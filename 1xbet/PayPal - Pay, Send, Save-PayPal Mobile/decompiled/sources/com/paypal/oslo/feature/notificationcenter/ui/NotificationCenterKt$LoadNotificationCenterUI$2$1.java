package com.paypal.oslo.feature.notificationcenter.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterKt$LoadNotificationCenterUI$2$1", f = "NotificationCenter.kt", i = {}, l = {270}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class NotificationCenterKt$LoadNotificationCenterUI$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.List<com.paypal.oslo.feature.notificationcenter.domain.model.Notification> Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.Set<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.lazy.LazyListState getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.lazy.LazyListState lazyListState = this.getHighSpeedVideoFpsRanges;
            final java.util.List<com.paypal.oslo.feature.notificationcenter.domain.model.Notification> list = this.Camera2StreamConfigurationMap;
            kotlinx.coroutines.flow.Flow debounce = kotlinx.coroutines.flow.FlowKt.debounce(kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterKt$LoadNotificationCenterUI$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterKt$LoadNotificationCenterUI$2$1.getHighSpeedVideoSizes(androidx.compose.foundation.lazy.LazyListState.this, list);
                }
            })), 1000L);
            final java.util.List<com.paypal.oslo.feature.notificationcenter.domain.model.Notification> list2 = this.Camera2StreamConfigurationMap;
            final java.util.Set<java.lang.String> set = this.getHighResolutionOutputSizeshNQ4ISI;
            final com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel notificationViewModel = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (debounce.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterKt$LoadNotificationCenterUI$2$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterKt.updateImpressedNotifications((java.util.List) obj2, list2, set, new com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterKt$LoadNotificationCenterUI$2$1.AnonymousClass2.AnonymousClass1(notificationViewModel));
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                /* renamed from: com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterKt$LoadNotificationCenterUI$2$1$2$1, reason: invalid class name */
                static final /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<java.util.List<? extends com.paypal.oslo.feature.notificationcenter.domain.model.Notification>, com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus, kotlin.jvm.functions.Function0<? extends kotlin.Unit>, kotlin.Unit> {
                    public final void getHighSpeedVideoFpsRangesFor(java.util.List<com.paypal.oslo.feature.notificationcenter.domain.model.Notification> list, com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus notificationStatus, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationStatus, "");
                        ((com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel) this.receiver).updateNotificationsStatus(list, notificationStatus, function0);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final /* synthetic */ kotlin.Unit invoke(java.util.List<? extends com.paypal.oslo.feature.notificationcenter.domain.model.Notification> list, com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus notificationStatus, kotlin.jvm.functions.Function0<? extends kotlin.Unit> function0) {
                        getHighSpeedVideoFpsRangesFor(list, notificationStatus, function0);
                        return kotlin.Unit.INSTANCE;
                    }

                    AnonymousClass1(java.lang.Object obj) {
                        super(3, obj, com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel.class, "updateNotificationsStatus", "updateNotificationsStatus(Ljava/util/List;Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationStatus;Lkotlin/jvm/functions/Function0;)V", 0);
                    }
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.util.List getHighSpeedVideoSizes(androidx.compose.foundation.lazy.LazyListState lazyListState, java.util.List list) {
        java.util.List<androidx.compose.foundation.lazy.LazyListItemInfo> visibleItemsInfo = lazyListState.getLayoutInfo().getVisibleItemsInfo();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = visibleItemsInfo.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.notificationcenter.domain.model.Notification notification = (com.paypal.oslo.feature.notificationcenter.domain.model.Notification) kotlin.collections.CollectionsKt.getOrNull(list, ((androidx.compose.foundation.lazy.LazyListItemInfo) it.next()).getIndex());
            java.lang.String id = notification != null ? notification.getId() : null;
            if (id != null) {
                arrayList.add(id);
            }
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterKt$LoadNotificationCenterUI$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterKt$LoadNotificationCenterUI$2$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationCenterKt$LoadNotificationCenterUI$2$1(androidx.compose.foundation.lazy.LazyListState lazyListState, java.util.List<com.paypal.oslo.feature.notificationcenter.domain.model.Notification> list, java.util.Set<java.lang.String> set, com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel notificationViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterKt$LoadNotificationCenterUI$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = lazyListState;
        this.Camera2StreamConfigurationMap = list;
        this.getHighResolutionOutputSizeshNQ4ISI = set;
        this.getHighSpeedVideoSizes = notificationViewModel;
    }
}
