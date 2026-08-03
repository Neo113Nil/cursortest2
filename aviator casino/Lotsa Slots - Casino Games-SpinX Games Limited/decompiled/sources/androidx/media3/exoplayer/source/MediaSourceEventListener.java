package androidx.media3.exoplayer.source;

/* loaded from: classes2.dex */
public interface MediaSourceEventListener {

    /* renamed from: androidx.media3.exoplayer.source.MediaSourceEventListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onDownstreamFormatChanged(androidx.media3.exoplayer.source.MediaSourceEventListener _this, int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
        }

        public static void $default$onLoadCanceled(androidx.media3.exoplayer.source.MediaSourceEventListener _this, int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
        }

        public static void $default$onLoadCompleted(androidx.media3.exoplayer.source.MediaSourceEventListener _this, int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
        }

        public static void $default$onLoadError(androidx.media3.exoplayer.source.MediaSourceEventListener _this, int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, java.io.IOException iOException, boolean z) {
        }

        public static void $default$onLoadStarted(androidx.media3.exoplayer.source.MediaSourceEventListener _this, int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
        }

        public static void $default$onUpstreamDiscarded(androidx.media3.exoplayer.source.MediaSourceEventListener _this, int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
        }
    }

    void onDownstreamFormatChanged(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData);

    void onLoadCanceled(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData);

    void onLoadCompleted(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData);

    void onLoadError(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, java.io.IOException iOException, boolean z);

    void onLoadStarted(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData);

    void onUpstreamDiscarded(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData);

    public static class EventDispatcher {
        private final java.util.concurrent.CopyOnWriteArrayList<androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler> listenerAndHandlers;
        public final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        public EventDispatcher() {
            this(new java.util.concurrent.CopyOnWriteArrayList(), 0, null);
        }

        private EventDispatcher(java.util.concurrent.CopyOnWriteArrayList<androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler> copyOnWriteArrayList, int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            this.listenerAndHandlers = copyOnWriteArrayList;
            this.windowIndex = i;
            this.mediaPeriodId = mediaPeriodId;
        }

        public androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher withParameters(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            return new androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher(this.listenerAndHandlers, i, mediaPeriodId);
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher withParameters(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j) {
            return new androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher(this.listenerAndHandlers, i, mediaPeriodId);
        }

        public void addEventListener(android.os.Handler handler, androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener) {
            androidx.media3.common.util.Assertions.checkNotNull(handler);
            androidx.media3.common.util.Assertions.checkNotNull(mediaSourceEventListener);
            this.listenerAndHandlers.add(new androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler(handler, mediaSourceEventListener));
        }

        public void removeEventListener(androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener) {
            java.util.Iterator<androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler next = it.next();
                if (next.listener == mediaSourceEventListener) {
                    this.listenerAndHandlers.remove(next);
                }
            }
        }

        public void loadStarted(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, int i) {
            loadStarted(loadEventInfo, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void loadStarted(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, int i, int i2, androidx.media3.common.Format format, int i3, java.lang.Object obj, long j, long j2) {
            loadStarted(loadEventInfo, new androidx.media3.exoplayer.source.MediaLoadData(i, i2, format, i3, obj, androidx.media3.common.util.Util.usToMs(j), androidx.media3.common.util.Util.usToMs(j2)));
        }

        public void loadStarted(final androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, final androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            java.util.Iterator<androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler next = it.next();
                final androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener = next.listener;
                androidx.media3.common.util.Util.postOrRun(next.handler, new java.lang.Runnable() { // from class: androidx.media3.exoplayer.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher.this.m4874x7ecff69a(mediaSourceEventListener, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        /* renamed from: lambda$loadStarted$0$androidx-media3-exoplayer-source-MediaSourceEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m4874x7ecff69a(androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onLoadStarted(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        public void loadCompleted(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, int i) {
            loadCompleted(loadEventInfo, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void loadCompleted(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, int i, int i2, androidx.media3.common.Format format, int i3, java.lang.Object obj, long j, long j2) {
            loadCompleted(loadEventInfo, new androidx.media3.exoplayer.source.MediaLoadData(i, i2, format, i3, obj, androidx.media3.common.util.Util.usToMs(j), androidx.media3.common.util.Util.usToMs(j2)));
        }

        public void loadCompleted(final androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, final androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            java.util.Iterator<androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler next = it.next();
                final androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener = next.listener;
                androidx.media3.common.util.Util.postOrRun(next.handler, new java.lang.Runnable() { // from class: androidx.media3.exoplayer.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher.this.m4872xeec2c4e5(mediaSourceEventListener, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        /* renamed from: lambda$loadCompleted$1$androidx-media3-exoplayer-source-MediaSourceEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m4872xeec2c4e5(androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onLoadCompleted(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        public void loadCanceled(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, int i) {
            loadCanceled(loadEventInfo, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void loadCanceled(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, int i, int i2, androidx.media3.common.Format format, int i3, java.lang.Object obj, long j, long j2) {
            loadCanceled(loadEventInfo, new androidx.media3.exoplayer.source.MediaLoadData(i, i2, format, i3, obj, androidx.media3.common.util.Util.usToMs(j), androidx.media3.common.util.Util.usToMs(j2)));
        }

        public void loadCanceled(final androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, final androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            java.util.Iterator<androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler next = it.next();
                final androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener = next.listener;
                androidx.media3.common.util.Util.postOrRun(next.handler, new java.lang.Runnable() { // from class: androidx.media3.exoplayer.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher.this.m4871x7abee11a(mediaSourceEventListener, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        /* renamed from: lambda$loadCanceled$2$androidx-media3-exoplayer-source-MediaSourceEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m4871x7abee11a(androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onLoadCanceled(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        public void loadError(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, int i, java.io.IOException iOException, boolean z) {
            loadError(loadEventInfo, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        }

        public void loadError(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, int i, int i2, androidx.media3.common.Format format, int i3, java.lang.Object obj, long j, long j2, java.io.IOException iOException, boolean z) {
            loadError(loadEventInfo, new androidx.media3.exoplayer.source.MediaLoadData(i, i2, format, i3, obj, androidx.media3.common.util.Util.usToMs(j), androidx.media3.common.util.Util.usToMs(j2)), iOException, z);
        }

        public void loadError(final androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, final androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, final java.io.IOException iOException, final boolean z) {
            java.util.Iterator<androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler next = it.next();
                final androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener = next.listener;
                androidx.media3.common.util.Util.postOrRun(next.handler, new java.lang.Runnable() { // from class: androidx.media3.exoplayer.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher.this.m4873xa1507124(mediaSourceEventListener, loadEventInfo, mediaLoadData, iOException, z);
                    }
                });
            }
        }

        /* renamed from: lambda$loadError$3$androidx-media3-exoplayer-source-MediaSourceEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m4873xa1507124(androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, java.io.IOException iOException, boolean z) {
            mediaSourceEventListener.onLoadError(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData, iOException, z);
        }

        public void upstreamDiscarded(int i, long j, long j2) {
            upstreamDiscarded(new androidx.media3.exoplayer.source.MediaLoadData(1, i, null, 3, null, androidx.media3.common.util.Util.usToMs(j), androidx.media3.common.util.Util.usToMs(j2)));
        }

        public void upstreamDiscarded(final androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) androidx.media3.common.util.Assertions.checkNotNull(this.mediaPeriodId);
            java.util.Iterator<androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler next = it.next();
                final androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener = next.listener;
                androidx.media3.common.util.Util.postOrRun(next.handler, new java.lang.Runnable() { // from class: androidx.media3.exoplayer.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher.this.m4875x1ba5ea45(mediaSourceEventListener, mediaPeriodId, mediaLoadData);
                    }
                });
            }
        }

        /* renamed from: lambda$upstreamDiscarded$4$androidx-media3-exoplayer-source-MediaSourceEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m4875x1ba5ea45(androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onUpstreamDiscarded(this.windowIndex, mediaPeriodId, mediaLoadData);
        }

        public void downstreamFormatChanged(int i, androidx.media3.common.Format format, int i2, java.lang.Object obj, long j) {
            downstreamFormatChanged(new androidx.media3.exoplayer.source.MediaLoadData(1, i, format, i2, obj, androidx.media3.common.util.Util.usToMs(j), -9223372036854775807L));
        }

        public void downstreamFormatChanged(final androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            java.util.Iterator<androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler next = it.next();
                final androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener = next.listener;
                androidx.media3.common.util.Util.postOrRun(next.handler, new java.lang.Runnable() { // from class: androidx.media3.exoplayer.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher.this.m4870xc39c8e5f(mediaSourceEventListener, mediaLoadData);
                    }
                });
            }
        }

        /* renamed from: lambda$downstreamFormatChanged$5$androidx-media3-exoplayer-source-MediaSourceEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m4870xc39c8e5f(androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onDownstreamFormatChanged(this.windowIndex, this.mediaPeriodId, mediaLoadData);
        }

        private static final class ListenerAndHandler {
            public android.os.Handler handler;
            public androidx.media3.exoplayer.source.MediaSourceEventListener listener;

            public ListenerAndHandler(android.os.Handler handler, androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener) {
                this.handler = handler;
                this.listener = mediaSourceEventListener;
            }
        }
    }
}
