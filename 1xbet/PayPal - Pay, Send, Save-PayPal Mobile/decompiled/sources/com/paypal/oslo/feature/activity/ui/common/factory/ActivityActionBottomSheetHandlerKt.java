package com.paypal.oslo.feature.activity.ui.common.factory;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ae\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0011\u0010\u0012\u001aY\u0010\u0015\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001aC\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "action", "Lcom/paypal/oslo/feature/activity/ui/common/model/states/ActionExecutionState;", "actionExecutionState", "Lcom/paypal/pds/components/BottomSheetController;", "confirmationBottomSheetController", "Lcom/paypal/oslo/feature/activity/ui/detail/model/ActivityTransactionDetailViewModel;", "viewModel", "Lcom/paypal/oslo/feature/activity/api/models/ActivityTransactionDto;", "transaction", "Lkotlin/Function0;", "", "onNeedsLedgerRefresh", "Lkotlin/Function1;", "", "onToastMessage", "onClearPendingAction", "ActionConfirmationHandler", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;Lcom/paypal/oslo/feature/activity/ui/common/model/states/ActionExecutionState;Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/oslo/feature/activity/ui/detail/model/ActivityTransactionDetailViewModel;Lcom/paypal/oslo/feature/activity/api/models/ActivityTransactionDto;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityActionType;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivityActionType;", "onNegativeAction", "(Lcom/paypal/oslo/feature/activity/ui/detail/model/ActivityTransactionDetailViewModel;Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;Lcom/paypal/pds/components/BottomSheetController;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/activity/ui/common/model/states/ActionExecutionState;Lcom/paypal/oslo/feature/activity/api/models/ActivityTransactionDto;)Lkotlin/jvm/functions/Function1;", "onDismissAction", "(Lcom/paypal/oslo/feature/activity/ui/common/model/states/ActionExecutionState;Lcom/paypal/pds/components/BottomSheetController;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/activity/ui/detail/model/ActivityTransactionDetailViewModel;Lcom/paypal/oslo/feature/activity/api/models/ActivityTransactionDto;)Lkotlin/jvm/functions/Function0;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityActionBottomSheetHandlerKt {
    public static final void ActionConfirmationHandler(final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, final com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState actionExecutionState, final com.paypal.pds.components.BottomSheetController bottomSheetController, final com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel, final com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto activityTransactionDto, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionExecutionState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionDetailViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionDto, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1536071233);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(activityActionModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(actionExecutionState) : startRestartGroup.changedInstance(actionExecutionState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(activityTransactionDetailViewModel) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? startRestartGroup.changed(activityTransactionDto) : startRestartGroup.changedInstance(activityTransactionDto) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 8388608 : 4194304;
        }
        int i5 = i2;
        if (!startRestartGroup.shouldExecute((4793491 & i5) != 4793490, i5 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1536071233, i5, -1, "com.paypal.oslo.feature.activity.ui.common.factory.ActionConfirmationHandler (ActivityActionBottomSheetHandler.kt:35)");
            }
            boolean changedInstance = startRestartGroup.changedInstance(activityTransactionDetailViewModel);
            int i6 = i5 & 896;
            boolean z3 = i6 == 256 || ((i5 & 512) != 0 && startRestartGroup.changedInstance(bottomSheetController));
            com.paypal.oslo.feature.activity.ui.common.factory.ActivityActionBottomSheetHandlerKt$ActionConfirmationHandler$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.activity.ui.common.factory.ActivityActionBottomSheetHandlerKt$ActionConfirmationHandler$1$1(activityTransactionDetailViewModel, bottomSheetController, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            int i7 = i5 & 14;
            androidx.compose.runtime.EffectsKt.LaunchedEffect(activityActionModel, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, i7);
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_action_report_success_toast, startRestartGroup, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_details_block_success_text, new java.lang.Object[]{activityTransactionDetailViewModel.getActionMetadata$activity_prodRelease().getCounterPartyName()}, startRestartGroup, 0);
            boolean z4 = (i5 & 112) == 32 || ((i5 & 64) != 0 && startRestartGroup.changedInstance(actionExecutionState));
            boolean z5 = (458752 & i5) == 131072;
            if (i7 == 4) {
                z = true;
                i3 = 256;
            } else {
                i3 = 256;
                z = false;
            }
            boolean z6 = i6 == i3 || ((i5 & 512) != 0 && startRestartGroup.changedInstance(bottomSheetController));
            boolean z7 = (29360128 & i5) == 8388608;
            boolean z8 = (3670016 & i5) == 1048576;
            boolean changed = startRestartGroup.changed(stringResource);
            boolean changedInstance2 = startRestartGroup.changedInstance(activityTransactionDetailViewModel);
            boolean z9 = (i5 & 57344) == 16384 || ((i5 & 32768) != 0 && startRestartGroup.changedInstance(activityTransactionDto));
            boolean changed2 = startRestartGroup.changed(stringResource2);
            com.paypal.oslo.feature.activity.ui.common.factory.ActivityActionBottomSheetHandlerKt$ActionConfirmationHandler$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (((z4 | z5 | z | z6 | z7 | z8 | changed | changedInstance2 | z9) || changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                z2 = false;
                i4 = i7;
                rememberedValue2 = new com.paypal.oslo.feature.activity.ui.common.factory.ActivityActionBottomSheetHandlerKt$ActionConfirmationHandler$2$1(actionExecutionState, function0, activityActionModel, bottomSheetController, function02, function1, stringResource, activityTransactionDetailViewModel, activityTransactionDto, stringResource2, null);
                composer2 = startRestartGroup;
                composer2.updateRememberedValue(rememberedValue2);
            } else {
                composer2 = startRestartGroup;
                i4 = i7;
                z2 = false;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(actionExecutionState, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer2, (i5 >> 3) & 14);
            com.paypal.oslo.api.graphql.schema.type.ActivityActionType type = activityActionModel.getType();
            com.paypal.oslo.feature.activity.ui.detail.model.ActionMetadata actionMetadata$activity_prodRelease = activityTransactionDetailViewModel.getActionMetadata$activity_prodRelease();
            boolean changedInstance3 = composer2.changedInstance(activityTransactionDetailViewModel);
            boolean z10 = i4 != 4 ? z2 : true;
            java.lang.Object rememberedValue3 = composer2.rememberedValue();
            if ((changedInstance3 | z10) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.common.factory.ActivityActionBottomSheetHandlerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.activity.ui.common.factory.ActivityActionBottomSheetHandlerKt.$r8$lambda$9ipeDG6xRq92IOvUSftipcs2bLU(com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel.this, activityActionModel);
                    }
                };
                composer2.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetKt.ActivityActionBottomSheet(bottomSheetController, type, actionMetadata$activity_prodRelease, actionExecutionState, (kotlin.jvm.functions.Function0) rememberedValue3, onDismissAction(actionExecutionState, bottomSheetController, function02, activityTransactionDetailViewModel, activityTransactionDto), onNegativeAction(activityTransactionDetailViewModel, activityActionModel, bottomSheetController, function02, actionExecutionState, activityTransactionDto), composer2, com.paypal.pds.components.BottomSheetController.$stable | ((i5 >> 6) & 14) | ((i5 << 6) & 7168));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.common.factory.ActivityActionBottomSheetHandlerKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.common.factory.ActivityActionBottomSheetHandlerKt.m11805$r8$lambda$FsTDMgQ2DKVWuf_KCkupFOoFyM(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel.this, actionExecutionState, bottomSheetController, activityTransactionDetailViewModel, activityTransactionDto, function0, function1, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.api.graphql.schema.type.ActivityActionType, kotlin.Unit> onNegativeAction(final com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel, final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState actionExecutionState, final com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto activityTransactionDto) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionDetailViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionExecutionState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionDto, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.common.factory.ActivityActionBottomSheetHandlerKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.activity.ui.common.factory.ActivityActionBottomSheetHandlerKt.$r8$lambda$pzG2Rse_0XSbeex0pJ585Av8cnw(com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel.this, activityActionModel, bottomSheetController, function0, actionExecutionState, activityTransactionDto, (com.paypal.oslo.api.graphql.schema.type.ActivityActionType) obj);
            }
        };
    }

    public static final kotlin.jvm.functions.Function0<kotlin.Unit> onDismissAction(final com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState actionExecutionState, final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel, final com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto activityTransactionDto) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionExecutionState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionDetailViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionDto, "");
        return new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.common.factory.ActivityActionBottomSheetHandlerKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.activity.ui.common.factory.ActivityActionBottomSheetHandlerKt.m11806$r8$lambda$jG8GWzidmlOlLi3LucXYfRku5E(com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState.this, bottomSheetController, function0, activityTransactionDetailViewModel, activityTransactionDto);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9ipeDG6xRq92IOvUSftipcs2bLU(com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel, com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        activityTransactionDetailViewModel.executeAction$activity_prodRelease(activityActionModel);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$FsTDMgQ2DKVWuf_KCkupFOoF-yM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11805$r8$lambda$FsTDMgQ2DKVWuf_KCkupFOoFyM(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState actionExecutionState, com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel, com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto activityTransactionDto, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        ActionConfirmationHandler(activityActionModel, actionExecutionState, bottomSheetController, activityTransactionDetailViewModel, activityTransactionDto, function0, function1, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$jG8GWzidmlOlLi3-LucXYfRku5E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11806$r8$lambda$jG8GWzidmlOlLi3LucXYfRku5E(com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState actionExecutionState, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel, com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto activityTransactionDto) {
        boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(actionExecutionState, com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState.Success.INSTANCE);
        bottomSheetController.hideSheet();
        function0.invoke();
        activityTransactionDetailViewModel.resetActionExecutionState$activity_prodRelease();
        if (areEqual) {
            activityTransactionDetailViewModel.fetchActivityDetailResult$activity_prodRelease(activityTransactionDto);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pzG2Rse_0XSbeex0pJ585Av8cnw(com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel, com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState actionExecutionState, com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto activityTransactionDto, com.paypal.oslo.api.graphql.schema.type.ActivityActionType activityActionType) {
        if (activityActionType != null && com.paypal.oslo.feature.activity.ui.common.factory.ActivityActionBottomSheetHandlerKt.WhenMappings.$EnumSwitchMapping$0[activityActionType.ordinal()] == 1) {
            activityTransactionDetailViewModel.invokeAction$activity_prodRelease(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel.copy$default(activityActionModel, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.LEARN_TAX_LAW, null, null, 6, null));
            bottomSheetController.hideSheet();
            function0.invoke();
            activityTransactionDetailViewModel.resetActionExecutionState$activity_prodRelease();
        } else {
            onDismissAction(actionExecutionState, bottomSheetController, function0, activityTransactionDetailViewModel, activityTransactionDto).invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.LEARN_TAX_LAW.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
