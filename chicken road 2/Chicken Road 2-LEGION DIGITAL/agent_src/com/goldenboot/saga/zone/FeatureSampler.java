package com.goldenboot.saga.zone;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class FeatureSampler {
    public static final long evictLayout = ViewConfiguration.getTapTimeout();

    public static final boolean clipOrigin(KeyEvent keyEvent) {
        return SingletonImpl.flushSample(WorkerInstantiator.growPayload(keyEvent), SingletonImpl.INSTANCE.evictLayout()) && detachStream(keyEvent);
    }

    public static final boolean detachStream(KeyEvent keyEvent) {
        int growPayload = ObserverMaintainer.growPayload(WorkerInstantiator.evictLayout(keyEvent));
        return growPayload == 23 || growPayload == 66 || growPayload == 160;
    }

    public static final long evictLayout() {
        return evictLayout;
    }

    public static final boolean growPayload(KeyEvent keyEvent) {
        return SingletonImpl.flushSample(WorkerInstantiator.growPayload(keyEvent), SingletonImpl.INSTANCE.growPayload()) && detachStream(keyEvent);
    }

    public static final boolean injectMetric(CachedDeserializer cachedDeserializer) {
        return releaseHeader(BaseInterpreter.evictLayout(cachedDeserializer));
    }

    public static final boolean releaseHeader(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }
}
