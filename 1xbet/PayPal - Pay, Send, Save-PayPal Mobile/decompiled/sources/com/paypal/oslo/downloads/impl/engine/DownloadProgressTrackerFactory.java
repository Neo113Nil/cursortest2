package com.paypal.oslo.downloads.impl.engine;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/downloads/impl/engine/DownloadProgressTrackerFactory;", "", "<init>", "()V", "Lcom/paypal/oslo/downloads/impl/engine/DownloadProgressTracker;", "create", "()Lcom/paypal/oslo/downloads/impl/engine/DownloadProgressTracker;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DownloadProgressTrackerFactory {
    @javax.inject.Inject
    public DownloadProgressTrackerFactory() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.paypal.oslo.downloads.impl.engine.DownloadProgressTracker create() {
        return new com.paypal.oslo.downloads.impl.engine.DownloadProgressTracker(null, 1, 0 == true ? 1 : 0);
    }
}
