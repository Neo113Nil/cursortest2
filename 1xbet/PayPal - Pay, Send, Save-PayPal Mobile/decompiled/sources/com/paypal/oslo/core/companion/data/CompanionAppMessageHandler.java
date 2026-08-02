package com.paypal.oslo.core.companion.data;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/core/companion/data/CompanionAppMessageHandler;", "Landroid/os/Handler;", "Lcom/paypal/oslo/core/companion/domain/CompanionConfigurationApi;", "companionConfigurationApi", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/coroutines/CoroutineScope;", "serviceScope", "<init>", "(Lcom/paypal/oslo/core/companion/domain/CompanionConfigurationApi;Lkotlinx/serialization/json/Json;Lkotlinx/coroutines/CoroutineScope;)V", "Landroid/os/Message;", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "", "handleMessage", "(Landroid/os/Message;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/companion/domain/CompanionConfigurationApi;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/serialization/json/Json;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CompanionAppMessageHandler extends android.os.Handler {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.companion.domain.CompanionConfigurationApi getHighSpeedVideoFpsRanges;
    private final kotlinx.serialization.json.Json getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompanionAppMessageHandler(com.paypal.oslo.core.companion.domain.CompanionConfigurationApi companionConfigurationApi, kotlinx.serialization.json.Json json, kotlinx.coroutines.CoroutineScope coroutineScope) {
        super(android.os.Looper.getMainLooper());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companionConfigurationApi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighSpeedVideoFpsRanges = companionConfigurationApi;
        this.getHighSpeedVideoFpsRangesFor = json;
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineScope;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "");
        android.os.Messenger messenger = msg.replyTo;
        if (messenger == null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.companion.LoggerKt.log, "No replyTo Messenger provided in message", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("what", msg)), null, 4, null);
            return;
        }
        int i = msg.what;
        if (i == 1) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, new com.paypal.oslo.core.companion.data.CompanionAppMessageHandler$handleGetConfig$1(this, messenger, null), 3, null);
            return;
        }
        if (i == 5) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, new com.paypal.oslo.core.companion.data.CompanionAppMessageHandler$handleSyncConfig$1(msg.getData().getString(com.paypal.oslo.core.companion.domain.CompanionIpcConstants.KEY_CONFIG_DATA), this, messenger, null), 3, null);
            return;
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.companion.LoggerKt.log, "Unknown message code", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("what", java.lang.Integer.valueOf(msg.what))), null, 4, null);
        java.lang.String concat = "Unknown message code: ".concat(java.lang.String.valueOf(msg.what));
        android.os.Message obtain = android.os.Message.obtain((android.os.Handler) null, -1);
        obtain.setData(androidx.core.os.BundleKt.bundleOf(kotlin.TuplesKt.to("error", concat)));
        try {
            messenger.send(obtain);
        } catch (android.os.RemoteException e) {
            com.paypal.oslo.core.companion.LoggerKt.log.e("Failed to send error response", e);
        }
    }
}
