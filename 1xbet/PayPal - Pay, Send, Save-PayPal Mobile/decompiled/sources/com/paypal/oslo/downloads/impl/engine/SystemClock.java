package com.paypal.oslo.downloads.impl.engine;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/downloads/impl/engine/SystemClock;", "Lcom/paypal/oslo/downloads/impl/engine/Clock;", "<init>", "()V", "", "currentTimeMillis", "()J"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SystemClock implements com.paypal.oslo.downloads.impl.engine.Clock {
    public static final com.paypal.oslo.downloads.impl.engine.SystemClock INSTANCE = new com.paypal.oslo.downloads.impl.engine.SystemClock();

    private SystemClock() {
    }

    @Override // com.paypal.oslo.downloads.impl.engine.Clock
    public final long currentTimeMillis() {
        return java.lang.System.currentTimeMillis();
    }
}
