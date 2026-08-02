package com.paypal.oslo.feature.activity.domain.base.utils;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/utils/ActivityItemUniqueIDTimestampProvider;", "", "<init>", "()V", "", "generateTimestamp$activity_prodRelease", "()J", "Ljava/util/concurrent/atomic/AtomicLong;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/atomic/AtomicLong;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityItemUniqueIDTimestampProvider {
    public static final com.paypal.oslo.feature.activity.domain.base.utils.ActivityItemUniqueIDTimestampProvider INSTANCE = new com.paypal.oslo.feature.activity.domain.base.utils.ActivityItemUniqueIDTimestampProvider();

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicLong(java.lang.System.currentTimeMillis() * 1000);
    public static final int $stable = 8;

    private ActivityItemUniqueIDTimestampProvider() {
    }

    public final long generateTimestamp$activity_prodRelease() {
        return getHighSpeedVideoSizes.getAndIncrement();
    }
}
