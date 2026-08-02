package com.paypal.oslo.core.telemetry.vendors.adjust;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/adjust/AdjustPushTokenListener;", "Lcom/paypal/oslo/core/telemetry/push/PushTokenListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "onPushTokenReceived", "(Ljava/lang/String;)V", "Camera2StreamConfigurationMap", "Landroid/content/Context;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AdjustPushTokenListener implements com.paypal.oslo.core.telemetry.push.PushTokenListener {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.content.Context getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public AdjustPushTokenListener(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighResolutionOutputSizeshNQ4ISI = context;
    }

    @Override // com.paypal.oslo.core.telemetry.push.PushTokenListener
    public final void onPushTokenReceived(java.lang.String token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "[PushToken] Setting token for Adjust", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, token)), 2, null);
        com.adjust.sdk.Adjust.setPushToken(token, this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
