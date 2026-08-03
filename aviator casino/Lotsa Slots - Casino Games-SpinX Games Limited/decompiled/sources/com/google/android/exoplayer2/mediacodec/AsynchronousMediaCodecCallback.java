package com.google.android.exoplayer2.mediacodec;

/* loaded from: classes3.dex */
final class AsynchronousMediaCodecCallback extends android.media.MediaCodec.Callback {
    private final android.os.HandlerThread callbackThread;
    private android.media.MediaFormat currentFormat;
    private android.os.Handler handler;
    private java.lang.IllegalStateException internalException;
    private android.media.MediaCodec.CodecException mediaCodecException;
    private long pendingFlushCount;
    private android.media.MediaFormat pendingOutputFormat;
    private boolean shutDown;
    private final java.lang.Object lock = new java.lang.Object();
    private final com.google.android.exoplayer2.mediacodec.IntArrayQueue availableInputBuffers = new com.google.android.exoplayer2.mediacodec.IntArrayQueue();
    private final com.google.android.exoplayer2.mediacodec.IntArrayQueue availableOutputBuffers = new com.google.android.exoplayer2.mediacodec.IntArrayQueue();
    private final java.util.ArrayDeque<android.media.MediaCodec.BufferInfo> bufferInfos = new java.util.ArrayDeque<>();
    private final java.util.ArrayDeque<android.media.MediaFormat> formats = new java.util.ArrayDeque<>();

    AsynchronousMediaCodecCallback(android.os.HandlerThread handlerThread) {
        this.callbackThread = handlerThread;
    }

    public void initialize(android.media.MediaCodec mediaCodec) {
        com.google.android.exoplayer2.util.Assertions.checkState(this.handler == null);
        this.callbackThread.start();
        android.os.Handler handler = new android.os.Handler(this.callbackThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.handler = handler;
    }

    public void shutdown() {
        synchronized (this.lock) {
            this.shutDown = true;
            this.callbackThread.quit();
            flushInternal();
        }
    }

    public int dequeueInputBufferIndex() {
        synchronized (this.lock) {
            int i = -1;
            if (isFlushingOrShutdown()) {
                return -1;
            }
            maybeThrowException();
            if (!this.availableInputBuffers.isEmpty()) {
                i = this.availableInputBuffers.remove();
            }
            return i;
        }
    }

    public int dequeueOutputBufferIndex(android.media.MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.lock) {
            if (isFlushingOrShutdown()) {
                return -1;
            }
            maybeThrowException();
            if (this.availableOutputBuffers.isEmpty()) {
                return -1;
            }
            int remove = this.availableOutputBuffers.remove();
            if (remove >= 0) {
                com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.currentFormat);
                android.media.MediaCodec.BufferInfo remove2 = this.bufferInfos.remove();
                bufferInfo.set(remove2.offset, remove2.size, remove2.presentationTimeUs, remove2.flags);
            } else if (remove == -2) {
                this.currentFormat = this.formats.remove();
            }
            return remove;
        }
    }

    public android.media.MediaFormat getOutputFormat() {
        android.media.MediaFormat mediaFormat;
        synchronized (this.lock) {
            mediaFormat = this.currentFormat;
            if (mediaFormat == null) {
                throw new java.lang.IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void flush() {
        synchronized (this.lock) {
            this.pendingFlushCount++;
            ((android.os.Handler) com.google.android.exoplayer2.util.Util.castNonNull(this.handler)).post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecCallback$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecCallback.this.onFlushCompleted();
                }
            });
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(android.media.MediaCodec mediaCodec, int i) {
        synchronized (this.lock) {
            this.availableInputBuffers.add(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(android.media.MediaCodec mediaCodec, int i, android.media.MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.lock) {
            android.media.MediaFormat mediaFormat = this.pendingOutputFormat;
            if (mediaFormat != null) {
                addOutputFormat(mediaFormat);
                this.pendingOutputFormat = null;
            }
            this.availableOutputBuffers.add(i);
            this.bufferInfos.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(android.media.MediaCodec mediaCodec, android.media.MediaCodec.CodecException codecException) {
        synchronized (this.lock) {
            this.mediaCodecException = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat) {
        synchronized (this.lock) {
            addOutputFormat(mediaFormat);
            this.pendingOutputFormat = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFlushCompleted() {
        synchronized (this.lock) {
            if (this.shutDown) {
                return;
            }
            long j = this.pendingFlushCount - 1;
            this.pendingFlushCount = j;
            if (j > 0) {
                return;
            }
            if (j < 0) {
                setInternalException(new java.lang.IllegalStateException());
            } else {
                flushInternal();
            }
        }
    }

    private void flushInternal() {
        if (!this.formats.isEmpty()) {
            this.pendingOutputFormat = this.formats.getLast();
        }
        this.availableInputBuffers.clear();
        this.availableOutputBuffers.clear();
        this.bufferInfos.clear();
        this.formats.clear();
        this.mediaCodecException = null;
    }

    private boolean isFlushingOrShutdown() {
        return this.pendingFlushCount > 0 || this.shutDown;
    }

    private void addOutputFormat(android.media.MediaFormat mediaFormat) {
        this.availableOutputBuffers.add(-2);
        this.formats.add(mediaFormat);
    }

    private void maybeThrowException() {
        maybeThrowInternalException();
        maybeThrowMediaCodecException();
    }

    private void maybeThrowInternalException() {
        java.lang.IllegalStateException illegalStateException = this.internalException;
        if (illegalStateException == null) {
            return;
        }
        this.internalException = null;
        throw illegalStateException;
    }

    private void maybeThrowMediaCodecException() {
        android.media.MediaCodec.CodecException codecException = this.mediaCodecException;
        if (codecException == null) {
            return;
        }
        this.mediaCodecException = null;
        throw codecException;
    }

    private void setInternalException(java.lang.IllegalStateException illegalStateException) {
        synchronized (this.lock) {
            this.internalException = illegalStateException;
        }
    }
}
