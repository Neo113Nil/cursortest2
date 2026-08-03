package androidx.media3.exoplayer.drm;

/* loaded from: classes2.dex */
public interface DrmSessionEventListener {

    /* renamed from: androidx.media3.exoplayer.drm.DrmSessionEventListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onDrmKeysLoaded(androidx.media3.exoplayer.drm.DrmSessionEventListener _this, int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        }

        public static void $default$onDrmKeysRemoved(androidx.media3.exoplayer.drm.DrmSessionEventListener _this, int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        }

        public static void $default$onDrmKeysRestored(androidx.media3.exoplayer.drm.DrmSessionEventListener _this, int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        }

        @java.lang.Deprecated
        public static void $default$onDrmSessionAcquired(androidx.media3.exoplayer.drm.DrmSessionEventListener _this, int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        }

        public static void $default$onDrmSessionAcquired(androidx.media3.exoplayer.drm.DrmSessionEventListener _this, int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, int i2) {
        }

        public static void $default$onDrmSessionManagerError(androidx.media3.exoplayer.drm.DrmSessionEventListener _this, int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, java.lang.Exception exc) {
        }

        public static void $default$onDrmSessionReleased(androidx.media3.exoplayer.drm.DrmSessionEventListener _this, int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        }
    }

    void onDrmKeysLoaded(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId);

    void onDrmKeysRemoved(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId);

    void onDrmKeysRestored(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId);

    @java.lang.Deprecated
    void onDrmSessionAcquired(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId);

    void onDrmSessionAcquired(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, int i2);

    void onDrmSessionManagerError(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, java.lang.Exception exc);

    void onDrmSessionReleased(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId);

    public static class EventDispatcher {
        private final java.util.concurrent.CopyOnWriteArrayList<androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler> listenerAndHandlers;
        public final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        public EventDispatcher() {
            this(new java.util.concurrent.CopyOnWriteArrayList(), 0, null);
        }

        private EventDispatcher(java.util.concurrent.CopyOnWriteArrayList<androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler> copyOnWriteArrayList, int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            this.listenerAndHandlers = copyOnWriteArrayList;
            this.windowIndex = i;
            this.mediaPeriodId = mediaPeriodId;
        }

        public androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher withParameters(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            return new androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher(this.listenerAndHandlers, i, mediaPeriodId);
        }

        public void addEventListener(android.os.Handler handler, androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener) {
            androidx.media3.common.util.Assertions.checkNotNull(handler);
            androidx.media3.common.util.Assertions.checkNotNull(drmSessionEventListener);
            this.listenerAndHandlers.add(new androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler(handler, drmSessionEventListener));
        }

        public void removeEventListener(androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener) {
            java.util.Iterator<androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler next = it.next();
                if (next.listener == drmSessionEventListener) {
                    this.listenerAndHandlers.remove(next);
                }
            }
        }

        public void drmSessionAcquired(final int i) {
            java.util.Iterator<androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler next = it.next();
                final androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener = next.listener;
                androidx.media3.common.util.Util.postOrRun(next.handler, new java.lang.Runnable() { // from class: androidx.media3.exoplayer.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.this.m4843x3233dce6(drmSessionEventListener, i);
                    }
                });
            }
        }

        /* renamed from: lambda$drmSessionAcquired$0$androidx-media3-exoplayer-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m4843x3233dce6(androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener, int i) {
            drmSessionEventListener.onDrmSessionAcquired(this.windowIndex, this.mediaPeriodId);
            drmSessionEventListener.onDrmSessionAcquired(this.windowIndex, this.mediaPeriodId, i);
        }

        public void drmKeysLoaded() {
            java.util.Iterator<androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler next = it.next();
                final androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener = next.listener;
                androidx.media3.common.util.Util.postOrRun(next.handler, new java.lang.Runnable() { // from class: androidx.media3.exoplayer.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.this.m4840x8fe293c0(drmSessionEventListener);
                    }
                });
            }
        }

        /* renamed from: lambda$drmKeysLoaded$1$androidx-media3-exoplayer-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m4840x8fe293c0(androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysLoaded(this.windowIndex, this.mediaPeriodId);
        }

        public void drmSessionManagerError(final java.lang.Exception exc) {
            java.util.Iterator<androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler next = it.next();
                final androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener = next.listener;
                androidx.media3.common.util.Util.postOrRun(next.handler, new java.lang.Runnable() { // from class: androidx.media3.exoplayer.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.this.m4844x18253075(drmSessionEventListener, exc);
                    }
                });
            }
        }

        /* renamed from: lambda$drmSessionManagerError$2$androidx-media3-exoplayer-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m4844x18253075(androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener, java.lang.Exception exc) {
            drmSessionEventListener.onDrmSessionManagerError(this.windowIndex, this.mediaPeriodId, exc);
        }

        public void drmKeysRestored() {
            java.util.Iterator<androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler next = it.next();
                final androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener = next.listener;
                androidx.media3.common.util.Util.postOrRun(next.handler, new java.lang.Runnable() { // from class: androidx.media3.exoplayer.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.this.m4842xcfc47b53(drmSessionEventListener);
                    }
                });
            }
        }

        /* renamed from: lambda$drmKeysRestored$3$androidx-media3-exoplayer-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m4842xcfc47b53(androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysRestored(this.windowIndex, this.mediaPeriodId);
        }

        public void drmKeysRemoved() {
            java.util.Iterator<androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler next = it.next();
                final androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener = next.listener;
                androidx.media3.common.util.Util.postOrRun(next.handler, new java.lang.Runnable() { // from class: androidx.media3.exoplayer.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.this.m4841x5d8fdb2(drmSessionEventListener);
                    }
                });
            }
        }

        /* renamed from: lambda$drmKeysRemoved$4$androidx-media3-exoplayer-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m4841x5d8fdb2(androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysRemoved(this.windowIndex, this.mediaPeriodId);
        }

        public void drmSessionReleased() {
            java.util.Iterator<androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler next = it.next();
                final androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener = next.listener;
                androidx.media3.common.util.Util.postOrRun(next.handler, new java.lang.Runnable() { // from class: androidx.media3.exoplayer.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.this.m4845x690251a(drmSessionEventListener);
                    }
                });
            }
        }

        /* renamed from: lambda$drmSessionReleased$5$androidx-media3-exoplayer-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m4845x690251a(androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmSessionReleased(this.windowIndex, this.mediaPeriodId);
        }

        private static final class ListenerAndHandler {
            public android.os.Handler handler;
            public androidx.media3.exoplayer.drm.DrmSessionEventListener listener;

            public ListenerAndHandler(android.os.Handler handler, androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener) {
                this.handler = handler;
                this.listener = drmSessionEventListener;
            }
        }
    }
}
