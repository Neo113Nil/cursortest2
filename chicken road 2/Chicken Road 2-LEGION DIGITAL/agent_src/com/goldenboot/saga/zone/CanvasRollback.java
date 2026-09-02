package com.goldenboot.saga.zone;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class CanvasRollback {
    public final BounceHandler evictLayout;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator implements BounceHandler {
        public final InputContentInfo evictLayout;

        public ActivityMutator(Object obj) {
            this.evictLayout = (InputContentInfo) obj;
        }

        @Override // com.goldenboot.saga.zone.CanvasRollback.BounceHandler
        public ClipDescription detachStream() {
            return this.evictLayout.getDescription();
        }

        @Override // com.goldenboot.saga.zone.CanvasRollback.BounceHandler
        public Uri evictLayout() {
            return this.evictLayout.getContentUri();
        }

        @Override // com.goldenboot.saga.zone.CanvasRollback.BounceHandler
        public void growPayload() {
            this.evictLayout.requestPermission();
        }

        @Override // com.goldenboot.saga.zone.CanvasRollback.BounceHandler
        public Uri injectMetric() {
            return this.evictLayout.getLinkUri();
        }

        @Override // com.goldenboot.saga.zone.CanvasRollback.BounceHandler
        public Object releaseHeader() {
            return this.evictLayout;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public interface BounceHandler {
        ClipDescription detachStream();

        Uri evictLayout();

        void growPayload();

        Uri injectMetric();

        Object releaseHeader();
    }

    public CanvasRollback(BounceHandler bounceHandler) {
        this.evictLayout = bounceHandler;
    }

    public static CanvasRollback clipOrigin(Object obj) {
        if (obj == null) {
            return null;
        }
        return new CanvasRollback(new ActivityMutator(obj));
    }

    public void detachStream() {
        this.evictLayout.growPayload();
    }

    public Uri evictLayout() {
        return this.evictLayout.evictLayout();
    }

    public ClipDescription growPayload() {
        return this.evictLayout.detachStream();
    }

    public Uri injectMetric() {
        return this.evictLayout.injectMetric();
    }

    public Object releaseHeader() {
        return this.evictLayout.releaseHeader();
    }
}
