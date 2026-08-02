package com.paypal.oslo.feature.activity.api.widget;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0004\b\u0007\u0010\bR#\u0010\u000e\u001a\u0011\u0012\u0004\u0012\u00020\u00020\tj\u0002`\n¢\u0006\u0002\b\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/widget/IActivityWidget;", "", "", "refreshActivities", "()V", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetLifecycleState;", "activityWidgetState", "()Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function0;", "Lcom/paypal/oslo/feature/activity/api/widget/WidgetContent;", "Landroidx/compose/runtime/Composable;", "getContent", "()Lkotlin/jvm/functions/Function2;", "content"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface IActivityWidget {
    kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState> activityWidgetState();

    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getContent();

    void refreshActivities();
}
