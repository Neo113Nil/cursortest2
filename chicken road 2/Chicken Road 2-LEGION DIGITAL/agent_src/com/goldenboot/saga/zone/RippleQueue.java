package com.goldenboot.saga.zone;

import com.google.android.material.card.MaterialCardViewHelper;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class RippleQueue {
    public static /* synthetic */ ServerScheduler applyTask(int i, int i2, CachedEvent cachedEvent, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            cachedEvent = TriggerCustodian.injectMetric();
        }
        return updateTimer(i, i2, cachedEvent);
    }

    public static final StartupBuffer clipOrigin(float f, float f2, Object obj) {
        return new StartupBuffer(f, f2, obj);
    }

    public static final NavBarWatcher detachStream(TouchTunnel touchTunnel, ResponseSet responseSet, long j) {
        return new NavBarWatcher(touchTunnel, responseSet, j, null);
    }

    public static /* synthetic */ StartupBuffer flushSample(float f, float f2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return clipOrigin(f, f2, obj);
    }

    public static final ModuleAllocator growPayload(GestureInitializer gestureInitializer, Object obj) {
        if (obj == null) {
            return null;
        }
        return (ModuleAllocator) gestureInitializer.evictLayout().invoke(obj);
    }

    public static final ScrollArbitrator injectMetric(ScrollArbitrator scrollArbitrator, long j) {
        return new ClickChain(scrollArbitrator, j);
    }

    public static /* synthetic */ NavBarWatcher releaseHeader(TouchTunnel touchTunnel, ResponseSet responseSet, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            responseSet = ResponseSet.Restart;
        }
        if ((i & 4) != 0) {
            j = FlingChain.injectMetric(0, 0, 2, null);
        }
        return detachStream(touchTunnel, responseSet, j);
    }

    public static final ServerScheduler updateTimer(int i, int i2, CachedEvent cachedEvent) {
        return new ServerScheduler(i, i2, cachedEvent);
    }
}
