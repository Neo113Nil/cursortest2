package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\"\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\b*\f\b\u0002\u0010\f\"\u00020\u00062\u00020\u0006¨\u0006\r"}, d2 = {"Lcom/goldenboot/saga/zone/MarginPort;", "", "evictLayout", "Lcom/goldenboot/saga/zone/MarginPort;", "()Lcom/goldenboot/saga/zone/MarginPort;", "EmptyInterval", "", "growPayload", "I", "TreeColorRed", "injectMetric", "TreeColorBlack", "TreeColor", "ui-graphics_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultConverter {
    private static final Interval<Object> evictLayout = new Interval<>(Float.MAX_VALUE, Float.MIN_VALUE, null);
    private static final int growPayload = 0;
    private static final int injectMetric = 1;

    public static final Interval<Object> evictLayout() {
        return evictLayout;
    }
}
