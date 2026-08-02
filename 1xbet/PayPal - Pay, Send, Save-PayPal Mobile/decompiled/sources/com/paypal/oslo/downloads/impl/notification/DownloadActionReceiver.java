package com.paypal.oslo.downloads.impl.notification;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/downloads/impl/notification/DownloadActionReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lcom/paypal/oslo/downloads/impl/notification/DownloadActionHandler;", "handler", "Lcom/paypal/oslo/downloads/impl/notification/DownloadActionHandler;", "getHandler", "()Lcom/paypal/oslo/downloads/impl/notification/DownloadActionHandler;", "setHandler", "(Lcom/paypal/oslo/downloads/impl/notification/DownloadActionHandler;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.hilt.android.AndroidEntryPoint
/* loaded from: classes10.dex */
public final class DownloadActionReceiver extends com.paypal.oslo.downloads.impl.notification.Hilt_DownloadActionReceiver {

    @javax.inject.Inject
    public com.paypal.oslo.downloads.impl.notification.DownloadActionHandler handler;

    public final com.paypal.oslo.downloads.impl.notification.DownloadActionHandler getHandler() {
        com.paypal.oslo.downloads.impl.notification.DownloadActionHandler downloadActionHandler = this.handler;
        if (downloadActionHandler != null) {
            return downloadActionHandler;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setHandler(com.paypal.oslo.downloads.impl.notification.DownloadActionHandler downloadActionHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadActionHandler, "");
        this.handler = downloadActionHandler;
    }

    @Override // com.paypal.oslo.downloads.impl.notification.Hilt_DownloadActionReceiver, android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        super.onReceive(context, intent);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        getHandler().handleIntent(intent, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.downloads.impl.notification.DownloadActionReceiver$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.downloads.impl.notification.DownloadActionReceiver.$r8$lambda$Fk3ec_DQIf240NVAdKuouEvefi4(com.paypal.oslo.downloads.impl.notification.DownloadActionReceiver.this);
            }
        });
    }

    public static /* synthetic */ android.content.BroadcastReceiver.PendingResult $r8$lambda$Fk3ec_DQIf240NVAdKuouEvefi4(com.paypal.oslo.downloads.impl.notification.DownloadActionReceiver downloadActionReceiver) {
        android.content.BroadcastReceiver.PendingResult goAsync = downloadActionReceiver.goAsync();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(goAsync, "");
        return goAsync;
    }
}
