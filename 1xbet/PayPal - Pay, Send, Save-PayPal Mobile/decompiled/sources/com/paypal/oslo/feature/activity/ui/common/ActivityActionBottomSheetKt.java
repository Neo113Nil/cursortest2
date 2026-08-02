package com.paypal.oslo.feature.activity.ui.common;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001ak\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u001a\u0010\u000e\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0004\u0012\u00020\n0\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\u0010\u0011\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a;\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00182\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u0016\u0010\u001a"}, d2 = {"Lcom/paypal/pds/components/BottomSheetController;", "bottomSheetController", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityActionType;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivityActionType;", "positiveActionType", "Lcom/paypal/oslo/feature/activity/ui/detail/model/ActionMetadata;", "actionMetadata", "Lcom/paypal/oslo/feature/activity/ui/common/model/states/ActionExecutionState;", "state", "Lkotlin/Function0;", "", "onConfirm", "onDismiss", "Lkotlin/Function1;", "onNegativeAction", "ActivityActionBottomSheet", "(Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/oslo/api/graphql/schema/type/ActivityActionType;Lcom/paypal/oslo/feature/activity/ui/detail/model/ActionMetadata;Lcom/paypal/oslo/feature/activity/ui/common/model/states/ActionExecutionState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "p0", "", "p1", "p2", "Lcom/paypal/oslo/feature/activity/ui/common/ActionBottomSheetModal;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/api/graphql/schema/type/ActivityActionType;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/ui/common/model/states/ActionExecutionState;Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/activity/ui/common/ActionBottomSheetModal;", "", "p3", "(Lcom/paypal/oslo/feature/activity/ui/common/ActionBottomSheetModal;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityActionBottomSheetKt {
    public static final void ActivityActionBottomSheet(final com.paypal.pds.components.BottomSheetController bottomSheetController, final com.paypal.oslo.api.graphql.schema.type.ActivityActionType activityActionType, final com.paypal.oslo.feature.activity.ui.detail.model.ActionMetadata actionMetadata, final com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState actionExecutionState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.api.graphql.schema.type.ActivityActionType, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionExecutionState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1861183307);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(activityActionType.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(actionMetadata) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? startRestartGroup.changed(actionExecutionState) : startRestartGroup.changedInstance(actionExecutionState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1861183307, i3, -1, "com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheet (ActivityActionBottomSheet.kt:58)");
            }
            final boolean z = actionExecutionState instanceof com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState.Loading;
            final boolean z2 = actionExecutionState instanceof com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState.Success;
            final com.paypal.oslo.feature.activity.ui.common.ActionBottomSheetModal Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(activityActionType, actionMetadata.getCounterPartyName(), actionExecutionState, startRestartGroup, (i3 >> 3) & 910);
            if (Camera2StreamConfigurationMap == null) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetKt.m11791$r8$lambda$5lrIveLuHN8pECYoGvrxhuaXDQ(com.paypal.pds.components.BottomSheetController.this, activityActionType, actionMetadata, actionExecutionState, function0, function02, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    };
                    endRestartGroup.updateScope(function2);
                }
                return;
            }
            int i4 = 458752 & i3;
            boolean z3 = i4 == 131072;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetKt.m11798$r8$lambda$iuRplOPzWhpc95LzaTg_MMsGaA(kotlin.jvm.functions.Function0.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue;
            com.paypal.pds.components.TopNavConfig topNavConfig = new com.paypal.pds.components.TopNavConfig(null, false, null, 7, null);
            boolean z4 = i4 == 131072;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z4 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetKt.$r8$lambda$2Sb5PWt3X9spDH8IkuAy1_61RvA(kotlin.jvm.functions.Function0.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function03, topNavConfig, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue2, !z, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(2114127036, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetKt.$r8$lambda$t4uPmGQCtrP2reiiMRQah7DrGeY(com.paypal.oslo.feature.activity.ui.common.ActionBottomSheetModal.this, z, z2, function02, function0, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), composer2, com.paypal.pds.components.BottomSheetController.$stable | 805306368 | (i3 & 14) | (com.paypal.pds.components.TopNavConfig.$stable << 6), 312);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetKt.m11797$r8$lambda$c01pZ3vclCFsqUNimjBm6E1vds(com.paypal.pds.components.BottomSheetController.this, activityActionType, actionMetadata, actionExecutionState, function0, function02, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            };
            endRestartGroup.updateScope(function2);
        }
    }

    private static final com.paypal.oslo.feature.activity.ui.common.ActionBottomSheetModal Camera2StreamConfigurationMap(com.paypal.oslo.api.graphql.schema.type.ActivityActionType activityActionType, java.lang.String str, com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState actionExecutionState, androidx.compose.runtime.Composer composer, int i) {
        com.paypal.oslo.feature.activity.ui.common.ActionBottomSheetModal actionBottomSheetModal;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2074943275, i, -1, "com.paypal.oslo.feature.activity.ui.common.resolveBottomSheetModel (ActivityActionBottomSheet.kt:85)");
        }
        if ((actionExecutionState instanceof com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState.Success) && com.paypal.oslo.feature.activity.ui.detail.model.extensions.ActivityDetailsActionExtensionKt.getRequiresSuccessModal(activityActionType)) {
            composer.startReplaceGroup(1466052466);
            actionBottomSheetModal = new com.paypal.oslo.feature.activity.ui.common.ActionBottomSheetModal(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_action_decline_success_title, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_action_decline_success_description, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_action_decline_success_done_button, composer, 0), null, activityActionType, null, 32, null);
        } else if (actionExecutionState instanceof com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState.Error) {
            composer.startReplaceGroup(1466513467);
            actionBottomSheetModal = new com.paypal.oslo.feature.activity.ui.common.ActionBottomSheetModal(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_error_state_something_went_wrong, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_error_state_description, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_error_state_retry_text, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_help_section_block_cancel_cta, composer, 0), activityActionType, null, 32, null);
        } else {
            composer.startReplaceGroup(1467096019);
            switch (com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetKt.WhenMappings.$EnumSwitchMapping$0[activityActionType.ordinal()]) {
                case 1:
                    composer.startReplaceGroup(1155703417);
                    actionBottomSheetModal = new com.paypal.oslo.feature.activity.ui.common.ActionBottomSheetModal(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_action_decline_confirm_title, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_action_decline_confirm_description, new java.lang.Object[]{str}, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_action_decline_confirm_yes_button, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_action_decline_confirm_no_button, composer, 0), activityActionType, null, 32, null);
                    composer.endReplaceGroup();
                    break;
                case 2:
                    composer.startReplaceGroup(1155723639);
                    actionBottomSheetModal = new com.paypal.oslo.feature.activity.ui.common.ActionBottomSheetModal(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_action_report_confirm_title, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_action_report_confirm_description, new java.lang.Object[]{str}, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_action_report_confirm_button, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_help_section_block_cancel_cta, composer, 0), activityActionType, null, 32, null);
                    composer.endReplaceGroup();
                    break;
                case 3:
                    composer.startReplaceGroup(1155744085);
                    actionBottomSheetModal = new com.paypal.oslo.feature.activity.ui.common.ActionBottomSheetModal(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_help_section_block_cta, new java.lang.Object[]{str}, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_help_section_block_subtitle, new java.lang.Object[]{str}, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_help_section_block_confirm_cta, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_help_section_block_cancel_cta, composer, 0), activityActionType, null, 32, null);
                    composer.endReplaceGroup();
                    break;
                case 4:
                    composer.startReplaceGroup(1155765176);
                    actionBottomSheetModal = new com.paypal.oslo.feature.activity.ui.common.ActionBottomSheetModal(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_action_cancel_confirm_title, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_action_cancel_confirm_description, new java.lang.Object[]{str}, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_action_decline_confirm_yes_button, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_action_decline_confirm_no_button, composer, 0), activityActionType, null, 32, null);
                    composer.endReplaceGroup();
                    break;
                case 5:
                case 6:
                    composer.startReplaceGroup(1155786822);
                    actionBottomSheetModal = new com.paypal.oslo.feature.activity.ui.common.ActionBottomSheetModal(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_tax_law_sheet_consent_title, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_tax_law_sheet_consent_description, new java.lang.Object[]{""}, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_tax_law_sheet_consent_add_tax_id_cta, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_tax_law_sheet_consent_more_about_this_tax_law, composer, 0), activityActionType, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.LEARN_TAX_LAW);
                    composer.endReplaceGroup();
                    break;
                default:
                    composer.startReplaceGroup(1470438066);
                    composer.endReplaceGroup();
                    actionBottomSheetModal = null;
                    break;
            }
        }
        composer.endReplaceGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return actionBottomSheetModal;
    }

    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.activity.ui.common.ActionBottomSheetModal actionBottomSheetModal, final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.functions.Function0 function03;
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1366629367);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(actionBottomSheetModal) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        int i4 = i2;
        if (startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1366629367, i4, -1, "com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetContent (ActivityActionBottomSheet.kt:168)");
            }
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(actionBottomSheetModal.Camera2StreamConfigurationMap, null, null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 0, 6, 1006);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(actionBottomSheetModal.getHighSpeedVideoFpsRanges, null, null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, 0, 6, 1006);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            if (z) {
                startRestartGroup.startReplaceGroup(-2032801069);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            kotlin.Unit unit;
                            unit = kotlin.Unit.INSTANCE;
                            return unit;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                function03 = (kotlin.jvm.functions.Function0) rememberedValue;
            } else {
                startRestartGroup.startReplaceGroup(-2032791614);
                boolean z2 = (i4 & 896) == 256;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetKt.m11793$r8$lambda$QJ1KCYllpwCOwZw5el9Z0or79I(kotlin.jvm.functions.Function0.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                function03 = (kotlin.jvm.functions.Function0) rememberedValue2;
            }
            startRestartGroup.endReplaceGroup();
            com.paypal.pds.components.ButtonKt.Button(function03, actionBottomSheetModal.getHighSpeedVideoFpsRangesFor, fillMaxWidth$default, null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, null, !z, z, startRestartGroup, ((i4 << 21) & 234881024) | 196992, 88);
            if (z || actionBottomSheetModal.getHighSpeedVideoSizes == null) {
                composer2 = startRestartGroup;
                i3 = 0;
                composer2.startReplaceGroup(-2032261483);
                composer2.endReplaceGroup();
            } else {
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(-2032542095);
                i3 = 0;
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer2, 0);
                androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                java.lang.String str = actionBottomSheetModal.getHighSpeedVideoSizes;
                com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
                boolean z3 = (i4 & 7168) == 2048;
                java.lang.Object rememberedValue3 = composer2.rememberedValue();
                if (z3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetKt.$r8$lambda$HTnMtJpn3p2HDWyajOokoVci9OM(kotlin.jvm.functions.Function0.this);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue3);
                }
                com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue3, str, fillMaxWidth$default2, null, null, secondary, null, false, false, composer2, 196992, 472);
                composer2.endReplaceGroup();
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, i3);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetKt.$r8$lambda$lBOrG5xptTkGzXCMg8tV1FoZaQo(com.paypal.oslo.feature.activity.ui.common.ActionBottomSheetModal.this, z, function0, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2Sb5PWt3X9spDH8IkuAy1_61RvA(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$5lrIveLuH-N8pECYoGvrxhuaXDQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11791$r8$lambda$5lrIveLuHN8pECYoGvrxhuaXDQ(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.api.graphql.schema.type.ActivityActionType activityActionType, com.paypal.oslo.feature.activity.ui.detail.model.ActionMetadata actionMetadata, com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState actionExecutionState, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        ActivityActionBottomSheet(bottomSheetController, activityActionType, actionMetadata, actionExecutionState, function0, function02, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HTnMtJpn3p2HDWyajOokoVci9OM(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Js9ZnftYfwvZfQ6JzWoGBmpQ7ow(boolean z, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02) {
        if (z) {
            function0.invoke();
        } else {
            function02.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$QJ1KCYllpwCOwZw5el9Z0or79-I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11793$r8$lambda$QJ1KCYllpwCOwZw5el9Z0or79I(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$TS1QglrpniFkCR_eQ-23RJ1_kQc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11794$r8$lambda$TS1QglrpniFkCR_eQ23RJ1_kQc(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.activity.ui.common.ActionBottomSheetModal actionBottomSheetModal) {
        function1.invoke(actionBottomSheetModal.getOutputFormats);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$TikVNyt-PJWvpqAiTKGFHQY2yVY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11796$r8$lambda$TikVNytPJWvpqAiTKGFHQY2yVY(final com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetPreviewParams activityActionBottomSheetPreviewParams, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1509788613);
        if ((updateChangedFlags & 6) == 0) {
            i3 = ((updateChangedFlags & 8) == 0 ? startRestartGroup.changed(activityActionBottomSheetPreviewParams) : startRestartGroup.changedInstance(activityActionBottomSheetPreviewParams) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1509788613, i3, -1, "com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetContentPreview (ActivityActionBottomSheet.kt:221)");
            }
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.wrapContentWidth$default(androidx.compose.ui.Modifier.INSTANCE, null, false, 3, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.oslo.feature.activity.ui.common.ActionBottomSheetModal Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(activityActionBottomSheetPreviewParams.getHighSpeedVideoFpsRangesFor, "John Doe", activityActionBottomSheetPreviewParams.getHighSpeedVideoFpsRanges, startRestartGroup, 48);
            if (Camera2StreamConfigurationMap == null) {
                startRestartGroup.startReplaceGroup(526518194);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(526518195);
                boolean z = activityActionBottomSheetPreviewParams.getHighSpeedVideoFpsRanges instanceof com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState.Loading;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetKt$$ExternalSyntheticLambda2
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
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            kotlin.Unit unit;
                            unit = kotlin.Unit.INSTANCE;
                            return unit;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                Camera2StreamConfigurationMap(Camera2StreamConfigurationMap, z, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 3456);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetKt.m11796$r8$lambda$TikVNytPJWvpqAiTKGFHQY2yVY(com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetPreviewParams.this, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$c-01pZ3vclCFsqUNimjBm6E1vds, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11797$r8$lambda$c01pZ3vclCFsqUNimjBm6E1vds(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.api.graphql.schema.type.ActivityActionType activityActionType, com.paypal.oslo.feature.activity.ui.detail.model.ActionMetadata actionMetadata, com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState actionExecutionState, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        ActivityActionBottomSheet(bottomSheetController, activityActionType, actionMetadata, actionExecutionState, function0, function02, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$iuRplO-PzWhpc95LzaTg_MMsGaA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11798$r8$lambda$iuRplOPzWhpc95LzaTg_MMsGaA(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lBOrG5xptTkGzXCMg8tV1FoZaQo(com.paypal.oslo.feature.activity.ui.common.ActionBottomSheetModal actionBottomSheetModal, boolean z, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(actionBottomSheetModal, z, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$t4uPmGQCtrP2reiiMRQah7DrGeY(final com.paypal.oslo.feature.activity.ui.common.ActionBottomSheetModal actionBottomSheetModal, boolean z, final boolean z2, final kotlin.jvm.functions.Function0 function0, final kotlin.jvm.functions.Function0 function02, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2114127036, i, -1, "com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheet.<anonymous> (ActivityActionBottomSheet.kt:70)");
            }
            boolean changed = composer.changed(z2);
            boolean changed2 = composer.changed(function0);
            boolean changed3 = composer.changed(function02);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2 | changed3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetKt.$r8$lambda$Js9ZnftYfwvZfQ6JzWoGBmpQ7ow(z2, function0, function02);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changed4 = composer.changed(function1);
            boolean changed5 = composer.changed(actionBottomSheetModal);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changed4 | changed5) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetKt.m11794$r8$lambda$TS1QglrpniFkCR_eQ23RJ1_kQc(kotlin.jvm.functions.Function1.this, actionBottomSheetModal);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            Camera2StreamConfigurationMap(actionBottomSheetModal, z, function03, (kotlin.jvm.functions.Function0) rememberedValue2, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.DECLINE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.REPORT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.SHOW_P2P_BLOCK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.CANCEL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.ADD_TAX_ID.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.CONFIRM_TAX_ID.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
