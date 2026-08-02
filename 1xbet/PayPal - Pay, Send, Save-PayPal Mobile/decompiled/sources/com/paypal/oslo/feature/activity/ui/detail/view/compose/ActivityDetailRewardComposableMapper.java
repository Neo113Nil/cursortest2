package com.paypal.oslo.feature.activity.ui.detail.view.compose;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/ActivityDetailRewardComposableMapper;", "Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/mapper/IActivityDetailSectionComposableMapper;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailRewardSectionModel;", "<init>", "()V", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "model", "", "canHandle", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;)Z", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailBaseSectionModel;", "getBaseSectionUIModel", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailRewardSectionModel;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailBaseSectionModel;", "", "RenderComposable", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailRewardSectionModel;Landroidx/compose/runtime/Composer;I)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityDetailRewardComposableMapper implements com.paypal.oslo.feature.activity.ui.detail.view.compose.mapper.IActivityDetailSectionComposableMapper<com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailRewardSectionModel> {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapper INSTANCE = new com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapper();

    private ActivityDetailRewardComposableMapper() {
    }

    @Override // com.paypal.oslo.feature.activity.ui.detail.view.compose.mapper.IActivityDetailSectionComposableMapper
    public final boolean canHandle(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel model) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
        return model instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailRewardSectionModel;
    }

    @Override // com.paypal.oslo.feature.activity.ui.detail.view.compose.mapper.IActivityDetailSectionComposableMapper
    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailBaseSectionModel getBaseSectionUIModel(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailRewardSectionModel model) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
        return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailBaseSectionModel(null, null, false, false, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, null);
    }

    @Override // com.paypal.oslo.feature.activity.ui.detail.view.compose.mapper.IActivityDetailSectionComposableMapper
    public final void RenderComposable(final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailRewardSectionModel transactionDetailRewardSectionModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionDetailRewardSectionModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(637636239);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(transactionDetailRewardSectionModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(637636239, i2, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapper.RenderComposable (ActivityDetailRewardComposableMapper.kt:68)");
            }
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
            }
            final com.paypal.oslo.core.navigation.AppNavigator navigator = ((com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel.class), current, (java.lang.String) null, (androidx.lifecycle.ViewModelProvider.Factory) null, empty, startRestartGroup, 0, 0)).getActivityComposeConfig$activity_prodRelease().getNavigator();
            com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardModel activityDetailSectionUIModel = transactionDetailRewardSectionModel.getActivityDetailSectionUIModel();
            boolean changed = startRestartGroup.changed(navigator);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapper$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapper.$r8$lambda$zwStbJN_SEUjQiDG2pKQqh4cBHo(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapperKt.ActivityTransactionDetailRewardCompose(activityDetailSectionUIModel, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapper$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapper.$r8$lambda$fjc1YQQwcsx1s33UrbNZNRcbblE(com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapper.this, transactionDetailRewardSectionModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fjc1YQQwcsx1s33UrbNZNRcbblE(com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapper activityDetailRewardComposableMapper, com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailRewardSectionModel transactionDetailRewardSectionModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        activityDetailRewardComposableMapper.RenderComposable(transactionDetailRewardSectionModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wx4k8Nz0H1_IWIwuCbqdzLJCG3c(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation.RewardsSummaryActivityDestination((java.lang.String) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zwStbJN_SEUjQiDG2pKQqh4cBHo(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        if (appNavigator != null) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapper$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapper.$r8$lambda$wx4k8Nz0H1_IWIwuCbqdzLJCG3c((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
