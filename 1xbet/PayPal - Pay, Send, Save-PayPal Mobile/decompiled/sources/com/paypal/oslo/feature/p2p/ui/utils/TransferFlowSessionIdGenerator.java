package com.paypal.oslo.feature.p2p.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/utils/TransferFlowSessionIdGenerator;", "", "<init>", "()V", "", "generate", "()Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicLong;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/atomic/AtomicLong;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TransferFlowSessionIdGenerator {
    public static final com.paypal.oslo.feature.p2p.ui.utils.TransferFlowSessionIdGenerator INSTANCE = new com.paypal.oslo.feature.p2p.ui.utils.TransferFlowSessionIdGenerator();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicLong(java.lang.System.currentTimeMillis() * 1000);
    public static final int $stable = 8;

    private TransferFlowSessionIdGenerator() {
    }

    public final java.lang.String generate() {
        return java.lang.String.valueOf(getHighSpeedVideoFpsRangesFor.getAndIncrement());
    }
}
