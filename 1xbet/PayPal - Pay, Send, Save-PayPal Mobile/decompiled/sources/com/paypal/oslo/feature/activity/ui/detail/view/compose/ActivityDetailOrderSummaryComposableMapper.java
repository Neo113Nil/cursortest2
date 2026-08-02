package com.paypal.oslo.feature.activity.ui.detail.view.compose;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/ActivityDetailOrderSummaryComposableMapper;", "Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/mapper/IActivityDetailSectionComposableMapper;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailOrderSummarySectionModel;", "<init>", "()V", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "model", "", "canHandle", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;)Z", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailBaseSectionModel;", "getBaseSectionUIModel", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailOrderSummarySectionModel;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailBaseSectionModel;", "", "RenderComposable", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailOrderSummarySectionModel;Landroidx/compose/runtime/Composer;I)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityDetailOrderSummaryComposableMapper implements com.paypal.oslo.feature.activity.ui.detail.view.compose.mapper.IActivityDetailSectionComposableMapper<com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailOrderSummarySectionModel> {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapper INSTANCE = new com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapper();

    private ActivityDetailOrderSummaryComposableMapper() {
    }

    @Override // com.paypal.oslo.feature.activity.ui.detail.view.compose.mapper.IActivityDetailSectionComposableMapper
    public final boolean canHandle(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel model) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
        return model instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailOrderSummarySectionModel;
    }

    @Override // com.paypal.oslo.feature.activity.ui.detail.view.compose.mapper.IActivityDetailSectionComposableMapper
    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailBaseSectionModel getBaseSectionUIModel(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailOrderSummarySectionModel model) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
        return model.getActivityDetailSectionUIModel();
    }

    @Override // com.paypal.oslo.feature.activity.ui.detail.view.compose.mapper.IActivityDetailSectionComposableMapper
    public final void RenderComposable(final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailOrderSummarySectionModel transactionDetailOrderSummarySectionModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionDetailOrderSummarySectionModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1360301612);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(transactionDetailOrderSummarySectionModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1360301612, i2, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapper.RenderComposable (ActivityDetailOrderSummaryComposableMapper.kt:74)");
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
            com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailOrderSummarySectionModel activityDetailSectionUIModel = transactionDetailOrderSummarySectionModel.getActivityDetailSectionUIModel();
            boolean changed = startRestartGroup.changed(navigator);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapper$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapper.m11839$r8$lambda$pErT8K7w2soJf4VYxYZU8pDXHY(com.paypal.oslo.core.navigation.AppNavigator.this, (java.lang.String) obj, (java.lang.String) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapperKt.ActivityTransactionDetailOrderSummaryCompose(activityDetailSectionUIModel, (kotlin.jvm.functions.Function2) rememberedValue, startRestartGroup, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapper$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapper.$r8$lambda$L9T0n7eTql0a9PoFLcHBoSBAPPc(com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapper.this, transactionDetailOrderSummarySectionModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$L9T0n7eTql0a9PoFLcHBoSBAPPc(com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapper activityDetailOrderSummaryComposableMapper, com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailOrderSummarySectionModel transactionDetailOrderSummarySectionModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        activityDetailOrderSummaryComposableMapper.RenderComposable(transactionDetailOrderSummarySectionModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kc4h1X8oo_QbGdYRG_JLWXLCzws(java.lang.String str, java.lang.String str2, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination("activity_details", str, str2, (java.lang.String) null, 8, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$pErT8K7w2soJ-f4VYxYZU8pDXHY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11839$r8$lambda$pErT8K7w2soJf4VYxYZU8pDXHY(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, final java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (appNavigator != null) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapper$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapper.$r8$lambda$kc4h1X8oo_QbGdYRG_JLWXLCzws(str, str2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
