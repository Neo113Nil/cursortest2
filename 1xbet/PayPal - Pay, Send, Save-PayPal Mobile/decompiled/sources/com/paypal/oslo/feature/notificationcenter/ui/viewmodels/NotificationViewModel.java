package com.paypal.oslo.feature.notificationcenter.ui.viewmodels;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010J/\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u0010J5\u0010\u0018\u001a\u00020\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u001b2\u0006\u0010\u0015\u001a\u00020\u00142\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010$R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/R \u00101\u001a\b\u0012\u0004\u0012\u00020-008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u0010/R\"\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050,8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010/\u001a\u0004\b8\u00109R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020(0,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010/R \u0010;\u001a\b\u0012\u0004\u0012\u00020(008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u00102\u001a\u0004\b;\u00104"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/ui/viewmodels/NotificationViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/notificationcenter/domain/usecase/GetNotificationsUseCase;", "getNotificationsUseCase", "Lcom/paypal/oslo/feature/notificationcenter/domain/usecase/UpdateNotificationsTrackingStatusUseCase;", "updateNotificationsTrackingStatusUseCase", "Lcom/paypal/oslo/feature/notificationcenter/badge/api/NotificationBadgeManager;", "notificationBadgeManager", "Lcom/paypal/oslo/feature/notificationcenter/domain/provider/TimeProvider;", "timeProvider", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/feature/notificationcenter/domain/usecase/GetNotificationsUseCase;Lcom/paypal/oslo/feature/notificationcenter/domain/usecase/UpdateNotificationsTrackingStatusUseCase;Lcom/paypal/oslo/feature/notificationcenter/badge/api/NotificationBadgeManager;Lcom/paypal/oslo/feature/notificationcenter/domain/provider/TimeProvider;Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "", "onCleared", "()V", "fetchNotifications", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/Notification;", "notification", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationStatus;", "status", "Lkotlin/Function0;", "onSuccess", "updateNotificationsStatus", "(Lcom/paypal/oslo/feature/notificationcenter/domain/model/Notification;Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationStatus;Lkotlin/jvm/functions/Function0;)V", "clearError", "", "notifications", "(Ljava/util/List;Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationStatus;Lkotlin/jvm/functions/Function0;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/notificationcenter/domain/usecase/GetNotificationsUseCase;", "getHighSpeedVideoFpsRanges", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/notificationcenter/domain/usecase/UpdateNotificationsTrackingStatusUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/notificationcenter/badge/api/NotificationBadgeManager;", "Lcom/paypal/oslo/feature/notificationcenter/domain/provider/TimeProvider;", "getTimeProvider", "()Lcom/paypal/oslo/feature/notificationcenter/domain/provider/TimeProvider;", "", "isShowMoreOrLessEnabled", "Z", "()Z", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/notificationcenter/ui/viewmodels/NotificationUIState;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "notificationState", "Lkotlinx/coroutines/flow/StateFlow;", "getNotificationState", "()Lkotlinx/coroutines/flow/StateFlow;", "", "getHighSpeedVideoFpsRangesFor", "errorResId", "getErrorResId", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getOutputMinFrameDuration", "isLoading"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NotificationViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationUIState> Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> errorResId;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.notificationcenter.domain.usecase.GetNotificationsUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.notificationcenter.badge.api.NotificationBadgeManager getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getOutputMinFrameDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.notificationcenter.domain.usecase.UpdateNotificationsTrackingStatusUseCase getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading;
    private final boolean isShowMoreOrLessEnabled;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationUIState> notificationState;
    private final com.paypal.oslo.feature.notificationcenter.domain.provider.TimeProvider timeProvider;

    @javax.inject.Inject
    public NotificationViewModel(com.paypal.oslo.feature.notificationcenter.domain.usecase.GetNotificationsUseCase getNotificationsUseCase, com.paypal.oslo.feature.notificationcenter.domain.usecase.UpdateNotificationsTrackingStatusUseCase updateNotificationsTrackingStatusUseCase, com.paypal.oslo.feature.notificationcenter.badge.api.NotificationBadgeManager notificationBadgeManager, com.paypal.oslo.feature.notificationcenter.domain.provider.TimeProvider timeProvider, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getNotificationsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateNotificationsTrackingStatusUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationBadgeManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.getHighSpeedVideoFpsRanges = getNotificationsUseCase;
        this.getHighSpeedVideoSizes = updateNotificationsTrackingStatusUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = notificationBadgeManager;
        this.timeProvider = timeProvider;
        this.isShowMoreOrLessEnabled = featureGate.checkGate(com.paypal.oslo.feature.notificationcenter.common.NotificationCenterFeatureGates.INSTANCE.getShowMoreOrLess());
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationUIState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationUIState.Loading.INSTANCE);
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.notificationState = MutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow2;
        this.errorResId = MutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow3 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.getOutputMinFrameDuration = MutableStateFlow3;
        this.isLoading = MutableStateFlow3;
    }

    public final com.paypal.oslo.feature.notificationcenter.domain.provider.TimeProvider getTimeProvider() {
        return this.timeProvider;
    }

    /* renamed from: isShowMoreOrLessEnabled, reason: from getter */
    public final boolean getIsShowMoreOrLessEnabled() {
        return this.isShowMoreOrLessEnabled;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationUIState> getNotificationState() {
        return this.notificationState;
    }

    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> getErrorResId() {
        return this.errorResId;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading() {
        return this.isLoading;
    }

    @Override // androidx.view.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.getHighResolutionOutputSizeshNQ4ISI.onNotificationCenterClosed();
    }

    public final void fetchNotifications() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel$fetchNotifications$1(this, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateNotificationsStatus$default(com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel notificationViewModel, com.paypal.oslo.feature.notificationcenter.domain.model.Notification notification, com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus notificationStatus, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        notificationViewModel.updateNotificationsStatus(notification, notificationStatus, (kotlin.jvm.functions.Function0<kotlin.Unit>) function0);
    }

    public final void updateNotificationsStatus(com.paypal.oslo.feature.notificationcenter.domain.model.Notification notification, com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus status, kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notification, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        updateNotificationsStatus(kotlin.collections.CollectionsKt.listOf(notification), status, onSuccess);
    }

    public final void clearError() {
        this.getHighSpeedVideoFpsRangesFor.setValue(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateNotificationsStatus$default(com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel notificationViewModel, java.util.List list, com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus notificationStatus, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        notificationViewModel.updateNotificationsStatus((java.util.List<com.paypal.oslo.feature.notificationcenter.domain.model.Notification>) list, notificationStatus, (kotlin.jvm.functions.Function0<kotlin.Unit>) function0);
    }

    public final void updateNotificationsStatus(java.util.List<com.paypal.oslo.feature.notificationcenter.domain.model.Notification> notifications, com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus status, kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notifications, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel$updateNotificationsStatus$1(status, this, notifications, onSuccess, null), 3, null);
    }

    public static final /* synthetic */ java.lang.Integer access$getNotificationErrorMessage(com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel notificationViewModel, com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus notificationStatus, boolean z) {
        int i;
        int i2;
        int i3 = com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel.WhenMappings.$EnumSwitchMapping$0[notificationStatus.ordinal()];
        if (i3 == 1) {
            if (z) {
                i = com.paypal.oslo.feature.notificationcenter.R.string.feature_notification_center_notification_error_failed_to_mark_as_read_no_internet;
            } else {
                i = com.paypal.oslo.feature.notificationcenter.R.string.feature_notification_center_notification_error_failed_to_mark_as_read;
            }
            return java.lang.Integer.valueOf(i);
        }
        if (i3 != 2) {
            return null;
        }
        if (z) {
            i2 = com.paypal.oslo.feature.notificationcenter.R.string.feature_notification_center_notification_error_failed_to_delete_no_internet;
        } else {
            i2 = com.paypal.oslo.feature.notificationcenter.R.string.feature_notification_center_notification_error_failed_to_delete;
        }
        return java.lang.Integer.valueOf(i2);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus.CLICKED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus.DISMISSED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
