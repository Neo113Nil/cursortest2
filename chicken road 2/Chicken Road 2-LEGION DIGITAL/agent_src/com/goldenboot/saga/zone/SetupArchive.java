package com.goldenboot.saga.zone;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class SetupArchive {
    public final List evictLayout;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends SetupArchive {
        public final boolean detachStream;
        public final long growPayload;
        public final long injectMetric;

        public /* synthetic */ ActivityMutator(List list, long j, long j2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, j, j2, z);
        }

        @Override // com.goldenboot.saga.zone.SetupArchive
        public SetupArchive growPayload(ParallelPartition f) {
            Intrinsics.checkNotNullParameter(f, "f");
            List injectMetric = DefaultBenchmark.injectMetric();
            int size = evictLayout().size();
            for (int i = 0; i < size; i++) {
                injectMetric.add(((ListenerCollector) evictLayout().get(i)).serializeOffset(f));
            }
            return new ActivityMutator(DefaultBenchmark.evictLayout(injectMetric), SlotVersion.peekRevision(this.growPayload, f), SlotVersion.peekRevision(this.injectMetric, f), this.detachStream, null);
        }

        public final boolean injectMetric() {
            return this.detachStream;
        }

        public String toString() {
            return "Corner: vertex=" + ((Object) NavBarMaker.clipOrigin(this.growPayload)) + ", center=" + ((Object) NavBarMaker.clipOrigin(this.injectMetric)) + ", convex=" + this.detachStream;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityMutator(List cubics, long j, long j2, boolean z) {
            super(cubics);
            Intrinsics.checkNotNullParameter(cubics, "cubics");
            this.growPayload = j;
            this.injectMetric = j2;
            this.detachStream = z;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler extends SetupArchive {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BounceHandler(List cubics) {
            super(cubics);
            Intrinsics.checkNotNullParameter(cubics, "cubics");
        }

        @Override // com.goldenboot.saga.zone.SetupArchive
        /* renamed from: injectMetric, reason: merged with bridge method [inline-methods] */
        public BounceHandler growPayload(ParallelPartition f) {
            Intrinsics.checkNotNullParameter(f, "f");
            List injectMetric = DefaultBenchmark.injectMetric();
            int size = evictLayout().size();
            for (int i = 0; i < size; i++) {
                injectMetric.add(((ListenerCollector) evictLayout().get(i)).serializeOffset(f));
            }
            return new BounceHandler(DefaultBenchmark.evictLayout(injectMetric));
        }

        public String toString() {
            return "Edge";
        }
    }

    public SetupArchive(List cubics) {
        Intrinsics.checkNotNullParameter(cubics, "cubics");
        this.evictLayout = cubics;
    }

    public final List evictLayout() {
        return this.evictLayout;
    }

    public abstract SetupArchive growPayload(ParallelPartition parallelPartition);
}
