package com.goldenboot.saga.zone;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class EmitterList {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public final Object evictLayout;

        public ActivityMutator(Object obj) {
            this.evictLayout = obj;
        }

        public final Object evictLayout() {
            return this.evictLayout;
        }
    }

    public abstract Intent evictLayout(Context context, Object obj);

    public ActivityMutator growPayload(Context context, Object obj) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    public abstract Object injectMetric(int i, Intent intent);
}
