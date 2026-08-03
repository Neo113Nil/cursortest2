package com.google.android.exoplayer2.text;

/* loaded from: classes3.dex */
public final class TextRenderer extends com.google.android.exoplayer2.BaseRenderer implements android.os.Handler.Callback {
    private static final int MSG_UPDATE_OUTPUT = 0;
    private static final int REPLACEMENT_STATE_NONE = 0;
    private static final int REPLACEMENT_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REPLACEMENT_STATE_WAIT_END_OF_STREAM = 2;
    private static final java.lang.String TAG = "TextRenderer";
    private com.google.android.exoplayer2.text.SubtitleDecoder decoder;
    private final com.google.android.exoplayer2.text.SubtitleDecoderFactory decoderFactory;
    private int decoderReplacementState;
    private long finalStreamEndPositionUs;
    private final com.google.android.exoplayer2.FormatHolder formatHolder;
    private boolean inputStreamEnded;
    private long lastRendererPositionUs;
    private com.google.android.exoplayer2.text.SubtitleInputBuffer nextInputBuffer;
    private com.google.android.exoplayer2.text.SubtitleOutputBuffer nextSubtitle;
    private int nextSubtitleEventIndex;
    private final com.google.android.exoplayer2.text.TextOutput output;
    private final android.os.Handler outputHandler;
    private boolean outputStreamEnded;
    private long outputStreamOffsetUs;
    private com.google.android.exoplayer2.Format streamFormat;
    private com.google.android.exoplayer2.text.SubtitleOutputBuffer subtitle;
    private boolean waitingForKeyFrame;

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isReady() {
        return true;
    }

    public TextRenderer(com.google.android.exoplayer2.text.TextOutput textOutput, android.os.Looper looper) {
        this(textOutput, looper, com.google.android.exoplayer2.text.SubtitleDecoderFactory.DEFAULT);
    }

    public TextRenderer(com.google.android.exoplayer2.text.TextOutput textOutput, android.os.Looper looper, com.google.android.exoplayer2.text.SubtitleDecoderFactory subtitleDecoderFactory) {
        super(3);
        this.output = (com.google.android.exoplayer2.text.TextOutput) com.google.android.exoplayer2.util.Assertions.checkNotNull(textOutput);
        this.outputHandler = looper == null ? null : com.google.android.exoplayer2.util.Util.createHandler(looper, this);
        this.decoderFactory = subtitleDecoderFactory;
        this.formatHolder = new com.google.android.exoplayer2.FormatHolder();
        this.finalStreamEndPositionUs = -9223372036854775807L;
        this.outputStreamOffsetUs = -9223372036854775807L;
        this.lastRendererPositionUs = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public java.lang.String getName() {
        return TAG;
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public int supportsFormat(com.google.android.exoplayer2.Format format) {
        if (this.decoderFactory.supportsFormat(format)) {
            return com.google.android.exoplayer2.RendererCapabilities.CC.create(format.cryptoType == 0 ? 4 : 2);
        }
        if (com.google.android.exoplayer2.util.MimeTypes.isText(format.sampleMimeType)) {
            return com.google.android.exoplayer2.RendererCapabilities.CC.create(1);
        }
        return com.google.android.exoplayer2.RendererCapabilities.CC.create(0);
    }

    public void setFinalStreamEndPositionUs(long j) {
        com.google.android.exoplayer2.util.Assertions.checkState(isCurrentStreamFinal());
        this.finalStreamEndPositionUs = j;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onStreamChanged(com.google.android.exoplayer2.Format[] formatArr, long j, long j2) {
        this.outputStreamOffsetUs = j2;
        this.streamFormat = formatArr[0];
        if (this.decoder != null) {
            this.decoderReplacementState = 1;
        } else {
            initDecoder();
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onPositionReset(long j, boolean z) {
        this.lastRendererPositionUs = j;
        clearOutput();
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        this.finalStreamEndPositionUs = -9223372036854775807L;
        if (this.decoderReplacementState != 0) {
            replaceDecoder();
        } else {
            releaseBuffers();
            ((com.google.android.exoplayer2.text.SubtitleDecoder) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.decoder)).flush();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x00a9, code lost:
    
        if (r11 != false) goto L48;
     */
    @Override // com.google.android.exoplayer2.Renderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void render(long j, long j2) {
        boolean z;
        this.lastRendererPositionUs = j;
        if (isCurrentStreamFinal()) {
            long j3 = this.finalStreamEndPositionUs;
            if (j3 != -9223372036854775807L && j >= j3) {
                releaseBuffers();
                this.outputStreamEnded = true;
            }
        }
        if (this.outputStreamEnded) {
            return;
        }
        if (this.nextSubtitle == null) {
            ((com.google.android.exoplayer2.text.SubtitleDecoder) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.decoder)).setPositionUs(j);
            try {
                this.nextSubtitle = ((com.google.android.exoplayer2.text.SubtitleDecoder) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.decoder)).dequeueOutputBuffer();
            } catch (com.google.android.exoplayer2.text.SubtitleDecoderException e) {
                handleDecoderError(e);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.subtitle != null) {
            long nextEventTime = getNextEventTime();
            z = false;
            while (nextEventTime <= j) {
                this.nextSubtitleEventIndex++;
                nextEventTime = getNextEventTime();
                z = true;
            }
        } else {
            z = false;
        }
        com.google.android.exoplayer2.text.SubtitleOutputBuffer subtitleOutputBuffer = this.nextSubtitle;
        if (subtitleOutputBuffer != null) {
            if (subtitleOutputBuffer.isEndOfStream()) {
                if (!z && getNextEventTime() == Long.MAX_VALUE) {
                    if (this.decoderReplacementState == 2) {
                        replaceDecoder();
                    } else {
                        releaseBuffers();
                        this.outputStreamEnded = true;
                    }
                }
            } else if (subtitleOutputBuffer.timeUs <= j) {
                com.google.android.exoplayer2.text.SubtitleOutputBuffer subtitleOutputBuffer2 = this.subtitle;
                if (subtitleOutputBuffer2 != null) {
                    subtitleOutputBuffer2.release();
                }
                this.nextSubtitleEventIndex = subtitleOutputBuffer.getNextEventTimeIndex(j);
                this.subtitle = subtitleOutputBuffer;
                this.nextSubtitle = null;
                com.google.android.exoplayer2.util.Assertions.checkNotNull(this.subtitle);
                updateOutput(new com.google.android.exoplayer2.text.CueGroup(this.subtitle.getCues(j), getPresentationTimeUs(getCurrentEventTimeUs(j))));
                if (this.decoderReplacementState == 2) {
                    return;
                }
                while (!this.inputStreamEnded) {
                    try {
                        com.google.android.exoplayer2.text.SubtitleInputBuffer subtitleInputBuffer = this.nextInputBuffer;
                        if (subtitleInputBuffer == null) {
                            subtitleInputBuffer = ((com.google.android.exoplayer2.text.SubtitleDecoder) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.decoder)).dequeueInputBuffer();
                            if (subtitleInputBuffer == null) {
                                return;
                            } else {
                                this.nextInputBuffer = subtitleInputBuffer;
                            }
                        }
                        if (this.decoderReplacementState == 1) {
                            subtitleInputBuffer.setFlags(4);
                            ((com.google.android.exoplayer2.text.SubtitleDecoder) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.decoder)).queueInputBuffer(subtitleInputBuffer);
                            this.nextInputBuffer = null;
                            this.decoderReplacementState = 2;
                            return;
                        }
                        int readSource = readSource(this.formatHolder, subtitleInputBuffer, 0);
                        if (readSource == -4) {
                            if (subtitleInputBuffer.isEndOfStream()) {
                                this.inputStreamEnded = true;
                                this.waitingForKeyFrame = false;
                            } else {
                                com.google.android.exoplayer2.Format format = this.formatHolder.format;
                                if (format == null) {
                                    return;
                                }
                                subtitleInputBuffer.subsampleOffsetUs = format.subsampleOffsetUs;
                                subtitleInputBuffer.flip();
                                this.waitingForKeyFrame &= !subtitleInputBuffer.isKeyFrame();
                            }
                            if (!this.waitingForKeyFrame) {
                                ((com.google.android.exoplayer2.text.SubtitleDecoder) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.decoder)).queueInputBuffer(subtitleInputBuffer);
                                this.nextInputBuffer = null;
                            }
                        } else if (readSource == -3) {
                            return;
                        }
                    } catch (com.google.android.exoplayer2.text.SubtitleDecoderException e2) {
                        handleDecoderError(e2);
                        return;
                    }
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onDisabled() {
        this.streamFormat = null;
        this.finalStreamEndPositionUs = -9223372036854775807L;
        clearOutput();
        this.outputStreamOffsetUs = -9223372036854775807L;
        this.lastRendererPositionUs = -9223372036854775807L;
        releaseDecoder();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    private void releaseBuffers() {
        this.nextInputBuffer = null;
        this.nextSubtitleEventIndex = -1;
        com.google.android.exoplayer2.text.SubtitleOutputBuffer subtitleOutputBuffer = this.subtitle;
        if (subtitleOutputBuffer != null) {
            subtitleOutputBuffer.release();
            this.subtitle = null;
        }
        com.google.android.exoplayer2.text.SubtitleOutputBuffer subtitleOutputBuffer2 = this.nextSubtitle;
        if (subtitleOutputBuffer2 != null) {
            subtitleOutputBuffer2.release();
            this.nextSubtitle = null;
        }
    }

    private void releaseDecoder() {
        releaseBuffers();
        ((com.google.android.exoplayer2.text.SubtitleDecoder) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.decoder)).release();
        this.decoder = null;
        this.decoderReplacementState = 0;
    }

    private void initDecoder() {
        this.waitingForKeyFrame = true;
        this.decoder = this.decoderFactory.createDecoder((com.google.android.exoplayer2.Format) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.streamFormat));
    }

    private void replaceDecoder() {
        releaseDecoder();
        initDecoder();
    }

    private long getNextEventTime() {
        if (this.nextSubtitleEventIndex == -1) {
            return Long.MAX_VALUE;
        }
        com.google.android.exoplayer2.util.Assertions.checkNotNull(this.subtitle);
        if (this.nextSubtitleEventIndex >= this.subtitle.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.subtitle.getEventTime(this.nextSubtitleEventIndex);
    }

    private void updateOutput(com.google.android.exoplayer2.text.CueGroup cueGroup) {
        android.os.Handler handler = this.outputHandler;
        if (handler != null) {
            handler.obtainMessage(0, cueGroup).sendToTarget();
        } else {
            invokeUpdateOutputInternal(cueGroup);
        }
    }

    private void clearOutput() {
        updateOutput(new com.google.android.exoplayer2.text.CueGroup(com.google.common.collect.ImmutableList.of(), getPresentationTimeUs(this.lastRendererPositionUs)));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (message.what == 0) {
            invokeUpdateOutputInternal((com.google.android.exoplayer2.text.CueGroup) message.obj);
            return true;
        }
        throw new java.lang.IllegalStateException();
    }

    private void invokeUpdateOutputInternal(com.google.android.exoplayer2.text.CueGroup cueGroup) {
        this.output.onCues(cueGroup.cues);
        this.output.onCues(cueGroup);
    }

    private void handleDecoderError(com.google.android.exoplayer2.text.SubtitleDecoderException subtitleDecoderException) {
        com.google.android.exoplayer2.util.Log.e(TAG, "Subtitle decoding failed. streamFormat=" + this.streamFormat, subtitleDecoderException);
        clearOutput();
        replaceDecoder();
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"subtitle"})
    @org.checkerframework.dataflow.qual.SideEffectFree
    private long getCurrentEventTimeUs(long j) {
        int nextEventTimeIndex = this.subtitle.getNextEventTimeIndex(j);
        if (nextEventTimeIndex == 0) {
            return this.subtitle.timeUs;
        }
        if (nextEventTimeIndex == -1) {
            return this.subtitle.getEventTime(r2.getEventTimeCount() - 1);
        }
        return this.subtitle.getEventTime(nextEventTimeIndex - 1);
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    private long getPresentationTimeUs(long j) {
        com.google.android.exoplayer2.util.Assertions.checkState(j != -9223372036854775807L);
        com.google.android.exoplayer2.util.Assertions.checkState(this.outputStreamOffsetUs != -9223372036854775807L);
        return j - this.outputStreamOffsetUs;
    }
}
