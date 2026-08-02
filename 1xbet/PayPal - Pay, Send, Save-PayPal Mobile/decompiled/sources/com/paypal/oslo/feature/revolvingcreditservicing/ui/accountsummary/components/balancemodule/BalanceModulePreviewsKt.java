package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u000f\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\r\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0002\u001a\r\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0002\u001a\r\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0002\u001a\r\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0002\u001a\r\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\u0002\u001a\r\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\u0002\u001a\r\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u0002\u001a\r\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\u0002\u001a\r\u0010\f\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\u0002\u001a\r\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u0002\u001a\r\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u0002\u001a\r\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0002"}, d2 = {"", "BalanceModuleGroup1NoBalanceTempLimitPreview", "(Landroidx/compose/runtime/Composer;I)V", "BalanceModuleGroup1NoBalanceFullLimitPreview", "BalanceModuleGroup1NegativeBalancePreview", "BalanceModuleGroup2BalanceNoPaymentDuePreview", "BalanceModuleGroup2BalancePaymentDuePreview", "BalanceModuleGroup2BalancePastDuePreview", "BalanceModuleGroup3PastDueMinimumMethodPreview", "BalanceModuleGroup3MinPaymentDueMinimumMethodPreview", "BalanceModuleGroup3MinPaymentDueStatementBalancePreview", "BalanceModuleGroup3MinPaymentDueCustomAmountPreview", "BalanceModuleGroup4ScheduledPayTodayPreview", "BalanceModuleGroup4MultiplePaymentsScheduledPreview", "BalanceModuleGroup4ScheduledPayFuturePreview", "BalanceModuleGroup5ATAIFeaturePreview"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BalanceModulePreviewsKt {
    public static final void BalanceModuleGroup1NoBalanceTempLimitPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-962261466);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-962261466, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleGroup1NoBalanceTempLimitPreview (BalanceModulePreviews.kt:62)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
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
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel("$0.00", "$2,000.00", "$2,000.00", new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.MinimumPaymentUiModel("$0.00", "Jan 15", null, null, 12, null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel.Disabled(null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_status_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), 3, null), false, null, 0.0f, null, false, null, 1600, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda28
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.m18231$r8$lambda$xiyUOg6GH5f2U7ezAECee1H56I((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda32
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$WCgPzFqIyNMzOucAA5Lfgs3979g((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda34
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$hmHrYl9oBco6LYuZDoSO9YP0vfQ((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleKt.BalanceModule(balanceModuleUiModel, function0, function02, function03, function1, function12, (kotlin.jvm.functions.Function1) rememberedValue6, null, startRestartGroup, 1797552, 128);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$atNIwzNqiMLwWxQ1xA2dieCkqbQ(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BalanceModuleGroup1NoBalanceFullLimitPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(322004705);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(322004705, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleGroup1NoBalanceFullLimitPreview (BalanceModulePreviews.kt:100)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
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
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel("$0.00", "$1,000.00", "$1,000.00", new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.MinimumPaymentUiModel("$66.18", "Jan 15", null, null, 12, null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel.Disabled(null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_status_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), 3, null), false, null, 0.0f, null, false, null, 1600, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda5
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$kKdV4J_pOpdTEiOKjEY2DGLv7Ts((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$1bE333SqZxYEaQDCE2GhGgLqGz8((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.m18225$r8$lambda$c5a4_eQSKUmnGuFvJZoYRbAso8((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleKt.BalanceModule(balanceModuleUiModel, function0, function02, function03, function1, function12, (kotlin.jvm.functions.Function1) rememberedValue6, null, startRestartGroup, 1797552, 128);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.m18196$r8$lambda$0mMBZiAoJPcYmsR7mU1n2oQFIo(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BalanceModuleGroup1NegativeBalancePreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1798622755);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1798622755, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleGroup1NegativeBalancePreview (BalanceModulePreviews.kt:138)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
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
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel("-$50.00", "$1,000.00", "$1,050.00", new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.MinimumPaymentUiModel("$66.18", "Jan 15", null, null, 12, null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel.Disabled(null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_status_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), 3, null), false, null, 0.0f, null, false, null, 1600, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda43
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda45
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda46
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda47
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.m18201$r8$lambda$AZ0G2pmJLxwZqC_JYuh3GdCqrY((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda48
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$Zp3Qd2ekFY6ItHth3o8G9Accc78((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda49
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.m18215$r8$lambda$Q1frVtlfwXSSH7gUBjRlrqGCQk((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleKt.BalanceModule(balanceModuleUiModel, function0, function02, function03, function1, function12, (kotlin.jvm.functions.Function1) rememberedValue6, null, startRestartGroup, 1797552, 128);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda50
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.m18213$r8$lambda$OtrxAubpv2VbxtpI57oFTW6wg(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BalanceModuleGroup2BalanceNoPaymentDuePreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1198225632);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1198225632, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleGroup2BalanceNoPaymentDuePreview (BalanceModulePreviews.kt:180)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
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
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel("$100.00", "$1,000.00", "$900.00", new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.MinimumPaymentUiModel("$0.00", "Jan 15", null, null, 12, null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel.Disabled(null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_status_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), 3, null), true, null, 10.0f, null, false, null, 1600, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda77
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda88
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda97
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$bOw8rydiNY5E9gU44dmuXGdfhoM((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.m18218$r8$lambda$V6cGUxF_ZkzrmHSMuwslC4e934((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$mFZwJLV3pd42sB84AJfTZ6Etsls((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleKt.BalanceModule(balanceModuleUiModel, function0, function02, function03, function1, function12, (kotlin.jvm.functions.Function1) rememberedValue6, null, startRestartGroup, 1797552, 128);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.m18202$r8$lambda$AxM7Pl8m6ksJ1MLbsum4TlTvYU(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BalanceModuleGroup2BalancePaymentDuePreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1789137569);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1789137569, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleGroup2BalancePaymentDuePreview (BalanceModulePreviews.kt:218)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
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
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel("$500.00", "$1,000.00", "$500.00", new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.MinimumPaymentUiModel("$35.00", "Jan 15", null, null, 12, null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel.Disabled(null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_status_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), 3, null), true, null, 50.0f, null, false, null, 1600, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda90
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda91
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda92
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda93
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.m18230$r8$lambda$wMMwX7B3uUkKFmu9lMiYftxqNs((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda94
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$X6eE3mlELk4t30Zl5_YoCrPCYPA((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda95
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.m18207$r8$lambda$EBwLETUtKx7fdrHCUpusG1Qi0s((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleKt.BalanceModule(balanceModuleUiModel, function0, function02, function03, function1, function12, (kotlin.jvm.functions.Function1) rememberedValue6, null, startRestartGroup, 1797552, 128);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda96
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.m18214$r8$lambda$PPrD37uBB7yiEN1DFTZKwk9eQ(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BalanceModuleGroup2BalancePastDuePreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1555231147);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1555231147, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleGroup2BalancePastDuePreview (BalanceModulePreviews.kt:256)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
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
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel("$800.00", "$1,000.00", "$200.00", new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.MinimumPaymentUiModel("$50.00", "", null, null, 12, null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel.Disabled(null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_status_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), 3, null), true, null, 80.0f, null, false, null, 1600, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda13
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$8TSattAYIl0Jf2tHSvlzgPMx8QI((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$auaIKaqAlPO1Aq6uveZNqCXJ1kA((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.m18232$r8$lambda$xje2dk4j2XK0NAvaxwRLmU048w((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleKt.BalanceModule(balanceModuleUiModel, function0, function02, function03, function1, function12, (kotlin.jvm.functions.Function1) rememberedValue6, null, startRestartGroup, 1797552, 128);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.m18204$r8$lambda$DAr_15w0mi9GyUiCLx6DWdymQ(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BalanceModuleGroup3PastDueMinimumMethodPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-95443517);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-95443517, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleGroup3PastDueMinimumMethodPreview (BalanceModulePreviews.kt:298)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
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
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel("$800.00", "$1,000.00", "$200.00", new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.MinimumPaymentUiModel("$55.00", "", null, null, 12, null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel.Enabled(new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.AutopayMethodUiModel.MinimumPaymentDue(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US), null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_status_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), 6, null), true, null, 50.0f, null, false, null, 1600, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda36
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda37
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda38
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda39
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$50BybgKQTrOjOmJL_57hDi3eJyo((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda40
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.m18206$r8$lambda$E1QBjxjqakEedJNkyosXoI2qXw((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda41
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$m9YUZCE4C8yjK39gPW_jLoV1UfE((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleKt.BalanceModule(balanceModuleUiModel, function0, function02, function03, function1, function12, (kotlin.jvm.functions.Function1) rememberedValue6, null, startRestartGroup, 1797552, 128);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda42
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.m18228$r8$lambda$ruzXhehqSR2hfzsDKEQ1bsA1oY(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BalanceModuleGroup3MinPaymentDueMinimumMethodPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(200871873);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(200871873, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleGroup3MinPaymentDueMinimumMethodPreview (BalanceModulePreviews.kt:339)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
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
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel("$500.00", "$1,000.00", "$500.00", new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.MinimumPaymentUiModel("$35.00", "Jan 15", null, null, 12, null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel.Enabled(new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.AutopayMethodUiModel.MinimumPaymentDue(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US), null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_status_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), 6, null), true, null, 70.0f, null, false, null, 1600, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda59
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda60
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda61
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda62
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$Q6HyMns8LQX5tQnRZEjgeZFE8fU((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda63
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$LQ369lLPX2l9qJIHcTtYF07E3I4((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda64
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$B_eLCKSCIhzD3RtaIphdgpvz3o8((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleKt.BalanceModule(balanceModuleUiModel, function0, function02, function03, function1, function12, (kotlin.jvm.functions.Function1) rememberedValue6, null, startRestartGroup, 1797552, 128);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda65
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$iKhLlAkoMhH0wfrjjLXClAn6roA(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BalanceModuleGroup3MinPaymentDueStatementBalancePreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1445666881);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1445666881, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleGroup3MinPaymentDueStatementBalancePreview (BalanceModulePreviews.kt:380)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
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
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel("$500.00", "$1,000.00", "$500.00", new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.MinimumPaymentUiModel("$35.00", "Jan 15", null, null, 12, null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel.Enabled(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.AutopayMethodUiModel.StatementBalance.INSTANCE, null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_status_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), 6, null), true, null, 60.0f, null, false, null, 1600, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda67
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda68
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda69
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda70
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.m18212$r8$lambda$Nq42vjUUhNqp6NAj_Y2V1VQALQ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda71
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$jKqNzeRjqUBK7usDjVTL0msVFF4((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda72
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$98yTpGzhkuOC8wIVwwNlBKZo79k((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleKt.BalanceModule(balanceModuleUiModel, function0, function02, function03, function1, function12, (kotlin.jvm.functions.Function1) rememberedValue6, null, startRestartGroup, 1797552, 128);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda73
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.m18229$r8$lambda$via1AM8NDoNtbegpbOCfSgBO_U(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BalanceModuleGroup3MinPaymentDueCustomAmountPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1392141181);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1392141181, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleGroup3MinPaymentDueCustomAmountPreview (BalanceModulePreviews.kt:419)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
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
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel("$500.00", "$1,000.00", "$500.00", new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.MinimumPaymentUiModel("$35.00", "Jan 15", null, null, 12, null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel.Enabled(new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.AutopayMethodUiModel.CustomAmount("$100.00"), null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_status_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), 6, null), true, null, 40.0f, null, false, null, 1600, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda51
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda52
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda53
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda54
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$gZOfVcP9qcbUs7MHv2ZrT9pLU1s((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda56
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.m18227$r8$lambda$oanpIldFXtEjeyNPnsjV95wTQ8((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda57
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.m18216$r8$lambda$S0UCSgDUzt8Jpw3ApU5J3llk_E((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleKt.BalanceModule(balanceModuleUiModel, function0, function02, function03, function1, function12, (kotlin.jvm.functions.Function1) rememberedValue6, null, startRestartGroup, 1797552, 128);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda58
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.m18210$r8$lambda$KArSCn4tbGCj_loUKQlk9cPhGY(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BalanceModuleGroup4ScheduledPayTodayPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(698944743);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(698944743, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleGroup4ScheduledPayTodayPreview (BalanceModulePreviews.kt:462)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
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
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel("$1,000.00", "$1,000.00", "$0.00", new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.MinimumPaymentUiModel("$35.00", "Jan 15", null, null, 12, null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel.Enabled(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.AutopayMethodUiModel.StatementBalance.INSTANCE, null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_status_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), 6, null), true, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payment_scheduled_today, new java.lang.Object[]{"$35.00"}, null, false, 12, null), 100.0f, null, false, null, 1536, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda20
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$rFvpJHcTBbyPwIlbOdBvfUiCKeY((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$p_G2htCd4cPtcHqAtHmMMV_sLik((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$EJcb8tTjM5fUHir0oN0Dbjuf08Y((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleKt.BalanceModule(balanceModuleUiModel, function0, function02, function03, function1, function12, (kotlin.jvm.functions.Function1) rememberedValue6, null, startRestartGroup, 1797552, 128);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$nHWvlXsPzc3gaPMGfZWaEzg6YYY(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BalanceModuleGroup4MultiplePaymentsScheduledPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(193614621);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(193614621, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleGroup4MultiplePaymentsScheduledPreview (BalanceModulePreviews.kt:505)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
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
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel("$1,000.00", "$1,000.00", "$0.00", new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.MinimumPaymentUiModel("$35.00", "Jan 15", null, null, 12, null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel.Enabled(new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.AutopayMethodUiModel.MinimumPaymentDue(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US), null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_status_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), 6, null), true, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_multiple_scheduled_payments, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), 100.0f, null, false, null, 1536, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda74
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda75
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda76
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda78
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.m18220$r8$lambda$VgOIAqsqRpZiJfNYpJ4sIEjq7I((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda79
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$NaZoheWinAlWA1IOSyxwfpzgCuY((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda80
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$3Cz6h0TRDUBIkVvOvw3Mtcw8l_Y((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleKt.BalanceModule(balanceModuleUiModel, function0, function02, function03, function1, function12, (kotlin.jvm.functions.Function1) rememberedValue6, null, startRestartGroup, 1797552, 128);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda81
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.m18224$r8$lambda$_NEQSsX2TA5XSgqlBd1XIvtmwk(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BalanceModuleGroup4ScheduledPayFuturePreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(976262161);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(976262161, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleGroup4ScheduledPayFuturePreview (BalanceModulePreviews.kt:549)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
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
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel("$1,000.00", "$1,000.00", "$0.00", new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.MinimumPaymentUiModel("$35.00", "Jan 15", null, null, 12, null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel.Enabled(new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.AutopayMethodUiModel.CustomAmount("$50.00"), null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_status_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), 6, null), true, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_single_scheduled_payment, new java.lang.Object[]{"$50.00", "Oct 25"}, null, false, 12, null), 100.0f, null, false, null, 1536, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda0
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda33
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$EunqUHfnqZwV79d594U52DK5p8E((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda44
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$UBn1SQWulXSruEIiSN0adlmwTeo((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda55
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.m18203$r8$lambda$CJHGbt9fAd2Kvrd5ts5lSbmHT4((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleKt.BalanceModule(balanceModuleUiModel, function0, function02, function03, function1, function12, (kotlin.jvm.functions.Function1) rememberedValue6, null, startRestartGroup, 1797552, 128);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda66
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$BfL2DRY9CQ_EW2awJ9eB2njuX_8(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BalanceModuleGroup5ATAIFeaturePreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1952152941);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1952152941, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleGroup5ATAIFeaturePreview (BalanceModulePreviews.kt:597)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
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
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel("$850.00", "$2,000.00", "$1,150.00", new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.MinimumPaymentUiModel("$45.00", "Feb 1", "$212.50", null, 8, null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel.Disabled(null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_status_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), 3, null), true, null, 42.5f, null, false, null, 1600, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda82
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda83
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda84
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda85
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.m18223$r8$lambda$XC8bI5NsMbheuuoIhXJeEP4fb8((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda86
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$XvKP32RnmKUA4QikXrsxMK6JZ58((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda87
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.m18208$r8$lambda$Em7QxHh45ApvMcA852q7uVWkQ((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModuleKt.BalanceModule(balanceModuleUiModel, function0, function02, function03, function1, function12, (kotlin.jvm.functions.Function1) rememberedValue6, null, startRestartGroup, 1797552, 128);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt$$ExternalSyntheticLambda89
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.BalanceModulePreviewsKt.$r8$lambda$yR6lPztOpOXFG6xSaMhZ9WPjSrE(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$0mMB-ZiAoJPcYmsR7mU1n2oQFIo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18196$r8$lambda$0mMBZiAoJPcYmsR7mU1n2oQFIo(int i, androidx.compose.runtime.Composer composer, int i2) {
        BalanceModuleGroup1NoBalanceFullLimitPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1bE333SqZxYEaQDCE2GhGgLqGz8(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3Cz6h0TRDUBIkVvOvw3Mtcw8l_Y(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$50BybgKQTrOjOmJL_57hDi3eJyo(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentUrl, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8TSattAYIl0Jf2tHSvlzgPMx8QI(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentUrl, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$98yTpGzhkuOC8wIVwwNlBKZo79k(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$AZ0-G2pmJLxwZqC_JYuh3GdCqrY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18201$r8$lambda$AZ0G2pmJLxwZqC_JYuh3GdCqrY(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentUrl, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$AxM7Pl8-m6ksJ1MLbsum4TlTvYU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18202$r8$lambda$AxM7Pl8m6ksJ1MLbsum4TlTvYU(int i, androidx.compose.runtime.Composer composer, int i2) {
        BalanceModuleGroup2BalanceNoPaymentDuePreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$B_eLCKSCIhzD3RtaIphdgpvz3o8(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BfL2DRY9CQ_EW2awJ9eB2njuX_8(int i, androidx.compose.runtime.Composer composer, int i2) {
        BalanceModuleGroup4ScheduledPayFuturePreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$CJHGbt9fAd2-Kvrd5ts5lSbmHT4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18203$r8$lambda$CJHGbt9fAd2Kvrd5ts5lSbmHT4(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$DAr-_-15w0mi9GyUiCLx6DWdymQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18204$r8$lambda$DAr_15w0mi9GyUiCLx6DWdymQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        BalanceModuleGroup2BalancePastDuePreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$E-1QBjxjqakEedJNkyosXoI2qXw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18206$r8$lambda$E1QBjxjqakEedJNkyosXoI2qXw(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$EB-wLETUtKx7fdrHCUpusG1Qi0s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18207$r8$lambda$EBwLETUtKx7fdrHCUpusG1Qi0s(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EJcb8tTjM5fUHir0oN0Dbjuf08Y(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Em7QxHh4--5ApvMcA852q7uVWkQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18208$r8$lambda$Em7QxHh45ApvMcA852q7uVWkQ(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EunqUHfnqZwV79d594U52DK5p8E(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentUrl, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KArSCn4tbGCj_loUKQlk9cP-hGY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18210$r8$lambda$KArSCn4tbGCj_loUKQlk9cPhGY(int i, androidx.compose.runtime.Composer composer, int i2) {
        BalanceModuleGroup3MinPaymentDueCustomAmountPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LQ369lLPX2l9qJIHcTtYF07E3I4(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NaZoheWinAlWA1IOSyxwfpzgCuY(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Nq42vjUUhNqp6NAj_Y2V1VQ-ALQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18212$r8$lambda$Nq42vjUUhNqp6NAj_Y2V1VQALQ(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentUrl, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Ot-rxAubpv2Vbxtp-I57oFTW6wg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18213$r8$lambda$OtrxAubpv2VbxtpI57oFTW6wg(int i, androidx.compose.runtime.Composer composer, int i2) {
        BalanceModuleGroup1NegativeBalancePreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$P-PrD37uBB7yiEN1-DFTZKwk9eQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18214$r8$lambda$PPrD37uBB7yiEN1DFTZKwk9eQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        BalanceModuleGroup2BalancePaymentDuePreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Q1frVtlfwXSSH7gUB-jRlrqGCQk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18215$r8$lambda$Q1frVtlfwXSSH7gUBjRlrqGCQk(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Q6HyMns8LQX5tQnRZEjgeZFE8fU(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentUrl, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$S0UCSgDUzt8Jpw3Ap-U5J3llk_E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18216$r8$lambda$S0UCSgDUzt8Jpw3ApU5J3llk_E(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UBn1SQWulXSruEIiSN0adlmwTeo(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$V6-cGUxF_ZkzrmHSMuwslC4e934, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18218$r8$lambda$V6cGUxF_ZkzrmHSMuwslC4e934(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_N-EQSsX2TA5XSgqlBd1XIvtmwk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18224$r8$lambda$_NEQSsX2TA5XSgqlBd1XIvtmwk(int i, androidx.compose.runtime.Composer composer, int i2) {
        BalanceModuleGroup4MultiplePaymentsScheduledPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$atNIwzNqiMLwWxQ1xA2dieCkqbQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        BalanceModuleGroup1NoBalanceTempLimitPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iKhLlAkoMhH0wfrjjLXClAn6roA(int i, androidx.compose.runtime.Composer composer, int i2) {
        BalanceModuleGroup3MinPaymentDueMinimumMethodPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nHWvlXsPzc3gaPMGfZWaEzg6YYY(int i, androidx.compose.runtime.Composer composer, int i2) {
        BalanceModuleGroup4ScheduledPayTodayPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ruzXhehqSR2hfzsDKEQ1bs-A1oY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18228$r8$lambda$ruzXhehqSR2hfzsDKEQ1bsA1oY(int i, androidx.compose.runtime.Composer composer, int i2) {
        BalanceModuleGroup3PastDueMinimumMethodPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$via1AM8N-DoNtbegpbOCfSgBO_U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18229$r8$lambda$via1AM8NDoNtbegpbOCfSgBO_U(int i, androidx.compose.runtime.Composer composer, int i2) {
        BalanceModuleGroup3MinPaymentDueStatementBalancePreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yR6lPztOpOXFG6xSaMhZ9WPjSrE(int i, androidx.compose.runtime.Composer composer, int i2) {
        BalanceModuleGroup5ATAIFeaturePreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WCgPzFqIyNMzOucAA5Lfgs3979g(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hmHrYl9oBco6LYuZDoSO9YP0vfQ(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xiyUOg6GH5f2U7ezAECee1H56-I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18231$r8$lambda$xiyUOg6GH5f2U7ezAECee1H56I(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentUrl, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$c5a4_eQSKUmn-GuFvJZoYRbAso8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18225$r8$lambda$c5a4_eQSKUmnGuFvJZoYRbAso8(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kKdV4J_pOpdTEiOKjEY2DGLv7Ts(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentUrl, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Zp3Qd2ekFY6ItHth3o8G9Accc78(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bOw8rydiNY5E9gU44dmuXGdfhoM(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentUrl, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mFZwJLV3pd42sB84AJfTZ6Etsls(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$X6eE3mlELk4t30Zl5_YoCrPCYPA(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$wMMwX7B3uUkKFmu9lMi-YftxqNs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18230$r8$lambda$wMMwX7B3uUkKFmu9lMiYftxqNs(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentUrl, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$auaIKaqAlPO1Aq6uveZNqCXJ1kA(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xje2dk4j2XK0NAv-axwRLmU048w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18232$r8$lambda$xje2dk4j2XK0NAvaxwRLmU048w(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m9YUZCE4C8yjK39gPW_jLoV1UfE(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jKqNzeRjqUBK7usDjVTL0msVFF4(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gZOfVcP9qcbUs7MHv2ZrT9pLU1s(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentUrl, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$oanpIldFXtEjeyNPns-jV95wTQ8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18227$r8$lambda$oanpIldFXtEjeyNPnsjV95wTQ8(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$p_G2htCd4cPtcHqAtHmMMV_sLik(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rFvpJHcTBbyPwIlbOdBvfUiCKeY(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentUrl, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VgOIAqsqRpZ-iJfNYpJ4sIEjq7I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18220$r8$lambda$VgOIAqsqRpZiJfNYpJ4sIEjq7I(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentUrl, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$XC8bI5NsMbheuuoIhXJ-eEP4fb8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18223$r8$lambda$XC8bI5NsMbheuuoIhXJeEP4fb8(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentUrl, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XvKP32RnmKUA4QikXrsxMK6JZ58(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }
}
