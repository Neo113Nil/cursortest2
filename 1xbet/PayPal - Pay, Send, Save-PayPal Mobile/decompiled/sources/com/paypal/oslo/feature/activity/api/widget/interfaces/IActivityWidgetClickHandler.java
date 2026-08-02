package com.paypal.oslo.feature.activity.api.widget.interfaces;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/widget/interfaces/IActivityWidgetClickHandler;", "", "Lcom/paypal/oslo/feature/activity/api/models/ActivityTransactionDto;", "activityTransactionDto", "", "onTransactionClick", "(Lcom/paypal/oslo/feature/activity/api/models/ActivityTransactionDto;)Z", "onSeeMoreClick", "()Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface IActivityWidgetClickHandler {
    default boolean onSeeMoreClick() {
        return false;
    }

    default boolean onTransactionClick(com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto activityTransactionDto) {
        return false;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static boolean onTransactionClick(com.paypal.oslo.feature.activity.api.widget.interfaces.IActivityWidgetClickHandler iActivityWidgetClickHandler, com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto activityTransactionDto) {
            return com.paypal.oslo.feature.activity.api.widget.interfaces.IActivityWidgetClickHandler.super.onTransactionClick(activityTransactionDto);
        }

        @java.lang.Deprecated
        public static boolean onSeeMoreClick(com.paypal.oslo.feature.activity.api.widget.interfaces.IActivityWidgetClickHandler iActivityWidgetClickHandler) {
            return com.paypal.oslo.feature.activity.api.widget.interfaces.IActivityWidgetClickHandler.super.onSeeMoreClick();
        }
    }
}
