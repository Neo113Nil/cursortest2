package com.google.android.exoplayer2.source;

/* loaded from: classes3.dex */
public interface MediaSourceEventListener {

    /* renamed from: com.google.android.exoplayer2.source.MediaSourceEventListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onDownstreamFormatChanged(com.google.android.exoplayer2.source.MediaSourceEventListener _this, int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
        }

        public static void $default$onLoadCanceled(com.google.android.exoplayer2.source.MediaSourceEventListener _this, int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
        }

        public static void $default$onLoadCompleted(com.google.android.exoplayer2.source.MediaSourceEventListener _this, int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
        }

        public static void $default$onLoadError(com.google.android.exoplayer2.source.MediaSourceEventListener _this, int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData, java.io.IOException iOException, boolean z) {
        }

        public static void $default$onLoadStarted(com.google.android.exoplayer2.source.MediaSourceEventListener _this, int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
        }

        public static void $default$onUpstreamDiscarded(com.google.android.exoplayer2.source.MediaSourceEventListener _this, int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
        }
    }

    void onDownstreamFormatChanged(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData);

    void onLoadCanceled(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData);

    void onLoadCompleted(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData);

    void onLoadError(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData, java.io.IOException iOException, boolean z);

    void onLoadStarted(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData);

    void onUpstreamDiscarded(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData);

    public static class EventDispatcher {
        private final java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler> listenerAndHandlers;
        public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId;
        private final long mediaTimeOffsetMs;
        public final int windowIndex;

        public EventDispatcher() {
            this(new java.util.concurrent.CopyOnWriteArrayList(), 0, null, 0L);
        }

        private EventDispatcher(java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler> copyOnWriteArrayList, int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, long j) {
            this.listenerAndHandlers = copyOnWriteArrayList;
            this.windowIndex = i;
            this.mediaPeriodId = mediaPeriodId;
            this.mediaTimeOffsetMs = j;
        }

        public com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher withParameters(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, long j) {
            return new com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher(this.listenerAndHandlers, i, mediaPeriodId, j);
        }

        public void addEventListener(android.os.Handler handler, com.google.android.exoplayer2.source.MediaSourceEventListener mediaSourceEventListener) {
            com.google.android.exoplayer2.util.Assertions.checkNotNull(handler);
            com.google.android.exoplayer2.util.Assertions.checkNotNull(mediaSourceEventListener);
            this.listenerAndHandlers.add(new com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler(handler, mediaSourceEventListener));
        }

        public void removeEventListener(com.google.android.exoplayer2.source.MediaSourceEventListener mediaSourceEventListener) {
            java.util.Iterator<com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler next = it.next();
                if (next.listener == mediaSourceEventListener) {
                    this.listenerAndHandlers.remove(next);
                }
            }
        }

        public void loadStarted(com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, int i) {
            loadStarted(loadEventInfo, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void loadStarted(com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, int i, int i2, com.google.android.exoplayer2.Format format, int i3, java.lang.Object obj, long j, long j2) {
            loadStarted(loadEventInfo, new com.google.android.exoplayer2.source.MediaLoadData(i, i2, format, i3, obj, adjustMediaTime(j), adjustMediaTime(j2)));
        }

        public void loadStarted(final com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, final com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
            java.util.Iterator<com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler next = it.next();
                final com.google.android.exoplayer2.source.MediaSourceEventListener mediaSourceEventListener = next.listener;
                com.google.android.exoplayer2.util.Util.postOrRun(next.handler, new java.lang.Runnable() { // from class: com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.this.m5425xa95b4272(mediaSourceEventListener, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        /* renamed from: lambda$loadStarted$0$com-google-android-exoplayer2-source-MediaSourceEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5425xa95b4272(com.google.android.exoplayer2.source.MediaSourceEventListener mediaSourceEventListener, com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onLoadStarted(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        public void loadCompleted(com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, int i) {
            loadCompleted(loadEventInfo, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void loadCompleted(com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, int i, int i2, com.google.android.exoplayer2.Format format, int i3, java.lang.Object obj, long j, long j2) {
            loadCompleted(loadEventInfo, new com.google.android.exoplayer2.source.MediaLoadData(i, i2, format, i3, obj, adjustMediaTime(j), adjustMediaTime(j2)));
        }

        public void loadCompleted(final com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, final com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
            java.util.Iterator<com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler next = it.next();
                final com.google.android.exoplayer2.source.MediaSourceEventListener mediaSourceEventListener = next.listener;
                com.google.android.exoplayer2.util.Util.postOrRun(next.handler, new java.lang.Runnable() { // from class: com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.this.m5423x2b57f33d(mediaSourceEventListener, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        /* renamed from: lambda$loadCompleted$1$com-google-android-exoplayer2-source-MediaSourceEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5423x2b57f33d(com.google.android.exoplayer2.source.MediaSourceEventListener mediaSourceEventListener, com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onLoadCompleted(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        public void loadCanceled(com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, int i) {
            loadCanceled(loadEventInfo, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void loadCanceled(com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, int i, int i2, com.google.android.exoplayer2.Format format, int i3, java.lang.Object obj, long j, long j2) {
            loadCanceled(loadEventInfo, new com.google.android.exoplayer2.source.MediaLoadData(i, i2, format, i3, obj, adjustMediaTime(j), adjustMediaTime(j2)));
        }

        public void loadCanceled(final com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, final com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
            java.util.Iterator<com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler next = it.next();
                final com.google.android.exoplayer2.source.MediaSourceEventListener mediaSourceEventListener = next.listener;
                com.google.android.exoplayer2.util.Util.postOrRun(next.handler, new java.lang.Runnable() { // from class: com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.this.m5422xe6d0ecf2(mediaSourceEventListener, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        /* renamed from: lambda$loadCanceled$2$com-google-android-exoplayer2-source-MediaSourceEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5422xe6d0ecf2(com.google.android.exoplayer2.source.MediaSourceEventListener mediaSourceEventListener, com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onLoadCanceled(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        public void loadError(com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, int i, java.io.IOException iOException, boolean z) {
            loadError(loadEventInfo, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        }

        public void loadError(com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, int i, int i2, com.google.android.exoplayer2.Format format, int i3, java.lang.Object obj, long j, long j2, java.io.IOException iOException, boolean z) {
            loadError(loadEventInfo, new com.google.android.exoplayer2.source.MediaLoadData(i, i2, format, i3, obj, adjustMediaTime(j), adjustMediaTime(j2)), iOException, z);
        }

        public void loadError(final com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, final com.google.android.exoplayer2.source.MediaLoadData mediaLoadData, final java.io.IOException iOException, final boolean z) {
            java.util.Iterator<com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler next = it.next();
                final com.google.android.exoplayer2.source.MediaSourceEventListener mediaSourceEventListener = next.listener;
                com.google.android.exoplayer2.util.Util.postOrRun(next.handler, new java.lang.Runnable() { // from class: com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.this.m5424x4aa767fc(mediaSourceEventListener, loadEventInfo, mediaLoadData, iOException, z);
                    }
                });
            }
        }

        /* renamed from: lambda$loadError$3$com-google-android-exoplayer2-source-MediaSourceEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5424x4aa767fc(com.google.android.exoplayer2.source.MediaSourceEventListener mediaSourceEventListener, com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData, java.io.IOException iOException, boolean z) {
            mediaSourceEventListener.onLoadError(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData, iOException, z);
        }

        public void upstreamDiscarded(int i, long j, long j2) {
            upstreamDiscarded(new com.google.android.exoplayer2.source.MediaLoadData(1, i, null, 3, null, adjustMediaTime(j), adjustMediaTime(j2)));
        }

        public void upstreamDiscarded(final com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
            final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.mediaPeriodId);
            java.util.Iterator<com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler next = it.next();
                final com.google.android.exoplayer2.source.MediaSourceEventListener mediaSourceEventListener = next.listener;
                com.google.android.exoplayer2.util.Util.postOrRun(next.handler, new java.lang.Runnable() { // from class: com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.this.m5426x3d69689d(mediaSourceEventListener, mediaPeriodId, mediaLoadData);
                    }
                });
            }
        }

        /* renamed from: lambda$upstreamDiscarded$4$com-google-android-exoplayer2-source-MediaSourceEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5426x3d69689d(com.google.android.exoplayer2.source.MediaSourceEventListener mediaSourceEventListener, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onUpstreamDiscarded(this.windowIndex, mediaPeriodId, mediaLoadData);
        }

        public void downstreamFormatChanged(int i, com.google.android.exoplayer2.Format format, int i2, java.lang.Object obj, long j) {
            downstreamFormatChanged(new com.google.android.exoplayer2.source.MediaLoadData(1, i, format, i2, obj, adjustMediaTime(j), -9223372036854775807L));
        }

        public void downstreamFormatChanged(final com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
            java.util.Iterator<com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler next = it.next();
                final com.google.android.exoplayer2.source.MediaSourceEventListener mediaSourceEventListener = next.listener;
                com.google.android.exoplayer2.util.Util.postOrRun(next.handler, new java.lang.Runnable() { // from class: com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.this.m5421x2dc6fb7(mediaSourceEventListener, mediaLoadData);
                    }
                });
            }
        }

        /* renamed from: lambda$downstreamFormatChanged$5$com-google-android-exoplayer2-source-MediaSourceEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5421x2dc6fb7(com.google.android.exoplayer2.source.MediaSourceEventListener mediaSourceEventListener, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onDownstreamFormatChanged(this.windowIndex, this.mediaPeriodId, mediaLoadData);
        }

        private long adjustMediaTime(long j) {
            long usToMs = com.google.android.exoplayer2.util.Util.usToMs(j);
            if (usToMs == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.mediaTimeOffsetMs + usToMs;
        }

        private static final class ListenerAndHandler {
            public android.os.Handler handler;
            public com.google.android.exoplayer2.source.MediaSourceEventListener listener;

            public ListenerAndHandler(android.os.Handler handler, com.google.android.exoplayer2.source.MediaSourceEventListener mediaSourceEventListener) {
                this.handler = handler;
                this.listener = mediaSourceEventListener;
            }
        }
    }
}
