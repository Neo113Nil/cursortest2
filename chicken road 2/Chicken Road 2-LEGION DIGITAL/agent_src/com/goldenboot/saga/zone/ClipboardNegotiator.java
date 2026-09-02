package com.goldenboot.saga.zone;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public interface ClipboardNegotiator extends StepperDiff {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator implements ClipboardNegotiator {
        public final BounceHandler evictLayout;

        public ActivityMutator(BounceHandler bounceHandler) {
            this.evictLayout = bounceHandler;
        }

        public final BounceHandler evictLayout() {
            return this.evictLayout;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler implements ClipboardNegotiator {
        public final long evictLayout;

        public /* synthetic */ BounceHandler(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }

        public final long evictLayout() {
            return this.evictLayout;
        }

        public BounceHandler(long j) {
            this.evictLayout = j;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class FeedbackFlow implements ClipboardNegotiator {
        public final BounceHandler evictLayout;

        public FeedbackFlow(BounceHandler bounceHandler) {
            this.evictLayout = bounceHandler;
        }

        public final BounceHandler evictLayout() {
            return this.evictLayout;
        }
    }
}
