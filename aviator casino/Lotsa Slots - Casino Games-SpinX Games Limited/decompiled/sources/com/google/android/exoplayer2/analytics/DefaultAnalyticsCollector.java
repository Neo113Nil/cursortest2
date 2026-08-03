package com.google.android.exoplayer2.analytics;

/* loaded from: classes3.dex */
public class DefaultAnalyticsCollector implements com.google.android.exoplayer2.analytics.AnalyticsCollector {
    private final com.google.android.exoplayer2.util.Clock clock;
    private final android.util.SparseArray<com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime> eventTimes;
    private com.google.android.exoplayer2.util.HandlerWrapper handler;
    private boolean isSeeking;
    private com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.analytics.AnalyticsListener> listeners;
    private final com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.MediaPeriodQueueTracker mediaPeriodQueueTracker;
    private final com.google.android.exoplayer2.Timeline.Period period;
    private com.google.android.exoplayer2.Player player;
    private final com.google.android.exoplayer2.Timeline.Window window;

    static /* synthetic */ void lambda$new$0(com.google.android.exoplayer2.analytics.AnalyticsListener analyticsListener, com.google.android.exoplayer2.util.FlagSet flagSet) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public /* synthetic */ void onDrmSessionAcquired(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        com.google.android.exoplayer2.drm.DrmSessionEventListener.CC.$default$onDrmSessionAcquired(this, i, mediaPeriodId);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onEvents(com.google.android.exoplayer2.Player player, com.google.android.exoplayer2.Player.Events events) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onLoadingChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPositionDiscontinuity(int i) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onRenderedFirstFrame() {
    }

    public DefaultAnalyticsCollector(com.google.android.exoplayer2.util.Clock clock) {
        this.clock = (com.google.android.exoplayer2.util.Clock) com.google.android.exoplayer2.util.Assertions.checkNotNull(clock);
        this.listeners = new com.google.android.exoplayer2.util.ListenerSet<>(com.google.android.exoplayer2.util.Util.getCurrentOrMainLooper(), clock, new com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda37
            @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
            public final void invoke(java.lang.Object obj, com.google.android.exoplayer2.util.FlagSet flagSet) {
                com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.lambda$new$0((com.google.android.exoplayer2.analytics.AnalyticsListener) obj, flagSet);
            }
        });
        com.google.android.exoplayer2.Timeline.Period period = new com.google.android.exoplayer2.Timeline.Period();
        this.period = period;
        this.window = new com.google.android.exoplayer2.Timeline.Window();
        this.mediaPeriodQueueTracker = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.MediaPeriodQueueTracker(period);
        this.eventTimes = new android.util.SparseArray<>();
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public void addListener(com.google.android.exoplayer2.analytics.AnalyticsListener analyticsListener) {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(analyticsListener);
        this.listeners.add(analyticsListener);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public void removeListener(com.google.android.exoplayer2.analytics.AnalyticsListener analyticsListener) {
        this.listeners.remove(analyticsListener);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public void setPlayer(final com.google.android.exoplayer2.Player player, android.os.Looper looper) {
        com.google.android.exoplayer2.util.Assertions.checkState(this.player == null || this.mediaPeriodQueueTracker.mediaPeriodQueue.isEmpty());
        this.player = (com.google.android.exoplayer2.Player) com.google.android.exoplayer2.util.Assertions.checkNotNull(player);
        this.handler = this.clock.createHandler(looper, null);
        this.listeners = this.listeners.copy(looper, new com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda19
            @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
            public final void invoke(java.lang.Object obj, com.google.android.exoplayer2.util.FlagSet flagSet) {
                com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.this.m5384xd6963fe(player, (com.google.android.exoplayer2.analytics.AnalyticsListener) obj, flagSet);
            }
        });
    }

    /* renamed from: lambda$setPlayer$1$com-google-android-exoplayer2-analytics-DefaultAnalyticsCollector, reason: not valid java name */
    /* synthetic */ void m5384xd6963fe(com.google.android.exoplayer2.Player player, com.google.android.exoplayer2.analytics.AnalyticsListener analyticsListener, com.google.android.exoplayer2.util.FlagSet flagSet) {
        analyticsListener.onEvents(player, new com.google.android.exoplayer2.analytics.AnalyticsListener.Events(flagSet, this.eventTimes));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public void release() {
        ((com.google.android.exoplayer2.util.HandlerWrapper) com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.handler)).post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.this.releaseInternal();
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void updateMediaPeriodQueueInfo(java.util.List<com.google.android.exoplayer2.source.MediaSource.MediaPeriodId> list, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        this.mediaPeriodQueueTracker.onQueueUpdated(list, mediaPeriodId, (com.google.android.exoplayer2.Player) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.player));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void notifySeekStarted() {
        if (this.isSeeking) {
            return;
        }
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        this.isSeeking = true;
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, -1, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda17
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onSeekStarted(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioEnabled(final com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1007, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda56
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.lambda$onAudioEnabled$3(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, decoderCounters, (com.google.android.exoplayer2.analytics.AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onAudioEnabled$3(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters, com.google.android.exoplayer2.analytics.AnalyticsListener analyticsListener) {
        analyticsListener.onAudioEnabled(eventTime, decoderCounters);
        analyticsListener.onDecoderEnabled(eventTime, 1, decoderCounters);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioDecoderInitialized(final java.lang.String str, final long j, final long j2) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1008, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda11
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.lambda$onAudioDecoderInitialized$4(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, str, j2, j, (com.google.android.exoplayer2.analytics.AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onAudioDecoderInitialized$4(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, long j, long j2, com.google.android.exoplayer2.analytics.AnalyticsListener analyticsListener) {
        analyticsListener.onAudioDecoderInitialized(eventTime, str, j);
        analyticsListener.onAudioDecoderInitialized(eventTime, str, j2, j);
        analyticsListener.onDecoderInitialized(eventTime, 1, str, j);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioInputFormatChanged(final com.google.android.exoplayer2.Format format, final com.google.android.exoplayer2.decoder.DecoderReuseEvaluation decoderReuseEvaluation) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1009, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda9
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.lambda$onAudioInputFormatChanged$5(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, format, decoderReuseEvaluation, (com.google.android.exoplayer2.analytics.AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onAudioInputFormatChanged$5(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation decoderReuseEvaluation, com.google.android.exoplayer2.analytics.AnalyticsListener analyticsListener) {
        analyticsListener.onAudioInputFormatChanged(eventTime, format);
        analyticsListener.onAudioInputFormatChanged(eventTime, format, decoderReuseEvaluation);
        analyticsListener.onDecoderInputFormatChanged(eventTime, 1, format);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioPositionAdvancing(final long j) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1010, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda42
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onAudioPositionAdvancing(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, j);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioUnderrun(final int i, final long j, final long j2) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1011, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda10
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onAudioUnderrun(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, i, j, j2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioDecoderReleased(final java.lang.String str) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1012, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda40
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onAudioDecoderReleased(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, str);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioDisabled(final com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(generatePlayingMediaPeriodEventTime, 1013, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda39
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.lambda$onAudioDisabled$9(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, decoderCounters, (com.google.android.exoplayer2.analytics.AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onAudioDisabled$9(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters, com.google.android.exoplayer2.analytics.AnalyticsListener analyticsListener) {
        analyticsListener.onAudioDisabled(eventTime, decoderCounters);
        analyticsListener.onDecoderDisabled(eventTime, 1, decoderCounters);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioSinkError(final java.lang.Exception exc) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1014, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda50
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onAudioSinkError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioCodecError(final java.lang.Exception exc) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1029, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda7
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onAudioCodecError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onVolumeChanged(final float f) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 22, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda59
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onVolumeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, f);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoEnabled(final com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1015, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda32
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.lambda$onVideoEnabled$13(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, decoderCounters, (com.google.android.exoplayer2.analytics.AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onVideoEnabled$13(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters, com.google.android.exoplayer2.analytics.AnalyticsListener analyticsListener) {
        analyticsListener.onVideoEnabled(eventTime, decoderCounters);
        analyticsListener.onDecoderEnabled(eventTime, 2, decoderCounters);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoDecoderInitialized(final java.lang.String str, final long j, final long j2) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1016, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda35
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.lambda$onVideoDecoderInitialized$14(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, str, j2, j, (com.google.android.exoplayer2.analytics.AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onVideoDecoderInitialized$14(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, long j, long j2, com.google.android.exoplayer2.analytics.AnalyticsListener analyticsListener) {
        analyticsListener.onVideoDecoderInitialized(eventTime, str, j);
        analyticsListener.onVideoDecoderInitialized(eventTime, str, j2, j);
        analyticsListener.onDecoderInitialized(eventTime, 2, str, j);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoInputFormatChanged(final com.google.android.exoplayer2.Format format, final com.google.android.exoplayer2.decoder.DecoderReuseEvaluation decoderReuseEvaluation) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1017, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda31
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.lambda$onVideoInputFormatChanged$15(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, format, decoderReuseEvaluation, (com.google.android.exoplayer2.analytics.AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onVideoInputFormatChanged$15(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation decoderReuseEvaluation, com.google.android.exoplayer2.analytics.AnalyticsListener analyticsListener) {
        analyticsListener.onVideoInputFormatChanged(eventTime, format);
        analyticsListener.onVideoInputFormatChanged(eventTime, format, decoderReuseEvaluation);
        analyticsListener.onDecoderInputFormatChanged(eventTime, 2, format);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onDroppedFrames(final int i, final long j) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(generatePlayingMediaPeriodEventTime, 1018, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda47
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onDroppedVideoFrames(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, i, j);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoDecoderReleased(final java.lang.String str) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1019, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda64
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onVideoDecoderReleased(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, str);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoDisabled(final com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(generatePlayingMediaPeriodEventTime, 1020, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda44
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.lambda$onVideoDisabled$18(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, decoderCounters, (com.google.android.exoplayer2.analytics.AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onVideoDisabled$18(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters, com.google.android.exoplayer2.analytics.AnalyticsListener analyticsListener) {
        analyticsListener.onVideoDisabled(eventTime, decoderCounters);
        analyticsListener.onDecoderDisabled(eventTime, 2, decoderCounters);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onRenderedFirstFrame(final java.lang.Object obj, final long j) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 26, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda2
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj2) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj2).onRenderedFirstFrame(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, obj, j);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoFrameProcessingOffset(final long j, final int i) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(generatePlayingMediaPeriodEventTime, 1021, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda51
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onVideoFrameProcessingOffset(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, j, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoCodecError(final java.lang.Exception exc) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1030, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda6
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onVideoCodecError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onSurfaceSizeChanged(final int i, final int i2) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 24, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda25
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onSurfaceSizeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, i, i2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadStarted(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, final com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, final com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1000, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda55
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onLoadStarted(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, loadEventInfo, mediaLoadData);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadCompleted(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, final com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, final com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1001, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda15
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onLoadCompleted(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, loadEventInfo, mediaLoadData);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadCanceled(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, final com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, final com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1002, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda69
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onLoadCanceled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, loadEventInfo, mediaLoadData);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadError(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, final com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, final com.google.android.exoplayer2.source.MediaLoadData mediaLoadData, final java.io.IOException iOException, final boolean z) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1003, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda26
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onLoadError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, loadEventInfo, mediaLoadData, iOException, z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onUpstreamDiscarded(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, final com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1005, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda52
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onUpstreamDiscarded(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, mediaLoadData);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onDownstreamFormatChanged(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, final com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1004, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda21
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onDownstreamFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, mediaLoadData);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onTimelineChanged(com.google.android.exoplayer2.Timeline timeline, final int i) {
        this.mediaPeriodQueueTracker.onTimelineChanged((com.google.android.exoplayer2.Player) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.player));
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 0, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda57
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onTimelineChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onMediaItemTransition(final com.google.android.exoplayer2.MediaItem mediaItem, final int i) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 1, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda28
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onMediaItemTransition(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, mediaItem, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onTracksChanged(final com.google.android.exoplayer2.Tracks tracks) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 2, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda46
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onTracksChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, tracks);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onIsLoadingChanged(final boolean z) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 3, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda67
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.lambda$onIsLoadingChanged$32(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, z, (com.google.android.exoplayer2.analytics.AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onIsLoadingChanged$32(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, boolean z, com.google.android.exoplayer2.analytics.AnalyticsListener analyticsListener) {
        analyticsListener.onLoadingChanged(eventTime, z);
        analyticsListener.onIsLoadingChanged(eventTime, z);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onAvailableCommandsChanged(final com.google.android.exoplayer2.Player.Commands commands) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 13, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda30
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onAvailableCommandsChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, commands);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlayerStateChanged(final boolean z, final int i) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, -1, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda16
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onPlayerStateChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, z, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlaybackStateChanged(final int i) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 4, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda34
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onPlaybackStateChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlayWhenReadyChanged(final boolean z, final int i) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 5, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda22
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onPlayWhenReadyChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, z, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlaybackSuppressionReasonChanged(final int i) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 6, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda49
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onPlaybackSuppressionReasonChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onIsPlayingChanged(final boolean z) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 7, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda4
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onIsPlayingChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onRepeatModeChanged(final int i) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 8, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda41
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onRepeatModeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onShuffleModeEnabledChanged(final boolean z) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 9, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda8
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onShuffleModeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlayerError(final com.google.android.exoplayer2.PlaybackException playbackException) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTimeForErrorEvent = getEventTimeForErrorEvent(playbackException);
        sendEvent(eventTimeForErrorEvent, 10, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda27
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onPlayerError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, playbackException);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlayerErrorChanged(final com.google.android.exoplayer2.PlaybackException playbackException) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTimeForErrorEvent = getEventTimeForErrorEvent(playbackException);
        sendEvent(eventTimeForErrorEvent, 10, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda48
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onPlayerErrorChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, playbackException);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPositionDiscontinuity(final com.google.android.exoplayer2.Player.PositionInfo positionInfo, final com.google.android.exoplayer2.Player.PositionInfo positionInfo2, final int i) {
        if (i == 1) {
            this.isSeeking = false;
        }
        this.mediaPeriodQueueTracker.onPositionDiscontinuity((com.google.android.exoplayer2.Player) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.player));
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 11, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda54
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.lambda$onPositionDiscontinuity$43(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, i, positionInfo, positionInfo2, (com.google.android.exoplayer2.analytics.AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onPositionDiscontinuity$43(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, com.google.android.exoplayer2.Player.PositionInfo positionInfo, com.google.android.exoplayer2.Player.PositionInfo positionInfo2, com.google.android.exoplayer2.analytics.AnalyticsListener analyticsListener) {
        analyticsListener.onPositionDiscontinuity(eventTime, i);
        analyticsListener.onPositionDiscontinuity(eventTime, positionInfo, positionInfo2, i);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlaybackParametersChanged(final com.google.android.exoplayer2.PlaybackParameters playbackParameters) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 12, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda14
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onPlaybackParametersChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, playbackParameters);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onSeekBackIncrementChanged(final long j) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 16, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda1
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onSeekBackIncrementChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, j);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onSeekForwardIncrementChanged(final long j) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 17, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onSeekForwardIncrementChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, j);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onMaxSeekToPreviousPositionChanged(final long j) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 18, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda65
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onMaxSeekToPreviousPositionChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, j);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onMediaMetadataChanged(final com.google.android.exoplayer2.MediaMetadata mediaMetadata) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 14, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda12
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onMediaMetadataChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, mediaMetadata);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlaylistMetadataChanged(final com.google.android.exoplayer2.MediaMetadata mediaMetadata) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 15, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda23
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onPlaylistMetadataChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, mediaMetadata);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onMetadata(final com.google.android.exoplayer2.metadata.Metadata metadata) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 28, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda63
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onMetadata(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, metadata);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onCues(final java.util.List<com.google.android.exoplayer2.text.Cue> list) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 27, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda45
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onCues(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, (java.util.List<com.google.android.exoplayer2.text.Cue>) list);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onCues(final com.google.android.exoplayer2.text.CueGroup cueGroup) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 27, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda29
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onCues(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, cueGroup);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onSeekProcessed() {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, -1, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda20
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onSeekProcessed(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onSkipSilenceEnabledChanged(final boolean z) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 23, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda3
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onSkipSilenceEnabledChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onAudioSessionIdChanged(final int i) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 21, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda18
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onAudioSessionIdChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onAudioAttributesChanged(final com.google.android.exoplayer2.audio.AudioAttributes audioAttributes) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 20, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda5
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onAudioAttributesChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, audioAttributes);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onVideoSizeChanged(final com.google.android.exoplayer2.video.VideoSize videoSize) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 25, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda68
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.lambda$onVideoSizeChanged$57(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, videoSize, (com.google.android.exoplayer2.analytics.AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onVideoSizeChanged$57(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.video.VideoSize videoSize, com.google.android.exoplayer2.analytics.AnalyticsListener analyticsListener) {
        analyticsListener.onVideoSizeChanged(eventTime, videoSize);
        analyticsListener.onVideoSizeChanged(eventTime, videoSize.width, videoSize.height, videoSize.unappliedRotationDegrees, videoSize.pixelWidthHeightRatio);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onTrackSelectionParametersChanged(final com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 19, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda38
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onTrackSelectionParametersChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, trackSelectionParameters);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onDeviceInfoChanged(final com.google.android.exoplayer2.DeviceInfo deviceInfo) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 29, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda61
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onDeviceInfoChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, deviceInfo);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onDeviceVolumeChanged(final int i, final boolean z) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 30, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda62
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onDeviceVolumeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, i, z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener
    public final void onBandwidthSample(final int i, final long j, final long j2) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateLoadingMediaPeriodEventTime = generateLoadingMediaPeriodEventTime();
        sendEvent(generateLoadingMediaPeriodEventTime, 1006, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda33
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onBandwidthEstimate(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, i, j, j2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmSessionAcquired(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, final int i2) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1022, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda58
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.lambda$onDrmSessionAcquired$62(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, i2, (com.google.android.exoplayer2.analytics.AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onDrmSessionAcquired$62(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, com.google.android.exoplayer2.analytics.AnalyticsListener analyticsListener) {
        analyticsListener.onDrmSessionAcquired(eventTime);
        analyticsListener.onDrmSessionAcquired(eventTime, i);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmKeysLoaded(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1023, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda36
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onDrmKeysLoaded(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmSessionManagerError(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, final java.lang.Exception exc) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1024, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda53
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onDrmSessionManagerError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmKeysRestored(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1025, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda60
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onDrmKeysRestored(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmKeysRemoved(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1026, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda66
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onDrmKeysRemoved(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmSessionReleased(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1027, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda43
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onDrmSessionReleased(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this);
            }
        });
    }

    protected final void sendEvent(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, com.google.android.exoplayer2.util.ListenerSet.Event<com.google.android.exoplayer2.analytics.AnalyticsListener> event) {
        this.eventTimes.put(i, eventTime);
        this.listeners.sendEvent(i, event);
    }

    protected final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getCurrentPlayerMediaPeriod());
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"player"})
    protected final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateEventTime(com.google.android.exoplayer2.Timeline timeline, int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId2 = timeline.isEmpty() ? null : mediaPeriodId;
        long elapsedRealtime = this.clock.elapsedRealtime();
        boolean z = timeline.equals(this.player.getCurrentTimeline()) && i == this.player.getCurrentMediaItemIndex();
        long j = 0;
        if (mediaPeriodId2 == null || !mediaPeriodId2.isAd()) {
            if (z) {
                j = this.player.getContentPosition();
            } else if (!timeline.isEmpty()) {
                j = timeline.getWindow(i, this.window).getDefaultPositionMs();
            }
        } else if (z && this.player.getCurrentAdGroupIndex() == mediaPeriodId2.adGroupIndex && this.player.getCurrentAdIndexInAdGroup() == mediaPeriodId2.adIndexInAdGroup) {
            j = this.player.getCurrentPosition();
        }
        return new com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime(elapsedRealtime, timeline, i, mediaPeriodId2, j, this.player.getCurrentTimeline(), this.player.getCurrentMediaItemIndex(), this.mediaPeriodQueueTracker.getCurrentPlayerMediaPeriod(), this.player.getCurrentPosition(), this.player.getTotalBufferedDuration());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseInternal() {
        final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 1028, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda24
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onPlayerReleased(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.this);
            }
        });
        this.listeners.release();
    }

    private com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateEventTime(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(this.player);
        com.google.android.exoplayer2.Timeline mediaPeriodIdTimeline = mediaPeriodId == null ? null : this.mediaPeriodQueueTracker.getMediaPeriodIdTimeline(mediaPeriodId);
        if (mediaPeriodId == null || mediaPeriodIdTimeline == null) {
            int currentMediaItemIndex = this.player.getCurrentMediaItemIndex();
            com.google.android.exoplayer2.Timeline currentTimeline = this.player.getCurrentTimeline();
            if (currentMediaItemIndex >= currentTimeline.getWindowCount()) {
                currentTimeline = com.google.android.exoplayer2.Timeline.EMPTY;
            }
            return generateEventTime(currentTimeline, currentMediaItemIndex, null);
        }
        return generateEventTime(mediaPeriodIdTimeline, mediaPeriodIdTimeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, mediaPeriodId);
    }

    private com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getPlayingMediaPeriod());
    }

    private com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getReadingMediaPeriod());
    }

    private com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateLoadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getLoadingMediaPeriod());
    }

    private com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateMediaPeriodEventTime(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(this.player);
        if (mediaPeriodId != null) {
            if (this.mediaPeriodQueueTracker.getMediaPeriodIdTimeline(mediaPeriodId) != null) {
                return generateEventTime(mediaPeriodId);
            }
            return generateEventTime(com.google.android.exoplayer2.Timeline.EMPTY, i, mediaPeriodId);
        }
        com.google.android.exoplayer2.Timeline currentTimeline = this.player.getCurrentTimeline();
        if (i >= currentTimeline.getWindowCount()) {
            currentTimeline = com.google.android.exoplayer2.Timeline.EMPTY;
        }
        return generateEventTime(currentTimeline, i, null);
    }

    private com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime getEventTimeForErrorEvent(com.google.android.exoplayer2.PlaybackException playbackException) {
        if (playbackException instanceof com.google.android.exoplayer2.ExoPlaybackException) {
            com.google.android.exoplayer2.ExoPlaybackException exoPlaybackException = (com.google.android.exoplayer2.ExoPlaybackException) playbackException;
            if (exoPlaybackException.mediaPeriodId != null) {
                return generateEventTime(new com.google.android.exoplayer2.source.MediaSource.MediaPeriodId(exoPlaybackException.mediaPeriodId));
            }
        }
        return generateCurrentPlayerMediaPeriodEventTime();
    }

    private static final class MediaPeriodQueueTracker {
        private com.google.android.exoplayer2.source.MediaSource.MediaPeriodId currentPlayerMediaPeriod;
        private com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.MediaSource.MediaPeriodId> mediaPeriodQueue = com.google.common.collect.ImmutableList.of();
        private com.google.common.collect.ImmutableMap<com.google.android.exoplayer2.source.MediaSource.MediaPeriodId, com.google.android.exoplayer2.Timeline> mediaPeriodTimelines = com.google.common.collect.ImmutableMap.of();
        private final com.google.android.exoplayer2.Timeline.Period period;
        private com.google.android.exoplayer2.source.MediaSource.MediaPeriodId playingMediaPeriod;
        private com.google.android.exoplayer2.source.MediaSource.MediaPeriodId readingMediaPeriod;

        public MediaPeriodQueueTracker(com.google.android.exoplayer2.Timeline.Period period) {
            this.period = period;
        }

        public com.google.android.exoplayer2.source.MediaSource.MediaPeriodId getCurrentPlayerMediaPeriod() {
            return this.currentPlayerMediaPeriod;
        }

        public com.google.android.exoplayer2.source.MediaSource.MediaPeriodId getPlayingMediaPeriod() {
            return this.playingMediaPeriod;
        }

        public com.google.android.exoplayer2.source.MediaSource.MediaPeriodId getReadingMediaPeriod() {
            return this.readingMediaPeriod;
        }

        public com.google.android.exoplayer2.source.MediaSource.MediaPeriodId getLoadingMediaPeriod() {
            if (this.mediaPeriodQueue.isEmpty()) {
                return null;
            }
            return (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) com.google.common.collect.Iterables.getLast(this.mediaPeriodQueue);
        }

        public com.google.android.exoplayer2.Timeline getMediaPeriodIdTimeline(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
            return this.mediaPeriodTimelines.get(mediaPeriodId);
        }

        public void onPositionDiscontinuity(com.google.android.exoplayer2.Player player) {
            this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
        }

        public void onTimelineChanged(com.google.android.exoplayer2.Player player) {
            this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
            updateMediaPeriodTimelines(player.getCurrentTimeline());
        }

        public void onQueueUpdated(java.util.List<com.google.android.exoplayer2.source.MediaSource.MediaPeriodId> list, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.Player player) {
            this.mediaPeriodQueue = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
            if (!list.isEmpty()) {
                this.playingMediaPeriod = list.get(0);
                this.readingMediaPeriod = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) com.google.android.exoplayer2.util.Assertions.checkNotNull(mediaPeriodId);
            }
            if (this.currentPlayerMediaPeriod == null) {
                this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
            }
            updateMediaPeriodTimelines(player.getCurrentTimeline());
        }

        private void updateMediaPeriodTimelines(com.google.android.exoplayer2.Timeline timeline) {
            com.google.common.collect.ImmutableMap.Builder<com.google.android.exoplayer2.source.MediaSource.MediaPeriodId, com.google.android.exoplayer2.Timeline> builder = com.google.common.collect.ImmutableMap.builder();
            if (this.mediaPeriodQueue.isEmpty()) {
                addTimelineForMediaPeriodId(builder, this.playingMediaPeriod, timeline);
                if (!com.google.common.base.Objects.equal(this.readingMediaPeriod, this.playingMediaPeriod)) {
                    addTimelineForMediaPeriodId(builder, this.readingMediaPeriod, timeline);
                }
                if (!com.google.common.base.Objects.equal(this.currentPlayerMediaPeriod, this.playingMediaPeriod) && !com.google.common.base.Objects.equal(this.currentPlayerMediaPeriod, this.readingMediaPeriod)) {
                    addTimelineForMediaPeriodId(builder, this.currentPlayerMediaPeriod, timeline);
                }
            } else {
                for (int i = 0; i < this.mediaPeriodQueue.size(); i++) {
                    addTimelineForMediaPeriodId(builder, this.mediaPeriodQueue.get(i), timeline);
                }
                if (!this.mediaPeriodQueue.contains(this.currentPlayerMediaPeriod)) {
                    addTimelineForMediaPeriodId(builder, this.currentPlayerMediaPeriod, timeline);
                }
            }
            this.mediaPeriodTimelines = builder.buildOrThrow();
        }

        private void addTimelineForMediaPeriodId(com.google.common.collect.ImmutableMap.Builder<com.google.android.exoplayer2.source.MediaSource.MediaPeriodId, com.google.android.exoplayer2.Timeline> builder, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.Timeline timeline) {
            if (mediaPeriodId == null) {
                return;
            }
            if (timeline.getIndexOfPeriod(mediaPeriodId.periodUid) != -1) {
                builder.put(mediaPeriodId, timeline);
                return;
            }
            com.google.android.exoplayer2.Timeline timeline2 = this.mediaPeriodTimelines.get(mediaPeriodId);
            if (timeline2 != null) {
                builder.put(mediaPeriodId, timeline2);
            }
        }

        private static com.google.android.exoplayer2.source.MediaSource.MediaPeriodId findCurrentPlayerMediaPeriodInQueue(com.google.android.exoplayer2.Player player, com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.MediaSource.MediaPeriodId> immutableList, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.Timeline.Period period) {
            com.google.android.exoplayer2.Timeline currentTimeline = player.getCurrentTimeline();
            int currentPeriodIndex = player.getCurrentPeriodIndex();
            java.lang.Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(currentPeriodIndex);
            int adGroupIndexAfterPositionUs = (player.isPlayingAd() || currentTimeline.isEmpty()) ? -1 : currentTimeline.getPeriod(currentPeriodIndex, period).getAdGroupIndexAfterPositionUs(com.google.android.exoplayer2.util.Util.msToUs(player.getCurrentPosition()) - period.getPositionInWindowUs());
            for (int i = 0; i < immutableList.size(); i++) {
                com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId2 = immutableList.get(i);
                if (isMatchingMediaPeriod(mediaPeriodId2, uidOfPeriod, player.isPlayingAd(), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                    return mediaPeriodId2;
                }
            }
            if (immutableList.isEmpty() && mediaPeriodId != null) {
                if (isMatchingMediaPeriod(mediaPeriodId, uidOfPeriod, player.isPlayingAd(), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                    return mediaPeriodId;
                }
            }
            return null;
        }

        private static boolean isMatchingMediaPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, java.lang.Object obj, boolean z, int i, int i2, int i3) {
            if (mediaPeriodId.periodUid.equals(obj)) {
                return (z && mediaPeriodId.adGroupIndex == i && mediaPeriodId.adIndexInAdGroup == i2) || (!z && mediaPeriodId.adGroupIndex == -1 && mediaPeriodId.nextAdGroupIndex == i3);
            }
            return false;
        }
    }
}
