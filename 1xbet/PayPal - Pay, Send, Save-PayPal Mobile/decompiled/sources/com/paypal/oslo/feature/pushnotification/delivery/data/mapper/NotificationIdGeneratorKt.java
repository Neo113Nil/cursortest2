package com.paypal.oslo.feature.pushnotification.delivery.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "generateUniqueNotificationId", "()Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NotificationIdGeneratorKt {
    public static final java.lang.String generateUniqueNotificationId() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int random = kotlin.ranges.RangesKt.random(new kotlin.ranges.IntRange(0, org.threeten.bp.chrono.HijrahDate.MAX_VALUE_OF_ERA), kotlin.random.Random.INSTANCE);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("notif-");
        sb.append(currentTimeMillis);
        sb.append("-");
        sb.append(random);
        return sb.toString();
    }
}
