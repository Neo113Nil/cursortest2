package com.paypal.oslo.feature.activity.ui.detail.view.compose;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/ActivityDetailTransactionIdComposableMapper;", "Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/mapper/IActivityDetailSectionComposableMapper;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailTransactionCopyableSectionModel;", "<init>", "()V", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "model", "", "canHandle", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;)Z", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailBaseSectionModel;", "getBaseSectionUIModel", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailTransactionCopyableSectionModel;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailBaseSectionModel;", "", "RenderComposable", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailTransactionCopyableSectionModel;Landroidx/compose/runtime/Composer;I)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityDetailTransactionIdComposableMapper implements com.paypal.oslo.feature.activity.ui.detail.view.compose.mapper.IActivityDetailSectionComposableMapper<com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailTransactionCopyableSectionModel> {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailTransactionIdComposableMapper INSTANCE = new com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailTransactionIdComposableMapper();

    private ActivityDetailTransactionIdComposableMapper() {
    }

    @Override // com.paypal.oslo.feature.activity.ui.detail.view.compose.mapper.IActivityDetailSectionComposableMapper
    public final boolean canHandle(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel model) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
        return model instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailTransactionCopyableSectionModel;
    }

    @Override // com.paypal.oslo.feature.activity.ui.detail.view.compose.mapper.IActivityDetailSectionComposableMapper
    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailBaseSectionModel getBaseSectionUIModel(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailTransactionCopyableSectionModel model) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
        return model.getActivityDetailSectionUIModel();
    }

    @Override // com.paypal.oslo.feature.activity.ui.detail.view.compose.mapper.IActivityDetailSectionComposableMapper
    public final void RenderComposable(final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailTransactionCopyableSectionModel transactionDetailTransactionCopyableSectionModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionDetailTransactionCopyableSectionModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-212881453);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(transactionDetailTransactionCopyableSectionModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-212881453, i2, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailTransactionIdComposableMapper.RenderComposable (ActivityDetailTransactionIdComposableMapper.kt:52)");
            }
            com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailTransactionIdComposableMapperKt.ActivityTransactionDetailTransactionIdCompose(transactionDetailTransactionCopyableSectionModel.getActivityDetailSectionUIModel(), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailTransactionIdComposableMapper$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailTransactionIdComposableMapper.$r8$lambda$ts6sN1ZD5XryOZo2gFyOFpSY02U(com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailTransactionIdComposableMapper.this, transactionDetailTransactionCopyableSectionModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ts6sN1ZD5XryOZo2gFyOFpSY02U(com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailTransactionIdComposableMapper activityDetailTransactionIdComposableMapper, com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailTransactionCopyableSectionModel transactionDetailTransactionCopyableSectionModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        activityDetailTransactionIdComposableMapper.RenderComposable(transactionDetailTransactionCopyableSectionModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
