package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class DoubleTapScanner extends SurfaceHub implements AccentFactory {
    public DoubleTapScanner(int i) {
        super(1, Integer.MAX_VALUE, RailAssembler.notifyMessage);
        injectMetric(Integer.valueOf(i));
    }

    public final boolean resetValue(int i) {
        boolean injectMetric;
        synchronized (this) {
            injectMetric = injectMetric(Integer.valueOf(((Number) bindBody()).intValue() + i));
        }
        return injectMetric;
    }

    @Override // com.goldenboot.saga.zone.AccentFactory
    /* renamed from: resolveDelta, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(((Number) bindBody()).intValue());
        }
        return valueOf;
    }
}
