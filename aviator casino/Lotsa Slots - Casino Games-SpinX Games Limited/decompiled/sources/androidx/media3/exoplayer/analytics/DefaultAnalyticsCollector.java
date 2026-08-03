package androidx.media3.exoplayer.analytics;

/* loaded from: classes2.dex */
public class DefaultAnalyticsCollector implements androidx.media3.exoplayer.analytics.AnalyticsCollector {
    private final androidx.media3.common.util.Clock clock;
    private final android.util.SparseArray<androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime> eventTimes;
    private androidx.media3.common.util.HandlerWrapper handler;
    private boolean isSeeking;
    private androidx.media3.common.util.ListenerSet<androidx.media3.exoplayer.analytics.AnalyticsListener> listeners;
    private final androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector.MediaPeriodQueueTracker mediaPeriodQueueTracker;
    private final androidx.media3.common.Timeline.Period period;
    private androidx.media3.common.Player player;
    private final androidx.media3.common.Timeline.Window window;

    static /* synthetic */ void lambda$new$0(androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener, androidx.media3.common.FlagSet flagSet) {
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public /* synthetic */ void onDrmSessionAcquired(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        androidx.media3.exoplayer.drm.DrmSessionEventListener.CC.$default$onDrmSessionAcquired(this, i, mediaPeriodId);
    }

    @Override // androidx.media3.common.Player.Listener
    public void onEvents(androidx.media3.common.Player player, androidx.media3.common.Player.Events events) {
    }

    @Override // androidx.media3.common.Player.Listener
    public void onLoadingChanged(boolean z) {
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPositionDiscontinuity(int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public void onRenderedFirstFrame() {
    }

    public DefaultAnalyticsCollector(androidx.media3.common.util.Clock clock) {
        this.clock = (androidx.media3.common.util.Clock) androidx.media3.common.util.Assertions.checkNotNull(clock);
        this.listeners = new androidx.media3.common.util.ListenerSet<>(androidx.media3.common.util.Util.getCurrentOrMainLooper(), clock, new androidx.media3.common.util.ListenerSet.IterationFinishedEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda31
            @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
            public final void invoke(java.lang.Object obj, androidx.media3.common.FlagSet flagSet) {
                androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector.lambda$new$0((androidx.media3.exoplayer.analytics.AnalyticsListener) obj, flagSet);
            }
        });
        androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
        this.period = period;
        this.window = new androidx.media3.common.Timeline.Window();
        this.mediaPeriodQueueTracker = new androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector.MediaPeriodQueueTracker(period);
        this.eventTimes = new android.util.SparseArray<>();
    }

    @java.lang.Deprecated
    public void setThrowsWhenUsingWrongThread(boolean z) {
        this.listeners.setThrowsWhenUsingWrongThread(z);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void addListener(androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener) {
        androidx.media3.common.util.Assertions.checkNotNull(analyticsListener);
        this.listeners.add(analyticsListener);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void removeListener(androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener) {
        this.listeners.remove(analyticsListener);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void setPlayer(final androidx.media3.common.Player player, android.os.Looper looper) {
        androidx.media3.common.util.Assertions.checkState(this.player == null || this.mediaPeriodQueueTracker.mediaPeriodQueue.isEmpty());
        this.player = (androidx.media3.common.Player) androidx.media3.common.util.Assertions.checkNotNull(player);
        this.handler = this.clock.createHandler(looper, null);
        this.listeners = this.listeners.copy(looper, new androidx.media3.common.util.ListenerSet.IterationFinishedEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda16
            @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
            public final void invoke(java.lang.Object obj, androidx.media3.common.FlagSet flagSet) {
                androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector.this.m4824xfeaa50a6(player, (androidx.media3.exoplayer.analytics.AnalyticsListener) obj, flagSet);
            }
        });
    }

    /* renamed from: lambda$setPlayer$1$androidx-media3-exoplayer-analytics-DefaultAnalyticsCollector, reason: not valid java name */
    /* synthetic */ void m4824xfeaa50a6(androidx.media3.common.Player player, androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener, androidx.media3.common.FlagSet flagSet) {
        analyticsListener.onEvents(player, new androidx.media3.exoplayer.analytics.AnalyticsListener.Events(flagSet, this.eventTimes));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void release() {
        ((androidx.media3.common.util.HandlerWrapper) androidx.media3.common.util.Assertions.checkStateNotNull(this.handler)).post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda54
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector.this.releaseInternal();
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void updateMediaPeriodQueueInfo(java.util.List<androidx.media3.exoplayer.source.MediaSource.MediaPeriodId> list, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        this.mediaPeriodQueueTracker.onQueueUpdated(list, mediaPeriodId, (androidx.media3.common.Player) androidx.media3.common.util.Assertions.checkNotNull(this.player));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void notifySeekStarted() {
        if (this.isSeeking) {
            return;
        }
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        this.isSeeking = true;
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, -1, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda50
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onSeekStarted(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioEnabled(final androidx.media3.exoplayer.DecoderCounters decoderCounters) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1007, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda2
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onAudioEnabled(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, decoderCounters);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioDecoderInitialized(final java.lang.String str, final long j, final long j2) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1008, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda23
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector.lambda$onAudioDecoderInitialized$4(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, str, j2, j, (androidx.media3.exoplayer.analytics.AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onAudioDecoderInitialized$4(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, long j, long j2, androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener) {
        analyticsListener.onAudioDecoderInitialized(eventTime, str, j);
        analyticsListener.onAudioDecoderInitialized(eventTime, str, j2, j);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioInputFormatChanged(final androidx.media3.common.Format format, final androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1009, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda51
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onAudioInputFormatChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, format, decoderReuseEvaluation);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioPositionAdvancing(final long j) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1010, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda20
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onAudioPositionAdvancing(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, j);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioUnderrun(final int i, final long j, final long j2) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1011, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda14
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onAudioUnderrun(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, i, j, j2);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioDecoderReleased(final java.lang.String str) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1012, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda5
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onAudioDecoderReleased(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, str);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioDisabled(final androidx.media3.exoplayer.DecoderCounters decoderCounters) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(generatePlayingMediaPeriodEventTime, 1013, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda36
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onAudioDisabled(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, decoderCounters);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioSinkError(final java.lang.Exception exc) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1014, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda64
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onAudioSinkError(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, exc);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioCodecError(final java.lang.Exception exc) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1029, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda59
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onAudioCodecError(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, exc);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void onAudioTrackInitialized(final androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1031, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda45
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onAudioTrackInitialized(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, audioTrackConfig);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void onAudioTrackReleased(final androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1032, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda62
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onAudioTrackReleased(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, audioTrackConfig);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVolumeChanged(final float f) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 22, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda12
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onVolumeChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, f);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoEnabled(final androidx.media3.exoplayer.DecoderCounters decoderCounters) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1015, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda53
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onVideoEnabled(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, decoderCounters);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoDecoderInitialized(final java.lang.String str, final long j, final long j2) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1016, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda60
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector.lambda$onVideoDecoderInitialized$16(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, str, j2, j, (androidx.media3.exoplayer.analytics.AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onVideoDecoderInitialized$16(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, long j, long j2, androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener) {
        analyticsListener.onVideoDecoderInitialized(eventTime, str, j);
        analyticsListener.onVideoDecoderInitialized(eventTime, str, j2, j);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoInputFormatChanged(final androidx.media3.common.Format format, final androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1017, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda43
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onVideoInputFormatChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, format, decoderReuseEvaluation);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onDroppedFrames(final int i, final long j) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(generatePlayingMediaPeriodEventTime, 1018, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda26
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onDroppedVideoFrames(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, i, j);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoDecoderReleased(final java.lang.String str) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1019, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda25
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onVideoDecoderReleased(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, str);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoDisabled(final androidx.media3.exoplayer.DecoderCounters decoderCounters) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(generatePlayingMediaPeriodEventTime, 1020, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda44
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onVideoDisabled(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, decoderCounters);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onRenderedFirstFrame(final java.lang.Object obj, final long j) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 26, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda57
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj2) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj2).onRenderedFirstFrame(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, obj, j);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoFrameProcessingOffset(final long j, final int i) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(generatePlayingMediaPeriodEventTime, 1021, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda32
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onVideoFrameProcessingOffset(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, j, i);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoCodecError(final java.lang.Exception exc) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1030, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda13
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onVideoCodecError(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, exc);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onSurfaceSizeChanged(final int i, final int i2) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 24, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda67
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onSurfaceSizeChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, i, i2);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadStarted(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, final androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, final androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1000, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda6
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onLoadStarted(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, loadEventInfo, mediaLoadData);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadCompleted(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, final androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, final androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1001, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda42
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onLoadCompleted(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, loadEventInfo, mediaLoadData);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadCanceled(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, final androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, final androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1002, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda34
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onLoadCanceled(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, loadEventInfo, mediaLoadData);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadError(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, final androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, final androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, final java.io.IOException iOException, final boolean z) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1003, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda15
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onLoadError(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, loadEventInfo, mediaLoadData, iOException, z);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onUpstreamDiscarded(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, final androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1005, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda58
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onUpstreamDiscarded(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, mediaLoadData);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onDownstreamFormatChanged(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, final androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1004, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda33
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onDownstreamFormatChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, mediaLoadData);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onTimelineChanged(androidx.media3.common.Timeline timeline, final int i) {
        this.mediaPeriodQueueTracker.onTimelineChanged((androidx.media3.common.Player) androidx.media3.common.util.Assertions.checkNotNull(this.player));
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 0, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda8
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onTimelineChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, i);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onMediaItemTransition(final androidx.media3.common.MediaItem mediaItem, final int i) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 1, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda9
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onMediaItemTransition(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, mediaItem, i);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onTracksChanged(final androidx.media3.common.Tracks tracks) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 2, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda22
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onTracksChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, tracks);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onIsLoadingChanged(final boolean z) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 3, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda4
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector.lambda$onIsLoadingChanged$34(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, z, (androidx.media3.exoplayer.analytics.AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onIsLoadingChanged$34(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, boolean z, androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener) {
        analyticsListener.onLoadingChanged(eventTime, z);
        analyticsListener.onIsLoadingChanged(eventTime, z);
    }

    @Override // androidx.media3.common.Player.Listener
    public void onAvailableCommandsChanged(final androidx.media3.common.Player.Commands commands) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 13, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda7
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onAvailableCommandsChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, commands);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerStateChanged(final boolean z, final int i) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, -1, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda17
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onPlayerStateChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, z, i);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(final int i) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 4, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda37
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onPlaybackStateChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, i);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayWhenReadyChanged(final boolean z, final int i) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 5, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda29
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onPlayWhenReadyChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, z, i);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackSuppressionReasonChanged(final int i) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 6, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda24
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onPlaybackSuppressionReasonChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, i);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onIsPlayingChanged(final boolean z) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 7, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda21
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onIsPlayingChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, z);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onRepeatModeChanged(final int i) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 8, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda56
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onRepeatModeChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, i);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onShuffleModeEnabledChanged(final boolean z) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 9, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda65
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onShuffleModeChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, z);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(final androidx.media3.common.PlaybackException playbackException) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeForErrorEvent = getEventTimeForErrorEvent(playbackException);
        sendEvent(eventTimeForErrorEvent, 10, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda35
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onPlayerError(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, playbackException);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlayerErrorChanged(final androidx.media3.common.PlaybackException playbackException) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeForErrorEvent = getEventTimeForErrorEvent(playbackException);
        sendEvent(eventTimeForErrorEvent, 10, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda27
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onPlayerErrorChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, playbackException);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPositionDiscontinuity(final androidx.media3.common.Player.PositionInfo positionInfo, final androidx.media3.common.Player.PositionInfo positionInfo2, final int i) {
        if (i == 1) {
            this.isSeeking = false;
        }
        this.mediaPeriodQueueTracker.onPositionDiscontinuity((androidx.media3.common.Player) androidx.media3.common.util.Assertions.checkNotNull(this.player));
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 11, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda52
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector.lambda$onPositionDiscontinuity$45(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, i, positionInfo, positionInfo2, (androidx.media3.exoplayer.analytics.AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onPositionDiscontinuity$45(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i, androidx.media3.common.Player.PositionInfo positionInfo, androidx.media3.common.Player.PositionInfo positionInfo2, androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener) {
        analyticsListener.onPositionDiscontinuity(eventTime, i);
        analyticsListener.onPositionDiscontinuity(eventTime, positionInfo, positionInfo2, i);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackParametersChanged(final androidx.media3.common.PlaybackParameters playbackParameters) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 12, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onPlaybackParametersChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, playbackParameters);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onSeekBackIncrementChanged(final long j) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 16, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda68
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onSeekBackIncrementChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, j);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onSeekForwardIncrementChanged(final long j) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 17, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda3
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onSeekForwardIncrementChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, j);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onMaxSeekToPreviousPositionChanged(final long j) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 18, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda69
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onMaxSeekToPreviousPositionChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, j);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onMediaMetadataChanged(final androidx.media3.common.MediaMetadata mediaMetadata) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 14, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda66
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onMediaMetadataChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, mediaMetadata);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlaylistMetadataChanged(final androidx.media3.common.MediaMetadata mediaMetadata) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 15, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda48
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onPlaylistMetadataChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, mediaMetadata);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onMetadata(final androidx.media3.common.Metadata metadata) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 28, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda19
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onMetadata(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, metadata);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onCues(final java.util.List<androidx.media3.common.text.Cue> list) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 27, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda30
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onCues(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, (java.util.List<androidx.media3.common.text.Cue>) list);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onCues(final androidx.media3.common.text.CueGroup cueGroup) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 27, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda55
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onCues(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, cueGroup);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onSkipSilenceEnabledChanged(final boolean z) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 23, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda10
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onSkipSilenceEnabledChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, z);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onAudioSessionIdChanged(final int i) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 21, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda47
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onAudioSessionIdChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, i);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onAudioAttributesChanged(final androidx.media3.common.AudioAttributes audioAttributes) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 20, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda18
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onAudioAttributesChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, audioAttributes);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVideoSizeChanged(final androidx.media3.common.VideoSize videoSize) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 25, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda49
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector.lambda$onVideoSizeChanged$58(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, videoSize, (androidx.media3.exoplayer.analytics.AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onVideoSizeChanged$58(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.VideoSize videoSize, androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener) {
        analyticsListener.onVideoSizeChanged(eventTime, videoSize);
        analyticsListener.onVideoSizeChanged(eventTime, videoSize.width, videoSize.height, videoSize.unappliedRotationDegrees, videoSize.pixelWidthHeightRatio);
    }

    @Override // androidx.media3.common.Player.Listener
    public void onTrackSelectionParametersChanged(final androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 19, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda70
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onTrackSelectionParametersChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, trackSelectionParameters);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onDeviceInfoChanged(final androidx.media3.common.DeviceInfo deviceInfo) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 29, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda39
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onDeviceInfoChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, deviceInfo);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onDeviceVolumeChanged(final int i, final boolean z) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 30, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda28
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onDeviceVolumeChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, i, z);
            }
        });
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener
    public final void onBandwidthSample(final int i, final long j, final long j2) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateLoadingMediaPeriodEventTime = generateLoadingMediaPeriodEventTime();
        sendEvent(generateLoadingMediaPeriodEventTime, 1006, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda11
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onBandwidthEstimate(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, i, j, j2);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmSessionAcquired(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, final int i2) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1022, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda38
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector.lambda$onDrmSessionAcquired$63(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, i2, (androidx.media3.exoplayer.analytics.AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onDrmSessionAcquired$63(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i, androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener) {
        analyticsListener.onDrmSessionAcquired(eventTime);
        analyticsListener.onDrmSessionAcquired(eventTime, i);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmKeysLoaded(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1023, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda61
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onDrmKeysLoaded(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmSessionManagerError(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, final java.lang.Exception exc) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1024, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda41
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onDrmSessionManagerError(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this, exc);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmKeysRestored(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1025, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda46
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onDrmKeysRestored(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmKeysRemoved(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1026, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda40
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onDrmKeysRemoved(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmSessionReleased(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1027, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda63
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onDrmSessionReleased(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this);
            }
        });
    }

    protected final void sendEvent(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i, androidx.media3.common.util.ListenerSet.Event<androidx.media3.exoplayer.analytics.AnalyticsListener> event) {
        this.eventTimes.put(i, eventTime);
        this.listeners.sendEvent(i, event);
    }

    protected final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getCurrentPlayerMediaPeriod());
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"player"})
    protected final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateEventTime(androidx.media3.common.Timeline timeline, int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId2 = timeline.isEmpty() ? null : mediaPeriodId;
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
        return new androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime(elapsedRealtime, timeline, i, mediaPeriodId2, j, this.player.getCurrentTimeline(), this.player.getCurrentMediaItemIndex(), this.mediaPeriodQueueTracker.getCurrentPlayerMediaPeriod(), this.player.getCurrentPosition(), this.player.getTotalBufferedDuration());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseInternal() {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 1028, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onPlayerReleased(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime.this);
            }
        });
        this.listeners.release();
    }

    private androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateEventTime(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        androidx.media3.common.util.Assertions.checkNotNull(this.player);
        androidx.media3.common.Timeline mediaPeriodIdTimeline = mediaPeriodId == null ? null : this.mediaPeriodQueueTracker.getMediaPeriodIdTimeline(mediaPeriodId);
        if (mediaPeriodId == null || mediaPeriodIdTimeline == null) {
            int currentMediaItemIndex = this.player.getCurrentMediaItemIndex();
            androidx.media3.common.Timeline currentTimeline = this.player.getCurrentTimeline();
            if (currentMediaItemIndex >= currentTimeline.getWindowCount()) {
                currentTimeline = androidx.media3.common.Timeline.EMPTY;
            }
            return generateEventTime(currentTimeline, currentMediaItemIndex, null);
        }
        return generateEventTime(mediaPeriodIdTimeline, mediaPeriodIdTimeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, mediaPeriodId);
    }

    private androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getPlayingMediaPeriod());
    }

    private androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getReadingMediaPeriod());
    }

    private androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateLoadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getLoadingMediaPeriod());
    }

    private androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateMediaPeriodEventTime(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        androidx.media3.common.util.Assertions.checkNotNull(this.player);
        if (mediaPeriodId != null) {
            if (this.mediaPeriodQueueTracker.getMediaPeriodIdTimeline(mediaPeriodId) != null) {
                return generateEventTime(mediaPeriodId);
            }
            return generateEventTime(androidx.media3.common.Timeline.EMPTY, i, mediaPeriodId);
        }
        androidx.media3.common.Timeline currentTimeline = this.player.getCurrentTimeline();
        if (i >= currentTimeline.getWindowCount()) {
            currentTimeline = androidx.media3.common.Timeline.EMPTY;
        }
        return generateEventTime(currentTimeline, i, null);
    }

    private androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime getEventTimeForErrorEvent(androidx.media3.common.PlaybackException playbackException) {
        if (playbackException instanceof androidx.media3.exoplayer.ExoPlaybackException) {
            androidx.media3.exoplayer.ExoPlaybackException exoPlaybackException = (androidx.media3.exoplayer.ExoPlaybackException) playbackException;
            if (exoPlaybackException.mediaPeriodId != null) {
                return generateEventTime(exoPlaybackException.mediaPeriodId);
            }
        }
        return generateCurrentPlayerMediaPeriodEventTime();
    }

    private static final class MediaPeriodQueueTracker {
        private androidx.media3.exoplayer.source.MediaSource.MediaPeriodId currentPlayerMediaPeriod;
        private com.google.common.collect.ImmutableList<androidx.media3.exoplayer.source.MediaSource.MediaPeriodId> mediaPeriodQueue = com.google.common.collect.ImmutableList.of();
        private com.google.common.collect.ImmutableMap<androidx.media3.exoplayer.source.MediaSource.MediaPeriodId, androidx.media3.common.Timeline> mediaPeriodTimelines = com.google.common.collect.ImmutableMap.of();
        private final androidx.media3.common.Timeline.Period period;
        private androidx.media3.exoplayer.source.MediaSource.MediaPeriodId playingMediaPeriod;
        private androidx.media3.exoplayer.source.MediaSource.MediaPeriodId readingMediaPeriod;

        public MediaPeriodQueueTracker(androidx.media3.common.Timeline.Period period) {
            this.period = period;
        }

        public androidx.media3.exoplayer.source.MediaSource.MediaPeriodId getCurrentPlayerMediaPeriod() {
            return this.currentPlayerMediaPeriod;
        }

        public androidx.media3.exoplayer.source.MediaSource.MediaPeriodId getPlayingMediaPeriod() {
            return this.playingMediaPeriod;
        }

        public androidx.media3.exoplayer.source.MediaSource.MediaPeriodId getReadingMediaPeriod() {
            return this.readingMediaPeriod;
        }

        public androidx.media3.exoplayer.source.MediaSource.MediaPeriodId getLoadingMediaPeriod() {
            if (this.mediaPeriodQueue.isEmpty()) {
                return null;
            }
            return (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) com.google.common.collect.Iterables.getLast(this.mediaPeriodQueue);
        }

        public androidx.media3.common.Timeline getMediaPeriodIdTimeline(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            return this.mediaPeriodTimelines.get(mediaPeriodId);
        }

        public void onPositionDiscontinuity(androidx.media3.common.Player player) {
            this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
        }

        public void onTimelineChanged(androidx.media3.common.Player player) {
            this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
            updateMediaPeriodTimelines(player.getCurrentTimeline());
        }

        public void onQueueUpdated(java.util.List<androidx.media3.exoplayer.source.MediaSource.MediaPeriodId> list, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.common.Player player) {
            this.mediaPeriodQueue = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
            if (!list.isEmpty()) {
                this.playingMediaPeriod = list.get(0);
                this.readingMediaPeriod = (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) androidx.media3.common.util.Assertions.checkNotNull(mediaPeriodId);
            }
            if (this.currentPlayerMediaPeriod == null) {
                this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
            }
            updateMediaPeriodTimelines(player.getCurrentTimeline());
        }

        private void updateMediaPeriodTimelines(androidx.media3.common.Timeline timeline) {
            com.google.common.collect.ImmutableMap.Builder<androidx.media3.exoplayer.source.MediaSource.MediaPeriodId, androidx.media3.common.Timeline> builder = com.google.common.collect.ImmutableMap.builder();
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

        private void addTimelineForMediaPeriodId(com.google.common.collect.ImmutableMap.Builder<androidx.media3.exoplayer.source.MediaSource.MediaPeriodId, androidx.media3.common.Timeline> builder, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.common.Timeline timeline) {
            if (mediaPeriodId == null) {
                return;
            }
            if (timeline.getIndexOfPeriod(mediaPeriodId.periodUid) != -1) {
                builder.put(mediaPeriodId, timeline);
                return;
            }
            androidx.media3.common.Timeline timeline2 = this.mediaPeriodTimelines.get(mediaPeriodId);
            if (timeline2 != null) {
                builder.put(mediaPeriodId, timeline2);
            }
        }

        private static androidx.media3.exoplayer.source.MediaSource.MediaPeriodId findCurrentPlayerMediaPeriodInQueue(androidx.media3.common.Player player, com.google.common.collect.ImmutableList<androidx.media3.exoplayer.source.MediaSource.MediaPeriodId> immutableList, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.common.Timeline.Period period) {
            androidx.media3.common.Timeline currentTimeline = player.getCurrentTimeline();
            int currentPeriodIndex = player.getCurrentPeriodIndex();
            java.lang.Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(currentPeriodIndex);
            int adGroupIndexAfterPositionUs = (player.isPlayingAd() || currentTimeline.isEmpty()) ? -1 : currentTimeline.getPeriod(currentPeriodIndex, period).getAdGroupIndexAfterPositionUs(androidx.media3.common.util.Util.msToUs(player.getCurrentPosition()) - period.getPositionInWindowUs());
            for (int i = 0; i < immutableList.size(); i++) {
                androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId2 = immutableList.get(i);
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

        private static boolean isMatchingMediaPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, java.lang.Object obj, boolean z, int i, int i2, int i3) {
            if (mediaPeriodId.periodUid.equals(obj)) {
                return (z && mediaPeriodId.adGroupIndex == i && mediaPeriodId.adIndexInAdGroup == i2) || (!z && mediaPeriodId.adGroupIndex == -1 && mediaPeriodId.nextAdGroupIndex == i3);
            }
            return false;
        }
    }
}
