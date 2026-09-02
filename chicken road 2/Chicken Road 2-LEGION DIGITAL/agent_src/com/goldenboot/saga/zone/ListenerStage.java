package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/goldenboot/saga/zone/ListenerStage;", "", "evictLayout", "ActivityMutator", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ListenerStage {

    /* renamed from: evictLayout, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.evictLayout;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/goldenboot/saga/zone/ListenerStage$ActivityMutator;", "", "<init>", "()V", "", "radius", "Lcom/goldenboot/saga/zone/ListenerStage;", "growPayload", "(F)Lcom/goldenboot/saga/zone/ListenerStage;", "", "intervals", "phase", "injectMetric", "([FF)Lcom/goldenboot/saga/zone/ListenerStage;", "outer", "inner", "evictLayout", "(Lcom/goldenboot/saga/zone/ListenerStage;Lcom/goldenboot/saga/zone/ListenerStage;)Lcom/goldenboot/saga/zone/ListenerStage;", "Lcom/goldenboot/saga/zone/ServiceFetcher;", "shape", "advance", "Lcom/goldenboot/saga/zone/ConsumerVersion;", "style", "releaseHeader", "(Lcom/goldenboot/saga/zone/ServiceFetcher;FFI)Lcom/goldenboot/saga/zone/ListenerStage;", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.ListenerStage$ActivityMutator, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion evictLayout = new Companion();

        private Companion() {
        }

        public static /* synthetic */ ListenerStage detachStream(Companion companion, float[] fArr, float f, int i, Object obj) {
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            return companion.injectMetric(fArr, f);
        }

        public final ListenerStage evictLayout(ListenerStage outer, ListenerStage inner) {
            return TrackballFormatter.evictLayout(outer, inner);
        }

        public final ListenerStage growPayload(float radius) {
            return TrackballFormatter.growPayload(radius);
        }

        public final ListenerStage injectMetric(float[] intervals, float phase) {
            return TrackballFormatter.injectMetric(intervals, phase);
        }

        public final ListenerStage releaseHeader(ServiceFetcher shape, float advance, float phase, int style) {
            return TrackballFormatter.detachStream(shape, advance, phase, style);
        }
    }
}
