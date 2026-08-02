package com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/listener/CommsTokenRefreshListenerImpl;", "Lcom/paypal/oslo/feature/pushnotification/shared/domain/listener/CommsTokenRefreshListener;", "<init>", "()V", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "onTokenRefresh", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommsTokenRefreshListenerImpl implements com.paypal.oslo.feature.pushnotification.shared.domain.listener.CommsTokenRefreshListener {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CommsTokenRefreshListenerImpl() {
    }

    @Override // com.paypal.oslo.feature.pushnotification.shared.domain.listener.CommsTokenRefreshListener
    public final void onTokenRefresh(java.lang.String token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "FCM token received for Comms", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, token)), 2, null);
    }
}
