package com.goldenboot.saga.zone;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class ConnectionFactory implements FooterSupervisor {
    public final TypographyArranger evictLayout;
    public final FlingBuffer growPayload;
    public final long injectMetric;

    public /* synthetic */ ConnectionFactory(long j, boolean z, TypographyArranger typographyArranger, FlingBuffer flingBuffer, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, z, typographyArranger, flingBuffer);
    }

    public static /* synthetic */ ProxySteward releaseHeader(ConnectionFactory connectionFactory, int i, long j, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-0kLqBqw");
        }
        if ((i2 & 2) != 0) {
            j = connectionFactory.injectMetric;
        }
        return connectionFactory.detachStream(i, j);
    }

    public final long clipOrigin() {
        return this.injectMetric;
    }

    public final ProxySteward detachStream(int i, long j) {
        return growPayload(i, this.evictLayout.evictLayout(i), this.evictLayout.detachStream(i), this.growPayload.dispatchField(i, j), j);
    }

    public final androidx.compose.foundation.lazy.layout.BounceHandler flushSample() {
        return this.evictLayout.growPayload();
    }

    public abstract ProxySteward growPayload(int i, Object obj, Object obj2, List list, long j);

    @Override // com.goldenboot.saga.zone.FooterSupervisor
    /* renamed from: injectMetric, reason: merged with bridge method [inline-methods] */
    public ProxySteward evictLayout(int i, int i2, int i3, long j) {
        return detachStream(i, j);
    }

    public ConnectionFactory(long j, boolean z, TypographyArranger typographyArranger, FlingBuffer flingBuffer) {
        this.evictLayout = typographyArranger;
        this.growPayload = flingBuffer;
        this.injectMetric = SubscriberCache.growPayload(0, z ? PagerPlanner.notifyMessage(j) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : PagerPlanner.reduceScope(j), 5, null);
    }
}
