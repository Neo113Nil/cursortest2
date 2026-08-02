package com.paypal.oslo.feature.activity.ui.ledger.view.compose.states;

@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rH\u0001¢\u0006\u0002\u0010\u000f\u001a3\u0010\u0010\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\u0003¢\u0006\u0002\u0010\u0013\u001aE\u0010\u0014\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0001¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b¨\u0006\u001c"}, d2 = {"SetActivityLedgerErrorResult", "", "uiActivityState", "Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState$Failure;", "items", "Landroidx/compose/runtime/MutableState;", "", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "viewModel", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityLedgerViewModel;", "ledgerScreenState", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerScreenState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent;", "(Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState$Failure;Landroidx/compose/runtime/MutableState;Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityLedgerViewModel;Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerScreenState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "SetHeaderForFilterIfApplicable", "filterHeaderData", "Lcom/paypal/oslo/feature/activity/domain/ledger/remote/ActivityItemsResult;", "(Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerScreenState;Lcom/paypal/oslo/feature/activity/domain/ledger/remote/ActivityItemsResult;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;I)V", "RenderActivityLedgerUIErrorState", "errorData", "Lcom/paypal/oslo/feature/activity/domain/base/error/ActivityErrorUIModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityLedgerViewModel;Lcom/paypal/oslo/feature/activity/domain/base/error/ActivityErrorUIModel;Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerScreenState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RenderActivityLedgerUIErrorStatePreview", "(Landroidx/compose/runtime/Composer;I)V", "activity_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityLedgerErrorContentComposeKt {
    public static final void SetActivityLedgerErrorResult(final com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Failure failure, final androidx.compose.runtime.MutableState<java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>> mutableState, final com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState activityLedgerScreenState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerScreenState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1595709963);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(failure) : startRestartGroup.changedInstance(failure) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(mutableState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(activityLedgerViewModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(activityLedgerScreenState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1595709963, i2, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.SetActivityLedgerErrorResult (ActivityLedgerErrorContentCompose.kt:50)");
            }
            com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult result = failure.getResult();
            if (result == null) {
                startRestartGroup.startReplaceGroup(1097780150);
            } else {
                startRestartGroup.startReplaceGroup(1097780151);
                com.paypal.oslo.feature.activity.domain.base.result.IActivityRemoteBaseResult data = result.getData();
                getHighSpeedVideoFpsRanges(activityLedgerScreenState, data instanceof com.paypal.oslo.feature.activity.domain.ledger.remote.ActivityItemsResult ? (com.paypal.oslo.feature.activity.domain.ledger.remote.ActivityItemsResult) data : null, mutableState, startRestartGroup, ((i2 >> 9) & 14) | ((i2 << 3) & 896));
                com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError error = result.getError();
                com.paypal.oslo.feature.activity.domain.base.error.ActivityErrorUIModel activityErrorUIModel = error instanceof com.paypal.oslo.feature.activity.domain.base.error.ActivityErrorUIModel ? (com.paypal.oslo.feature.activity.domain.base.error.ActivityErrorUIModel) error : null;
                if (activityErrorUIModel != null) {
                    startRestartGroup.startReplaceGroup(-1838426465);
                    int i3 = i2 >> 3;
                    RenderActivityLedgerUIErrorState(activityLedgerViewModel, activityErrorUIModel, activityLedgerScreenState, function1, null, startRestartGroup, ((i2 >> 6) & 14) | (i3 & 896) | (i3 & 7168), 16);
                    startRestartGroup.endReplaceGroup();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } else {
                    startRestartGroup.startReplaceGroup(-1838426466);
                    startRestartGroup.endReplaceGroup();
                }
            }
            startRestartGroup.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerErrorContentComposeKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerErrorContentComposeKt.m11930$r8$lambda$f_o5dyXQzsUP_qMmW44YwQ76e0(com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Failure.this, mutableState, activityLedgerViewModel, activityLedgerScreenState, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState activityLedgerScreenState, final com.paypal.oslo.feature.activity.domain.ledger.remote.ActivityItemsResult activityItemsResult, final androidx.compose.runtime.MutableState<java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>> mutableState, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1283102315);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(activityLedgerScreenState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(activityItemsResult) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(mutableState) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1283102315, i2, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.SetHeaderForFilterIfApplicable (ActivityLedgerErrorContentCompose.kt:73)");
            }
            if ((activityLedgerScreenState instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerFilterState) && activityItemsResult != null) {
                mutableState.setValue(activityItemsResult.getActivityItemDomainList$activity_prodRelease());
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerErrorContentComposeKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerErrorContentComposeKt.$r8$lambda$sr3MvvvVuonvu_VP7SixM7ryW8g(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.this, activityItemsResult, mutableState, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RenderActivityLedgerUIErrorState(final com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, final com.paypal.oslo.feature.activity.domain.base.error.ActivityErrorUIModel activityErrorUIModel, final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState activityLedgerScreenState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityErrorUIModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerScreenState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1957825333);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(activityLedgerViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(activityErrorUIModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(activityLedgerScreenState) ? 256 : 128;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if (startRestartGroup.shouldExecute((i3 & 8339) == 8338, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1957825333, i3, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.RenderActivityLedgerUIErrorState (ActivityLedgerErrorContentCompose.kt:100)");
                }
                com.paypal.oslo.core.navigation.scene.L1ContentInsets l1ContentInsets = (com.paypal.oslo.core.navigation.scene.L1ContentInsets) startRestartGroup.consume(com.paypal.oslo.core.navigation.scene.LocalL1ContentInsetsKt.getLocalL1ContentInsets());
                boolean z = (i3 & 896) == 256;
                boolean changedInstance = startRestartGroup.changedInstance(activityLedgerViewModel);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerErrorContentComposeKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerErrorContentComposeKt.$r8$lambda$Rh68lShD44Y1IqsWXNZE8dQ635w(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.this, activityLedgerViewModel);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.activity.ui.common.ActivityErrorEmptyStateKt.ActivityErrorEmptyState(activityErrorUIModel, (kotlin.jvm.functions.Function0) rememberedValue, androidx.compose.foundation.layout.PaddingKt.padding(modifier3, androidx.compose.foundation.layout.PaddingKt.m1703PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, l1ContentInsets.m11616getBottomD9Ej5fM(), 7, null)), startRestartGroup, (i3 >> 3) & 14, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerErrorContentComposeKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerErrorContentComposeKt.$r8$lambda$sv8b9g725AEmkwAfRq30fEahYlQ(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel.this, activityErrorUIModel, activityLedgerScreenState, function1, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 8339) == 8338, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GF0XqIwGRq9X35nYxiIVCkEWKN0(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent activityLedgerEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Rh68lShD44Y1IqsWXNZE8dQ635w(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState activityLedgerScreenState, com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel) {
        if (activityLedgerScreenState instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerInitialState) {
            if (activityLedgerViewModel != null) {
                activityLedgerViewModel.fetchActivityLedgerItems$activity_prodRelease(((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerInitialState) activityLedgerScreenState).getActivityFilterType());
            }
        } else {
            if (!(activityLedgerScreenState instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerFilterState)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (activityLedgerViewModel != null) {
                activityLedgerViewModel.fetchActivityLedgerItems$activity_prodRelease(((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerFilterState) activityLedgerScreenState).getActivityFilterType());
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dx3QODyoyYqHt3WFzAjCEkUa95U(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1263177370);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1263177370, updateChangedFlags, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.RenderActivityLedgerUIErrorStatePreview (ActivityLedgerErrorContentCompose.kt:120)");
            }
            com.paypal.oslo.feature.activity.domain.base.error.ActivityErrorUIModel activityErrorUIModel = new com.paypal.oslo.feature.activity.domain.base.error.ActivityErrorUIModel(java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_error_state_something_went_wrong), java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_details_error_screen_subtitle), com.paypal.oslo.feature.activity.R.string.feature_activity_error_state_retry_text, null, null);
            com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerInitialState ledgerInitialState = new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerInitialState(null, 1, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerErrorContentComposeKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerErrorContentComposeKt.$r8$lambda$GF0XqIwGRq9X35nYxiIVCkEWKN0((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            RenderActivityLedgerUIErrorState(null, activityErrorUIModel, ledgerInitialState, (kotlin.jvm.functions.Function1) rememberedValue, androidx.compose.ui.Modifier.INSTANCE, startRestartGroup, 27654, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerErrorContentComposeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerErrorContentComposeKt.$r8$lambda$dx3QODyoyYqHt3WFzAjCEkUa95U(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$f_o5dyXQzsUP_-qMmW44YwQ76e0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11930$r8$lambda$f_o5dyXQzsUP_qMmW44YwQ76e0(com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Failure failure, androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState activityLedgerScreenState, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        SetActivityLedgerErrorResult(failure, mutableState, activityLedgerViewModel, activityLedgerScreenState, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sr3MvvvVuonvu_VP7SixM7ryW8g(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState activityLedgerScreenState, com.paypal.oslo.feature.activity.domain.ledger.remote.ActivityItemsResult activityItemsResult, androidx.compose.runtime.MutableState mutableState, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(activityLedgerScreenState, activityItemsResult, mutableState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sv8b9g725AEmkwAfRq30fEahYlQ(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, com.paypal.oslo.feature.activity.domain.base.error.ActivityErrorUIModel activityErrorUIModel, com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState activityLedgerScreenState, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RenderActivityLedgerUIErrorState(activityLedgerViewModel, activityErrorUIModel, activityLedgerScreenState, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
