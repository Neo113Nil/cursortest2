package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\tJ5\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/goldenboot/saga/zone/ConsumerAlerter;", "", "<init>", "()V", "", "start", "stop", "amount", "growPayload", "(FFF)F", "a", "b", "value", "injectMetric", "rangeMin", "rangeMax", "valueMin", "valueMax", "evictLayout", "(FFFFF)F", "ui-unit"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConsumerAlerter {
    public static final ConsumerAlerter evictLayout = new ConsumerAlerter();
    public static final int growPayload = 0;

    private ConsumerAlerter() {
    }

    public final float evictLayout(float rangeMin, float rangeMax, float valueMin, float valueMax, float value) {
        return growPayload(rangeMin, rangeMax, Math.max(0.0f, Math.min(1.0f, injectMetric(valueMin, valueMax, value))));
    }

    public final float growPayload(float start, float stop, float amount) {
        return start + ((stop - start) * amount);
    }

    public final float injectMetric(float a, float b, float value) {
        if (a == b) {
            return 0.0f;
        }
        return (value - a) / (b - a);
    }
}
