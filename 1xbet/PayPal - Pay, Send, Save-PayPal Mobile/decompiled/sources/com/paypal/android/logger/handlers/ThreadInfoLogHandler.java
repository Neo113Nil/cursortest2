package com.paypal.android.logger.handlers;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r"}, d2 = {"Lcom/paypal/android/logger/handlers/ThreadInfoLogHandler;", "Lcom/paypal/android/logger/LogHandler;", "", "addThreadName", "addThreadId", "<init>", "(ZZ)V", "Lcom/paypal/android/logger/Log;", "log", "", "handle", "(Lcom/paypal/android/logger/Log;)V", "getHighResolutionOutputSizeshNQ4ISI", "Z", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ThreadInfoLogHandler implements com.paypal.android.logger.LogHandler {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    public ThreadInfoLogHandler(boolean z, boolean z2) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoFpsRanges = z2;
    }

    public /* synthetic */ ThreadInfoLogHandler(boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2);
    }

    @Override // com.paypal.android.logger.LogHandler
    public final void handle(com.paypal.android.logger.Log log) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(log, "");
        if (this.getHighSpeedVideoFpsRanges) {
            log.getAttributes().put("thread_id", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            log.getAttributes().put("thread_name", java.lang.Thread.currentThread().getName());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ThreadInfoLogHandler() {
        this(r2, r2, 3, null);
        boolean z = false;
    }
}
