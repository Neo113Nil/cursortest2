package com.paypal.oslo.core.pushnotification.data.click;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\r*\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/data/click/NotificationClickReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/content/Intent;Ljava/lang/String;)Ljava/util/Map;", "Lcom/paypal/oslo/core/pushnotification/data/click/NotificationClickDispatcher;", "clickDispatcher", "Lcom/paypal/oslo/core/pushnotification/data/click/NotificationClickDispatcher;", "getClickDispatcher", "()Lcom/paypal/oslo/core/pushnotification/data/click/NotificationClickDispatcher;", "setClickDispatcher", "(Lcom/paypal/oslo/core/pushnotification/data/click/NotificationClickDispatcher;)V", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.hilt.android.AndroidEntryPoint
/* loaded from: classes10.dex */
public final class NotificationClickReceiver extends com.paypal.oslo.core.pushnotification.data.click.Hilt_NotificationClickReceiver {
    public static final java.lang.String ACTION_NOTIFICATION_ACTION_CLICK = "com.paypal.oslo.NOTIFICATION_ACTION_CLICK";
    public static final java.lang.String EXTRA_ACTION_ID = "action_id";
    public static final java.lang.String EXTRA_ACTION_METADATA = "action_metadata";
    public static final java.lang.String EXTRA_METADATA = "metadata";
    public static final java.lang.String EXTRA_NOTIFICATION_ID = "notification_id";

    @javax.inject.Inject
    public com.paypal.oslo.core.pushnotification.data.click.NotificationClickDispatcher clickDispatcher;

    public final com.paypal.oslo.core.pushnotification.data.click.NotificationClickDispatcher getClickDispatcher() {
        com.paypal.oslo.core.pushnotification.data.click.NotificationClickDispatcher notificationClickDispatcher = this.clickDispatcher;
        if (notificationClickDispatcher != null) {
            return notificationClickDispatcher;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setClickDispatcher(com.paypal.oslo.core.pushnotification.data.click.NotificationClickDispatcher notificationClickDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationClickDispatcher, "");
        this.clickDispatcher = notificationClickDispatcher;
    }

    @Override // com.paypal.oslo.core.pushnotification.data.click.Hilt_NotificationClickReceiver, android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick.Action action;
        java.lang.String str;
        super.onReceive(context, intent);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        java.lang.String stringExtra = intent.getStringExtra(EXTRA_NOTIFICATION_ID);
        com.paypal.android.logger.Logger logger = com.paypal.oslo.core.pushnotification.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        java.lang.String action2 = intent.getAction();
        if (action2 == null) {
            action2 = "null";
        }
        pairArr[0] = kotlin.TuplesKt.to("action", action2);
        pairArr[1] = kotlin.TuplesKt.to(EXTRA_NOTIFICATION_ID, stringExtra);
        com.paypal.android.logger.Logger.d$default(logger, "Notification click received", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        if (!kotlin.jvm.internal.Intrinsics.areEqual(intent.getAction(), ACTION_NOTIFICATION_ACTION_CLICK)) {
            com.paypal.android.logger.Logger logger2 = com.paypal.oslo.core.pushnotification.LoggerKt.log;
            java.lang.String action3 = intent.getAction();
            com.paypal.android.logger.Logger.w$default(logger2, "Unknown action", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", action3 != null ? action3 : "null")), null, 4, null);
            return;
        }
        java.lang.String stringExtra2 = intent.getStringExtra(EXTRA_NOTIFICATION_ID);
        java.lang.String stringExtra3 = intent.getStringExtra("action_id");
        java.lang.String str2 = stringExtra2;
        if (str2 == null || kotlin.text.StringsKt.isBlank(str2) || (str = stringExtra3) == null || kotlin.text.StringsKt.isBlank(str)) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.pushnotification.LoggerKt.log, "Missing notification ID or action ID in action click intent", null, null, null, 14, null);
            action = null;
        } else {
            action = new com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick.Action(stringExtra2, getHighResolutionOutputSizeshNQ4ISI(intent, "metadata"), stringExtra3, getHighResolutionOutputSizeshNQ4ISI(intent, EXTRA_ACTION_METADATA));
        }
        if (action != null) {
            getClickDispatcher().dispatchClick(action);
        }
    }

    private static java.util.Map<java.lang.String, java.lang.String> getHighResolutionOutputSizeshNQ4ISI(android.content.Intent intent, java.lang.String str) {
        java.util.HashMap hashMap;
        java.util.LinkedHashMap linkedHashMap = null;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            hashMap = (java.util.HashMap) intent.getSerializableExtra(str, java.util.HashMap.class);
        } else {
            java.io.Serializable serializableExtra = intent.getSerializableExtra(str);
            hashMap = serializableExtra instanceof java.util.HashMap ? (java.util.HashMap) serializableExtra : null;
        }
        if (hashMap != null) {
            java.util.HashMap hashMap2 = hashMap;
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(hashMap2.size()));
            for (java.util.Map.Entry entry : hashMap2.entrySet()) {
                linkedHashMap2.put(entry.getKey().toString(), entry.getValue());
            }
            linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(linkedHashMap2.size()));
            for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue().toString());
            }
        }
        return linkedHashMap == null ? kotlin.collections.MapsKt.emptyMap() : linkedHashMap;
    }
}
