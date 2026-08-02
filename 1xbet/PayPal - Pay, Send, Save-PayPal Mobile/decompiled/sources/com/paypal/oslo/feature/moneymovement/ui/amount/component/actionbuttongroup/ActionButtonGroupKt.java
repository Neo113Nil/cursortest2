package com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\u001a\u0016\u0010\u000f\u001a\u00020\r*\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0002\u001a/\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u000e\u001a/\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"ActionButtonGroupPrimaryButtonTestTag", "", "ActionButtonGroupSecondaryButtonTestTag", "ActionButtonGroupTertiaryButtonTestTag", "MMPActionButtonGroup", "", "config", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupConfig;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupData;", "callbacks", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupConfig;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupData;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "contentDescriptionOrDefault", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "VerticalButtonGroup", "HorizontalButtonGroup", "money-movement_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ActionButtonGroupKt {
    public static final java.lang.String ActionButtonGroupPrimaryButtonTestTag = "action_button_group_primary";
    public static final java.lang.String ActionButtonGroupSecondaryButtonTestTag = "action_button_group_secondary";
    public static final java.lang.String ActionButtonGroupTertiaryButtonTestTag = "action_button_group_tertiary";

    public static final void MMPActionButtonGroup(final com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupConfig actionButtonGroupConfig, final com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData actionButtonGroupData, final com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks actionButtonGroupCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionButtonGroupConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionButtonGroupData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionButtonGroupCallbacks, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-906215618);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(actionButtonGroupConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(actionButtonGroupData) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(actionButtonGroupCallbacks) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-906215618, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.MMPActionButtonGroup (ActionButtonGroup.kt:132)");
            }
            int i5 = com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroupKt.WhenMappings.$EnumSwitchMapping$0[actionButtonGroupConfig.getLayoutDirection().ordinal()];
            if (i5 == 1) {
                startRestartGroup.startReplaceGroup(1005160534);
                getHighSpeedVideoFpsRanges(actionButtonGroupConfig, actionButtonGroupData, actionButtonGroupCallbacks, modifier, startRestartGroup, i3 & 8190, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                if (i5 != 2) {
                    startRestartGroup.startReplaceGroup(1005158445);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(1005166840);
                Camera2StreamConfigurationMap(actionButtonGroupConfig, actionButtonGroupData, actionButtonGroupCallbacks, modifier, startRestartGroup, i3 & 8190, 0);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroupKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroupKt.$r8$lambda$AWbpUB8Cgbmd74Z5vsGwCjRwe3U(com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupConfig.this, actionButtonGroupData, actionButtonGroupCallbacks, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupConfig actionButtonGroupConfig, final com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData actionButtonGroupData, final com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks actionButtonGroupCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-221941974);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(actionButtonGroupConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(actionButtonGroupData) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(actionButtonGroupCallbacks) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-221941974, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.VerticalButtonGroup (ActionButtonGroup.kt:158)");
                }
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                java.lang.String primaryButtonText = actionButtonGroupData.getPrimaryButtonText();
                kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryClick = actionButtonGroupCallbacks.getOnPrimaryClick();
                com.paypal.pds.components.ButtonStyle primaryButtonStyle = actionButtonGroupConfig.getPrimaryButtonStyle();
                com.paypal.pds.components.ButtonSize buttonSize = actionButtonGroupConfig.getButtonSize();
                boolean primaryButtonEnabled = actionButtonGroupData.getPrimaryButtonEnabled();
                boolean primaryButtonLoading = actionButtonGroupData.getPrimaryButtonLoading();
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), ActionButtonGroupPrimaryButtonTestTag);
                java.lang.String primaryButtonContentDescription = actionButtonGroupData.getPrimaryButtonContentDescription();
                if (primaryButtonContentDescription != null) {
                    testTag = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(testTag, false, new com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroupKt$$ExternalSyntheticLambda0(primaryButtonContentDescription), 1, null);
                }
                modifier3 = modifier4;
                com.paypal.pds.components.ButtonKt.Button(onPrimaryClick, primaryButtonText, testTag, null, null, primaryButtonStyle, buttonSize, primaryButtonEnabled, primaryButtonLoading, startRestartGroup, 0, 24);
                java.lang.String secondaryButtonText = actionButtonGroupData.getSecondaryButtonText();
                if (actionButtonGroupConfig.getShowSecondaryButton() && secondaryButtonText != null) {
                    startRestartGroup.startReplaceGroup(-710253850);
                    kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryClick = actionButtonGroupCallbacks.getOnSecondaryClick();
                    com.paypal.pds.components.ButtonStyle secondaryButtonStyle = actionButtonGroupConfig.getSecondaryButtonStyle();
                    com.paypal.pds.components.ButtonSize buttonSize2 = actionButtonGroupConfig.getButtonSize();
                    boolean secondaryButtonEnabled = actionButtonGroupData.getSecondaryButtonEnabled();
                    boolean secondaryButtonLoading = actionButtonGroupData.getSecondaryButtonLoading();
                    androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), ActionButtonGroupSecondaryButtonTestTag);
                    java.lang.String secondaryButtonContentDescription = actionButtonGroupData.getSecondaryButtonContentDescription();
                    if (secondaryButtonContentDescription != null) {
                        testTag2 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(testTag2, false, new com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroupKt$$ExternalSyntheticLambda0(secondaryButtonContentDescription), 1, null);
                    }
                    com.paypal.pds.components.ButtonKt.Button(onSecondaryClick, secondaryButtonText, testTag2, null, null, secondaryButtonStyle, buttonSize2, secondaryButtonEnabled, secondaryButtonLoading, startRestartGroup, 0, 24);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-709713458);
                    startRestartGroup.endReplaceGroup();
                }
                java.lang.String tertiaryButtonText = actionButtonGroupData.getTertiaryButtonText();
                if (actionButtonGroupConfig.getShowTertiaryButton() && tertiaryButtonText != null) {
                    startRestartGroup.startReplaceGroup(-709518995);
                    kotlin.jvm.functions.Function0<kotlin.Unit> onTertiaryClick = actionButtonGroupCallbacks.getOnTertiaryClick();
                    com.paypal.pds.components.ButtonStyle tertiaryButtonStyle = actionButtonGroupConfig.getTertiaryButtonStyle();
                    com.paypal.pds.components.ButtonSize buttonSize3 = actionButtonGroupConfig.getButtonSize();
                    boolean tertiaryButtonEnabled = actionButtonGroupData.getTertiaryButtonEnabled();
                    boolean tertiaryButtonLoading = actionButtonGroupData.getTertiaryButtonLoading();
                    androidx.compose.ui.Modifier testTag3 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), ActionButtonGroupTertiaryButtonTestTag);
                    java.lang.String tertiaryButtonContentDescription = actionButtonGroupData.getTertiaryButtonContentDescription();
                    if (tertiaryButtonContentDescription != null) {
                        testTag3 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(testTag3, false, new com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroupKt$$ExternalSyntheticLambda0(tertiaryButtonContentDescription), 1, null);
                    }
                    com.paypal.pds.components.ButtonKt.Button(onTertiaryClick, tertiaryButtonText, testTag3, null, null, tertiaryButtonStyle, buttonSize3, tertiaryButtonEnabled, tertiaryButtonLoading, startRestartGroup, 0, 24);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-708985330);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroupKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroupKt.m15629$r8$lambda$cQmLk9JHqQ5HbHspeCuEFwkMY(com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupConfig.this, actionButtonGroupData, actionButtonGroupCallbacks, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupConfig actionButtonGroupConfig, final com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData actionButtonGroupData, final com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks actionButtonGroupCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        androidx.compose.ui.Modifier fillMaxWidth$default;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1053066408);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(actionButtonGroupConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(actionButtonGroupData) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(actionButtonGroupCallbacks) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1053066408, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.HorizontalButtonGroup (ActionButtonGroup.kt:219)");
                }
                androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
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
                java.lang.String secondaryButtonText = actionButtonGroupData.getSecondaryButtonText();
                androidx.compose.ui.Modifier fillMaxWidth$default3 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default3);
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
                if (actionButtonGroupConfig.getShowSecondaryButton() && secondaryButtonText != null) {
                    startRestartGroup.startReplaceGroup(-370731852);
                    kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryClick = actionButtonGroupCallbacks.getOnSecondaryClick();
                    com.paypal.pds.components.ButtonStyle secondaryButtonStyle = actionButtonGroupConfig.getSecondaryButtonStyle();
                    com.paypal.pds.components.ButtonSize buttonSize = actionButtonGroupConfig.getButtonSize();
                    boolean secondaryButtonEnabled = actionButtonGroupData.getSecondaryButtonEnabled();
                    boolean secondaryButtonLoading = actionButtonGroupData.getSecondaryButtonLoading();
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), ActionButtonGroupSecondaryButtonTestTag);
                    java.lang.String secondaryButtonContentDescription = actionButtonGroupData.getSecondaryButtonContentDescription();
                    if (secondaryButtonContentDescription != null) {
                        testTag = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(testTag, false, new com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroupKt$$ExternalSyntheticLambda0(secondaryButtonContentDescription), 1, null);
                    }
                    modifier3 = modifier4;
                    com.paypal.pds.components.ButtonKt.Button(onSecondaryClick, secondaryButtonText, testTag, null, null, secondaryButtonStyle, buttonSize, secondaryButtonEnabled, secondaryButtonLoading, startRestartGroup, 0, 24);
                    startRestartGroup.endReplaceGroup();
                } else {
                    modifier3 = modifier4;
                    startRestartGroup.startReplaceGroup(-370149052);
                    startRestartGroup.endReplaceGroup();
                }
                java.lang.String primaryButtonText = actionButtonGroupData.getPrimaryButtonText();
                kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryClick = actionButtonGroupCallbacks.getOnPrimaryClick();
                com.paypal.pds.components.ButtonStyle primaryButtonStyle = actionButtonGroupConfig.getPrimaryButtonStyle();
                com.paypal.pds.components.ButtonSize buttonSize2 = actionButtonGroupConfig.getButtonSize();
                boolean primaryButtonEnabled = actionButtonGroupData.getPrimaryButtonEnabled();
                boolean primaryButtonLoading = actionButtonGroupData.getPrimaryButtonLoading();
                if (actionButtonGroupConfig.getShowSecondaryButton()) {
                    fillMaxWidth$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                    i4 = 1;
                } else {
                    i4 = 1;
                    fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                }
                androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(fillMaxWidth$default, ActionButtonGroupPrimaryButtonTestTag);
                java.lang.String primaryButtonContentDescription = actionButtonGroupData.getPrimaryButtonContentDescription();
                if (primaryButtonContentDescription != null) {
                    testTag2 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(testTag2, false, new com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroupKt$$ExternalSyntheticLambda0(primaryButtonContentDescription), i4, null);
                }
                androidx.compose.ui.Modifier modifier5 = testTag2;
                int i6 = i4;
                com.paypal.pds.components.ButtonKt.Button(onPrimaryClick, primaryButtonText, modifier5, null, null, primaryButtonStyle, buttonSize2, primaryButtonEnabled, primaryButtonLoading, startRestartGroup, 0, 24);
                startRestartGroup.endNode();
                java.lang.String tertiaryButtonText = actionButtonGroupData.getTertiaryButtonText();
                if (actionButtonGroupConfig.getShowTertiaryButton() && tertiaryButtonText != null) {
                    startRestartGroup.startReplaceGroup(-524955777);
                    kotlin.jvm.functions.Function0<kotlin.Unit> onTertiaryClick = actionButtonGroupCallbacks.getOnTertiaryClick();
                    com.paypal.pds.components.ButtonStyle tertiaryButtonStyle = actionButtonGroupConfig.getTertiaryButtonStyle();
                    com.paypal.pds.components.ButtonSize buttonSize3 = actionButtonGroupConfig.getButtonSize();
                    boolean tertiaryButtonEnabled = actionButtonGroupData.getTertiaryButtonEnabled();
                    boolean tertiaryButtonLoading = actionButtonGroupData.getTertiaryButtonLoading();
                    androidx.compose.ui.Modifier testTag3 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i6, null), ActionButtonGroupTertiaryButtonTestTag);
                    java.lang.String tertiaryButtonContentDescription = actionButtonGroupData.getTertiaryButtonContentDescription();
                    if (tertiaryButtonContentDescription != null) {
                        testTag3 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(testTag3, false, new com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroupKt$$ExternalSyntheticLambda0(tertiaryButtonContentDescription), i6, null);
                    }
                    com.paypal.pds.components.ButtonKt.Button(onTertiaryClick, tertiaryButtonText, testTag3, null, null, tertiaryButtonStyle, buttonSize3, tertiaryButtonEnabled, tertiaryButtonLoading, startRestartGroup, 0, 24);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-524422112);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier6 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroupKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroupKt.$r8$lambda$uvVmvbhhEGbTV6hTwLw0ET7bwmE(com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupConfig.this, actionButtonGroupData, actionButtonGroupCallbacks, modifier6, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AWbpUB8Cgbmd74Z5vsGwCjRwe3U(com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupConfig actionButtonGroupConfig, com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData actionButtonGroupData, com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks actionButtonGroupCallbacks, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        MMPActionButtonGroup(actionButtonGroupConfig, actionButtonGroupData, actionButtonGroupCallbacks, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Q6Gkf8DpfAEKA2aIA69IP8bhBEw(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$cQmLk9JHq-Q5HbHsp-eCuEFwkMY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15629$r8$lambda$cQmLk9JHqQ5HbHspeCuEFwkMY(com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupConfig actionButtonGroupConfig, com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData actionButtonGroupData, com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks actionButtonGroupCallbacks, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRanges(actionButtonGroupConfig, actionButtonGroupData, actionButtonGroupCallbacks, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uvVmvbhhEGbTV6hTwLw0ET7bwmE(com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupConfig actionButtonGroupConfig, com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData actionButtonGroupData, com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks actionButtonGroupCallbacks, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Camera2StreamConfigurationMap(actionButtonGroupConfig, actionButtonGroupData, actionButtonGroupCallbacks, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ButtonLayoutDirection.values().length];
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ButtonLayoutDirection.VERTICAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ButtonLayoutDirection.HORIZONTAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
