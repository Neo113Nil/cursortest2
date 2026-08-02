package com.paypal.android.logger;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/android/logger/LogHandlerChain;", "Lcom/paypal/android/logger/LogHandler;", "<init>", "()V", "handler", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Lcom/paypal/android/logger/LogHandler;)Lcom/paypal/android/logger/LogHandlerChain;", "Lcom/paypal/android/logger/Log;", "log", "", "handle", "(Lcom/paypal/android/logger/Log;)V", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "", "getChain", "()Ljava/util/List;", "chain"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LogHandlerChain implements com.paypal.android.logger.LogHandler {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.List<com.paypal.android.logger.LogHandler> getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();

    public final java.util.List<com.paypal.android.logger.LogHandler> getChain() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final com.paypal.android.logger.LogHandlerChain add(com.paypal.android.logger.LogHandler handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        this.getHighResolutionOutputSizeshNQ4ISI.add(handler);
        return this;
    }

    @Override // com.paypal.android.logger.LogHandler
    public final void handle(com.paypal.android.logger.Log log) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(log, "");
        java.util.Iterator<com.paypal.android.logger.LogHandler> it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
        while (it.hasNext()) {
            it.next().handle(log);
        }
    }
}
