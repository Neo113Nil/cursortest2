package com.paypal.oslo.core.telemetry.vendors.adjust;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/adjust/AdjustDeferredDeepLinkResponseListener;", "Lcom/adjust/sdk/OnDeferredDeeplinkResponseListener;", "<init>", "()V", "Landroid/net/Uri;", "uri", "", "launchReceivedDeeplink", "(Landroid/net/Uri;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdjustDeferredDeepLinkResponseListener implements com.adjust.sdk.OnDeferredDeeplinkResponseListener {
    public static final int $stable = 0;

    @Override // com.adjust.sdk.OnDeferredDeeplinkResponseListener
    public final boolean launchReceivedDeeplink(android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "[Adjust] Received deferred deep link", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("uri", uri.toString())), null, 4, null);
        return true;
    }
}
