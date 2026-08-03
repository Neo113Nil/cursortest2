package com.google.android.exoplayer2.drm;

/* loaded from: classes3.dex */
public interface DrmSessionEventListener {

    /* renamed from: com.google.android.exoplayer2.drm.DrmSessionEventListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onDrmKeysLoaded(com.google.android.exoplayer2.drm.DrmSessionEventListener _this, int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        }

        public static void $default$onDrmKeysRemoved(com.google.android.exoplayer2.drm.DrmSessionEventListener _this, int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        }

        public static void $default$onDrmKeysRestored(com.google.android.exoplayer2.drm.DrmSessionEventListener _this, int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        }

        @java.lang.Deprecated
        public static void $default$onDrmSessionAcquired(com.google.android.exoplayer2.drm.DrmSessionEventListener _this, int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        }

        public static void $default$onDrmSessionAcquired(com.google.android.exoplayer2.drm.DrmSessionEventListener _this, int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, int i2) {
        }

        public static void $default$onDrmSessionManagerError(com.google.android.exoplayer2.drm.DrmSessionEventListener _this, int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, java.lang.Exception exc) {
        }

        public static void $default$onDrmSessionReleased(com.google.android.exoplayer2.drm.DrmSessionEventListener _this, int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        }
    }

    void onDrmKeysLoaded(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId);

    void onDrmKeysRemoved(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId);

    void onDrmKeysRestored(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId);

    @java.lang.Deprecated
    void onDrmSessionAcquired(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId);

    void onDrmSessionAcquired(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, int i2);

    void onDrmSessionManagerError(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, java.lang.Exception exc);

    void onDrmSessionReleased(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId);

    public static class EventDispatcher {
        private final java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler> listenerAndHandlers;
        public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        public EventDispatcher() {
            this(new java.util.concurrent.CopyOnWriteArrayList(), 0, null);
        }

        private EventDispatcher(java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler> copyOnWriteArrayList, int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
            this.listenerAndHandlers = copyOnWriteArrayList;
            this.windowIndex = i;
            this.mediaPeriodId = mediaPeriodId;
        }

        public com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher withParameters(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
            return new com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher(this.listenerAndHandlers, i, mediaPeriodId);
        }

        public void addEventListener(android.os.Handler handler, com.google.android.exoplayer2.drm.DrmSessionEventListener drmSessionEventListener) {
            com.google.android.exoplayer2.util.Assertions.checkNotNull(handler);
            com.google.android.exoplayer2.util.Assertions.checkNotNull(drmSessionEventListener);
            this.listenerAndHandlers.add(new com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler(handler, drmSessionEventListener));
        }

        public void removeEventListener(com.google.android.exoplayer2.drm.DrmSessionEventListener drmSessionEventListener) {
            java.util.Iterator<com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler next = it.next();
                if (next.listener == drmSessionEventListener) {
                    this.listenerAndHandlers.remove(next);
                }
            }
        }

        public void drmSessionAcquired(final int i) {
            java.util.Iterator<com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler next = it.next();
                final com.google.android.exoplayer2.drm.DrmSessionEventListener drmSessionEventListener = next.listener;
                com.google.android.exoplayer2.util.Util.postOrRun(next.handler, new java.lang.Runnable() { // from class: com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.this.m5400x7aff32be(drmSessionEventListener, i);
                    }
                });
            }
        }

        /* renamed from: lambda$drmSessionAcquired$0$com-google-android-exoplayer2-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5400x7aff32be(com.google.android.exoplayer2.drm.DrmSessionEventListener drmSessionEventListener, int i) {
            drmSessionEventListener.onDrmSessionAcquired(this.windowIndex, this.mediaPeriodId);
            drmSessionEventListener.onDrmSessionAcquired(this.windowIndex, this.mediaPeriodId, i);
        }

        public void drmKeysLoaded() {
            java.util.Iterator<com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler next = it.next();
                final com.google.android.exoplayer2.drm.DrmSessionEventListener drmSessionEventListener = next.listener;
                com.google.android.exoplayer2.util.Util.postOrRun(next.handler, new java.lang.Runnable() { // from class: com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.this.m5397x6262ec98(drmSessionEventListener);
                    }
                });
            }
        }

        /* renamed from: lambda$drmKeysLoaded$1$com-google-android-exoplayer2-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5397x6262ec98(com.google.android.exoplayer2.drm.DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysLoaded(this.windowIndex, this.mediaPeriodId);
        }

        public void drmSessionManagerError(final java.lang.Exception exc) {
            java.util.Iterator<com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler next = it.next();
                final com.google.android.exoplayer2.drm.DrmSessionEventListener drmSessionEventListener = next.listener;
                com.google.android.exoplayer2.util.Util.postOrRun(next.handler, new java.lang.Runnable() { // from class: com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.this.m5401x99ee26cd(drmSessionEventListener, exc);
                    }
                });
            }
        }

        /* renamed from: lambda$drmSessionManagerError$2$com-google-android-exoplayer2-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5401x99ee26cd(com.google.android.exoplayer2.drm.DrmSessionEventListener drmSessionEventListener, java.lang.Exception exc) {
            drmSessionEventListener.onDrmSessionManagerError(this.windowIndex, this.mediaPeriodId, exc);
        }

        public void drmKeysRestored() {
            java.util.Iterator<com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler next = it.next();
                final com.google.android.exoplayer2.drm.DrmSessionEventListener drmSessionEventListener = next.listener;
                com.google.android.exoplayer2.util.Util.postOrRun(next.handler, new java.lang.Runnable() { // from class: com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.this.m5399x8910d2ab(drmSessionEventListener);
                    }
                });
            }
        }

        /* renamed from: lambda$drmKeysRestored$3$com-google-android-exoplayer2-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5399x8910d2ab(com.google.android.exoplayer2.drm.DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysRestored(this.windowIndex, this.mediaPeriodId);
        }

        public void drmKeysRemoved() {
            java.util.Iterator<com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler next = it.next();
                final com.google.android.exoplayer2.drm.DrmSessionEventListener drmSessionEventListener = next.listener;
                com.google.android.exoplayer2.util.Util.postOrRun(next.handler, new java.lang.Runnable() { // from class: com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.this.m5398xc24f0d8a(drmSessionEventListener);
                    }
                });
            }
        }

        /* renamed from: lambda$drmKeysRemoved$4$com-google-android-exoplayer2-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5398xc24f0d8a(com.google.android.exoplayer2.drm.DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysRemoved(this.windowIndex, this.mediaPeriodId);
        }

        public void drmSessionReleased() {
            java.util.Iterator<com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler next = it.next();
                final com.google.android.exoplayer2.drm.DrmSessionEventListener drmSessionEventListener = next.listener;
                com.google.android.exoplayer2.util.Util.postOrRun(next.handler, new java.lang.Runnable() { // from class: com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.this.m5402xbad440f2(drmSessionEventListener);
                    }
                });
            }
        }

        /* renamed from: lambda$drmSessionReleased$5$com-google-android-exoplayer2-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5402xbad440f2(com.google.android.exoplayer2.drm.DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmSessionReleased(this.windowIndex, this.mediaPeriodId);
        }

        private static final class ListenerAndHandler {
            public android.os.Handler handler;
            public com.google.android.exoplayer2.drm.DrmSessionEventListener listener;

            public ListenerAndHandler(android.os.Handler handler, com.google.android.exoplayer2.drm.DrmSessionEventListener drmSessionEventListener) {
                this.handler = handler;
                this.listener = drmSessionEventListener;
            }
        }
    }
}
