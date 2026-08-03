package androidx.media3.exoplayer;

/* loaded from: classes2.dex */
final class ExoPlayerImplInternal implements android.os.Handler.Callback, androidx.media3.exoplayer.source.MediaPeriod.Callback, androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener, androidx.media3.exoplayer.MediaSourceList.MediaSourceListInfoRefreshListener, androidx.media3.exoplayer.DefaultMediaClock.PlaybackParametersListener, androidx.media3.exoplayer.PlayerMessage.Sender {
    private static final long BUFFERING_MAXIMUM_INTERVAL_MS = androidx.media3.common.util.Util.usToMs(10000);
    private static final int MSG_ADD_MEDIA_SOURCES = 18;
    private static final int MSG_ATTEMPT_RENDERER_ERROR_RECOVERY = 25;
    private static final int MSG_DO_SOME_WORK = 2;
    private static final int MSG_MOVE_MEDIA_SOURCES = 19;
    private static final int MSG_PERIOD_PREPARED = 8;
    private static final int MSG_PLAYBACK_PARAMETERS_CHANGED_INTERNAL = 16;
    private static final int MSG_PLAYLIST_UPDATE_REQUESTED = 22;
    private static final int MSG_PREPARE = 29;
    private static final int MSG_RELEASE = 7;
    private static final int MSG_REMOVE_MEDIA_SOURCES = 20;
    private static final int MSG_RENDERER_CAPABILITIES_CHANGED = 26;
    private static final int MSG_SEEK_TO = 3;
    private static final int MSG_SEND_MESSAGE = 14;
    private static final int MSG_SEND_MESSAGE_TO_TARGET_THREAD = 15;
    private static final int MSG_SET_FOREGROUND_MODE = 13;
    private static final int MSG_SET_MEDIA_SOURCES = 17;
    private static final int MSG_SET_PAUSE_AT_END_OF_WINDOW = 23;
    private static final int MSG_SET_PLAYBACK_PARAMETERS = 4;
    private static final int MSG_SET_PLAY_WHEN_READY = 1;
    private static final int MSG_SET_PRELOAD_CONFIGURATION = 28;
    private static final int MSG_SET_REPEAT_MODE = 11;
    private static final int MSG_SET_SEEK_PARAMETERS = 5;
    private static final int MSG_SET_SHUFFLE_ENABLED = 12;
    private static final int MSG_SET_SHUFFLE_ORDER = 21;
    private static final int MSG_SOURCE_CONTINUE_LOADING_REQUESTED = 9;
    private static final int MSG_STOP = 6;
    private static final int MSG_TRACK_SELECTION_INVALIDATED = 10;
    private static final int MSG_UPDATE_MEDIA_SOURCES_WITH_MEDIA_ITEMS = 27;
    private static final long PLAYBACK_BUFFER_EMPTY_THRESHOLD_US = 500000;
    private static final long PLAYBACK_STUCK_AFTER_MS = 4000;
    private static final long READY_MAXIMUM_INTERVAL_MS = 1000;
    private static final java.lang.String TAG = "ExoPlayerImplInternal";
    private final long backBufferDurationUs;
    private final androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter;
    private final androidx.media3.common.util.Clock clock;
    private boolean deliverPendingMessageAtStartPositionRequired;
    private final boolean dynamicSchedulingEnabled;
    private final androidx.media3.exoplayer.trackselection.TrackSelectorResult emptyTrackSelectorResult;
    private int enabledRendererCount;
    private boolean foregroundMode;
    private final androidx.media3.common.util.HandlerWrapper handler;
    private final android.os.HandlerThread internalPlaybackThread;
    private boolean isRebuffering;
    private final androidx.media3.exoplayer.LivePlaybackSpeedControl livePlaybackSpeedControl;
    private final androidx.media3.exoplayer.LoadControl loadControl;
    private final androidx.media3.exoplayer.DefaultMediaClock mediaClock;
    private final androidx.media3.exoplayer.MediaSourceList mediaSourceList;
    private int nextPendingMessageIndexHint;
    private boolean offloadSchedulingEnabled;
    private boolean pauseAtEndOfWindow;
    private androidx.media3.exoplayer.ExoPlayerImplInternal.SeekPosition pendingInitialSeekPosition;
    private final java.util.ArrayList<androidx.media3.exoplayer.ExoPlayerImplInternal.PendingMessageInfo> pendingMessages;
    private boolean pendingPauseAtEndOfPeriod;
    private androidx.media3.exoplayer.ExoPlaybackException pendingRecoverableRendererError;
    private final androidx.media3.common.Timeline.Period period;
    private androidx.media3.exoplayer.PlaybackInfo playbackInfo;
    private androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate;
    private final androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdateListener playbackInfoUpdateListener;
    private final android.os.Looper playbackLooper;
    private final androidx.media3.exoplayer.analytics.PlayerId playerId;
    private androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration preloadConfiguration;
    private final androidx.media3.exoplayer.MediaPeriodQueue queue;
    private final long releaseTimeoutMs;
    private boolean released;
    private final androidx.media3.exoplayer.RendererCapabilities[] rendererCapabilities;
    private long rendererPositionElapsedRealtimeUs;
    private long rendererPositionUs;
    private final androidx.media3.exoplayer.Renderer[] renderers;
    private final java.util.Set<androidx.media3.exoplayer.Renderer> renderersToReset;
    private int repeatMode;
    private boolean requestForRendererSleep;
    private final boolean retainBackBufferFromKeyframe;
    private androidx.media3.exoplayer.SeekParameters seekParameters;
    private long setForegroundModeTimeoutMs;
    private boolean shouldContinueLoading;
    private boolean shuffleModeEnabled;
    private final androidx.media3.exoplayer.trackselection.TrackSelector trackSelector;
    private final androidx.media3.common.Timeline.Window window;
    private long playbackMaybeBecameStuckAtMs = -9223372036854775807L;
    private long lastRebufferRealtimeMs = -9223372036854775807L;
    private androidx.media3.common.Timeline lastPreloadPoolInvalidationTimeline = androidx.media3.common.Timeline.EMPTY;

    public interface PlaybackInfoUpdateListener {
        void onPlaybackInfoUpdate(androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate);
    }

    public static final class PlaybackInfoUpdate {
        public int discontinuityReason;
        private boolean hasPendingChange;
        public int operationAcks;
        public androidx.media3.exoplayer.PlaybackInfo playbackInfo;
        public boolean positionDiscontinuity;

        public PlaybackInfoUpdate(androidx.media3.exoplayer.PlaybackInfo playbackInfo) {
            this.playbackInfo = playbackInfo;
        }

        public void incrementPendingOperationAcks(int i) {
            this.hasPendingChange |= i > 0;
            this.operationAcks += i;
        }

        public void setPlaybackInfo(androidx.media3.exoplayer.PlaybackInfo playbackInfo) {
            this.hasPendingChange |= this.playbackInfo != playbackInfo;
            this.playbackInfo = playbackInfo;
        }

        public void setPositionDiscontinuity(int i) {
            if (this.positionDiscontinuity && this.discontinuityReason != 5) {
                androidx.media3.common.util.Assertions.checkArgument(i == 5);
                return;
            }
            this.hasPendingChange = true;
            this.positionDiscontinuity = true;
            this.discontinuityReason = i;
        }
    }

    public ExoPlayerImplInternal(androidx.media3.exoplayer.Renderer[] rendererArr, androidx.media3.exoplayer.trackselection.TrackSelector trackSelector, androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult, androidx.media3.exoplayer.LoadControl loadControl, androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter, int i, boolean z, androidx.media3.exoplayer.analytics.AnalyticsCollector analyticsCollector, androidx.media3.exoplayer.SeekParameters seekParameters, androidx.media3.exoplayer.LivePlaybackSpeedControl livePlaybackSpeedControl, long j, boolean z2, boolean z3, android.os.Looper looper, androidx.media3.common.util.Clock clock, androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdateListener playbackInfoUpdateListener, androidx.media3.exoplayer.analytics.PlayerId playerId, android.os.Looper looper2, androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.playbackInfoUpdateListener = playbackInfoUpdateListener;
        this.renderers = rendererArr;
        this.trackSelector = trackSelector;
        this.emptyTrackSelectorResult = trackSelectorResult;
        this.loadControl = loadControl;
        this.bandwidthMeter = bandwidthMeter;
        this.repeatMode = i;
        this.shuffleModeEnabled = z;
        this.seekParameters = seekParameters;
        this.livePlaybackSpeedControl = livePlaybackSpeedControl;
        this.releaseTimeoutMs = j;
        this.setForegroundModeTimeoutMs = j;
        this.pauseAtEndOfWindow = z2;
        this.dynamicSchedulingEnabled = z3;
        this.clock = clock;
        this.playerId = playerId;
        this.preloadConfiguration = preloadConfiguration;
        this.backBufferDurationUs = loadControl.getBackBufferDurationUs(playerId);
        this.retainBackBufferFromKeyframe = loadControl.retainBackBufferFromKeyframe(playerId);
        androidx.media3.exoplayer.PlaybackInfo createDummy = androidx.media3.exoplayer.PlaybackInfo.createDummy(trackSelectorResult);
        this.playbackInfo = createDummy;
        this.playbackInfoUpdate = new androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdate(createDummy);
        this.rendererCapabilities = new androidx.media3.exoplayer.RendererCapabilities[rendererArr.length];
        androidx.media3.exoplayer.RendererCapabilities.Listener rendererCapabilitiesListener = trackSelector.getRendererCapabilitiesListener();
        for (int i2 = 0; i2 < rendererArr.length; i2++) {
            rendererArr[i2].init(i2, playerId, clock);
            this.rendererCapabilities[i2] = rendererArr[i2].getCapabilities();
            if (rendererCapabilitiesListener != null) {
                this.rendererCapabilities[i2].setListener(rendererCapabilitiesListener);
            }
        }
        this.mediaClock = new androidx.media3.exoplayer.DefaultMediaClock(this, clock);
        this.pendingMessages = new java.util.ArrayList<>();
        this.renderersToReset = com.google.common.collect.Sets.newIdentityHashSet();
        this.window = new androidx.media3.common.Timeline.Window();
        this.period = new androidx.media3.common.Timeline.Period();
        trackSelector.init(this, bandwidthMeter);
        this.deliverPendingMessageAtStartPositionRequired = true;
        androidx.media3.common.util.HandlerWrapper createHandler = clock.createHandler(looper, null);
        this.queue = new androidx.media3.exoplayer.MediaPeriodQueue(analyticsCollector, createHandler, new androidx.media3.exoplayer.MediaPeriodHolder.Factory() { // from class: androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2
            @Override // androidx.media3.exoplayer.MediaPeriodHolder.Factory
            public final androidx.media3.exoplayer.MediaPeriodHolder create(androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo, long j2) {
                androidx.media3.exoplayer.MediaPeriodHolder createMediaPeriodHolder;
                createMediaPeriodHolder = androidx.media3.exoplayer.ExoPlayerImplInternal.this.createMediaPeriodHolder(mediaPeriodInfo, j2);
                return createMediaPeriodHolder;
            }
        }, preloadConfiguration);
        this.mediaSourceList = new androidx.media3.exoplayer.MediaSourceList(this, analyticsCollector, createHandler, playerId);
        if (looper2 != null) {
            this.internalPlaybackThread = null;
            this.playbackLooper = looper2;
        } else {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExoPlayer:Playback", -16);
            this.internalPlaybackThread = handlerThread;
            handlerThread.start();
            this.playbackLooper = handlerThread.getLooper();
        }
        this.handler = clock.createHandler(this.playbackLooper, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public androidx.media3.exoplayer.MediaPeriodHolder createMediaPeriodHolder(androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo, long j) {
        return new androidx.media3.exoplayer.MediaPeriodHolder(this.rendererCapabilities, j, this.trackSelector, this.loadControl.getAllocator(), this.mediaSourceList, mediaPeriodInfo, this.emptyTrackSelectorResult);
    }

    public void experimentalSetForegroundModeTimeoutMs(long j) {
        this.setForegroundModeTimeoutMs = j;
    }

    public void prepare() {
        this.handler.obtainMessage(29).sendToTarget();
    }

    public void setPlayWhenReady(boolean z, int i, int i2) {
        this.handler.obtainMessage(1, z ? 1 : 0, i | (i2 << 4)).sendToTarget();
    }

    public void setPauseAtEndOfWindow(boolean z) {
        this.handler.obtainMessage(23, z ? 1 : 0, 0).sendToTarget();
    }

    public void setRepeatMode(int i) {
        this.handler.obtainMessage(11, i, 0).sendToTarget();
    }

    public void setShuffleModeEnabled(boolean z) {
        this.handler.obtainMessage(12, z ? 1 : 0, 0).sendToTarget();
    }

    public void setPreloadConfiguration(androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.handler.obtainMessage(28, preloadConfiguration).sendToTarget();
    }

    public void seekTo(androidx.media3.common.Timeline timeline, int i, long j) {
        this.handler.obtainMessage(3, new androidx.media3.exoplayer.ExoPlayerImplInternal.SeekPosition(timeline, i, j)).sendToTarget();
    }

    public void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        this.handler.obtainMessage(4, playbackParameters).sendToTarget();
    }

    public void setSeekParameters(androidx.media3.exoplayer.SeekParameters seekParameters) {
        this.handler.obtainMessage(5, seekParameters).sendToTarget();
    }

    public void stop() {
        this.handler.obtainMessage(6).sendToTarget();
    }

    public void setMediaSources(java.util.List<androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder> list, int i, long j, androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(17, new androidx.media3.exoplayer.ExoPlayerImplInternal.MediaSourceListUpdateMessage(list, shuffleOrder, i, j)).sendToTarget();
    }

    public void addMediaSources(int i, java.util.List<androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder> list, androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(18, i, 0, new androidx.media3.exoplayer.ExoPlayerImplInternal.MediaSourceListUpdateMessage(list, shuffleOrder, -1, -9223372036854775807L)).sendToTarget();
    }

    public void removeMediaSources(int i, int i2, androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(20, i, i2, shuffleOrder).sendToTarget();
    }

    public void moveMediaSources(int i, int i2, int i3, androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(19, new androidx.media3.exoplayer.ExoPlayerImplInternal.MoveMediaItemsMessage(i, i2, i3, shuffleOrder)).sendToTarget();
    }

    public void setShuffleOrder(androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(21, shuffleOrder).sendToTarget();
    }

    public void updateMediaSourcesWithMediaItems(int i, int i2, java.util.List<androidx.media3.common.MediaItem> list) {
        this.handler.obtainMessage(27, i, i2, list).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.PlayerMessage.Sender
    public synchronized void sendMessage(androidx.media3.exoplayer.PlayerMessage playerMessage) {
        if (!this.released && this.playbackLooper.getThread().isAlive()) {
            this.handler.obtainMessage(14, playerMessage).sendToTarget();
            return;
        }
        androidx.media3.common.util.Log.w(TAG, "Ignoring messages sent after release.");
        playerMessage.markAsProcessed(false);
    }

    public synchronized boolean setForegroundMode(boolean z) {
        if (!this.released && this.playbackLooper.getThread().isAlive()) {
            if (z) {
                this.handler.obtainMessage(13, 1, 0).sendToTarget();
                return true;
            }
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean();
            this.handler.obtainMessage(13, 0, 0, atomicBoolean).sendToTarget();
            waitUninterruptibly(new androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda3(atomicBoolean), this.setForegroundModeTimeoutMs);
            return atomicBoolean.get();
        }
        return true;
    }

    public synchronized boolean release() {
        if (!this.released && this.playbackLooper.getThread().isAlive()) {
            this.handler.sendEmptyMessage(7);
            waitUninterruptibly(new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return androidx.media3.exoplayer.ExoPlayerImplInternal.this.m4808lambda$release$0$androidxmedia3exoplayerExoPlayerImplInternal();
                }
            }, this.releaseTimeoutMs);
            return this.released;
        }
        return true;
    }

    /* renamed from: lambda$release$0$androidx-media3-exoplayer-ExoPlayerImplInternal, reason: not valid java name */
    /* synthetic */ java.lang.Boolean m4808lambda$release$0$androidxmedia3exoplayerExoPlayerImplInternal() {
        return java.lang.Boolean.valueOf(this.released);
    }

    public android.os.Looper getPlaybackLooper() {
        return this.playbackLooper;
    }

    @Override // androidx.media3.exoplayer.MediaSourceList.MediaSourceListInfoRefreshListener
    public void onPlaylistUpdateRequested() {
        this.handler.removeMessages(2);
        this.handler.sendEmptyMessage(22);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public void onPrepared(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        this.handler.obtainMessage(8, mediaPeriod).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        this.handler.obtainMessage(9, mediaPeriod).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public void onTrackSelectionsInvalidated() {
        this.handler.sendEmptyMessage(10);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public void onRendererCapabilitiesChanged(androidx.media3.exoplayer.Renderer renderer) {
        this.handler.sendEmptyMessage(26);
    }

    @Override // androidx.media3.exoplayer.DefaultMediaClock.PlaybackParametersListener
    public void onPlaybackParametersChanged(androidx.media3.common.PlaybackParameters playbackParameters) {
        this.handler.obtainMessage(16, playbackParameters).sendToTarget();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        androidx.media3.exoplayer.MediaPeriodHolder readingPeriod;
        try {
            switch (message.what) {
                case 1:
                    setPlayWhenReadyInternal(message.arg1 != 0, message.arg2 >> 4, true, message.arg2 & 15);
                    break;
                case 2:
                    doSomeWork();
                    break;
                case 3:
                    seekToInternal((androidx.media3.exoplayer.ExoPlayerImplInternal.SeekPosition) message.obj);
                    break;
                case 4:
                    setPlaybackParametersInternal((androidx.media3.common.PlaybackParameters) message.obj);
                    break;
                case 5:
                    setSeekParametersInternal((androidx.media3.exoplayer.SeekParameters) message.obj);
                    break;
                case 6:
                    stopInternal(false, true);
                    break;
                case 7:
                    releaseInternal();
                    return true;
                case 8:
                    handlePeriodPrepared((androidx.media3.exoplayer.source.MediaPeriod) message.obj);
                    break;
                case 9:
                    handleContinueLoadingRequested((androidx.media3.exoplayer.source.MediaPeriod) message.obj);
                    break;
                case 10:
                    reselectTracksInternal();
                    break;
                case 11:
                    setRepeatModeInternal(message.arg1);
                    break;
                case 12:
                    setShuffleModeEnabledInternal(message.arg1 != 0);
                    break;
                case 13:
                    setForegroundModeInternal(message.arg1 != 0, (java.util.concurrent.atomic.AtomicBoolean) message.obj);
                    break;
                case 14:
                    sendMessageInternal((androidx.media3.exoplayer.PlayerMessage) message.obj);
                    break;
                case 15:
                    sendMessageToTargetThread((androidx.media3.exoplayer.PlayerMessage) message.obj);
                    break;
                case 16:
                    handlePlaybackParameters((androidx.media3.common.PlaybackParameters) message.obj, false);
                    break;
                case 17:
                    setMediaItemsInternal((androidx.media3.exoplayer.ExoPlayerImplInternal.MediaSourceListUpdateMessage) message.obj);
                    break;
                case 18:
                    addMediaItemsInternal((androidx.media3.exoplayer.ExoPlayerImplInternal.MediaSourceListUpdateMessage) message.obj, message.arg1);
                    break;
                case 19:
                    moveMediaItemsInternal((androidx.media3.exoplayer.ExoPlayerImplInternal.MoveMediaItemsMessage) message.obj);
                    break;
                case 20:
                    removeMediaItemsInternal(message.arg1, message.arg2, (androidx.media3.exoplayer.source.ShuffleOrder) message.obj);
                    break;
                case 21:
                    setShuffleOrderInternal((androidx.media3.exoplayer.source.ShuffleOrder) message.obj);
                    break;
                case 22:
                    mediaSourceListUpdateRequestedInternal();
                    break;
                case 23:
                    setPauseAtEndOfWindowInternal(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    attemptRendererErrorRecovery();
                    break;
                case 26:
                    reselectTracksInternalAndSeek();
                    break;
                case 27:
                    updateMediaSourcesWithMediaItemsInternal(message.arg1, message.arg2, (java.util.List) message.obj);
                    break;
                case 28:
                    setPreloadConfigurationInternal((androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration) message.obj);
                    break;
                case 29:
                    prepareInternal();
                    break;
            }
        } catch (androidx.media3.common.ParserException e) {
            if (e.dataType == 1) {
                r4 = e.contentIsMalformed ? 3001 : 3003;
            } else if (e.dataType == 4) {
                r4 = e.contentIsMalformed ? 3002 : 3004;
            }
            handleIoException(e, r4);
        } catch (androidx.media3.datasource.DataSourceException e2) {
            handleIoException(e2, e2.reason);
        } catch (androidx.media3.exoplayer.ExoPlaybackException e3) {
            androidx.media3.exoplayer.ExoPlaybackException exoPlaybackException = e3;
            if (exoPlaybackException.type == 1 && (readingPeriod = this.queue.getReadingPeriod()) != null) {
                exoPlaybackException = exoPlaybackException.copyWithMediaPeriodId(readingPeriod.info.id);
            }
            if (exoPlaybackException.isRecoverable && (this.pendingRecoverableRendererError == null || exoPlaybackException.errorCode == 5004 || exoPlaybackException.errorCode == 5003)) {
                androidx.media3.common.util.Log.w(TAG, "Recoverable renderer error", exoPlaybackException);
                androidx.media3.exoplayer.ExoPlaybackException exoPlaybackException2 = this.pendingRecoverableRendererError;
                if (exoPlaybackException2 != null) {
                    exoPlaybackException2.addSuppressed(exoPlaybackException);
                    exoPlaybackException = this.pendingRecoverableRendererError;
                } else {
                    this.pendingRecoverableRendererError = exoPlaybackException;
                }
                androidx.media3.common.util.HandlerWrapper handlerWrapper = this.handler;
                handlerWrapper.sendMessageAtFrontOfQueue(handlerWrapper.obtainMessage(25, exoPlaybackException));
            } else {
                androidx.media3.exoplayer.ExoPlaybackException exoPlaybackException3 = this.pendingRecoverableRendererError;
                if (exoPlaybackException3 != null) {
                    exoPlaybackException3.addSuppressed(exoPlaybackException);
                    exoPlaybackException = this.pendingRecoverableRendererError;
                }
                androidx.media3.exoplayer.ExoPlaybackException exoPlaybackException4 = exoPlaybackException;
                androidx.media3.common.util.Log.e(TAG, "Playback error", exoPlaybackException4);
                if (exoPlaybackException4.type == 1 && this.queue.getPlayingPeriod() != this.queue.getReadingPeriod()) {
                    while (this.queue.getPlayingPeriod() != this.queue.getReadingPeriod()) {
                        this.queue.advancePlayingPeriod();
                    }
                    androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder = (androidx.media3.exoplayer.MediaPeriodHolder) androidx.media3.common.util.Assertions.checkNotNull(this.queue.getPlayingPeriod());
                    maybeNotifyPlaybackInfoChanged();
                    this.playbackInfo = handlePositionDiscontinuity(mediaPeriodHolder.info.id, mediaPeriodHolder.info.startPositionUs, mediaPeriodHolder.info.requestedContentPositionUs, mediaPeriodHolder.info.startPositionUs, true, 0);
                }
                stopInternal(true, false);
                this.playbackInfo = this.playbackInfo.copyWithPlaybackError(exoPlaybackException4);
            }
        } catch (androidx.media3.exoplayer.drm.DrmSession.DrmSessionException e4) {
            handleIoException(e4, e4.errorCode);
        } catch (androidx.media3.exoplayer.source.BehindLiveWindowException e5) {
            handleIoException(e5, 1002);
        } catch (java.io.IOException e6) {
            handleIoException(e6, 2000);
        } catch (java.lang.RuntimeException e7) {
            androidx.media3.exoplayer.ExoPlaybackException createForUnexpected = androidx.media3.exoplayer.ExoPlaybackException.createForUnexpected(e7, ((e7 instanceof java.lang.IllegalStateException) || (e7 instanceof java.lang.IllegalArgumentException)) ? 1004 : 1000);
            androidx.media3.common.util.Log.e(TAG, "Playback error", createForUnexpected);
            stopInternal(true, false);
            this.playbackInfo = this.playbackInfo.copyWithPlaybackError(createForUnexpected);
        }
        maybeNotifyPlaybackInfoChanged();
        return true;
    }

    private void handleIoException(java.io.IOException iOException, int i) {
        androidx.media3.exoplayer.ExoPlaybackException createForSource = androidx.media3.exoplayer.ExoPlaybackException.createForSource(iOException, i);
        androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod != null) {
            createForSource = createForSource.copyWithMediaPeriodId(playingPeriod.info.id);
        }
        androidx.media3.common.util.Log.e(TAG, "Playback error", createForSource);
        stopInternal(false, false);
        this.playbackInfo = this.playbackInfo.copyWithPlaybackError(createForSource);
    }

    private synchronized void waitUninterruptibly(com.google.common.base.Supplier<java.lang.Boolean> supplier, long j) {
        long elapsedRealtime = this.clock.elapsedRealtime() + j;
        boolean z = false;
        while (!supplier.get().booleanValue() && j > 0) {
            try {
                this.clock.onThreadBlocked();
                wait(j);
            } catch (java.lang.InterruptedException unused) {
                z = true;
            }
            j = elapsedRealtime - this.clock.elapsedRealtime();
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    private void setState(int i) {
        if (this.playbackInfo.playbackState != i) {
            if (i != 2) {
                this.playbackMaybeBecameStuckAtMs = -9223372036854775807L;
            }
            this.playbackInfo = this.playbackInfo.copyWithPlaybackState(i);
        }
    }

    private void maybeNotifyPlaybackInfoChanged() {
        this.playbackInfoUpdate.setPlaybackInfo(this.playbackInfo);
        if (this.playbackInfoUpdate.hasPendingChange) {
            this.playbackInfoUpdateListener.onPlaybackInfoUpdate(this.playbackInfoUpdate);
            this.playbackInfoUpdate = new androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdate(this.playbackInfo);
        }
    }

    private void prepareInternal() {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        resetInternal(false, false, false, true);
        this.loadControl.onPrepared(this.playerId);
        setState(this.playbackInfo.timeline.isEmpty() ? 4 : 2);
        this.mediaSourceList.prepare(this.bandwidthMeter.getTransferListener());
        this.handler.sendEmptyMessage(2);
    }

    private void setMediaItemsInternal(androidx.media3.exoplayer.ExoPlayerImplInternal.MediaSourceListUpdateMessage mediaSourceListUpdateMessage) throws androidx.media3.exoplayer.ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        if (mediaSourceListUpdateMessage.windowIndex != -1) {
            this.pendingInitialSeekPosition = new androidx.media3.exoplayer.ExoPlayerImplInternal.SeekPosition(new androidx.media3.exoplayer.PlaylistTimeline(mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), mediaSourceListUpdateMessage.windowIndex, mediaSourceListUpdateMessage.positionUs);
        }
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.setMediaSources(mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), false);
    }

    private void addMediaItemsInternal(androidx.media3.exoplayer.ExoPlayerImplInternal.MediaSourceListUpdateMessage mediaSourceListUpdateMessage, int i) throws androidx.media3.exoplayer.ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        androidx.media3.exoplayer.MediaSourceList mediaSourceList = this.mediaSourceList;
        if (i == -1) {
            i = mediaSourceList.getSize();
        }
        handleMediaSourceListInfoRefreshed(mediaSourceList.addMediaSources(i, mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), false);
    }

    private void moveMediaItemsInternal(androidx.media3.exoplayer.ExoPlayerImplInternal.MoveMediaItemsMessage moveMediaItemsMessage) throws androidx.media3.exoplayer.ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.moveMediaSourceRange(moveMediaItemsMessage.fromIndex, moveMediaItemsMessage.toIndex, moveMediaItemsMessage.newFromIndex, moveMediaItemsMessage.shuffleOrder), false);
    }

    private void removeMediaItemsInternal(int i, int i2, androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) throws androidx.media3.exoplayer.ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.removeMediaSourceRange(i, i2, shuffleOrder), false);
    }

    private void mediaSourceListUpdateRequestedInternal() throws androidx.media3.exoplayer.ExoPlaybackException {
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.createTimeline(), true);
    }

    private void setShuffleOrderInternal(androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) throws androidx.media3.exoplayer.ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.setShuffleOrder(shuffleOrder), false);
    }

    private void updateMediaSourcesWithMediaItemsInternal(int i, int i2, java.util.List<androidx.media3.common.MediaItem> list) throws androidx.media3.exoplayer.ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.updateMediaSourcesWithMediaItems(i, i2, list), false);
    }

    private void notifyTrackSelectionPlayWhenReadyChanged(boolean z) {
        for (androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlayWhenReadyChanged(z);
                }
            }
        }
    }

    private void setPlayWhenReadyInternal(boolean z, int i, boolean z2, int i2) throws androidx.media3.exoplayer.ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(z2 ? 1 : 0);
        this.playbackInfo = this.playbackInfo.copyWithPlayWhenReady(z, i2, i);
        updateRebufferingState(false, false);
        notifyTrackSelectionPlayWhenReadyChanged(z);
        if (!shouldPlayWhenReady()) {
            stopRenderers();
            updatePlaybackPositions();
        } else if (this.playbackInfo.playbackState == 3) {
            this.mediaClock.start();
            startRenderers();
            this.handler.sendEmptyMessage(2);
        } else if (this.playbackInfo.playbackState == 2) {
            this.handler.sendEmptyMessage(2);
        }
    }

    private void setPauseAtEndOfWindowInternal(boolean z) throws androidx.media3.exoplayer.ExoPlaybackException {
        this.pauseAtEndOfWindow = z;
        resetPendingPauseAtEndOfPeriod();
        if (!this.pendingPauseAtEndOfPeriod || this.queue.getReadingPeriod() == this.queue.getPlayingPeriod()) {
            return;
        }
        seekToCurrentPosition(true);
        handleLoadingMediaPeriodChanged(false);
    }

    private void setOffloadSchedulingEnabled(boolean z) {
        if (z == this.offloadSchedulingEnabled) {
            return;
        }
        this.offloadSchedulingEnabled = z;
        if (z || !this.playbackInfo.sleepingForOffload) {
            return;
        }
        this.handler.sendEmptyMessage(2);
    }

    private void setRepeatModeInternal(int i) throws androidx.media3.exoplayer.ExoPlaybackException {
        this.repeatMode = i;
        if (!this.queue.updateRepeatMode(this.playbackInfo.timeline, i)) {
            seekToCurrentPosition(true);
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void setShuffleModeEnabledInternal(boolean z) throws androidx.media3.exoplayer.ExoPlaybackException {
        this.shuffleModeEnabled = z;
        if (!this.queue.updateShuffleModeEnabled(this.playbackInfo.timeline, z)) {
            seekToCurrentPosition(true);
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void setPreloadConfigurationInternal(androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.preloadConfiguration = preloadConfiguration;
        this.queue.updatePreloadConfiguration(this.playbackInfo.timeline, preloadConfiguration);
    }

    private void seekToCurrentPosition(boolean z) throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = this.queue.getPlayingPeriod().info.id;
        long seekToPeriodPosition = seekToPeriodPosition(mediaPeriodId, this.playbackInfo.positionUs, true, false);
        if (seekToPeriodPosition != this.playbackInfo.positionUs) {
            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, seekToPeriodPosition, this.playbackInfo.requestedContentPositionUs, this.playbackInfo.discontinuityStartPositionUs, z, 5);
        }
    }

    private void startRenderers() throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null) {
            return;
        }
        androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult = playingPeriod.getTrackSelectorResult();
        for (int i = 0; i < this.renderers.length; i++) {
            if (trackSelectorResult.isRendererEnabled(i) && this.renderers[i].getState() == 1) {
                this.renderers[i].start();
            }
        }
    }

    private void stopRenderers() throws androidx.media3.exoplayer.ExoPlaybackException {
        this.mediaClock.stop();
        for (androidx.media3.exoplayer.Renderer renderer : this.renderers) {
            if (isRendererEnabled(renderer)) {
                ensureStopped(renderer);
            }
        }
    }

    private void attemptRendererErrorRecovery() throws androidx.media3.exoplayer.ExoPlaybackException {
        reselectTracksInternalAndSeek();
    }

    private void updatePlaybackPositions() throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null) {
            return;
        }
        long readDiscontinuity = playingPeriod.prepared ? playingPeriod.mediaPeriod.readDiscontinuity() : -9223372036854775807L;
        if (readDiscontinuity != -9223372036854775807L) {
            if (!playingPeriod.isFullyBuffered()) {
                this.queue.removeAfter(playingPeriod);
                handleLoadingMediaPeriodChanged(false);
                maybeContinueLoading();
            }
            resetRendererPosition(readDiscontinuity);
            if (readDiscontinuity != this.playbackInfo.positionUs) {
                this.playbackInfo = handlePositionDiscontinuity(this.playbackInfo.periodId, readDiscontinuity, this.playbackInfo.requestedContentPositionUs, readDiscontinuity, true, 5);
            }
        } else {
            long syncAndGetPositionUs = this.mediaClock.syncAndGetPositionUs(playingPeriod != this.queue.getReadingPeriod());
            this.rendererPositionUs = syncAndGetPositionUs;
            long periodTime = playingPeriod.toPeriodTime(syncAndGetPositionUs);
            maybeTriggerPendingMessages(this.playbackInfo.positionUs, periodTime);
            if (this.mediaClock.hasSkippedSilenceSinceLastCall()) {
                this.playbackInfo = handlePositionDiscontinuity(this.playbackInfo.periodId, periodTime, this.playbackInfo.requestedContentPositionUs, periodTime, !this.playbackInfoUpdate.positionDiscontinuity, 6);
            } else {
                this.playbackInfo.updatePositionUs(periodTime);
            }
        }
        this.playbackInfo.bufferedPositionUs = this.queue.getLoadingPeriod().getBufferedPositionUs();
        this.playbackInfo.totalBufferedDurationUs = getTotalBufferedDurationUs();
        if (this.playbackInfo.playWhenReady && this.playbackInfo.playbackState == 3 && shouldUseLivePlaybackSpeedControl(this.playbackInfo.timeline, this.playbackInfo.periodId) && this.playbackInfo.playbackParameters.speed == 1.0f) {
            float adjustedPlaybackSpeed = this.livePlaybackSpeedControl.getAdjustedPlaybackSpeed(getCurrentLiveOffsetUs(), getTotalBufferedDurationUs());
            if (this.mediaClock.getPlaybackParameters().speed != adjustedPlaybackSpeed) {
                setMediaClockPlaybackParameters(this.playbackInfo.playbackParameters.withSpeed(adjustedPlaybackSpeed));
                handlePlaybackParameters(this.playbackInfo.playbackParameters, this.mediaClock.getPlaybackParameters().speed, false, false);
            }
        }
    }

    private void setMediaClockPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        this.handler.removeMessages(16);
        this.mediaClock.setPlaybackParameters(playbackParameters);
    }

    private void notifyTrackSelectionRebuffer() {
        for (androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onRebuffer();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void doSomeWork() throws androidx.media3.exoplayer.ExoPlaybackException, java.io.IOException {
        boolean z;
        boolean z2;
        boolean z3;
        long uptimeMillis = this.clock.uptimeMillis();
        this.handler.removeMessages(2);
        updatePeriods();
        if (this.playbackInfo.playbackState == 1 || this.playbackInfo.playbackState == 4) {
            return;
        }
        androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null) {
            scheduleNextWork(uptimeMillis);
            return;
        }
        androidx.media3.common.util.TraceUtil.beginSection("doSomeWork");
        updatePlaybackPositions();
        if (playingPeriod.prepared) {
            this.rendererPositionElapsedRealtimeUs = androidx.media3.common.util.Util.msToUs(this.clock.elapsedRealtime());
            playingPeriod.mediaPeriod.discardBuffer(this.playbackInfo.positionUs - this.backBufferDurationUs, this.retainBackBufferFromKeyframe);
            int i = 0;
            z = true;
            z2 = true;
            while (true) {
                androidx.media3.exoplayer.Renderer[] rendererArr = this.renderers;
                if (i >= rendererArr.length) {
                    break;
                }
                androidx.media3.exoplayer.Renderer renderer = rendererArr[i];
                if (isRendererEnabled(renderer)) {
                    renderer.render(this.rendererPositionUs, this.rendererPositionElapsedRealtimeUs);
                    z = z && renderer.isEnded();
                    boolean z4 = playingPeriod.sampleStreams[i] != renderer.getStream();
                    boolean z5 = z4 || (!z4 && renderer.hasReadStreamToEnd()) || renderer.isReady() || renderer.isEnded();
                    z2 = z2 && z5;
                    if (!z5) {
                        renderer.maybeThrowStreamError();
                    }
                }
                i++;
            }
        } else {
            playingPeriod.mediaPeriod.maybeThrowPrepareError();
            z = true;
            z2 = true;
        }
        long j = playingPeriod.info.durationUs;
        boolean z6 = z && playingPeriod.prepared && (j == -9223372036854775807L || j <= this.playbackInfo.positionUs);
        if (z6 && this.pendingPauseAtEndOfPeriod) {
            this.pendingPauseAtEndOfPeriod = false;
            setPlayWhenReadyInternal(false, this.playbackInfo.playbackSuppressionReason, false, 5);
        }
        if (z6 && playingPeriod.info.isFinal) {
            setState(4);
            stopRenderers();
        } else if (this.playbackInfo.playbackState == 2 && shouldTransitionToReadyState(z2)) {
            setState(3);
            this.pendingRecoverableRendererError = null;
            if (shouldPlayWhenReady()) {
                updateRebufferingState(false, false);
                this.mediaClock.start();
                startRenderers();
            }
        } else if (this.playbackInfo.playbackState == 3 && (this.enabledRendererCount != 0 ? !z2 : !isTimelineReady())) {
            updateRebufferingState(shouldPlayWhenReady(), false);
            setState(2);
            if (this.isRebuffering) {
                notifyTrackSelectionRebuffer();
                this.livePlaybackSpeedControl.notifyRebuffer();
            }
            stopRenderers();
        }
        if (this.playbackInfo.playbackState == 2) {
            int i2 = 0;
            while (true) {
                androidx.media3.exoplayer.Renderer[] rendererArr2 = this.renderers;
                if (i2 >= rendererArr2.length) {
                    break;
                }
                if (isRendererEnabled(rendererArr2[i2]) && this.renderers[i2].getStream() == playingPeriod.sampleStreams[i2]) {
                    this.renderers[i2].maybeThrowStreamError();
                }
                i2++;
            }
            if (!this.playbackInfo.isLoading && this.playbackInfo.totalBufferedDurationUs < PLAYBACK_BUFFER_EMPTY_THRESHOLD_US && isLoadingPossible()) {
                if (this.playbackMaybeBecameStuckAtMs == -9223372036854775807L) {
                    this.playbackMaybeBecameStuckAtMs = this.clock.elapsedRealtime();
                } else if (this.clock.elapsedRealtime() - this.playbackMaybeBecameStuckAtMs >= PLAYBACK_STUCK_AFTER_MS) {
                    throw new java.lang.IllegalStateException("Playback stuck buffering and not loading");
                }
                boolean z7 = !shouldPlayWhenReady() && this.playbackInfo.playbackState == 3;
                z3 = !this.offloadSchedulingEnabled && this.requestForRendererSleep && z7;
                if (this.playbackInfo.sleepingForOffload != z3) {
                    this.playbackInfo = this.playbackInfo.copyWithSleepingForOffload(z3);
                }
                this.requestForRendererSleep = false;
                if (!z3 && this.playbackInfo.playbackState != 4 && (z7 || this.playbackInfo.playbackState == 2 || (this.playbackInfo.playbackState == 3 && this.enabledRendererCount != 0))) {
                    scheduleNextWork(uptimeMillis);
                }
                androidx.media3.common.util.TraceUtil.endSection();
            }
        }
        this.playbackMaybeBecameStuckAtMs = -9223372036854775807L;
        if (shouldPlayWhenReady()) {
        }
        if (this.offloadSchedulingEnabled) {
        }
        if (this.playbackInfo.sleepingForOffload != z3) {
        }
        this.requestForRendererSleep = false;
        if (!z3) {
            scheduleNextWork(uptimeMillis);
        }
        androidx.media3.common.util.TraceUtil.endSection();
    }

    private long getCurrentLiveOffsetUs() {
        return getLiveOffsetUs(this.playbackInfo.timeline, this.playbackInfo.periodId.periodUid, this.playbackInfo.positionUs);
    }

    private long getLiveOffsetUs(androidx.media3.common.Timeline timeline, java.lang.Object obj, long j) {
        timeline.getWindow(timeline.getPeriodByUid(obj, this.period).windowIndex, this.window);
        if (this.window.windowStartTimeMs != -9223372036854775807L && this.window.isLive() && this.window.isDynamic) {
            return androidx.media3.common.util.Util.msToUs(this.window.getCurrentUnixTimeMs() - this.window.windowStartTimeMs) - (j + this.period.getPositionInWindowUs());
        }
        return -9223372036854775807L;
    }

    private boolean shouldUseLivePlaybackSpeedControl(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        if (mediaPeriodId.isAd() || timeline.isEmpty()) {
            return false;
        }
        timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, this.window);
        return this.window.isLive() && this.window.isDynamic && this.window.windowStartTimeMs != -9223372036854775807L;
    }

    private void scheduleNextWork(long j) {
        long j2 = (this.playbackInfo.playbackState != 3 || (!this.dynamicSchedulingEnabled && shouldPlayWhenReady())) ? BUFFERING_MAXIMUM_INTERVAL_MS : 1000L;
        if (this.dynamicSchedulingEnabled && shouldPlayWhenReady()) {
            for (androidx.media3.exoplayer.Renderer renderer : this.renderers) {
                if (isRendererEnabled(renderer)) {
                    j2 = java.lang.Math.min(j2, androidx.media3.common.util.Util.usToMs(renderer.getDurationToProgressUs(this.rendererPositionUs, this.rendererPositionElapsedRealtimeUs)));
                }
            }
        }
        this.handler.sendEmptyMessageAtTime(2, j + j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ab A[Catch: all -> 0x0151, TryCatch #0 {all -> 0x0151, blocks: (B:6:0x00a1, B:8:0x00ab, B:15:0x00b1, B:17:0x00b7, B:18:0x00ba, B:19:0x00c0, B:21:0x00ca, B:23:0x00d2, B:27:0x00da, B:28:0x00e4, B:30:0x00f4, B:32:0x00fb, B:34:0x0102, B:37:0x0116, B:40:0x011f), top: B:5:0x00a1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void seekToInternal(androidx.media3.exoplayer.ExoPlayerImplInternal.SeekPosition seekPosition) throws androidx.media3.exoplayer.ExoPlaybackException {
        long longValue;
        long j;
        boolean z;
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId;
        long adResumePositionUs;
        long j2;
        long j3;
        long j4;
        long j5;
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        android.util.Pair<java.lang.Object, java.lang.Long> resolveSeekPositionUs = resolveSeekPositionUs(this.playbackInfo.timeline, seekPosition, true, this.repeatMode, this.shuffleModeEnabled, this.window, this.period);
        try {
            if (resolveSeekPositionUs == null) {
                android.util.Pair<androidx.media3.exoplayer.source.MediaSource.MediaPeriodId, java.lang.Long> placeholderFirstMediaPeriodPositionUs = getPlaceholderFirstMediaPeriodPositionUs(this.playbackInfo.timeline);
                mediaPeriodId = (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) placeholderFirstMediaPeriodPositionUs.first;
                longValue = ((java.lang.Long) placeholderFirstMediaPeriodPositionUs.second).longValue();
                z = !this.playbackInfo.timeline.isEmpty();
                j = -9223372036854775807L;
            } else {
                java.lang.Object obj = resolveSeekPositionUs.first;
                longValue = ((java.lang.Long) resolveSeekPositionUs.second).longValue();
                long j6 = seekPosition.windowPositionUs == -9223372036854775807L ? -9223372036854775807L : longValue;
                androidx.media3.exoplayer.source.MediaSource.MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange = this.queue.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(this.playbackInfo.timeline, obj, longValue);
                if (resolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd()) {
                    this.playbackInfo.timeline.getPeriodByUid(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.periodUid, this.period);
                    adResumePositionUs = this.period.getFirstAdIndexToPlay(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adGroupIndex) == resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adIndexInAdGroup ? this.period.getAdResumePositionUs() : 0L;
                    j2 = j6;
                    z = true;
                    mediaPeriodId = resolveMediaPeriodIdForAdsAfterPeriodPositionChange;
                    if (!this.playbackInfo.timeline.isEmpty()) {
                        this.pendingInitialSeekPosition = seekPosition;
                    } else if (resolveSeekPositionUs == null) {
                        if (this.playbackInfo.playbackState != 1) {
                            setState(4);
                        }
                        resetInternal(false, true, false, true);
                    } else {
                        if (mediaPeriodId.equals(this.playbackInfo.periodId)) {
                            androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
                            j4 = (playingPeriod == null || !playingPeriod.prepared || adResumePositionUs == 0) ? adResumePositionUs : playingPeriod.mediaPeriod.getAdjustedSeekPositionUs(adResumePositionUs, this.seekParameters);
                            if (androidx.media3.common.util.Util.usToMs(j4) == androidx.media3.common.util.Util.usToMs(this.playbackInfo.positionUs) && (this.playbackInfo.playbackState == 2 || this.playbackInfo.playbackState == 3)) {
                                long j7 = this.playbackInfo.positionUs;
                                this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j7, j2, j7, z, 2);
                                return;
                            }
                        } else {
                            j4 = adResumePositionUs;
                        }
                        long seekToPeriodPosition = seekToPeriodPosition(mediaPeriodId, j4, this.playbackInfo.playbackState == 4);
                        z |= adResumePositionUs != seekToPeriodPosition;
                        try {
                            updatePlaybackSpeedSettingsForNewPeriod(this.playbackInfo.timeline, mediaPeriodId, this.playbackInfo.timeline, this.playbackInfo.periodId, j2, true);
                            j5 = seekToPeriodPosition;
                            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j5, j2, j5, z, 2);
                            return;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            j3 = seekToPeriodPosition;
                            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j3, j2, j3, z, 2);
                            throw th;
                        }
                    }
                    j5 = adResumePositionUs;
                    this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j5, j2, j5, z, 2);
                    return;
                }
                j = j6;
                z = seekPosition.windowPositionUs == -9223372036854775807L;
                mediaPeriodId = resolveMediaPeriodIdForAdsAfterPeriodPositionChange;
            }
            if (!this.playbackInfo.timeline.isEmpty()) {
            }
            j5 = adResumePositionUs;
            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j5, j2, j5, z, 2);
            return;
        } catch (java.lang.Throwable th2) {
            th = th2;
            j3 = adResumePositionUs;
        }
        adResumePositionUs = longValue;
        j2 = j;
    }

    private long seekToPeriodPosition(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z) throws androidx.media3.exoplayer.ExoPlaybackException {
        return seekToPeriodPosition(mediaPeriodId, j, this.queue.getPlayingPeriod() != this.queue.getReadingPeriod(), z);
    }

    private long seekToPeriodPosition(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z, boolean z2) throws androidx.media3.exoplayer.ExoPlaybackException {
        stopRenderers();
        updateRebufferingState(false, true);
        if (z2 || this.playbackInfo.playbackState == 3) {
            setState(2);
        }
        androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder = playingPeriod;
        while (mediaPeriodHolder != null && !mediaPeriodId.equals(mediaPeriodHolder.info.id)) {
            mediaPeriodHolder = mediaPeriodHolder.getNext();
        }
        if (z || playingPeriod != mediaPeriodHolder || (mediaPeriodHolder != null && mediaPeriodHolder.toRendererTime(j) < 0)) {
            for (androidx.media3.exoplayer.Renderer renderer : this.renderers) {
                disableRenderer(renderer);
            }
            if (mediaPeriodHolder != null) {
                while (this.queue.getPlayingPeriod() != mediaPeriodHolder) {
                    this.queue.advancePlayingPeriod();
                }
                this.queue.removeAfter(mediaPeriodHolder);
                mediaPeriodHolder.setRendererOffset(1000000000000L);
                enableRenderers();
            }
        }
        if (mediaPeriodHolder != null) {
            this.queue.removeAfter(mediaPeriodHolder);
            if (!mediaPeriodHolder.prepared) {
                mediaPeriodHolder.info = mediaPeriodHolder.info.copyWithStartPositionUs(j);
            } else if (mediaPeriodHolder.hasEnabledTracks) {
                long seekToUs = mediaPeriodHolder.mediaPeriod.seekToUs(j);
                mediaPeriodHolder.mediaPeriod.discardBuffer(seekToUs - this.backBufferDurationUs, this.retainBackBufferFromKeyframe);
                j = seekToUs;
            }
            resetRendererPosition(j);
            maybeContinueLoading();
        } else {
            this.queue.clear();
            resetRendererPosition(j);
        }
        handleLoadingMediaPeriodChanged(false);
        this.handler.sendEmptyMessage(2);
        return j;
    }

    private void resetRendererPosition(long j) throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long rendererTime = playingPeriod == null ? j + 1000000000000L : playingPeriod.toRendererTime(j);
        this.rendererPositionUs = rendererTime;
        this.mediaClock.resetPosition(rendererTime);
        for (androidx.media3.exoplayer.Renderer renderer : this.renderers) {
            if (isRendererEnabled(renderer)) {
                renderer.resetPosition(this.rendererPositionUs);
            }
        }
        notifyTrackSelectionDiscontinuity();
    }

    private void setPlaybackParametersInternal(androidx.media3.common.PlaybackParameters playbackParameters) throws androidx.media3.exoplayer.ExoPlaybackException {
        setMediaClockPlaybackParameters(playbackParameters);
        handlePlaybackParameters(this.mediaClock.getPlaybackParameters(), true);
    }

    private void setSeekParametersInternal(androidx.media3.exoplayer.SeekParameters seekParameters) {
        this.seekParameters = seekParameters;
    }

    private void setForegroundModeInternal(boolean z, java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
        if (this.foregroundMode != z) {
            this.foregroundMode = z;
            if (!z) {
                for (androidx.media3.exoplayer.Renderer renderer : this.renderers) {
                    if (!isRendererEnabled(renderer) && this.renderersToReset.remove(renderer)) {
                        renderer.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void stopInternal(boolean z, boolean z2) {
        resetInternal(z || !this.foregroundMode, false, true, false);
        this.playbackInfoUpdate.incrementPendingOperationAcks(z2 ? 1 : 0);
        this.loadControl.onStopped(this.playerId);
        setState(1);
    }

    private void releaseInternal() {
        try {
            resetInternal(true, false, true, false);
            releaseRenderers();
            this.loadControl.onReleased(this.playerId);
            setState(1);
            android.os.HandlerThread handlerThread = this.internalPlaybackThread;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            synchronized (this) {
                this.released = true;
                notifyAll();
            }
        } catch (java.lang.Throwable th) {
            android.os.HandlerThread handlerThread2 = this.internalPlaybackThread;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            synchronized (this) {
                this.released = true;
                notifyAll();
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void resetInternal(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        long j2;
        long j3;
        androidx.media3.common.Timeline timeline;
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId;
        androidx.media3.common.Timeline timeline2;
        this.handler.removeMessages(2);
        this.pendingRecoverableRendererError = null;
        boolean z5 = true;
        updateRebufferingState(false, true);
        this.mediaClock.stop();
        this.rendererPositionUs = 1000000000000L;
        for (androidx.media3.exoplayer.Renderer renderer : this.renderers) {
            try {
                disableRenderer(renderer);
            } catch (androidx.media3.exoplayer.ExoPlaybackException | java.lang.RuntimeException e) {
                androidx.media3.common.util.Log.e(TAG, "Disable failed.", e);
            }
        }
        if (z) {
            for (androidx.media3.exoplayer.Renderer renderer2 : this.renderers) {
                if (this.renderersToReset.remove(renderer2)) {
                    try {
                        renderer2.reset();
                    } catch (java.lang.RuntimeException e2) {
                        androidx.media3.common.util.Log.e(TAG, "Reset failed.", e2);
                    }
                }
            }
        }
        this.enabledRendererCount = 0;
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId2 = this.playbackInfo.periodId;
        long j4 = this.playbackInfo.positionUs;
        if (this.playbackInfo.periodId.isAd() || isUsingPlaceholderPeriod(this.playbackInfo, this.period)) {
            j = this.playbackInfo.requestedContentPositionUs;
        } else {
            j = this.playbackInfo.positionUs;
        }
        if (z2) {
            this.pendingInitialSeekPosition = null;
            android.util.Pair<androidx.media3.exoplayer.source.MediaSource.MediaPeriodId, java.lang.Long> placeholderFirstMediaPeriodPositionUs = getPlaceholderFirstMediaPeriodPositionUs(this.playbackInfo.timeline);
            androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId3 = (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) placeholderFirstMediaPeriodPositionUs.first;
            long longValue = ((java.lang.Long) placeholderFirstMediaPeriodPositionUs.second).longValue();
            j3 = -9223372036854775807L;
            if (mediaPeriodId3.equals(this.playbackInfo.periodId)) {
                mediaPeriodId2 = mediaPeriodId3;
                j2 = longValue;
            } else {
                mediaPeriodId2 = mediaPeriodId3;
                j2 = longValue;
                this.queue.clear();
                this.shouldContinueLoading = false;
                timeline = this.playbackInfo.timeline;
                if (z3 && (timeline instanceof androidx.media3.exoplayer.PlaylistTimeline)) {
                    timeline = ((androidx.media3.exoplayer.PlaylistTimeline) this.playbackInfo.timeline).copyWithPlaceholderTimeline(this.mediaSourceList.getShuffleOrder());
                    if (mediaPeriodId2.adGroupIndex != -1) {
                        timeline.getPeriodByUid(mediaPeriodId2.periodUid, this.period);
                        if (timeline.getWindow(this.period.windowIndex, this.window).isLive()) {
                            timeline2 = timeline;
                            mediaPeriodId = new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(mediaPeriodId2.periodUid, mediaPeriodId2.windowSequenceNumber);
                            this.playbackInfo = new androidx.media3.exoplayer.PlaybackInfo(timeline2, mediaPeriodId, j3, j2, this.playbackInfo.playbackState, z4 ? null : this.playbackInfo.playbackError, false, z5 ? androidx.media3.exoplayer.source.TrackGroupArray.EMPTY : this.playbackInfo.trackGroups, z5 ? this.emptyTrackSelectorResult : this.playbackInfo.trackSelectorResult, z5 ? com.google.common.collect.ImmutableList.of() : this.playbackInfo.staticMetadata, mediaPeriodId, this.playbackInfo.playWhenReady, this.playbackInfo.playWhenReadyChangeReason, this.playbackInfo.playbackSuppressionReason, this.playbackInfo.playbackParameters, j2, 0L, j2, 0L, false);
                            if (z3) {
                                this.queue.releasePreloadPool();
                                this.mediaSourceList.release();
                                return;
                            }
                            return;
                        }
                    }
                }
                mediaPeriodId = mediaPeriodId2;
                timeline2 = timeline;
                this.playbackInfo = new androidx.media3.exoplayer.PlaybackInfo(timeline2, mediaPeriodId, j3, j2, this.playbackInfo.playbackState, z4 ? null : this.playbackInfo.playbackError, false, z5 ? androidx.media3.exoplayer.source.TrackGroupArray.EMPTY : this.playbackInfo.trackGroups, z5 ? this.emptyTrackSelectorResult : this.playbackInfo.trackSelectorResult, z5 ? com.google.common.collect.ImmutableList.of() : this.playbackInfo.staticMetadata, mediaPeriodId, this.playbackInfo.playWhenReady, this.playbackInfo.playWhenReadyChangeReason, this.playbackInfo.playbackSuppressionReason, this.playbackInfo.playbackParameters, j2, 0L, j2, 0L, false);
                if (z3) {
                }
            }
        } else {
            j2 = j4;
            j3 = j;
        }
        z5 = false;
        this.queue.clear();
        this.shouldContinueLoading = false;
        timeline = this.playbackInfo.timeline;
        if (z3) {
            timeline = ((androidx.media3.exoplayer.PlaylistTimeline) this.playbackInfo.timeline).copyWithPlaceholderTimeline(this.mediaSourceList.getShuffleOrder());
            if (mediaPeriodId2.adGroupIndex != -1) {
            }
        }
        mediaPeriodId = mediaPeriodId2;
        timeline2 = timeline;
        this.playbackInfo = new androidx.media3.exoplayer.PlaybackInfo(timeline2, mediaPeriodId, j3, j2, this.playbackInfo.playbackState, z4 ? null : this.playbackInfo.playbackError, false, z5 ? androidx.media3.exoplayer.source.TrackGroupArray.EMPTY : this.playbackInfo.trackGroups, z5 ? this.emptyTrackSelectorResult : this.playbackInfo.trackSelectorResult, z5 ? com.google.common.collect.ImmutableList.of() : this.playbackInfo.staticMetadata, mediaPeriodId, this.playbackInfo.playWhenReady, this.playbackInfo.playWhenReadyChangeReason, this.playbackInfo.playbackSuppressionReason, this.playbackInfo.playbackParameters, j2, 0L, j2, 0L, false);
        if (z3) {
        }
    }

    private android.util.Pair<androidx.media3.exoplayer.source.MediaSource.MediaPeriodId, java.lang.Long> getPlaceholderFirstMediaPeriodPositionUs(androidx.media3.common.Timeline timeline) {
        if (timeline.isEmpty()) {
            return android.util.Pair.create(androidx.media3.exoplayer.PlaybackInfo.getDummyPeriodForEmptyTimeline(), 0L);
        }
        android.util.Pair<java.lang.Object, java.lang.Long> periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, timeline.getFirstWindowIndex(this.shuffleModeEnabled), -9223372036854775807L);
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange = this.queue.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(timeline, periodPositionUs.first, 0L);
        long longValue = ((java.lang.Long) periodPositionUs.second).longValue();
        if (resolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd()) {
            timeline.getPeriodByUid(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.periodUid, this.period);
            longValue = resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adIndexInAdGroup == this.period.getFirstAdIndexToPlay(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adGroupIndex) ? this.period.getAdResumePositionUs() : 0L;
        }
        return android.util.Pair.create(resolveMediaPeriodIdForAdsAfterPeriodPositionChange, java.lang.Long.valueOf(longValue));
    }

    private void sendMessageInternal(androidx.media3.exoplayer.PlayerMessage playerMessage) throws androidx.media3.exoplayer.ExoPlaybackException {
        if (playerMessage.getPositionMs() == -9223372036854775807L) {
            sendMessageToTarget(playerMessage);
            return;
        }
        if (this.playbackInfo.timeline.isEmpty()) {
            this.pendingMessages.add(new androidx.media3.exoplayer.ExoPlayerImplInternal.PendingMessageInfo(playerMessage));
            return;
        }
        androidx.media3.exoplayer.ExoPlayerImplInternal.PendingMessageInfo pendingMessageInfo = new androidx.media3.exoplayer.ExoPlayerImplInternal.PendingMessageInfo(playerMessage);
        if (resolvePendingMessagePosition(pendingMessageInfo, this.playbackInfo.timeline, this.playbackInfo.timeline, this.repeatMode, this.shuffleModeEnabled, this.window, this.period)) {
            this.pendingMessages.add(pendingMessageInfo);
            java.util.Collections.sort(this.pendingMessages);
        } else {
            playerMessage.markAsProcessed(false);
        }
    }

    private void sendMessageToTarget(androidx.media3.exoplayer.PlayerMessage playerMessage) throws androidx.media3.exoplayer.ExoPlaybackException {
        if (playerMessage.getLooper() == this.playbackLooper) {
            deliverMessage(playerMessage);
            if (this.playbackInfo.playbackState == 3 || this.playbackInfo.playbackState == 2) {
                this.handler.sendEmptyMessage(2);
                return;
            }
            return;
        }
        this.handler.obtainMessage(15, playerMessage).sendToTarget();
    }

    private void sendMessageToTargetThread(final androidx.media3.exoplayer.PlayerMessage playerMessage) {
        android.os.Looper looper = playerMessage.getLooper();
        if (!looper.getThread().isAlive()) {
            androidx.media3.common.util.Log.w("TAG", "Trying to send message on a dead thread.");
            playerMessage.markAsProcessed(false);
        } else {
            this.clock.createHandler(looper, null).post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.exoplayer.ExoPlayerImplInternal.this.m4809x7e52fcd1(playerMessage);
                }
            });
        }
    }

    /* renamed from: lambda$sendMessageToTargetThread$1$androidx-media3-exoplayer-ExoPlayerImplInternal, reason: not valid java name */
    /* synthetic */ void m4809x7e52fcd1(androidx.media3.exoplayer.PlayerMessage playerMessage) {
        try {
            deliverMessage(playerMessage);
        } catch (androidx.media3.exoplayer.ExoPlaybackException e) {
            androidx.media3.common.util.Log.e(TAG, "Unexpected error delivering message on external thread.", e);
            throw new java.lang.RuntimeException(e);
        }
    }

    private void deliverMessage(androidx.media3.exoplayer.PlayerMessage playerMessage) throws androidx.media3.exoplayer.ExoPlaybackException {
        if (playerMessage.isCanceled()) {
            return;
        }
        try {
            playerMessage.getTarget().handleMessage(playerMessage.getType(), playerMessage.getPayload());
        } finally {
            playerMessage.markAsProcessed(true);
        }
    }

    private void resolvePendingMessagePositions(androidx.media3.common.Timeline timeline, androidx.media3.common.Timeline timeline2) {
        if (timeline.isEmpty() && timeline2.isEmpty()) {
            return;
        }
        for (int size = this.pendingMessages.size() - 1; size >= 0; size--) {
            if (!resolvePendingMessagePosition(this.pendingMessages.get(size), timeline, timeline2, this.repeatMode, this.shuffleModeEnabled, this.window, this.period)) {
                this.pendingMessages.get(size).message.markAsProcessed(false);
                this.pendingMessages.remove(size);
            }
        }
        java.util.Collections.sort(this.pendingMessages);
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x007d, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void maybeTriggerPendingMessages(long j, long j2) throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.exoplayer.ExoPlayerImplInternal.PendingMessageInfo pendingMessageInfo;
        if (this.pendingMessages.isEmpty() || this.playbackInfo.periodId.isAd()) {
            return;
        }
        if (this.deliverPendingMessageAtStartPositionRequired) {
            j--;
            this.deliverPendingMessageAtStartPositionRequired = false;
        }
        int indexOfPeriod = this.playbackInfo.timeline.getIndexOfPeriod(this.playbackInfo.periodId.periodUid);
        int min = java.lang.Math.min(this.nextPendingMessageIndexHint, this.pendingMessages.size());
        androidx.media3.exoplayer.ExoPlayerImplInternal.PendingMessageInfo pendingMessageInfo2 = min > 0 ? this.pendingMessages.get(min - 1) : null;
        while (pendingMessageInfo2 != null && (pendingMessageInfo2.resolvedPeriodIndex > indexOfPeriod || (pendingMessageInfo2.resolvedPeriodIndex == indexOfPeriod && pendingMessageInfo2.resolvedPeriodTimeUs > j))) {
            int i = min - 1;
            pendingMessageInfo2 = i > 0 ? this.pendingMessages.get(min - 2) : null;
            min = i;
        }
        if (min < this.pendingMessages.size()) {
            pendingMessageInfo = this.pendingMessages.get(min);
            while (pendingMessageInfo != null && pendingMessageInfo.resolvedPeriodUid != null && (pendingMessageInfo.resolvedPeriodIndex < indexOfPeriod || (pendingMessageInfo.resolvedPeriodIndex == indexOfPeriod && pendingMessageInfo.resolvedPeriodTimeUs <= j))) {
                min++;
                if (min < this.pendingMessages.size()) {
                    pendingMessageInfo = this.pendingMessages.get(min);
                }
            }
            while (pendingMessageInfo != null && pendingMessageInfo.resolvedPeriodUid != null && pendingMessageInfo.resolvedPeriodIndex == indexOfPeriod && pendingMessageInfo.resolvedPeriodTimeUs > j && pendingMessageInfo.resolvedPeriodTimeUs <= j2) {
                try {
                    sendMessageToTarget(pendingMessageInfo.message);
                    if (pendingMessageInfo.message.getDeleteAfterDelivery() || pendingMessageInfo.message.isCanceled()) {
                        this.pendingMessages.remove(min);
                    } else {
                        min++;
                    }
                    pendingMessageInfo = min < this.pendingMessages.size() ? this.pendingMessages.get(min) : null;
                } catch (java.lang.Throwable th) {
                    if (pendingMessageInfo.message.getDeleteAfterDelivery() || pendingMessageInfo.message.isCanceled()) {
                        this.pendingMessages.remove(min);
                    }
                    throw th;
                }
            }
            this.nextPendingMessageIndexHint = min;
            return;
        }
        pendingMessageInfo = null;
    }

    private void ensureStopped(androidx.media3.exoplayer.Renderer renderer) {
        if (renderer.getState() == 2) {
            renderer.stop();
        }
    }

    private void disableRenderer(androidx.media3.exoplayer.Renderer renderer) throws androidx.media3.exoplayer.ExoPlaybackException {
        if (isRendererEnabled(renderer)) {
            this.mediaClock.onRendererDisabled(renderer);
            ensureStopped(renderer);
            renderer.disable();
            this.enabledRendererCount--;
        }
    }

    private void reselectTracksInternalAndSeek() throws androidx.media3.exoplayer.ExoPlaybackException {
        reselectTracksInternal();
        seekToCurrentPosition(true);
    }

    private void reselectTracksInternal() throws androidx.media3.exoplayer.ExoPlaybackException {
        float f = this.mediaClock.getPlaybackParameters().speed;
        androidx.media3.exoplayer.MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult = null;
        boolean z = true;
        for (androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null && playingPeriod.prepared; playingPeriod = playingPeriod.getNext()) {
            androidx.media3.exoplayer.trackselection.TrackSelectorResult selectTracks = playingPeriod.selectTracks(f, this.playbackInfo.timeline);
            if (playingPeriod == this.queue.getPlayingPeriod()) {
                trackSelectorResult = selectTracks;
            }
            if (selectTracks.isEquivalent(playingPeriod.getTrackSelectorResult())) {
                if (playingPeriod == readingPeriod) {
                    z = false;
                }
            } else {
                if (z) {
                    androidx.media3.exoplayer.MediaPeriodHolder playingPeriod2 = this.queue.getPlayingPeriod();
                    boolean removeAfter = this.queue.removeAfter(playingPeriod2);
                    boolean[] zArr = new boolean[this.renderers.length];
                    long applyTrackSelection = playingPeriod2.applyTrackSelection((androidx.media3.exoplayer.trackselection.TrackSelectorResult) androidx.media3.common.util.Assertions.checkNotNull(trackSelectorResult), this.playbackInfo.positionUs, removeAfter, zArr);
                    boolean z2 = (this.playbackInfo.playbackState == 4 || applyTrackSelection == this.playbackInfo.positionUs) ? false : true;
                    this.playbackInfo = handlePositionDiscontinuity(this.playbackInfo.periodId, applyTrackSelection, this.playbackInfo.requestedContentPositionUs, this.playbackInfo.discontinuityStartPositionUs, z2, 5);
                    if (z2) {
                        resetRendererPosition(applyTrackSelection);
                    }
                    boolean[] zArr2 = new boolean[this.renderers.length];
                    int i = 0;
                    while (true) {
                        androidx.media3.exoplayer.Renderer[] rendererArr = this.renderers;
                        if (i >= rendererArr.length) {
                            break;
                        }
                        androidx.media3.exoplayer.Renderer renderer = rendererArr[i];
                        zArr2[i] = isRendererEnabled(renderer);
                        androidx.media3.exoplayer.source.SampleStream sampleStream = playingPeriod2.sampleStreams[i];
                        if (zArr2[i]) {
                            if (sampleStream != renderer.getStream()) {
                                disableRenderer(renderer);
                            } else if (zArr[i]) {
                                renderer.resetPosition(this.rendererPositionUs);
                            }
                        }
                        i++;
                    }
                    enableRenderers(zArr2, this.rendererPositionUs);
                } else {
                    this.queue.removeAfter(playingPeriod);
                    if (playingPeriod.prepared) {
                        playingPeriod.applyTrackSelection(selectTracks, java.lang.Math.max(playingPeriod.info.startPositionUs, playingPeriod.toPeriodTime(this.rendererPositionUs)), false);
                    }
                }
                handleLoadingMediaPeriodChanged(true);
                if (this.playbackInfo.playbackState != 4) {
                    maybeContinueLoading();
                    updatePlaybackPositions();
                    this.handler.sendEmptyMessage(2);
                    return;
                }
                return;
            }
        }
    }

    private void updateTrackSelectionPlaybackSpeed(float f) {
        for (androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlaybackSpeed(f);
                }
            }
        }
    }

    private void notifyTrackSelectionDiscontinuity() {
        for (androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onDiscontinuity();
                }
            }
        }
    }

    private boolean shouldTransitionToReadyState(boolean z) {
        if (this.enabledRendererCount == 0) {
            return isTimelineReady();
        }
        if (!z) {
            return false;
        }
        if (!this.playbackInfo.isLoading) {
            return true;
        }
        androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long targetLiveOffsetUs = shouldUseLivePlaybackSpeedControl(this.playbackInfo.timeline, playingPeriod.info.id) ? this.livePlaybackSpeedControl.getTargetLiveOffsetUs() : -9223372036854775807L;
        androidx.media3.exoplayer.MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        return (loadingPeriod.isFullyBuffered() && loadingPeriod.info.isFinal) || (loadingPeriod.info.id.isAd() && !loadingPeriod.prepared) || this.loadControl.shouldStartPlayback(new androidx.media3.exoplayer.LoadControl.Parameters(this.playerId, this.playbackInfo.timeline, playingPeriod.info.id, playingPeriod.toPeriodTime(this.rendererPositionUs), getTotalBufferedDurationUs(), this.mediaClock.getPlaybackParameters().speed, this.playbackInfo.playWhenReady, this.isRebuffering, targetLiveOffsetUs));
    }

    private boolean isTimelineReady() {
        androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long j = playingPeriod.info.durationUs;
        return playingPeriod.prepared && (j == -9223372036854775807L || this.playbackInfo.positionUs < j || !shouldPlayWhenReady());
    }

    /* JADX WARN: Not initialized variable reg: 26, insn: 0x0154: MOVE (r5 I:??[long, double]) = (r26 I:??[long, double]), block:B:109:0x0153 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void handleMediaSourceListInfoRefreshed(androidx.media3.common.Timeline timeline, boolean z) throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.exoplayer.ExoPlayerImplInternal.SeekPosition seekPosition;
        long j;
        long j2;
        long j3;
        androidx.media3.exoplayer.ExoPlayerImplInternal.PositionUpdateForPlaylistChange resolvePositionForPlaylistChange = resolvePositionForPlaylistChange(timeline, this.playbackInfo, this.pendingInitialSeekPosition, this.queue, this.repeatMode, this.shuffleModeEnabled, this.window, this.period);
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = resolvePositionForPlaylistChange.periodId;
        long j4 = resolvePositionForPlaylistChange.requestedContentPositionUs;
        boolean z2 = resolvePositionForPlaylistChange.forceBufferingState;
        long j5 = resolvePositionForPlaylistChange.periodPositionUs;
        int i = 1;
        boolean z3 = (this.playbackInfo.periodId.equals(mediaPeriodId) && j5 == this.playbackInfo.positionUs) ? false : true;
        try {
            if (resolvePositionForPlaylistChange.endPlayback) {
                if (this.playbackInfo.playbackState != 1) {
                    setState(4);
                }
                resetInternal(false, false, false, true);
            }
            for (androidx.media3.exoplayer.Renderer renderer : this.renderers) {
                renderer.setTimeline(timeline);
            }
            try {
                if (z3) {
                    j2 = j5;
                    i = -1;
                    if (!timeline.isEmpty()) {
                        try {
                            for (androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
                                if (playingPeriod.info.id.equals(mediaPeriodId)) {
                                    playingPeriod.info = this.queue.getUpdatedMediaPeriodInfo(timeline, playingPeriod.info);
                                    playingPeriod.updateClipping();
                                }
                            }
                            j5 = j2;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            j5 = j2;
                        }
                        try {
                            j3 = seekToPeriodPosition(mediaPeriodId, j5, z2);
                            updatePlaybackSpeedSettingsForNewPeriod(timeline, mediaPeriodId, this.playbackInfo.timeline, this.playbackInfo.periodId, !resolvePositionForPlaylistChange.setTargetLiveOffset ? j3 : -9223372036854775807L, false);
                            if (!z3 || j4 != this.playbackInfo.requestedContentPositionUs) {
                                java.lang.Object obj = this.playbackInfo.periodId.periodUid;
                                androidx.media3.common.Timeline timeline2 = this.playbackInfo.timeline;
                                this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j3, j4, this.playbackInfo.discontinuityStartPositionUs, (z3 || !z || timeline2.isEmpty() || timeline2.getPeriodByUid(obj, this.period).isPlaceholder) ? false : true, timeline.getIndexOfPeriod(obj) != i ? 4 : 3);
                            }
                            resetPendingPauseAtEndOfPeriod();
                            resolvePendingMessagePositions(timeline, this.playbackInfo.timeline);
                            this.playbackInfo = this.playbackInfo.copyWithTimeline(timeline);
                            if (!timeline.isEmpty()) {
                                this.pendingInitialSeekPosition = null;
                            }
                            handleLoadingMediaPeriodChanged(false);
                            this.handler.sendEmptyMessage(2);
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            seekPosition = null;
                            long j6 = j5;
                            updatePlaybackSpeedSettingsForNewPeriod(timeline, mediaPeriodId, this.playbackInfo.timeline, this.playbackInfo.periodId, resolvePositionForPlaylistChange.setTargetLiveOffset ? j5 : -9223372036854775807L, false);
                            if (!z3) {
                            }
                            java.lang.Object obj2 = this.playbackInfo.periodId.periodUid;
                            androidx.media3.common.Timeline timeline3 = this.playbackInfo.timeline;
                            if (z3) {
                            }
                            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j6, j4, this.playbackInfo.discontinuityStartPositionUs, (z3 || !z || timeline3.isEmpty() || timeline3.getPeriodByUid(obj2, this.period).isPlaceholder) ? false : true, timeline.getIndexOfPeriod(obj2) != i ? 4 : 3);
                            resetPendingPauseAtEndOfPeriod();
                            resolvePendingMessagePositions(timeline, this.playbackInfo.timeline);
                            this.playbackInfo = this.playbackInfo.copyWithTimeline(timeline);
                            if (!timeline.isEmpty()) {
                            }
                            handleLoadingMediaPeriodChanged(false);
                            this.handler.sendEmptyMessage(2);
                            throw th;
                        }
                    }
                } else {
                    try {
                        i = -1;
                        j2 = j5;
                        if (!this.queue.updateQueuedPeriods(timeline, this.rendererPositionUs, getMaxRendererReadPositionUs())) {
                            seekToCurrentPosition(false);
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        i = -1;
                        seekPosition = null;
                        long j62 = j5;
                        updatePlaybackSpeedSettingsForNewPeriod(timeline, mediaPeriodId, this.playbackInfo.timeline, this.playbackInfo.periodId, resolvePositionForPlaylistChange.setTargetLiveOffset ? j5 : -9223372036854775807L, false);
                        if (!z3 || j4 != this.playbackInfo.requestedContentPositionUs) {
                            java.lang.Object obj22 = this.playbackInfo.periodId.periodUid;
                            androidx.media3.common.Timeline timeline32 = this.playbackInfo.timeline;
                            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j62, j4, this.playbackInfo.discontinuityStartPositionUs, (z3 || !z || timeline32.isEmpty() || timeline32.getPeriodByUid(obj22, this.period).isPlaceholder) ? false : true, timeline.getIndexOfPeriod(obj22) != i ? 4 : 3);
                        }
                        resetPendingPauseAtEndOfPeriod();
                        resolvePendingMessagePositions(timeline, this.playbackInfo.timeline);
                        this.playbackInfo = this.playbackInfo.copyWithTimeline(timeline);
                        if (!timeline.isEmpty()) {
                            this.pendingInitialSeekPosition = seekPosition;
                        }
                        handleLoadingMediaPeriodChanged(false);
                        this.handler.sendEmptyMessage(2);
                        throw th;
                    }
                }
                j3 = j2;
                updatePlaybackSpeedSettingsForNewPeriod(timeline, mediaPeriodId, this.playbackInfo.timeline, this.playbackInfo.periodId, !resolvePositionForPlaylistChange.setTargetLiveOffset ? j3 : -9223372036854775807L, false);
                if (!z3) {
                }
                java.lang.Object obj3 = this.playbackInfo.periodId.periodUid;
                androidx.media3.common.Timeline timeline22 = this.playbackInfo.timeline;
                if (z3) {
                }
                this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j3, j4, this.playbackInfo.discontinuityStartPositionUs, (z3 || !z || timeline22.isEmpty() || timeline22.getPeriodByUid(obj3, this.period).isPlaceholder) ? false : true, timeline.getIndexOfPeriod(obj3) != i ? 4 : 3);
                resetPendingPauseAtEndOfPeriod();
                resolvePendingMessagePositions(timeline, this.playbackInfo.timeline);
                this.playbackInfo = this.playbackInfo.copyWithTimeline(timeline);
                if (!timeline.isEmpty()) {
                }
                handleLoadingMediaPeriodChanged(false);
                this.handler.sendEmptyMessage(2);
            } catch (java.lang.Throwable th4) {
                th = th4;
                seekPosition = null;
                j5 = j;
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            seekPosition = null;
            i = -1;
        }
    }

    private void updatePlaybackSpeedSettingsForNewPeriod(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.common.Timeline timeline2, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId2, long j, boolean z) throws androidx.media3.exoplayer.ExoPlaybackException {
        if (!shouldUseLivePlaybackSpeedControl(timeline, mediaPeriodId)) {
            androidx.media3.common.PlaybackParameters playbackParameters = mediaPeriodId.isAd() ? androidx.media3.common.PlaybackParameters.DEFAULT : this.playbackInfo.playbackParameters;
            if (this.mediaClock.getPlaybackParameters().equals(playbackParameters)) {
                return;
            }
            setMediaClockPlaybackParameters(playbackParameters);
            handlePlaybackParameters(this.playbackInfo.playbackParameters, playbackParameters.speed, false, false);
            return;
        }
        timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, this.window);
        this.livePlaybackSpeedControl.setLiveConfiguration((androidx.media3.common.MediaItem.LiveConfiguration) androidx.media3.common.util.Util.castNonNull(this.window.liveConfiguration));
        if (j != -9223372036854775807L) {
            this.livePlaybackSpeedControl.setTargetLiveOffsetOverrideUs(getLiveOffsetUs(timeline, mediaPeriodId.periodUid, j));
            return;
        }
        if (!androidx.media3.common.util.Util.areEqual(!timeline2.isEmpty() ? timeline2.getWindow(timeline2.getPeriodByUid(mediaPeriodId2.periodUid, this.period).windowIndex, this.window).uid : null, this.window.uid) || z) {
            this.livePlaybackSpeedControl.setTargetLiveOffsetOverrideUs(-9223372036854775807L);
        }
    }

    private long getMaxRendererReadPositionUs() {
        androidx.media3.exoplayer.MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod == null) {
            return 0L;
        }
        long rendererOffset = readingPeriod.getRendererOffset();
        if (!readingPeriod.prepared) {
            return rendererOffset;
        }
        int i = 0;
        while (true) {
            androidx.media3.exoplayer.Renderer[] rendererArr = this.renderers;
            if (i >= rendererArr.length) {
                return rendererOffset;
            }
            if (isRendererEnabled(rendererArr[i]) && this.renderers[i].getStream() == readingPeriod.sampleStreams[i]) {
                long readingPositionUs = this.renderers[i].getReadingPositionUs();
                if (readingPositionUs == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                rendererOffset = java.lang.Math.max(readingPositionUs, rendererOffset);
            }
            i++;
        }
    }

    private void updatePeriods() throws androidx.media3.exoplayer.ExoPlaybackException {
        if (this.playbackInfo.timeline.isEmpty() || !this.mediaSourceList.isPrepared()) {
            return;
        }
        boolean maybeUpdateLoadingPeriod = maybeUpdateLoadingPeriod();
        maybeUpdateReadingPeriod();
        maybeUpdateReadingRenderers();
        maybeUpdatePlayingPeriod();
        maybeUpdatePreloadPeriods(maybeUpdateLoadingPeriod);
    }

    private boolean maybeUpdateLoadingPeriod() throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.exoplayer.MediaPeriodInfo nextMediaPeriodInfo;
        this.queue.reevaluateBuffer(this.rendererPositionUs);
        boolean z = false;
        if (this.queue.shouldLoadNextMediaPeriod() && (nextMediaPeriodInfo = this.queue.getNextMediaPeriodInfo(this.rendererPositionUs, this.playbackInfo)) != null) {
            androidx.media3.exoplayer.MediaPeriodHolder enqueueNextMediaPeriodHolder = this.queue.enqueueNextMediaPeriodHolder(nextMediaPeriodInfo);
            enqueueNextMediaPeriodHolder.mediaPeriod.prepare(this, nextMediaPeriodInfo.startPositionUs);
            if (this.queue.getPlayingPeriod() == enqueueNextMediaPeriodHolder) {
                resetRendererPosition(nextMediaPeriodInfo.startPositionUs);
            }
            handleLoadingMediaPeriodChanged(false);
            z = true;
        }
        if (this.shouldContinueLoading) {
            this.shouldContinueLoading = isLoadingPossible();
            updateIsLoading();
        } else {
            maybeContinueLoading();
        }
        return z;
    }

    private void maybeUpdateReadingPeriod() throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.exoplayer.MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod == null) {
            return;
        }
        int i = 0;
        if (readingPeriod.getNext() == null || this.pendingPauseAtEndOfPeriod) {
            if (!readingPeriod.info.isFinal && !this.pendingPauseAtEndOfPeriod) {
                return;
            }
            while (true) {
                androidx.media3.exoplayer.Renderer[] rendererArr = this.renderers;
                if (i >= rendererArr.length) {
                    return;
                }
                androidx.media3.exoplayer.Renderer renderer = rendererArr[i];
                androidx.media3.exoplayer.source.SampleStream sampleStream = readingPeriod.sampleStreams[i];
                if (sampleStream != null && renderer.getStream() == sampleStream && renderer.hasReadStreamToEnd()) {
                    setCurrentStreamFinal(renderer, (readingPeriod.info.durationUs == -9223372036854775807L || readingPeriod.info.durationUs == Long.MIN_VALUE) ? -9223372036854775807L : readingPeriod.getRendererOffset() + readingPeriod.info.durationUs);
                }
                i++;
            }
        } else if (hasReadingPeriodFinishedReading()) {
            if (readingPeriod.getNext().prepared || this.rendererPositionUs >= readingPeriod.getNext().getStartPositionRendererTime()) {
                androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
                androidx.media3.exoplayer.MediaPeriodHolder advanceReadingPeriod = this.queue.advanceReadingPeriod();
                androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult2 = advanceReadingPeriod.getTrackSelectorResult();
                updatePlaybackSpeedSettingsForNewPeriod(this.playbackInfo.timeline, advanceReadingPeriod.info.id, this.playbackInfo.timeline, readingPeriod.info.id, -9223372036854775807L, false);
                if (advanceReadingPeriod.prepared && advanceReadingPeriod.mediaPeriod.readDiscontinuity() != -9223372036854775807L) {
                    setAllRendererStreamsFinal(advanceReadingPeriod.getStartPositionRendererTime());
                    if (advanceReadingPeriod.isFullyBuffered()) {
                        return;
                    }
                    this.queue.removeAfter(advanceReadingPeriod);
                    handleLoadingMediaPeriodChanged(false);
                    maybeContinueLoading();
                    return;
                }
                for (int i2 = 0; i2 < this.renderers.length; i2++) {
                    boolean isRendererEnabled = trackSelectorResult.isRendererEnabled(i2);
                    boolean isRendererEnabled2 = trackSelectorResult2.isRendererEnabled(i2);
                    if (isRendererEnabled && !this.renderers[i2].isCurrentStreamFinal()) {
                        boolean z = this.rendererCapabilities[i2].getTrackType() == -2;
                        androidx.media3.exoplayer.RendererConfiguration rendererConfiguration = trackSelectorResult.rendererConfigurations[i2];
                        androidx.media3.exoplayer.RendererConfiguration rendererConfiguration2 = trackSelectorResult2.rendererConfigurations[i2];
                        if (!isRendererEnabled2 || !rendererConfiguration2.equals(rendererConfiguration) || z) {
                            setCurrentStreamFinal(this.renderers[i2], advanceReadingPeriod.getStartPositionRendererTime());
                        }
                    }
                }
            }
        }
    }

    private void maybeUpdateReadingRenderers() throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.exoplayer.MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod == null || this.queue.getPlayingPeriod() == readingPeriod || readingPeriod.allRenderersInCorrectState || !replaceStreamsOrDisableRendererForTransition()) {
            return;
        }
        enableRenderers();
    }

    private void maybeUpdatePreloadPeriods(boolean z) {
        if (this.preloadConfiguration.targetPreloadDurationUs != -9223372036854775807L) {
            if (z || !this.playbackInfo.timeline.equals(this.lastPreloadPoolInvalidationTimeline)) {
                this.lastPreloadPoolInvalidationTimeline = this.playbackInfo.timeline;
                this.queue.invalidatePreloadPool(this.playbackInfo.timeline);
            }
        }
    }

    private boolean replaceStreamsOrDisableRendererForTransition() throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.exoplayer.MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        int i = 0;
        boolean z = false;
        while (true) {
            androidx.media3.exoplayer.Renderer[] rendererArr = this.renderers;
            if (i >= rendererArr.length) {
                return !z;
            }
            androidx.media3.exoplayer.Renderer renderer = rendererArr[i];
            if (isRendererEnabled(renderer)) {
                boolean z2 = renderer.getStream() != readingPeriod.sampleStreams[i];
                if (!trackSelectorResult.isRendererEnabled(i) || z2) {
                    if (!renderer.isCurrentStreamFinal()) {
                        renderer.replaceStream(getFormats(trackSelectorResult.selections[i]), readingPeriod.sampleStreams[i], readingPeriod.getStartPositionRendererTime(), readingPeriod.getRendererOffset(), readingPeriod.info.id);
                        if (this.offloadSchedulingEnabled) {
                            setOffloadSchedulingEnabled(false);
                        }
                    } else if (renderer.isEnded()) {
                        disableRenderer(renderer);
                    } else {
                        z = true;
                    }
                }
            }
            i++;
        }
    }

    private void maybeUpdatePlayingPeriod() throws androidx.media3.exoplayer.ExoPlaybackException {
        boolean z = false;
        while (shouldAdvancePlayingPeriod()) {
            if (z) {
                maybeNotifyPlaybackInfoChanged();
            }
            androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder = (androidx.media3.exoplayer.MediaPeriodHolder) androidx.media3.common.util.Assertions.checkNotNull(this.queue.advancePlayingPeriod());
            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodHolder.info.id, mediaPeriodHolder.info.startPositionUs, mediaPeriodHolder.info.requestedContentPositionUs, mediaPeriodHolder.info.startPositionUs, !(this.playbackInfo.periodId.periodUid.equals(mediaPeriodHolder.info.id.periodUid) && this.playbackInfo.periodId.adGroupIndex == -1 && mediaPeriodHolder.info.id.adGroupIndex == -1 && this.playbackInfo.periodId.nextAdGroupIndex != mediaPeriodHolder.info.id.nextAdGroupIndex), 0);
            resetPendingPauseAtEndOfPeriod();
            updatePlaybackPositions();
            if (this.playbackInfo.playbackState == 3) {
                startRenderers();
            }
            allowRenderersToRenderStartOfStreams();
            z = true;
        }
    }

    private void maybeUpdateOffloadScheduling() {
        boolean z;
        androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod != null) {
            androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult = playingPeriod.getTrackSelectorResult();
            boolean z2 = false;
            int i = 0;
            boolean z3 = false;
            while (true) {
                if (i >= this.renderers.length) {
                    z = true;
                    break;
                }
                if (trackSelectorResult.isRendererEnabled(i)) {
                    if (this.renderers[i].getTrackType() != 1) {
                        z = false;
                        break;
                    } else if (trackSelectorResult.rendererConfigurations[i].offloadModePreferred != 0) {
                        z3 = true;
                    }
                }
                i++;
            }
            if (z3 && z) {
                z2 = true;
            }
            setOffloadSchedulingEnabled(z2);
        }
    }

    private void allowRenderersToRenderStartOfStreams() {
        androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult = this.queue.getPlayingPeriod().getTrackSelectorResult();
        for (int i = 0; i < this.renderers.length; i++) {
            if (trackSelectorResult.isRendererEnabled(i)) {
                this.renderers[i].enableMayRenderStartOfStream();
            }
        }
    }

    private void resetPendingPauseAtEndOfPeriod() {
        androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        this.pendingPauseAtEndOfPeriod = playingPeriod != null && playingPeriod.info.isLastInTimelineWindow && this.pauseAtEndOfWindow;
    }

    private boolean shouldAdvancePlayingPeriod() {
        androidx.media3.exoplayer.MediaPeriodHolder playingPeriod;
        androidx.media3.exoplayer.MediaPeriodHolder next;
        return shouldPlayWhenReady() && !this.pendingPauseAtEndOfPeriod && (playingPeriod = this.queue.getPlayingPeriod()) != null && (next = playingPeriod.getNext()) != null && this.rendererPositionUs >= next.getStartPositionRendererTime() && next.allRenderersInCorrectState;
    }

    private boolean hasReadingPeriodFinishedReading() {
        androidx.media3.exoplayer.MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (!readingPeriod.prepared) {
            return false;
        }
        int i = 0;
        while (true) {
            androidx.media3.exoplayer.Renderer[] rendererArr = this.renderers;
            if (i >= rendererArr.length) {
                return true;
            }
            androidx.media3.exoplayer.Renderer renderer = rendererArr[i];
            androidx.media3.exoplayer.source.SampleStream sampleStream = readingPeriod.sampleStreams[i];
            if (renderer.getStream() != sampleStream || (sampleStream != null && !renderer.hasReadStreamToEnd() && !hasReachedServerSideInsertedAdsTransition(renderer, readingPeriod))) {
                break;
            }
            i++;
        }
        return false;
    }

    private boolean hasReachedServerSideInsertedAdsTransition(androidx.media3.exoplayer.Renderer renderer, androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder) {
        androidx.media3.exoplayer.MediaPeriodHolder next = mediaPeriodHolder.getNext();
        return mediaPeriodHolder.info.isFollowedByTransitionToSameStream && next.prepared && ((renderer instanceof androidx.media3.exoplayer.text.TextRenderer) || (renderer instanceof androidx.media3.exoplayer.metadata.MetadataRenderer) || renderer.getReadingPositionUs() >= next.getStartPositionRendererTime());
    }

    private void setAllRendererStreamsFinal(long j) {
        for (androidx.media3.exoplayer.Renderer renderer : this.renderers) {
            if (renderer.getStream() != null) {
                setCurrentStreamFinal(renderer, j);
            }
        }
    }

    private void setCurrentStreamFinal(androidx.media3.exoplayer.Renderer renderer, long j) {
        renderer.setCurrentStreamFinal();
        if (renderer instanceof androidx.media3.exoplayer.text.TextRenderer) {
            ((androidx.media3.exoplayer.text.TextRenderer) renderer).setFinalStreamEndPositionUs(j);
        }
    }

    private void handlePeriodPrepared(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) throws androidx.media3.exoplayer.ExoPlaybackException {
        if (this.queue.isLoading(mediaPeriod)) {
            androidx.media3.exoplayer.MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
            loadingPeriod.handlePrepared(this.mediaClock.getPlaybackParameters().speed, this.playbackInfo.timeline);
            updateLoadControlTrackSelection(loadingPeriod.info.id, loadingPeriod.getTrackGroups(), loadingPeriod.getTrackSelectorResult());
            if (loadingPeriod == this.queue.getPlayingPeriod()) {
                resetRendererPosition(loadingPeriod.info.startPositionUs);
                enableRenderers();
                this.playbackInfo = handlePositionDiscontinuity(this.playbackInfo.periodId, loadingPeriod.info.startPositionUs, this.playbackInfo.requestedContentPositionUs, loadingPeriod.info.startPositionUs, false, 5);
            }
            maybeContinueLoading();
        }
    }

    private void handleContinueLoadingRequested(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        if (this.queue.isLoading(mediaPeriod)) {
            this.queue.reevaluateBuffer(this.rendererPositionUs);
            maybeContinueLoading();
        }
    }

    private void handlePlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters, boolean z) throws androidx.media3.exoplayer.ExoPlaybackException {
        handlePlaybackParameters(playbackParameters, playbackParameters.speed, true, z);
    }

    private void handlePlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters, float f, boolean z, boolean z2) throws androidx.media3.exoplayer.ExoPlaybackException {
        if (z) {
            if (z2) {
                this.playbackInfoUpdate.incrementPendingOperationAcks(1);
            }
            this.playbackInfo = this.playbackInfo.copyWithPlaybackParameters(playbackParameters);
        }
        updateTrackSelectionPlaybackSpeed(playbackParameters.speed);
        for (androidx.media3.exoplayer.Renderer renderer : this.renderers) {
            if (renderer != null) {
                renderer.setPlaybackSpeed(f, playbackParameters.speed);
            }
        }
    }

    private void maybeContinueLoading() {
        boolean shouldContinueLoading = shouldContinueLoading();
        this.shouldContinueLoading = shouldContinueLoading;
        if (shouldContinueLoading) {
            this.queue.getLoadingPeriod().continueLoading(this.rendererPositionUs, this.mediaClock.getPlaybackParameters().speed, this.lastRebufferRealtimeMs);
        }
        updateIsLoading();
    }

    private boolean shouldContinueLoading() {
        long periodTime;
        if (!isLoadingPossible()) {
            return false;
        }
        androidx.media3.exoplayer.MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        long totalBufferedDurationUs = getTotalBufferedDurationUs(loadingPeriod.getNextLoadPositionUs());
        if (loadingPeriod == this.queue.getPlayingPeriod()) {
            periodTime = loadingPeriod.toPeriodTime(this.rendererPositionUs);
        } else {
            periodTime = loadingPeriod.toPeriodTime(this.rendererPositionUs) - loadingPeriod.info.startPositionUs;
        }
        androidx.media3.exoplayer.LoadControl.Parameters parameters = new androidx.media3.exoplayer.LoadControl.Parameters(this.playerId, this.playbackInfo.timeline, loadingPeriod.info.id, periodTime, totalBufferedDurationUs, this.mediaClock.getPlaybackParameters().speed, this.playbackInfo.playWhenReady, this.isRebuffering, shouldUseLivePlaybackSpeedControl(this.playbackInfo.timeline, loadingPeriod.info.id) ? this.livePlaybackSpeedControl.getTargetLiveOffsetUs() : -9223372036854775807L);
        boolean shouldContinueLoading = this.loadControl.shouldContinueLoading(parameters);
        androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (shouldContinueLoading || !playingPeriod.prepared || totalBufferedDurationUs >= PLAYBACK_BUFFER_EMPTY_THRESHOLD_US) {
            return shouldContinueLoading;
        }
        if (this.backBufferDurationUs <= 0 && !this.retainBackBufferFromKeyframe) {
            return shouldContinueLoading;
        }
        playingPeriod.mediaPeriod.discardBuffer(this.playbackInfo.positionUs, false);
        return this.loadControl.shouldContinueLoading(parameters);
    }

    private boolean isLoadingPossible() {
        androidx.media3.exoplayer.MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        return (loadingPeriod == null || loadingPeriod.hasLoadingError() || loadingPeriod.getNextLoadPositionUs() == Long.MIN_VALUE) ? false : true;
    }

    private void updateIsLoading() {
        androidx.media3.exoplayer.MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        boolean z = this.shouldContinueLoading || (loadingPeriod != null && loadingPeriod.mediaPeriod.isLoading());
        if (z != this.playbackInfo.isLoading) {
            this.playbackInfo = this.playbackInfo.copyWithIsLoading(z);
        }
    }

    private androidx.media3.exoplayer.PlaybackInfo handlePositionDiscontinuity(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, long j3, boolean z, int i) {
        androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray;
        androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult;
        java.util.List list;
        androidx.media3.exoplayer.source.TrackGroupArray trackGroups;
        androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult2;
        this.deliverPendingMessageAtStartPositionRequired = (!this.deliverPendingMessageAtStartPositionRequired && j == this.playbackInfo.positionUs && mediaPeriodId.equals(this.playbackInfo.periodId)) ? false : true;
        resetPendingPauseAtEndOfPeriod();
        androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray2 = this.playbackInfo.trackGroups;
        androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult3 = this.playbackInfo.trackSelectorResult;
        java.util.List list2 = this.playbackInfo.staticMetadata;
        if (this.mediaSourceList.isPrepared()) {
            androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
            if (playingPeriod == null) {
                trackGroups = androidx.media3.exoplayer.source.TrackGroupArray.EMPTY;
            } else {
                trackGroups = playingPeriod.getTrackGroups();
            }
            if (playingPeriod == null) {
                trackSelectorResult2 = this.emptyTrackSelectorResult;
            } else {
                trackSelectorResult2 = playingPeriod.getTrackSelectorResult();
            }
            java.util.List extractMetadataFromTrackSelectionArray = extractMetadataFromTrackSelectionArray(trackSelectorResult2.selections);
            if (playingPeriod != null && playingPeriod.info.requestedContentPositionUs != j2) {
                playingPeriod.info = playingPeriod.info.copyWithRequestedContentPositionUs(j2);
            }
            maybeUpdateOffloadScheduling();
            trackGroupArray = trackGroups;
            trackSelectorResult = trackSelectorResult2;
            list = extractMetadataFromTrackSelectionArray;
        } else {
            if (!mediaPeriodId.equals(this.playbackInfo.periodId)) {
                trackGroupArray2 = androidx.media3.exoplayer.source.TrackGroupArray.EMPTY;
                trackSelectorResult3 = this.emptyTrackSelectorResult;
                list2 = com.google.common.collect.ImmutableList.of();
            }
            trackGroupArray = trackGroupArray2;
            trackSelectorResult = trackSelectorResult3;
            list = list2;
        }
        if (z) {
            this.playbackInfoUpdate.setPositionDiscontinuity(i);
        }
        return this.playbackInfo.copyWithNewPosition(mediaPeriodId, j, j2, j3, getTotalBufferedDurationUs(), trackGroupArray, trackSelectorResult, list);
    }

    private com.google.common.collect.ImmutableList<androidx.media3.common.Metadata> extractMetadataFromTrackSelectionArray(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr) {
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        boolean z = false;
        for (androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
            if (exoTrackSelection != null) {
                androidx.media3.common.Format format = exoTrackSelection.getFormat(0);
                if (format.metadata == null) {
                    builder.add((com.google.common.collect.ImmutableList.Builder) new androidx.media3.common.Metadata(new androidx.media3.common.Metadata.Entry[0]));
                } else {
                    builder.add((com.google.common.collect.ImmutableList.Builder) format.metadata);
                    z = true;
                }
            }
        }
        return z ? builder.build() : com.google.common.collect.ImmutableList.of();
    }

    private void enableRenderers() throws androidx.media3.exoplayer.ExoPlaybackException {
        enableRenderers(new boolean[this.renderers.length], this.queue.getReadingPeriod().getStartPositionRendererTime());
    }

    private void enableRenderers(boolean[] zArr, long j) throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.exoplayer.MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        for (int i = 0; i < this.renderers.length; i++) {
            if (!trackSelectorResult.isRendererEnabled(i) && this.renderersToReset.remove(this.renderers[i])) {
                this.renderers[i].reset();
            }
        }
        for (int i2 = 0; i2 < this.renderers.length; i2++) {
            if (trackSelectorResult.isRendererEnabled(i2)) {
                enableRenderer(i2, zArr[i2], j);
            }
        }
        readingPeriod.allRenderersInCorrectState = true;
    }

    private void enableRenderer(int i, boolean z, long j) throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.exoplayer.Renderer renderer = this.renderers[i];
        if (isRendererEnabled(renderer)) {
            return;
        }
        androidx.media3.exoplayer.MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        boolean z2 = readingPeriod == this.queue.getPlayingPeriod();
        androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        androidx.media3.exoplayer.RendererConfiguration rendererConfiguration = trackSelectorResult.rendererConfigurations[i];
        androidx.media3.common.Format[] formats = getFormats(trackSelectorResult.selections[i]);
        boolean z3 = shouldPlayWhenReady() && this.playbackInfo.playbackState == 3;
        boolean z4 = !z && z3;
        this.enabledRendererCount++;
        this.renderersToReset.add(renderer);
        renderer.enable(rendererConfiguration, formats, readingPeriod.sampleStreams[i], this.rendererPositionUs, z4, z2, j, readingPeriod.getRendererOffset(), readingPeriod.info.id);
        renderer.handleMessage(11, new androidx.media3.exoplayer.Renderer.WakeupListener() { // from class: androidx.media3.exoplayer.ExoPlayerImplInternal.1
            @Override // androidx.media3.exoplayer.Renderer.WakeupListener
            public void onSleep() {
                androidx.media3.exoplayer.ExoPlayerImplInternal.this.requestForRendererSleep = true;
            }

            @Override // androidx.media3.exoplayer.Renderer.WakeupListener
            public void onWakeup() {
                if (androidx.media3.exoplayer.ExoPlayerImplInternal.this.dynamicSchedulingEnabled || androidx.media3.exoplayer.ExoPlayerImplInternal.this.offloadSchedulingEnabled) {
                    androidx.media3.exoplayer.ExoPlayerImplInternal.this.handler.sendEmptyMessage(2);
                }
            }
        });
        this.mediaClock.onRendererEnabled(renderer);
        if (z3 && z2) {
            renderer.start();
        }
    }

    private void releaseRenderers() {
        for (int i = 0; i < this.renderers.length; i++) {
            this.rendererCapabilities[i].clearListener();
            this.renderers[i].release();
        }
    }

    private void handleLoadingMediaPeriodChanged(boolean z) {
        long bufferedPositionUs;
        androidx.media3.exoplayer.MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = loadingPeriod == null ? this.playbackInfo.periodId : loadingPeriod.info.id;
        boolean z2 = !this.playbackInfo.loadingMediaPeriodId.equals(mediaPeriodId);
        if (z2) {
            this.playbackInfo = this.playbackInfo.copyWithLoadingMediaPeriodId(mediaPeriodId);
        }
        androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
        if (loadingPeriod == null) {
            bufferedPositionUs = playbackInfo.positionUs;
        } else {
            bufferedPositionUs = loadingPeriod.getBufferedPositionUs();
        }
        playbackInfo.bufferedPositionUs = bufferedPositionUs;
        this.playbackInfo.totalBufferedDurationUs = getTotalBufferedDurationUs();
        if ((z2 || z) && loadingPeriod != null && loadingPeriod.prepared) {
            updateLoadControlTrackSelection(loadingPeriod.info.id, loadingPeriod.getTrackGroups(), loadingPeriod.getTrackSelectorResult());
        }
    }

    private long getTotalBufferedDurationUs() {
        return getTotalBufferedDurationUs(this.playbackInfo.bufferedPositionUs);
    }

    private long getTotalBufferedDurationUs(long j) {
        androidx.media3.exoplayer.MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        if (loadingPeriod == null) {
            return 0L;
        }
        return java.lang.Math.max(0L, j - loadingPeriod.toPeriodTime(this.rendererPositionUs));
    }

    private void updateLoadControlTrackSelection(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult) {
        this.loadControl.onTracksSelected(this.playerId, this.playbackInfo.timeline, mediaPeriodId, this.renderers, trackGroupArray, trackSelectorResult.selections);
    }

    private boolean shouldPlayWhenReady() {
        return this.playbackInfo.playWhenReady && this.playbackInfo.playbackSuppressionReason == 0;
    }

    private static androidx.media3.exoplayer.ExoPlayerImplInternal.PositionUpdateForPlaylistChange resolvePositionForPlaylistChange(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.PlaybackInfo playbackInfo, androidx.media3.exoplayer.ExoPlayerImplInternal.SeekPosition seekPosition, androidx.media3.exoplayer.MediaPeriodQueue mediaPeriodQueue, int i, boolean z, androidx.media3.common.Timeline.Window window, androidx.media3.common.Timeline.Period period) {
        long j;
        int i2;
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId;
        long j2;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        boolean z5;
        androidx.media3.exoplayer.MediaPeriodQueue mediaPeriodQueue2;
        long j3;
        boolean z6;
        int i5;
        boolean z7;
        boolean z8;
        if (timeline.isEmpty()) {
            return new androidx.media3.exoplayer.ExoPlayerImplInternal.PositionUpdateForPlaylistChange(androidx.media3.exoplayer.PlaybackInfo.getDummyPeriodForEmptyTimeline(), 0L, -9223372036854775807L, false, true, false);
        }
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId2 = playbackInfo.periodId;
        java.lang.Object obj = mediaPeriodId2.periodUid;
        boolean isUsingPlaceholderPeriod = isUsingPlaceholderPeriod(playbackInfo, period);
        if (playbackInfo.periodId.isAd() || isUsingPlaceholderPeriod) {
            j = playbackInfo.requestedContentPositionUs;
        } else {
            j = playbackInfo.positionUs;
        }
        long j4 = j;
        if (seekPosition != null) {
            i2 = -1;
            android.util.Pair<java.lang.Object, java.lang.Long> resolveSeekPositionUs = resolveSeekPositionUs(timeline, seekPosition, true, i, z, window, period);
            if (resolveSeekPositionUs == null) {
                i5 = timeline.getFirstWindowIndex(z);
                j2 = j4;
                z6 = false;
                z7 = false;
                z8 = true;
            } else {
                if (seekPosition.windowPositionUs == -9223372036854775807L) {
                    i5 = timeline.getPeriodByUid(resolveSeekPositionUs.first, period).windowIndex;
                    j2 = j4;
                    z6 = false;
                } else {
                    obj = resolveSeekPositionUs.first;
                    j2 = ((java.lang.Long) resolveSeekPositionUs.second).longValue();
                    z6 = true;
                    i5 = -1;
                }
                z7 = playbackInfo.playbackState == 4;
                z8 = false;
            }
            z4 = z6;
            z2 = z7;
            z3 = z8;
            i3 = i5;
            mediaPeriodId = mediaPeriodId2;
        } else {
            i2 = -1;
            if (playbackInfo.timeline.isEmpty()) {
                i4 = timeline.getFirstWindowIndex(z);
            } else if (timeline.getIndexOfPeriod(obj) == -1) {
                int resolveSubsequentPeriod = resolveSubsequentPeriod(window, period, i, z, obj, playbackInfo.timeline, timeline);
                if (resolveSubsequentPeriod == -1) {
                    resolveSubsequentPeriod = timeline.getFirstWindowIndex(z);
                    z5 = true;
                } else {
                    z5 = false;
                }
                i3 = resolveSubsequentPeriod;
                z3 = z5;
                j2 = j4;
                mediaPeriodId = mediaPeriodId2;
                z2 = false;
                z4 = false;
            } else if (j4 == -9223372036854775807L) {
                i4 = timeline.getPeriodByUid(obj, period).windowIndex;
            } else if (isUsingPlaceholderPeriod) {
                mediaPeriodId = mediaPeriodId2;
                playbackInfo.timeline.getPeriodByUid(mediaPeriodId.periodUid, period);
                if (playbackInfo.timeline.getWindow(period.windowIndex, window).firstPeriodIndex == playbackInfo.timeline.getIndexOfPeriod(mediaPeriodId.periodUid)) {
                    android.util.Pair<java.lang.Object, java.lang.Long> periodPositionUs = timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(obj, period).windowIndex, j4 + period.getPositionInWindowUs());
                    obj = periodPositionUs.first;
                    j2 = ((java.lang.Long) periodPositionUs.second).longValue();
                } else {
                    j2 = j4;
                }
                i3 = -1;
                z2 = false;
                z3 = false;
                z4 = true;
            } else {
                mediaPeriodId = mediaPeriodId2;
                j2 = j4;
                i3 = -1;
                z2 = false;
                z3 = false;
                z4 = false;
            }
            i3 = i4;
            j2 = j4;
            mediaPeriodId = mediaPeriodId2;
            z2 = false;
            z3 = false;
            z4 = false;
        }
        if (i3 != i2) {
            android.util.Pair<java.lang.Object, java.lang.Long> periodPositionUs2 = timeline.getPeriodPositionUs(window, period, i3, -9223372036854775807L);
            obj = periodPositionUs2.first;
            j2 = ((java.lang.Long) periodPositionUs2.second).longValue();
            mediaPeriodQueue2 = mediaPeriodQueue;
            j3 = -9223372036854775807L;
        } else {
            mediaPeriodQueue2 = mediaPeriodQueue;
            j3 = j2;
        }
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange = mediaPeriodQueue2.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(timeline, obj, j2);
        boolean z9 = mediaPeriodId.periodUid.equals(obj) && !mediaPeriodId.isAd() && !resolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd() && (resolveMediaPeriodIdForAdsAfterPeriodPositionChange.nextAdGroupIndex == i2 || (mediaPeriodId.nextAdGroupIndex != i2 && resolveMediaPeriodIdForAdsAfterPeriodPositionChange.nextAdGroupIndex >= mediaPeriodId.nextAdGroupIndex));
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId3 = mediaPeriodId;
        boolean isIgnorableServerSideAdInsertionPeriodChange = isIgnorableServerSideAdInsertionPeriodChange(isUsingPlaceholderPeriod, mediaPeriodId, j4, resolveMediaPeriodIdForAdsAfterPeriodPositionChange, timeline.getPeriodByUid(obj, period), j3);
        if (z9 || isIgnorableServerSideAdInsertionPeriodChange) {
            resolveMediaPeriodIdForAdsAfterPeriodPositionChange = mediaPeriodId3;
        }
        if (resolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd()) {
            if (resolveMediaPeriodIdForAdsAfterPeriodPositionChange.equals(mediaPeriodId3)) {
                j2 = playbackInfo.positionUs;
            } else {
                timeline.getPeriodByUid(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.periodUid, period);
                j2 = resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adIndexInAdGroup == period.getFirstAdIndexToPlay(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adGroupIndex) ? period.getAdResumePositionUs() : 0L;
            }
        }
        return new androidx.media3.exoplayer.ExoPlayerImplInternal.PositionUpdateForPlaylistChange(resolveMediaPeriodIdForAdsAfterPeriodPositionChange, j2, j3, z2, z3, z4);
    }

    private static boolean isIgnorableServerSideAdInsertionPeriodChange(boolean z, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId2, androidx.media3.common.Timeline.Period period, long j2) {
        if (!z && j == j2 && mediaPeriodId.periodUid.equals(mediaPeriodId2.periodUid)) {
            return (mediaPeriodId.isAd() && period.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex)) ? (period.getAdState(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup) == 4 || period.getAdState(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup) == 2) ? false : true : mediaPeriodId2.isAd() && period.isServerSideInsertedAdGroup(mediaPeriodId2.adGroupIndex);
        }
        return false;
    }

    private static boolean isUsingPlaceholderPeriod(androidx.media3.exoplayer.PlaybackInfo playbackInfo, androidx.media3.common.Timeline.Period period) {
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
        androidx.media3.common.Timeline timeline = playbackInfo.timeline;
        return timeline.isEmpty() || timeline.getPeriodByUid(mediaPeriodId.periodUid, period).isPlaceholder;
    }

    private void updateRebufferingState(boolean z, boolean z2) {
        this.isRebuffering = z;
        this.lastRebufferRealtimeMs = (!z || z2) ? -9223372036854775807L : this.clock.elapsedRealtime();
    }

    private static boolean resolvePendingMessagePosition(androidx.media3.exoplayer.ExoPlayerImplInternal.PendingMessageInfo pendingMessageInfo, androidx.media3.common.Timeline timeline, androidx.media3.common.Timeline timeline2, int i, boolean z, androidx.media3.common.Timeline.Window window, androidx.media3.common.Timeline.Period period) {
        if (pendingMessageInfo.resolvedPeriodUid == null) {
            android.util.Pair<java.lang.Object, java.lang.Long> resolveSeekPositionUs = resolveSeekPositionUs(timeline, new androidx.media3.exoplayer.ExoPlayerImplInternal.SeekPosition(pendingMessageInfo.message.getTimeline(), pendingMessageInfo.message.getMediaItemIndex(), pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE ? -9223372036854775807L : androidx.media3.common.util.Util.msToUs(pendingMessageInfo.message.getPositionMs())), false, i, z, window, period);
            if (resolveSeekPositionUs == null) {
                return false;
            }
            pendingMessageInfo.setResolvedPosition(timeline.getIndexOfPeriod(resolveSeekPositionUs.first), ((java.lang.Long) resolveSeekPositionUs.second).longValue(), resolveSeekPositionUs.first);
            if (pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE) {
                resolvePendingMessageEndOfStreamPosition(timeline, pendingMessageInfo, window, period);
            }
            return true;
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(pendingMessageInfo.resolvedPeriodUid);
        if (indexOfPeriod == -1) {
            return false;
        }
        if (pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE) {
            resolvePendingMessageEndOfStreamPosition(timeline, pendingMessageInfo, window, period);
            return true;
        }
        pendingMessageInfo.resolvedPeriodIndex = indexOfPeriod;
        timeline2.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, period);
        if (period.isPlaceholder && timeline2.getWindow(period.windowIndex, window).firstPeriodIndex == timeline2.getIndexOfPeriod(pendingMessageInfo.resolvedPeriodUid)) {
            android.util.Pair<java.lang.Object, java.lang.Long> periodPositionUs = timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, period).windowIndex, pendingMessageInfo.resolvedPeriodTimeUs + period.getPositionInWindowUs());
            pendingMessageInfo.setResolvedPosition(timeline.getIndexOfPeriod(periodPositionUs.first), ((java.lang.Long) periodPositionUs.second).longValue(), periodPositionUs.first);
        }
        return true;
    }

    private static void resolvePendingMessageEndOfStreamPosition(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.ExoPlayerImplInternal.PendingMessageInfo pendingMessageInfo, androidx.media3.common.Timeline.Window window, androidx.media3.common.Timeline.Period period) {
        int i = timeline.getWindow(timeline.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, period).windowIndex, window).lastPeriodIndex;
        pendingMessageInfo.setResolvedPosition(i, period.durationUs != -9223372036854775807L ? period.durationUs - 1 : Long.MAX_VALUE, timeline.getPeriod(i, period, true).uid);
    }

    private static android.util.Pair<java.lang.Object, java.lang.Long> resolveSeekPositionUs(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.ExoPlayerImplInternal.SeekPosition seekPosition, boolean z, int i, boolean z2, androidx.media3.common.Timeline.Window window, androidx.media3.common.Timeline.Period period) {
        android.util.Pair<java.lang.Object, java.lang.Long> periodPositionUs;
        int resolveSubsequentPeriod;
        androidx.media3.common.Timeline timeline2 = seekPosition.timeline;
        if (timeline.isEmpty()) {
            return null;
        }
        androidx.media3.common.Timeline timeline3 = timeline2.isEmpty() ? timeline : timeline2;
        try {
            periodPositionUs = timeline3.getPeriodPositionUs(window, period, seekPosition.windowIndex, seekPosition.windowPositionUs);
        } catch (java.lang.IndexOutOfBoundsException unused) {
        }
        if (timeline.equals(timeline3)) {
            return periodPositionUs;
        }
        if (timeline.getIndexOfPeriod(periodPositionUs.first) != -1) {
            return (timeline3.getPeriodByUid(periodPositionUs.first, period).isPlaceholder && timeline3.getWindow(period.windowIndex, window).firstPeriodIndex == timeline3.getIndexOfPeriod(periodPositionUs.first)) ? timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(periodPositionUs.first, period).windowIndex, seekPosition.windowPositionUs) : periodPositionUs;
        }
        if (z && (resolveSubsequentPeriod = resolveSubsequentPeriod(window, period, i, z2, periodPositionUs.first, timeline3, timeline)) != -1) {
            return timeline.getPeriodPositionUs(window, period, resolveSubsequentPeriod, -9223372036854775807L);
        }
        return null;
    }

    static int resolveSubsequentPeriod(androidx.media3.common.Timeline.Window window, androidx.media3.common.Timeline.Period period, int i, boolean z, java.lang.Object obj, androidx.media3.common.Timeline timeline, androidx.media3.common.Timeline timeline2) {
        java.lang.Object obj2 = timeline.getWindow(timeline.getPeriodByUid(obj, period).windowIndex, window).uid;
        for (int i2 = 0; i2 < timeline2.getWindowCount(); i2++) {
            if (timeline2.getWindow(i2, window).uid.equals(obj2)) {
                return i2;
            }
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(obj);
        int periodCount = timeline.getPeriodCount();
        int i3 = indexOfPeriod;
        int i4 = -1;
        for (int i5 = 0; i5 < periodCount && i4 == -1; i5++) {
            i3 = timeline.getNextPeriodIndex(i3, period, window, i, z);
            if (i3 == -1) {
                break;
            }
            i4 = timeline2.getIndexOfPeriod(timeline.getUidOfPeriod(i3));
        }
        if (i4 == -1) {
            return -1;
        }
        return timeline2.getPeriod(i4, period).windowIndex;
    }

    private static androidx.media3.common.Format[] getFormats(androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection) {
        int length = exoTrackSelection != null ? exoTrackSelection.length() : 0;
        androidx.media3.common.Format[] formatArr = new androidx.media3.common.Format[length];
        for (int i = 0; i < length; i++) {
            formatArr[i] = exoTrackSelection.getFormat(i);
        }
        return formatArr;
    }

    private static boolean isRendererEnabled(androidx.media3.exoplayer.Renderer renderer) {
        return renderer.getState() != 0;
    }

    private static final class SeekPosition {
        public final androidx.media3.common.Timeline timeline;
        public final int windowIndex;
        public final long windowPositionUs;

        public SeekPosition(androidx.media3.common.Timeline timeline, int i, long j) {
            this.timeline = timeline;
            this.windowIndex = i;
            this.windowPositionUs = j;
        }
    }

    private static final class PositionUpdateForPlaylistChange {
        public final boolean endPlayback;
        public final boolean forceBufferingState;
        public final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId periodId;
        public final long periodPositionUs;
        public final long requestedContentPositionUs;
        public final boolean setTargetLiveOffset;

        public PositionUpdateForPlaylistChange(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.periodId = mediaPeriodId;
            this.periodPositionUs = j;
            this.requestedContentPositionUs = j2;
            this.forceBufferingState = z;
            this.endPlayback = z2;
            this.setTargetLiveOffset = z3;
        }
    }

    private static final class PendingMessageInfo implements java.lang.Comparable<androidx.media3.exoplayer.ExoPlayerImplInternal.PendingMessageInfo> {
        public final androidx.media3.exoplayer.PlayerMessage message;
        public int resolvedPeriodIndex;
        public long resolvedPeriodTimeUs;
        public java.lang.Object resolvedPeriodUid;

        public PendingMessageInfo(androidx.media3.exoplayer.PlayerMessage playerMessage) {
            this.message = playerMessage;
        }

        public void setResolvedPosition(int i, long j, java.lang.Object obj) {
            this.resolvedPeriodIndex = i;
            this.resolvedPeriodTimeUs = j;
            this.resolvedPeriodUid = obj;
        }

        @Override // java.lang.Comparable
        public int compareTo(androidx.media3.exoplayer.ExoPlayerImplInternal.PendingMessageInfo pendingMessageInfo) {
            java.lang.Object obj = this.resolvedPeriodUid;
            if ((obj == null) != (pendingMessageInfo.resolvedPeriodUid == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.resolvedPeriodIndex - pendingMessageInfo.resolvedPeriodIndex;
            return i != 0 ? i : androidx.media3.common.util.Util.compareLong(this.resolvedPeriodTimeUs, pendingMessageInfo.resolvedPeriodTimeUs);
        }
    }

    private static final class MediaSourceListUpdateMessage {
        private final java.util.List<androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder> mediaSourceHolders;
        private final long positionUs;
        private final androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder;
        private final int windowIndex;

        private MediaSourceListUpdateMessage(java.util.List<androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder> list, androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder, int i, long j) {
            this.mediaSourceHolders = list;
            this.shuffleOrder = shuffleOrder;
            this.windowIndex = i;
            this.positionUs = j;
        }
    }

    private static class MoveMediaItemsMessage {
        public final int fromIndex;
        public final int newFromIndex;
        public final androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder;
        public final int toIndex;

        public MoveMediaItemsMessage(int i, int i2, int i3, androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
            this.fromIndex = i;
            this.toIndex = i2;
            this.newFromIndex = i3;
            this.shuffleOrder = shuffleOrder;
        }
    }
}
