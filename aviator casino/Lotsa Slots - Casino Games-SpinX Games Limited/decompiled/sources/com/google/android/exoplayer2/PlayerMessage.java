package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
public final class PlayerMessage {
    private final com.google.android.exoplayer2.util.Clock clock;
    private boolean isCanceled;
    private boolean isDelivered;
    private boolean isProcessed;
    private boolean isSent;
    private android.os.Looper looper;
    private int mediaItemIndex;
    private java.lang.Object payload;
    private final com.google.android.exoplayer2.PlayerMessage.Sender sender;
    private final com.google.android.exoplayer2.PlayerMessage.Target target;
    private final com.google.android.exoplayer2.Timeline timeline;
    private int type;
    private long positionMs = -9223372036854775807L;
    private boolean deleteAfterDelivery = true;

    public interface Sender {
        void sendMessage(com.google.android.exoplayer2.PlayerMessage playerMessage);
    }

    public interface Target {
        void handleMessage(int i, java.lang.Object obj) throws com.google.android.exoplayer2.ExoPlaybackException;
    }

    public PlayerMessage(com.google.android.exoplayer2.PlayerMessage.Sender sender, com.google.android.exoplayer2.PlayerMessage.Target target, com.google.android.exoplayer2.Timeline timeline, int i, com.google.android.exoplayer2.util.Clock clock, android.os.Looper looper) {
        this.sender = sender;
        this.target = target;
        this.timeline = timeline;
        this.looper = looper;
        this.clock = clock;
        this.mediaItemIndex = i;
    }

    public com.google.android.exoplayer2.Timeline getTimeline() {
        return this.timeline;
    }

    public com.google.android.exoplayer2.PlayerMessage.Target getTarget() {
        return this.target;
    }

    public com.google.android.exoplayer2.PlayerMessage setType(int i) {
        com.google.android.exoplayer2.util.Assertions.checkState(!this.isSent);
        this.type = i;
        return this;
    }

    public int getType() {
        return this.type;
    }

    public com.google.android.exoplayer2.PlayerMessage setPayload(java.lang.Object obj) {
        com.google.android.exoplayer2.util.Assertions.checkState(!this.isSent);
        this.payload = obj;
        return this;
    }

    public java.lang.Object getPayload() {
        return this.payload;
    }

    @java.lang.Deprecated
    public com.google.android.exoplayer2.PlayerMessage setHandler(android.os.Handler handler) {
        return setLooper(handler.getLooper());
    }

    public com.google.android.exoplayer2.PlayerMessage setLooper(android.os.Looper looper) {
        com.google.android.exoplayer2.util.Assertions.checkState(!this.isSent);
        this.looper = looper;
        return this;
    }

    public android.os.Looper getLooper() {
        return this.looper;
    }

    public long getPositionMs() {
        return this.positionMs;
    }

    public com.google.android.exoplayer2.PlayerMessage setPosition(long j) {
        com.google.android.exoplayer2.util.Assertions.checkState(!this.isSent);
        this.positionMs = j;
        return this;
    }

    public com.google.android.exoplayer2.PlayerMessage setPosition(int i, long j) {
        com.google.android.exoplayer2.util.Assertions.checkState(!this.isSent);
        com.google.android.exoplayer2.util.Assertions.checkArgument(j != -9223372036854775807L);
        if (i < 0 || (!this.timeline.isEmpty() && i >= this.timeline.getWindowCount())) {
            throw new com.google.android.exoplayer2.IllegalSeekPositionException(this.timeline, i, j);
        }
        this.mediaItemIndex = i;
        this.positionMs = j;
        return this;
    }

    public int getMediaItemIndex() {
        return this.mediaItemIndex;
    }

    public com.google.android.exoplayer2.PlayerMessage setDeleteAfterDelivery(boolean z) {
        com.google.android.exoplayer2.util.Assertions.checkState(!this.isSent);
        this.deleteAfterDelivery = z;
        return this;
    }

    public boolean getDeleteAfterDelivery() {
        return this.deleteAfterDelivery;
    }

    public com.google.android.exoplayer2.PlayerMessage send() {
        com.google.android.exoplayer2.util.Assertions.checkState(!this.isSent);
        if (this.positionMs == -9223372036854775807L) {
            com.google.android.exoplayer2.util.Assertions.checkArgument(this.deleteAfterDelivery);
        }
        this.isSent = true;
        this.sender.sendMessage(this);
        return this;
    }

    public synchronized com.google.android.exoplayer2.PlayerMessage cancel() {
        com.google.android.exoplayer2.util.Assertions.checkState(this.isSent);
        this.isCanceled = true;
        markAsProcessed(false);
        return this;
    }

    public synchronized boolean isCanceled() {
        return this.isCanceled;
    }

    public synchronized void markAsProcessed(boolean z) {
        this.isDelivered = z | this.isDelivered;
        this.isProcessed = true;
        notifyAll();
    }

    public synchronized boolean blockUntilDelivered() throws java.lang.InterruptedException {
        com.google.android.exoplayer2.util.Assertions.checkState(this.isSent);
        com.google.android.exoplayer2.util.Assertions.checkState(this.looper.getThread() != java.lang.Thread.currentThread());
        while (!this.isProcessed) {
            wait();
        }
        return this.isDelivered;
    }

    public synchronized boolean blockUntilDelivered(long j) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        boolean z;
        com.google.android.exoplayer2.util.Assertions.checkState(this.isSent);
        com.google.android.exoplayer2.util.Assertions.checkState(this.looper.getThread() != java.lang.Thread.currentThread());
        long elapsedRealtime = this.clock.elapsedRealtime() + j;
        while (true) {
            z = this.isProcessed;
            if (z || j <= 0) {
                break;
            }
            this.clock.onThreadBlocked();
            wait(j);
            j = elapsedRealtime - this.clock.elapsedRealtime();
        }
        if (!z) {
            throw new java.util.concurrent.TimeoutException("Message delivery timed out.");
        }
        return this.isDelivered;
    }
}
