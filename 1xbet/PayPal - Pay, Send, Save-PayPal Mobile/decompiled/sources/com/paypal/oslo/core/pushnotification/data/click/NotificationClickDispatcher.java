package com.paypal.oslo.core.pushnotification.data.click;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001c\b\u0007\u0012\u0011\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u001f\u0010\u000f\u001a\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/data/click/NotificationClickDispatcher;", "", "", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationClickHandler;", "Lkotlin/jvm/JvmSuppressWildcards;", "handlers", "<init>", "(Ljava/util/Set;)V", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationClick;", com.paypal.oslo.feature.merchantbanking.api.analytics.MerchantBankingAnalytics.AccountNumbersScreen.NAVIGATION_TYPE, "", "dispatchClick", "(Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationClick;)V", "getHighSpeedVideoFpsRanges", "Ljava/util/Set;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NotificationClickDispatcher {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Set<com.paypal.oslo.core.pushnotification.domain.notification.NotificationClickHandler> getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public NotificationClickDispatcher(java.util.Set<com.paypal.oslo.core.pushnotification.domain.notification.NotificationClickHandler> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.getHighSpeedVideoFpsRangesFor = set;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchClick(com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick click) {
        java.lang.Object obj;
        char c;
        java.lang.String simpleName;
        boolean onNotificationClicked;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(click, "");
        java.lang.String str = click.getMetadata().get("MID");
        if (str == null) {
            str = click.getMetadata().get("content_id");
        }
        java.lang.String str2 = str;
        java.lang.String str3 = click.getMetadata().get("CID");
        if (str3 == null) {
            str3 = click.getMetadata().get("campaign_id");
        }
        java.lang.String str4 = str3;
        com.paypal.android.logger.Logger logger = com.paypal.oslo.core.pushnotification.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[4];
        java.lang.String simpleName2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(click.getClass()).getSimpleName();
        if (simpleName2 == null) {
            simpleName2 = "";
        }
        char c2 = 0;
        pairArr[0] = kotlin.TuplesKt.to("click_type", simpleName2);
        pairArr[1] = kotlin.TuplesKt.to(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, click.getNotificationId());
        pairArr[2] = kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, str2);
        pairArr[3] = kotlin.TuplesKt.to("campaign_id", str4);
        java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(pairArr);
        java.lang.Object obj2 = com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER;
        com.paypal.android.logger.Logger.d$default(logger, "Dispatching notification click", mapOf, null, 4, null);
        java.util.Set<com.paypal.oslo.core.pushnotification.domain.notification.NotificationClickHandler> set = this.getHighSpeedVideoFpsRangesFor;
        if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
            for (com.paypal.oslo.core.pushnotification.domain.notification.NotificationClickHandler notificationClickHandler : set) {
                try {
                    onNotificationClicked = notificationClickHandler.onNotificationClicked(click);
                    if (onNotificationClicked) {
                        com.paypal.android.logger.Logger logger2 = com.paypal.oslo.core.pushnotification.LoggerKt.log;
                        kotlin.Pair[] pairArr2 = new kotlin.Pair[4];
                        java.lang.String simpleName3 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(notificationClickHandler.getClass()).getSimpleName();
                        if (simpleName3 == null) {
                            simpleName3 = "";
                        }
                        pairArr2[c2] = kotlin.TuplesKt.to("handler", simpleName3);
                        pairArr2[1] = kotlin.TuplesKt.to(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, click.getNotificationId());
                        obj = obj2;
                        try {
                            pairArr2[2] = kotlin.TuplesKt.to(obj, str2);
                            c = 3;
                            try {
                                pairArr2[3] = kotlin.TuplesKt.to("campaign_id", str4);
                                com.paypal.android.logger.Logger.d$default(logger2, "Click handled", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
                            } catch (java.lang.Exception e) {
                                e = e;
                                com.paypal.android.logger.Logger logger3 = com.paypal.oslo.core.pushnotification.LoggerKt.log;
                                kotlin.Pair[] pairArr3 = new kotlin.Pair[4];
                                simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(notificationClickHandler.getClass()).getSimpleName();
                                if (simpleName == null) {
                                    simpleName = "";
                                }
                                pairArr3[0] = kotlin.TuplesKt.to("handler", simpleName);
                                pairArr3[1] = kotlin.TuplesKt.to(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, click.getNotificationId());
                                pairArr3[2] = kotlin.TuplesKt.to(obj, str2);
                                pairArr3[c] = kotlin.TuplesKt.to("campaign_id", str4);
                                com.paypal.android.logger.Logger.e$default(logger3, "Click handler error", kotlin.collections.MapsKt.mapOf(pairArr3), null, e, 4, null);
                                obj2 = obj;
                                c2 = 0;
                            }
                        } catch (java.lang.Exception e2) {
                            e = e2;
                            c = 3;
                            com.paypal.android.logger.Logger logger32 = com.paypal.oslo.core.pushnotification.LoggerKt.log;
                            kotlin.Pair[] pairArr32 = new kotlin.Pair[4];
                            simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(notificationClickHandler.getClass()).getSimpleName();
                            if (simpleName == null) {
                            }
                            pairArr32[0] = kotlin.TuplesKt.to("handler", simpleName);
                            pairArr32[1] = kotlin.TuplesKt.to(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, click.getNotificationId());
                            pairArr32[2] = kotlin.TuplesKt.to(obj, str2);
                            pairArr32[c] = kotlin.TuplesKt.to("campaign_id", str4);
                            com.paypal.android.logger.Logger.e$default(logger32, "Click handler error", kotlin.collections.MapsKt.mapOf(pairArr32), null, e, 4, null);
                            obj2 = obj;
                            c2 = 0;
                        }
                    } else {
                        obj = obj2;
                    }
                } catch (java.lang.Exception e3) {
                    e = e3;
                    obj = obj2;
                }
                if (onNotificationClicked) {
                    return;
                }
                obj2 = obj;
                c2 = 0;
            }
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.pushnotification.LoggerKt.log, "No handler claimed notification click", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, click.getNotificationId()), kotlin.TuplesKt.to(obj2, str2), kotlin.TuplesKt.to("campaign_id", str4)), null, 4, null);
    }
}
