package com.goldenboot.saga.zone;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class ClientHandler {
    public static final ActivityMutator growPayload = new ActivityMutator(null);
    public final Map evictLayout = new LinkedHashMap();

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public /* synthetic */ ActivityMutator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public ActivityMutator() {
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler extends ClientHandler {
        public static final BounceHandler injectMetric = new BounceHandler();

        @Override // com.goldenboot.saga.zone.ClientHandler
        public Object evictLayout(FeedbackFlow key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return null;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public interface FeedbackFlow {
    }

    public boolean equals(Object obj) {
        return (obj instanceof ClientHandler) && Intrinsics.areEqual(this.evictLayout, ((ClientHandler) obj).evictLayout);
    }

    public abstract Object evictLayout(FeedbackFlow feedbackFlow);

    public final Map growPayload() {
        return this.evictLayout;
    }

    public int hashCode() {
        return this.evictLayout.hashCode();
    }

    public String toString() {
        return "CreationExtras(extras=" + this.evictLayout + ')';
    }
}
