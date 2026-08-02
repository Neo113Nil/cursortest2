package com.paypal.oslo.feature.activity.ui.detail.view.compose.mapper;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0001H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\f\u0010\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/mapper/IActivityDetailSectionComposableMapper;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "T", "", "model", "", "RenderComposable", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;Landroidx/compose/runtime/Composer;I)V", "", "canHandle", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;)Z", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailBaseSectionModel;", "getBaseSectionUIModel", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailBaseSectionModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface IActivityDetailSectionComposableMapper<T extends com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel> {
    void RenderComposable(T t, androidx.compose.runtime.Composer composer, int i);

    boolean canHandle(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel model);

    com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailBaseSectionModel getBaseSectionUIModel(T model);
}
