package com.google.android.exoplayer2.upstream;

/* loaded from: classes3.dex */
public interface BandwidthMeter {

    /* renamed from: com.google.android.exoplayer2.upstream.BandwidthMeter$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static long $default$getTimeToFirstByteEstimateUs(com.google.android.exoplayer2.upstream.BandwidthMeter _this) {
            return -9223372036854775807L;
        }
    }

    void addEventListener(android.os.Handler handler, com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener eventListener);

    long getBitrateEstimate();

    long getTimeToFirstByteEstimateUs();

    com.google.android.exoplayer2.upstream.TransferListener getTransferListener();

    void removeEventListener(com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener eventListener);

    public interface EventListener {
        void onBandwidthSample(int i, long j, long j2);

        public static final class EventDispatcher {
            private final java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener> listeners = new java.util.concurrent.CopyOnWriteArrayList<>();

            public void addListener(android.os.Handler handler, com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener eventListener) {
                com.google.android.exoplayer2.util.Assertions.checkNotNull(handler);
                com.google.android.exoplayer2.util.Assertions.checkNotNull(eventListener);
                removeListener(eventListener);
                this.listeners.add(new com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener(handler, eventListener));
            }

            public void removeListener(com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener eventListener) {
                java.util.Iterator<com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener> it = this.listeners.iterator();
                while (it.hasNext()) {
                    com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener next = it.next();
                    if (next.listener == eventListener) {
                        next.release();
                        this.listeners.remove(next);
                    }
                }
            }

            public void bandwidthSample(final int i, final long j, final long j2) {
                java.util.Iterator<com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener> it = this.listeners.iterator();
                while (it.hasNext()) {
                    final com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener next = it.next();
                    if (!next.released) {
                        next.handler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.upstream.BandwidthMeter$EventListener$EventDispatcher$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener.this.listener.onBandwidthSample(i, j, j2);
                            }
                        });
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            static final class HandlerAndListener {
                private final android.os.Handler handler;
                private final com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener listener;
                private boolean released;

                public HandlerAndListener(android.os.Handler handler, com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener eventListener) {
                    this.handler = handler;
                    this.listener = eventListener;
                }

                public void release() {
                    this.released = true;
                }
            }
        }
    }
}
