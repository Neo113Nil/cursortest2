package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
final class ExoPlayerImplInternal implements android.os.Handler.Callback, com.google.android.exoplayer2.source.MediaPeriod.Callback, com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener, com.google.android.exoplayer2.MediaSourceList.MediaSourceListInfoRefreshListener, com.google.android.exoplayer2.DefaultMediaClock.PlaybackParametersListener, com.google.android.exoplayer2.PlayerMessage.Sender {
    private static final int ACTIVE_INTERVAL_MS = 10;
    private static final int IDLE_INTERVAL_MS = 1000;
    private static final int MSG_ADD_MEDIA_SOURCES = 18;
    private static final int MSG_ATTEMPT_RENDERER_ERROR_RECOVERY = 25;
    private static final int MSG_DO_SOME_WORK = 2;
    private static final int MSG_MOVE_MEDIA_SOURCES = 19;
    private static final int MSG_PERIOD_PREPARED = 8;
    private static final int MSG_PLAYBACK_PARAMETERS_CHANGED_INTERNAL = 16;
    private static final int MSG_PLAYLIST_UPDATE_REQUESTED = 22;
    private static final int MSG_PREPARE = 0;
    private static final int MSG_RELEASE = 7;
    private static final int MSG_REMOVE_MEDIA_SOURCES = 20;
    private static final int MSG_SEEK_TO = 3;
    private static final int MSG_SEND_MESSAGE = 14;
    private static final int MSG_SEND_MESSAGE_TO_TARGET_THREAD = 15;
    private static final int MSG_SET_FOREGROUND_MODE = 13;
    private static final int MSG_SET_MEDIA_SOURCES = 17;
    private static final int MSG_SET_OFFLOAD_SCHEDULING_ENABLED = 24;
    private static final int MSG_SET_PAUSE_AT_END_OF_WINDOW = 23;
    private static final int MSG_SET_PLAYBACK_PARAMETERS = 4;
    private static final int MSG_SET_PLAY_WHEN_READY = 1;
    private static final int MSG_SET_REPEAT_MODE = 11;
    private static final int MSG_SET_SEEK_PARAMETERS = 5;
    private static final int MSG_SET_SHUFFLE_ENABLED = 12;
    private static final int MSG_SET_SHUFFLE_ORDER = 21;
    private static final int MSG_SOURCE_CONTINUE_LOADING_REQUESTED = 9;
    private static final int MSG_STOP = 6;
    private static final int MSG_TRACK_SELECTION_INVALIDATED = 10;
    private static final long PLAYBACK_BUFFER_EMPTY_THRESHOLD_US = 500000;
    private static final long PLAYBACK_STUCK_AFTER_MS = 4000;
    private static final java.lang.String TAG = "ExoPlayerImplInternal";
    private final long backBufferDurationUs;
    private final com.google.android.exoplayer2.upstream.BandwidthMeter bandwidthMeter;
    private final com.google.android.exoplayer2.util.Clock clock;
    private boolean deliverPendingMessageAtStartPositionRequired;
    private final com.google.android.exoplayer2.trackselection.TrackSelectorResult emptyTrackSelectorResult;
    private int enabledRendererCount;
    private boolean foregroundMode;
    private final com.google.android.exoplayer2.util.HandlerWrapper handler;
    private final android.os.HandlerThread internalPlaybackThread;
    private boolean isRebuffering;
    private final com.google.android.exoplayer2.LivePlaybackSpeedControl livePlaybackSpeedControl;
    private final com.google.android.exoplayer2.LoadControl loadControl;
    private final com.google.android.exoplayer2.DefaultMediaClock mediaClock;
    private final com.google.android.exoplayer2.MediaSourceList mediaSourceList;
    private int nextPendingMessageIndexHint;
    private boolean offloadSchedulingEnabled;
    private boolean pauseAtEndOfWindow;
    private com.google.android.exoplayer2.ExoPlayerImplInternal.SeekPosition pendingInitialSeekPosition;
    private final java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo> pendingMessages;
    private boolean pendingPauseAtEndOfPeriod;
    private com.google.android.exoplayer2.ExoPlaybackException pendingRecoverableRendererError;
    private final com.google.android.exoplayer2.Timeline.Period period;
    private com.google.android.exoplayer2.PlaybackInfo playbackInfo;
    private com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate;
    private final com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdateListener playbackInfoUpdateListener;
    private final android.os.Looper playbackLooper;
    private long playbackMaybeBecameStuckAtMs = -9223372036854775807L;
    private final com.google.android.exoplayer2.MediaPeriodQueue queue;
    private final long releaseTimeoutMs;
    private boolean released;
    private final com.google.android.exoplayer2.RendererCapabilities[] rendererCapabilities;
    private long rendererPositionUs;
    private final com.google.android.exoplayer2.Renderer[] renderers;
    private final java.util.Set<com.google.android.exoplayer2.Renderer> renderersToReset;
    private int repeatMode;
    private boolean requestForRendererSleep;
    private final boolean retainBackBufferFromKeyframe;
    private com.google.android.exoplayer2.SeekParameters seekParameters;
    private long setForegroundModeTimeoutMs;
    private boolean shouldContinueLoading;
    private boolean shuffleModeEnabled;
    private final com.google.android.exoplayer2.trackselection.TrackSelector trackSelector;
    private final com.google.android.exoplayer2.Timeline.Window window;

    public interface PlaybackInfoUpdateListener {
        void onPlaybackInfoUpdate(com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate);
    }

    public static final class PlaybackInfoUpdate {
        public int discontinuityReason;
        private boolean hasPendingChange;
        public boolean hasPlayWhenReadyChangeReason;
        public int operationAcks;
        public int playWhenReadyChangeReason;
        public com.google.android.exoplayer2.PlaybackInfo playbackInfo;
        public boolean positionDiscontinuity;

        public PlaybackInfoUpdate(com.google.android.exoplayer2.PlaybackInfo playbackInfo) {
            this.playbackInfo = playbackInfo;
        }

        public void incrementPendingOperationAcks(int i) {
            this.hasPendingChange |= i > 0;
            this.operationAcks += i;
        }

        public void setPlaybackInfo(com.google.android.exoplayer2.PlaybackInfo playbackInfo) {
            this.hasPendingChange |= this.playbackInfo != playbackInfo;
            this.playbackInfo = playbackInfo;
        }

        public void setPositionDiscontinuity(int i) {
            if (this.positionDiscontinuity && this.discontinuityReason != 5) {
                com.google.android.exoplayer2.util.Assertions.checkArgument(i == 5);
                return;
            }
            this.hasPendingChange = true;
            this.positionDiscontinuity = true;
            this.discontinuityReason = i;
        }

        public void setPlayWhenReadyChangeReason(int i) {
            this.hasPendingChange = true;
            this.hasPlayWhenReadyChangeReason = true;
            this.playWhenReadyChangeReason = i;
        }
    }

    public ExoPlayerImplInternal(com.google.android.exoplayer2.Renderer[] rendererArr, com.google.android.exoplayer2.trackselection.TrackSelector trackSelector, com.google.android.exoplayer2.trackselection.TrackSelectorResult trackSelectorResult, com.google.android.exoplayer2.LoadControl loadControl, com.google.android.exoplayer2.upstream.BandwidthMeter bandwidthMeter, int i, boolean z, com.google.android.exoplayer2.analytics.AnalyticsCollector analyticsCollector, com.google.android.exoplayer2.SeekParameters seekParameters, com.google.android.exoplayer2.LivePlaybackSpeedControl livePlaybackSpeedControl, long j, boolean z2, android.os.Looper looper, com.google.android.exoplayer2.util.Clock clock, com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdateListener playbackInfoUpdateListener, com.google.android.exoplayer2.analytics.PlayerId playerId) {
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
        this.clock = clock;
        this.backBufferDurationUs = loadControl.getBackBufferDurationUs();
        this.retainBackBufferFromKeyframe = loadControl.retainBackBufferFromKeyframe();
        com.google.android.exoplayer2.PlaybackInfo createDummy = com.google.android.exoplayer2.PlaybackInfo.createDummy(trackSelectorResult);
        this.playbackInfo = createDummy;
        this.playbackInfoUpdate = new com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdate(createDummy);
        this.rendererCapabilities = new com.google.android.exoplayer2.RendererCapabilities[rendererArr.length];
        for (int i2 = 0; i2 < rendererArr.length; i2++) {
            rendererArr[i2].init(i2, playerId);
            this.rendererCapabilities[i2] = rendererArr[i2].getCapabilities();
        }
        this.mediaClock = new com.google.android.exoplayer2.DefaultMediaClock(this, clock);
        this.pendingMessages = new java.util.ArrayList<>();
        this.renderersToReset = com.google.common.collect.Sets.newIdentityHashSet();
        this.window = new com.google.android.exoplayer2.Timeline.Window();
        this.period = new com.google.android.exoplayer2.Timeline.Period();
        trackSelector.init(this, bandwidthMeter);
        this.deliverPendingMessageAtStartPositionRequired = true;
        android.os.Handler handler = new android.os.Handler(looper);
        this.queue = new com.google.android.exoplayer2.MediaPeriodQueue(analyticsCollector, handler);
        this.mediaSourceList = new com.google.android.exoplayer2.MediaSourceList(this, analyticsCollector, handler, playerId);
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExoPlayer:Playback", -16);
        this.internalPlaybackThread = handlerThread;
        handlerThread.start();
        android.os.Looper looper2 = handlerThread.getLooper();
        this.playbackLooper = looper2;
        this.handler = clock.createHandler(looper2, this);
    }

    public void experimentalSetForegroundModeTimeoutMs(long j) {
        this.setForegroundModeTimeoutMs = j;
    }

    public void experimentalSetOffloadSchedulingEnabled(boolean z) {
        this.handler.obtainMessage(24, z ? 1 : 0, 0).sendToTarget();
    }

    public void prepare() {
        this.handler.obtainMessage(0).sendToTarget();
    }

    public void setPlayWhenReady(boolean z, int i) {
        this.handler.obtainMessage(1, z ? 1 : 0, i).sendToTarget();
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

    public void seekTo(com.google.android.exoplayer2.Timeline timeline, int i, long j) {
        this.handler.obtainMessage(3, new com.google.android.exoplayer2.ExoPlayerImplInternal.SeekPosition(timeline, i, j)).sendToTarget();
    }

    public void setPlaybackParameters(com.google.android.exoplayer2.PlaybackParameters playbackParameters) {
        this.handler.obtainMessage(4, playbackParameters).sendToTarget();
    }

    public void setSeekParameters(com.google.android.exoplayer2.SeekParameters seekParameters) {
        this.handler.obtainMessage(5, seekParameters).sendToTarget();
    }

    public void stop() {
        this.handler.obtainMessage(6).sendToTarget();
    }

    public void setMediaSources(java.util.List<com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder> list, int i, long j, com.google.android.exoplayer2.source.ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(17, new com.google.android.exoplayer2.ExoPlayerImplInternal.MediaSourceListUpdateMessage(list, shuffleOrder, i, j)).sendToTarget();
    }

    public void addMediaSources(int i, java.util.List<com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder> list, com.google.android.exoplayer2.source.ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(18, i, 0, new com.google.android.exoplayer2.ExoPlayerImplInternal.MediaSourceListUpdateMessage(list, shuffleOrder, -1, -9223372036854775807L)).sendToTarget();
    }

    public void removeMediaSources(int i, int i2, com.google.android.exoplayer2.source.ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(20, i, i2, shuffleOrder).sendToTarget();
    }

    public void moveMediaSources(int i, int i2, int i3, com.google.android.exoplayer2.source.ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(19, new com.google.android.exoplayer2.ExoPlayerImplInternal.MoveMediaItemsMessage(i, i2, i3, shuffleOrder)).sendToTarget();
    }

    public void setShuffleOrder(com.google.android.exoplayer2.source.ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(21, shuffleOrder).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.PlayerMessage.Sender
    public synchronized void sendMessage(com.google.android.exoplayer2.PlayerMessage playerMessage) {
        if (!this.released && this.internalPlaybackThread.isAlive()) {
            this.handler.obtainMessage(14, playerMessage).sendToTarget();
            return;
        }
        com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring messages sent after release.");
        playerMessage.markAsProcessed(false);
    }

    public synchronized boolean setForegroundMode(boolean z) {
        if (!this.released && this.internalPlaybackThread.isAlive()) {
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
        if (!this.released && this.internalPlaybackThread.isAlive()) {
            this.handler.sendEmptyMessage(7);
            waitUninterruptibly(new com.google.common.base.Supplier() { // from class: com.google.android.exoplayer2.ExoPlayerImplInternal$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return com.google.android.exoplayer2.ExoPlayerImplInternal.this.m5372x37739a9a();
                }
            }, this.releaseTimeoutMs);
            return this.released;
        }
        return true;
    }

    /* renamed from: lambda$release$0$com-google-android-exoplayer2-ExoPlayerImplInternal, reason: not valid java name */
    /* synthetic */ java.lang.Boolean m5372x37739a9a() {
        return java.lang.Boolean.valueOf(this.released);
    }

    public android.os.Looper getPlaybackLooper() {
        return this.playbackLooper;
    }

    @Override // com.google.android.exoplayer2.MediaSourceList.MediaSourceListInfoRefreshListener
    public void onPlaylistUpdateRequested() {
        this.handler.sendEmptyMessage(22);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    public void onPrepared(com.google.android.exoplayer2.source.MediaPeriod mediaPeriod) {
        this.handler.obtainMessage(8, mediaPeriod).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(com.google.android.exoplayer2.source.MediaPeriod mediaPeriod) {
        this.handler.obtainMessage(9, mediaPeriod).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener
    public void onTrackSelectionsInvalidated() {
        this.handler.sendEmptyMessage(10);
    }

    @Override // com.google.android.exoplayer2.DefaultMediaClock.PlaybackParametersListener
    public void onPlaybackParametersChanged(com.google.android.exoplayer2.PlaybackParameters playbackParameters) {
        this.handler.obtainMessage(16, playbackParameters).sendToTarget();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        com.google.android.exoplayer2.MediaPeriodHolder readingPeriod;
        try {
            switch (message.what) {
                case 0:
                    prepareInternal();
                    break;
                case 1:
                    setPlayWhenReadyInternal(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    doSomeWork();
                    break;
                case 3:
                    seekToInternal((com.google.android.exoplayer2.ExoPlayerImplInternal.SeekPosition) message.obj);
                    break;
                case 4:
                    setPlaybackParametersInternal((com.google.android.exoplayer2.PlaybackParameters) message.obj);
                    break;
                case 5:
                    setSeekParametersInternal((com.google.android.exoplayer2.SeekParameters) message.obj);
                    break;
                case 6:
                    stopInternal(false, true);
                    break;
                case 7:
                    releaseInternal();
                    return true;
                case 8:
                    handlePeriodPrepared((com.google.android.exoplayer2.source.MediaPeriod) message.obj);
                    break;
                case 9:
                    handleContinueLoadingRequested((com.google.android.exoplayer2.source.MediaPeriod) message.obj);
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
                    sendMessageInternal((com.google.android.exoplayer2.PlayerMessage) message.obj);
                    break;
                case 15:
                    sendMessageToTargetThread((com.google.android.exoplayer2.PlayerMessage) message.obj);
                    break;
                case 16:
                    handlePlaybackParameters((com.google.android.exoplayer2.PlaybackParameters) message.obj, false);
                    break;
                case 17:
                    setMediaItemsInternal((com.google.android.exoplayer2.ExoPlayerImplInternal.MediaSourceListUpdateMessage) message.obj);
                    break;
                case 18:
                    addMediaItemsInternal((com.google.android.exoplayer2.ExoPlayerImplInternal.MediaSourceListUpdateMessage) message.obj, message.arg1);
                    break;
                case 19:
                    moveMediaItemsInternal((com.google.android.exoplayer2.ExoPlayerImplInternal.MoveMediaItemsMessage) message.obj);
                    break;
                case 20:
                    removeMediaItemsInternal(message.arg1, message.arg2, (com.google.android.exoplayer2.source.ShuffleOrder) message.obj);
                    break;
                case 21:
                    setShuffleOrderInternal((com.google.android.exoplayer2.source.ShuffleOrder) message.obj);
                    break;
                case 22:
                    mediaSourceListUpdateRequestedInternal();
                    break;
                case 23:
                    setPauseAtEndOfWindowInternal(message.arg1 != 0);
                    break;
                case 24:
                    setOffloadSchedulingEnabledInternal(message.arg1 == 1);
                    break;
                case 25:
                    attemptRendererErrorRecovery();
                    break;
                default:
                    return false;
            }
        } catch (com.google.android.exoplayer2.ExoPlaybackException e) {
            e = e;
            if (e.type == 1 && (readingPeriod = this.queue.getReadingPeriod()) != null) {
                e = e.copyWithMediaPeriodId(readingPeriod.info.id);
            }
            if (e.isRecoverable && this.pendingRecoverableRendererError == null) {
                com.google.android.exoplayer2.util.Log.w(TAG, "Recoverable renderer error", e);
                this.pendingRecoverableRendererError = e;
                com.google.android.exoplayer2.util.HandlerWrapper handlerWrapper = this.handler;
                handlerWrapper.sendMessageAtFrontOfQueue(handlerWrapper.obtainMessage(25, e));
            } else {
                com.google.android.exoplayer2.ExoPlaybackException exoPlaybackException = this.pendingRecoverableRendererError;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.pendingRecoverableRendererError;
                }
                com.google.android.exoplayer2.util.Log.e(TAG, "Playback error", e);
                stopInternal(true, false);
                this.playbackInfo = this.playbackInfo.copyWithPlaybackError(e);
            }
        } catch (com.google.android.exoplayer2.ParserException e2) {
            if (e2.dataType == 1) {
                r2 = e2.contentIsMalformed ? 3001 : 3003;
            } else if (e2.dataType == 4) {
                r2 = e2.contentIsMalformed ? 3002 : 3004;
            }
            handleIoException(e2, r2);
        } catch (com.google.android.exoplayer2.drm.DrmSession.DrmSessionException e3) {
            handleIoException(e3, e3.errorCode);
        } catch (com.google.android.exoplayer2.source.BehindLiveWindowException e4) {
            handleIoException(e4, 1002);
        } catch (com.google.android.exoplayer2.upstream.DataSourceException e5) {
            handleIoException(e5, e5.reason);
        } catch (java.io.IOException e6) {
            handleIoException(e6, 2000);
        } catch (java.lang.RuntimeException e7) {
            com.google.android.exoplayer2.ExoPlaybackException createForUnexpected = com.google.android.exoplayer2.ExoPlaybackException.createForUnexpected(e7, ((e7 instanceof java.lang.IllegalStateException) || (e7 instanceof java.lang.IllegalArgumentException)) ? 1004 : 1000);
            com.google.android.exoplayer2.util.Log.e(TAG, "Playback error", createForUnexpected);
            stopInternal(true, false);
            this.playbackInfo = this.playbackInfo.copyWithPlaybackError(createForUnexpected);
        }
        maybeNotifyPlaybackInfoChanged();
        return true;
    }

    private void handleIoException(java.io.IOException iOException, int i) {
        com.google.android.exoplayer2.ExoPlaybackException createForSource = com.google.android.exoplayer2.ExoPlaybackException.createForSource(iOException, i);
        com.google.android.exoplayer2.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod != null) {
            createForSource = createForSource.copyWithMediaPeriodId(playingPeriod.info.id);
        }
        com.google.android.exoplayer2.util.Log.e(TAG, "Playback error", createForSource);
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
            this.playbackInfoUpdate = new com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdate(this.playbackInfo);
        }
    }

    private void prepareInternal() {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        resetInternal(false, false, false, true);
        this.loadControl.onPrepared();
        setState(this.playbackInfo.timeline.isEmpty() ? 4 : 2);
        this.mediaSourceList.prepare(this.bandwidthMeter.getTransferListener());
        this.handler.sendEmptyMessage(2);
    }

    private void setMediaItemsInternal(com.google.android.exoplayer2.ExoPlayerImplInternal.MediaSourceListUpdateMessage mediaSourceListUpdateMessage) throws com.google.android.exoplayer2.ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        if (mediaSourceListUpdateMessage.windowIndex != -1) {
            this.pendingInitialSeekPosition = new com.google.android.exoplayer2.ExoPlayerImplInternal.SeekPosition(new com.google.android.exoplayer2.PlaylistTimeline(mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), mediaSourceListUpdateMessage.windowIndex, mediaSourceListUpdateMessage.positionUs);
        }
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.setMediaSources(mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), false);
    }

    private void addMediaItemsInternal(com.google.android.exoplayer2.ExoPlayerImplInternal.MediaSourceListUpdateMessage mediaSourceListUpdateMessage, int i) throws com.google.android.exoplayer2.ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        com.google.android.exoplayer2.MediaSourceList mediaSourceList = this.mediaSourceList;
        if (i == -1) {
            i = mediaSourceList.getSize();
        }
        handleMediaSourceListInfoRefreshed(mediaSourceList.addMediaSources(i, mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), false);
    }

    private void moveMediaItemsInternal(com.google.android.exoplayer2.ExoPlayerImplInternal.MoveMediaItemsMessage moveMediaItemsMessage) throws com.google.android.exoplayer2.ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.moveMediaSourceRange(moveMediaItemsMessage.fromIndex, moveMediaItemsMessage.toIndex, moveMediaItemsMessage.newFromIndex, moveMediaItemsMessage.shuffleOrder), false);
    }

    private void removeMediaItemsInternal(int i, int i2, com.google.android.exoplayer2.source.ShuffleOrder shuffleOrder) throws com.google.android.exoplayer2.ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.removeMediaSourceRange(i, i2, shuffleOrder), false);
    }

    private void mediaSourceListUpdateRequestedInternal() throws com.google.android.exoplayer2.ExoPlaybackException {
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.createTimeline(), true);
    }

    private void setShuffleOrderInternal(com.google.android.exoplayer2.source.ShuffleOrder shuffleOrder) throws com.google.android.exoplayer2.ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.setShuffleOrder(shuffleOrder), false);
    }

    private void notifyTrackSelectionPlayWhenReadyChanged(boolean z) {
        for (com.google.android.exoplayer2.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (com.google.android.exoplayer2.trackselection.ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlayWhenReadyChanged(z);
                }
            }
        }
    }

    private void setPlayWhenReadyInternal(boolean z, int i, boolean z2, int i2) throws com.google.android.exoplayer2.ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(z2 ? 1 : 0);
        this.playbackInfoUpdate.setPlayWhenReadyChangeReason(i2);
        this.playbackInfo = this.playbackInfo.copyWithPlayWhenReady(z, i);
        this.isRebuffering = false;
        notifyTrackSelectionPlayWhenReadyChanged(z);
        if (!shouldPlayWhenReady()) {
            stopRenderers();
            updatePlaybackPositions();
        } else if (this.playbackInfo.playbackState == 3) {
            startRenderers();
            this.handler.sendEmptyMessage(2);
        } else if (this.playbackInfo.playbackState == 2) {
            this.handler.sendEmptyMessage(2);
        }
    }

    private void setPauseAtEndOfWindowInternal(boolean z) throws com.google.android.exoplayer2.ExoPlaybackException {
        this.pauseAtEndOfWindow = z;
        resetPendingPauseAtEndOfPeriod();
        if (!this.pendingPauseAtEndOfPeriod || this.queue.getReadingPeriod() == this.queue.getPlayingPeriod()) {
            return;
        }
        seekToCurrentPosition(true);
        handleLoadingMediaPeriodChanged(false);
    }

    private void setOffloadSchedulingEnabledInternal(boolean z) {
        if (z == this.offloadSchedulingEnabled) {
            return;
        }
        this.offloadSchedulingEnabled = z;
        if (z || !this.playbackInfo.sleepingForOffload) {
            return;
        }
        this.handler.sendEmptyMessage(2);
    }

    private void setRepeatModeInternal(int i) throws com.google.android.exoplayer2.ExoPlaybackException {
        this.repeatMode = i;
        if (!this.queue.updateRepeatMode(this.playbackInfo.timeline, i)) {
            seekToCurrentPosition(true);
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void setShuffleModeEnabledInternal(boolean z) throws com.google.android.exoplayer2.ExoPlaybackException {
        this.shuffleModeEnabled = z;
        if (!this.queue.updateShuffleModeEnabled(this.playbackInfo.timeline, z)) {
            seekToCurrentPosition(true);
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void seekToCurrentPosition(boolean z) throws com.google.android.exoplayer2.ExoPlaybackException {
        com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId = this.queue.getPlayingPeriod().info.id;
        long seekToPeriodPosition = seekToPeriodPosition(mediaPeriodId, this.playbackInfo.positionUs, true, false);
        if (seekToPeriodPosition != this.playbackInfo.positionUs) {
            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, seekToPeriodPosition, this.playbackInfo.requestedContentPositionUs, this.playbackInfo.discontinuityStartPositionUs, z, 5);
        }
    }

    private void startRenderers() throws com.google.android.exoplayer2.ExoPlaybackException {
        this.isRebuffering = false;
        this.mediaClock.start();
        for (com.google.android.exoplayer2.Renderer renderer : this.renderers) {
            if (isRendererEnabled(renderer)) {
                renderer.start();
            }
        }
    }

    private void stopRenderers() throws com.google.android.exoplayer2.ExoPlaybackException {
        this.mediaClock.stop();
        for (com.google.android.exoplayer2.Renderer renderer : this.renderers) {
            if (isRendererEnabled(renderer)) {
                ensureStopped(renderer);
            }
        }
    }

    private void attemptRendererErrorRecovery() throws com.google.android.exoplayer2.ExoPlaybackException {
        seekToCurrentPosition(true);
    }

    private void updatePlaybackPositions() throws com.google.android.exoplayer2.ExoPlaybackException {
        com.google.android.exoplayer2.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null) {
            return;
        }
        long readDiscontinuity = playingPeriod.prepared ? playingPeriod.mediaPeriod.readDiscontinuity() : -9223372036854775807L;
        if (readDiscontinuity != -9223372036854775807L) {
            resetRendererPosition(readDiscontinuity);
            if (readDiscontinuity != this.playbackInfo.positionUs) {
                this.playbackInfo = handlePositionDiscontinuity(this.playbackInfo.periodId, readDiscontinuity, this.playbackInfo.requestedContentPositionUs, readDiscontinuity, true, 5);
            }
        } else {
            long syncAndGetPositionUs = this.mediaClock.syncAndGetPositionUs(playingPeriod != this.queue.getReadingPeriod());
            this.rendererPositionUs = syncAndGetPositionUs;
            long periodTime = playingPeriod.toPeriodTime(syncAndGetPositionUs);
            maybeTriggerPendingMessages(this.playbackInfo.positionUs, periodTime);
            this.playbackInfo.positionUs = periodTime;
        }
        this.playbackInfo.bufferedPositionUs = this.queue.getLoadingPeriod().getBufferedPositionUs();
        this.playbackInfo.totalBufferedDurationUs = getTotalBufferedDurationUs();
        if (this.playbackInfo.playWhenReady && this.playbackInfo.playbackState == 3 && shouldUseLivePlaybackSpeedControl(this.playbackInfo.timeline, this.playbackInfo.periodId) && this.playbackInfo.playbackParameters.speed == 1.0f) {
            float adjustedPlaybackSpeed = this.livePlaybackSpeedControl.getAdjustedPlaybackSpeed(getCurrentLiveOffsetUs(), getTotalBufferedDurationUs());
            if (this.mediaClock.getPlaybackParameters().speed != adjustedPlaybackSpeed) {
                this.mediaClock.setPlaybackParameters(this.playbackInfo.playbackParameters.withSpeed(adjustedPlaybackSpeed));
                handlePlaybackParameters(this.playbackInfo.playbackParameters, this.mediaClock.getPlaybackParameters().speed, false, false);
            }
        }
    }

    private void notifyTrackSelectionRebuffer() {
        for (com.google.android.exoplayer2.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (com.google.android.exoplayer2.trackselection.ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onRebuffer();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void doSomeWork() throws com.google.android.exoplayer2.ExoPlaybackException, java.io.IOException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        long uptimeMillis = this.clock.uptimeMillis();
        this.handler.removeMessages(2);
        updatePeriods();
        if (this.playbackInfo.playbackState == 1 || this.playbackInfo.playbackState == 4) {
            return;
        }
        com.google.android.exoplayer2.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null) {
            scheduleNextWork(uptimeMillis, 10L);
            return;
        }
        com.google.android.exoplayer2.util.TraceUtil.beginSection("doSomeWork");
        updatePlaybackPositions();
        if (playingPeriod.prepared) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() * 1000;
            playingPeriod.mediaPeriod.discardBuffer(this.playbackInfo.positionUs - this.backBufferDurationUs, this.retainBackBufferFromKeyframe);
            int i = 0;
            z = true;
            z2 = true;
            while (true) {
                com.google.android.exoplayer2.Renderer[] rendererArr = this.renderers;
                if (i >= rendererArr.length) {
                    break;
                }
                com.google.android.exoplayer2.Renderer renderer = rendererArr[i];
                if (isRendererEnabled(renderer)) {
                    renderer.render(this.rendererPositionUs, elapsedRealtime);
                    z = z && renderer.isEnded();
                    boolean z5 = playingPeriod.sampleStreams[i] != renderer.getStream();
                    boolean z6 = z5 || (!z5 && renderer.hasReadStreamToEnd()) || renderer.isReady() || renderer.isEnded();
                    z2 = z2 && z6;
                    if (!z6) {
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
        boolean z7 = z && playingPeriod.prepared && (j == -9223372036854775807L || j <= this.playbackInfo.positionUs);
        if (z7 && this.pendingPauseAtEndOfPeriod) {
            this.pendingPauseAtEndOfPeriod = false;
            setPlayWhenReadyInternal(false, this.playbackInfo.playbackSuppressionReason, false, 5);
        }
        if (z7 && playingPeriod.info.isFinal) {
            setState(4);
            stopRenderers();
        } else if (this.playbackInfo.playbackState == 2 && shouldTransitionToReadyState(z2)) {
            setState(3);
            this.pendingRecoverableRendererError = null;
            if (shouldPlayWhenReady()) {
                startRenderers();
            }
        } else if (this.playbackInfo.playbackState == 3 && (this.enabledRendererCount != 0 ? !z2 : !isTimelineReady())) {
            this.isRebuffering = shouldPlayWhenReady();
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
                com.google.android.exoplayer2.Renderer[] rendererArr2 = this.renderers;
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
                z3 = !shouldPlayWhenReady() && this.playbackInfo.playbackState == 3;
                z4 = !this.offloadSchedulingEnabled && this.requestForRendererSleep && z3;
                if (this.playbackInfo.sleepingForOffload != z4) {
                    this.playbackInfo = this.playbackInfo.copyWithSleepingForOffload(z4);
                }
                this.requestForRendererSleep = false;
                if (!z4 && this.playbackInfo.playbackState != 4) {
                    if (!z3 || this.playbackInfo.playbackState == 2) {
                        scheduleNextWork(uptimeMillis, 10L);
                    } else if (this.playbackInfo.playbackState == 3 && this.enabledRendererCount != 0) {
                        scheduleNextWork(uptimeMillis, 1000L);
                    }
                }
                com.google.android.exoplayer2.util.TraceUtil.endSection();
            }
        }
        this.playbackMaybeBecameStuckAtMs = -9223372036854775807L;
        if (shouldPlayWhenReady()) {
        }
        if (this.offloadSchedulingEnabled) {
        }
        if (this.playbackInfo.sleepingForOffload != z4) {
        }
        this.requestForRendererSleep = false;
        if (!z4) {
            if (!z3) {
            }
            scheduleNextWork(uptimeMillis, 10L);
        }
        com.google.android.exoplayer2.util.TraceUtil.endSection();
    }

    private long getCurrentLiveOffsetUs() {
        return getLiveOffsetUs(this.playbackInfo.timeline, this.playbackInfo.periodId.periodUid, this.playbackInfo.positionUs);
    }

    private long getLiveOffsetUs(com.google.android.exoplayer2.Timeline timeline, java.lang.Object obj, long j) {
        timeline.getWindow(timeline.getPeriodByUid(obj, this.period).windowIndex, this.window);
        if (this.window.windowStartTimeMs != -9223372036854775807L && this.window.isLive() && this.window.isDynamic) {
            return com.google.android.exoplayer2.util.Util.msToUs(this.window.getCurrentUnixTimeMs() - this.window.windowStartTimeMs) - (j + this.period.getPositionInWindowUs());
        }
        return -9223372036854775807L;
    }

    private boolean shouldUseLivePlaybackSpeedControl(com.google.android.exoplayer2.Timeline timeline, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        if (mediaPeriodId.isAd() || timeline.isEmpty()) {
            return false;
        }
        timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, this.window);
        return this.window.isLive() && this.window.isDynamic && this.window.windowStartTimeMs != -9223372036854775807L;
    }

    private void scheduleNextWork(long j, long j2) {
        this.handler.sendEmptyMessageAtTime(2, j + j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ab A[Catch: all -> 0x0152, TryCatch #0 {all -> 0x0152, blocks: (B:6:0x00a1, B:8:0x00ab, B:15:0x00b1, B:17:0x00b7, B:18:0x00ba, B:19:0x00c0, B:21:0x00ca, B:23:0x00d2, B:27:0x00da, B:28:0x00e4, B:30:0x00f4, B:32:0x00fb, B:34:0x0102, B:37:0x0116, B:40:0x011f), top: B:5:0x00a1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void seekToInternal(com.google.android.exoplayer2.ExoPlayerImplInternal.SeekPosition seekPosition) throws com.google.android.exoplayer2.ExoPlaybackException {
        long longValue;
        long j;
        boolean z;
        com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId;
        long adResumePositionUs;
        long j2;
        long j3;
        long j4;
        long j5;
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        android.util.Pair<java.lang.Object, java.lang.Long> resolveSeekPositionUs = resolveSeekPositionUs(this.playbackInfo.timeline, seekPosition, true, this.repeatMode, this.shuffleModeEnabled, this.window, this.period);
        try {
            if (resolveSeekPositionUs == null) {
                android.util.Pair<com.google.android.exoplayer2.source.MediaSource.MediaPeriodId, java.lang.Long> placeholderFirstMediaPeriodPositionUs = getPlaceholderFirstMediaPeriodPositionUs(this.playbackInfo.timeline);
                mediaPeriodId = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) placeholderFirstMediaPeriodPositionUs.first;
                longValue = ((java.lang.Long) placeholderFirstMediaPeriodPositionUs.second).longValue();
                z = !this.playbackInfo.timeline.isEmpty();
                j = -9223372036854775807L;
            } else {
                java.lang.Object obj = resolveSeekPositionUs.first;
                longValue = ((java.lang.Long) resolveSeekPositionUs.second).longValue();
                long j6 = seekPosition.windowPositionUs == -9223372036854775807L ? -9223372036854775807L : longValue;
                com.google.android.exoplayer2.source.MediaSource.MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange = this.queue.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(this.playbackInfo.timeline, obj, longValue);
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
                            com.google.android.exoplayer2.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
                            j4 = (playingPeriod == null || !playingPeriod.prepared || adResumePositionUs == 0) ? adResumePositionUs : playingPeriod.mediaPeriod.getAdjustedSeekPositionUs(adResumePositionUs, this.seekParameters);
                            if (com.google.android.exoplayer2.util.Util.usToMs(j4) == com.google.android.exoplayer2.util.Util.usToMs(this.playbackInfo.positionUs) && (this.playbackInfo.playbackState == 2 || this.playbackInfo.playbackState == 3)) {
                                long j7 = this.playbackInfo.positionUs;
                                this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j7, j2, j7, z, 2);
                                return;
                            }
                        } else {
                            j4 = adResumePositionUs;
                        }
                        long seekToPeriodPosition = seekToPeriodPosition(mediaPeriodId, j4, this.playbackInfo.playbackState == 4);
                        boolean z2 = (adResumePositionUs != seekToPeriodPosition) | z;
                        try {
                            updatePlaybackSpeedSettingsForNewPeriod(this.playbackInfo.timeline, mediaPeriodId, this.playbackInfo.timeline, this.playbackInfo.periodId, j2);
                            z = z2;
                            j5 = seekToPeriodPosition;
                            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j5, j2, j5, z, 2);
                            return;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            z = z2;
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

    private long seekToPeriodPosition(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z) throws com.google.android.exoplayer2.ExoPlaybackException {
        return seekToPeriodPosition(mediaPeriodId, j, this.queue.getPlayingPeriod() != this.queue.getReadingPeriod(), z);
    }

    private long seekToPeriodPosition(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z, boolean z2) throws com.google.android.exoplayer2.ExoPlaybackException {
        stopRenderers();
        this.isRebuffering = false;
        if (z2 || this.playbackInfo.playbackState == 3) {
            setState(2);
        }
        com.google.android.exoplayer2.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        com.google.android.exoplayer2.MediaPeriodHolder mediaPeriodHolder = playingPeriod;
        while (mediaPeriodHolder != null && !mediaPeriodId.equals(mediaPeriodHolder.info.id)) {
            mediaPeriodHolder = mediaPeriodHolder.getNext();
        }
        if (z || playingPeriod != mediaPeriodHolder || (mediaPeriodHolder != null && mediaPeriodHolder.toRendererTime(j) < 0)) {
            for (com.google.android.exoplayer2.Renderer renderer : this.renderers) {
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

    private void resetRendererPosition(long j) throws com.google.android.exoplayer2.ExoPlaybackException {
        com.google.android.exoplayer2.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long rendererTime = playingPeriod == null ? j + 1000000000000L : playingPeriod.toRendererTime(j);
        this.rendererPositionUs = rendererTime;
        this.mediaClock.resetPosition(rendererTime);
        for (com.google.android.exoplayer2.Renderer renderer : this.renderers) {
            if (isRendererEnabled(renderer)) {
                renderer.resetPosition(this.rendererPositionUs);
            }
        }
        notifyTrackSelectionDiscontinuity();
    }

    private void setPlaybackParametersInternal(com.google.android.exoplayer2.PlaybackParameters playbackParameters) throws com.google.android.exoplayer2.ExoPlaybackException {
        this.mediaClock.setPlaybackParameters(playbackParameters);
        handlePlaybackParameters(this.mediaClock.getPlaybackParameters(), true);
    }

    private void setSeekParametersInternal(com.google.android.exoplayer2.SeekParameters seekParameters) {
        this.seekParameters = seekParameters;
    }

    private void setForegroundModeInternal(boolean z, java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
        if (this.foregroundMode != z) {
            this.foregroundMode = z;
            if (!z) {
                for (com.google.android.exoplayer2.Renderer renderer : this.renderers) {
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
        this.loadControl.onStopped();
        setState(1);
    }

    private void releaseInternal() {
        resetInternal(true, false, true, false);
        this.loadControl.onReleased();
        setState(1);
        this.internalPlaybackThread.quit();
        synchronized (this) {
            this.released = true;
            notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void resetInternal(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId;
        long j2;
        long j3;
        boolean z5;
        this.handler.removeMessages(2);
        this.pendingRecoverableRendererError = null;
        this.isRebuffering = false;
        this.mediaClock.stop();
        this.rendererPositionUs = 1000000000000L;
        for (com.google.android.exoplayer2.Renderer renderer : this.renderers) {
            try {
                disableRenderer(renderer);
            } catch (com.google.android.exoplayer2.ExoPlaybackException | java.lang.RuntimeException e) {
                com.google.android.exoplayer2.util.Log.e(TAG, "Disable failed.", e);
            }
        }
        if (z) {
            for (com.google.android.exoplayer2.Renderer renderer2 : this.renderers) {
                if (this.renderersToReset.remove(renderer2)) {
                    try {
                        renderer2.reset();
                    } catch (java.lang.RuntimeException e2) {
                        com.google.android.exoplayer2.util.Log.e(TAG, "Reset failed.", e2);
                    }
                }
            }
        }
        this.enabledRendererCount = 0;
        com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId2 = this.playbackInfo.periodId;
        long j4 = this.playbackInfo.positionUs;
        if (this.playbackInfo.periodId.isAd() || isUsingPlaceholderPeriod(this.playbackInfo, this.period)) {
            j = this.playbackInfo.requestedContentPositionUs;
        } else {
            j = this.playbackInfo.positionUs;
        }
        if (z2) {
            this.pendingInitialSeekPosition = null;
            android.util.Pair<com.google.android.exoplayer2.source.MediaSource.MediaPeriodId, java.lang.Long> placeholderFirstMediaPeriodPositionUs = getPlaceholderFirstMediaPeriodPositionUs(this.playbackInfo.timeline);
            com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId3 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) placeholderFirstMediaPeriodPositionUs.first;
            long longValue = ((java.lang.Long) placeholderFirstMediaPeriodPositionUs.second).longValue();
            if (!mediaPeriodId3.equals(this.playbackInfo.periodId)) {
                z5 = true;
                mediaPeriodId = mediaPeriodId3;
                j2 = longValue;
                j3 = -9223372036854775807L;
                this.queue.clear();
                this.shouldContinueLoading = false;
                this.playbackInfo = new com.google.android.exoplayer2.PlaybackInfo(this.playbackInfo.timeline, mediaPeriodId, j3, j2, this.playbackInfo.playbackState, z4 ? null : this.playbackInfo.playbackError, false, !z5 ? com.google.android.exoplayer2.source.TrackGroupArray.EMPTY : this.playbackInfo.trackGroups, !z5 ? this.emptyTrackSelectorResult : this.playbackInfo.trackSelectorResult, !z5 ? com.google.common.collect.ImmutableList.of() : this.playbackInfo.staticMetadata, mediaPeriodId, this.playbackInfo.playWhenReady, this.playbackInfo.playbackSuppressionReason, this.playbackInfo.playbackParameters, j2, 0L, j2, false);
                if (z3) {
                    return;
                }
                this.mediaSourceList.release();
                return;
            }
            mediaPeriodId = mediaPeriodId3;
            j2 = longValue;
            j3 = -9223372036854775807L;
        } else {
            mediaPeriodId = mediaPeriodId2;
            j2 = j4;
            j3 = j;
        }
        z5 = false;
        this.queue.clear();
        this.shouldContinueLoading = false;
        this.playbackInfo = new com.google.android.exoplayer2.PlaybackInfo(this.playbackInfo.timeline, mediaPeriodId, j3, j2, this.playbackInfo.playbackState, z4 ? null : this.playbackInfo.playbackError, false, !z5 ? com.google.android.exoplayer2.source.TrackGroupArray.EMPTY : this.playbackInfo.trackGroups, !z5 ? this.emptyTrackSelectorResult : this.playbackInfo.trackSelectorResult, !z5 ? com.google.common.collect.ImmutableList.of() : this.playbackInfo.staticMetadata, mediaPeriodId, this.playbackInfo.playWhenReady, this.playbackInfo.playbackSuppressionReason, this.playbackInfo.playbackParameters, j2, 0L, j2, false);
        if (z3) {
        }
    }

    private android.util.Pair<com.google.android.exoplayer2.source.MediaSource.MediaPeriodId, java.lang.Long> getPlaceholderFirstMediaPeriodPositionUs(com.google.android.exoplayer2.Timeline timeline) {
        if (timeline.isEmpty()) {
            return android.util.Pair.create(com.google.android.exoplayer2.PlaybackInfo.getDummyPeriodForEmptyTimeline(), 0L);
        }
        android.util.Pair<java.lang.Object, java.lang.Long> periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, timeline.getFirstWindowIndex(this.shuffleModeEnabled), -9223372036854775807L);
        com.google.android.exoplayer2.source.MediaSource.MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange = this.queue.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(timeline, periodPositionUs.first, 0L);
        long longValue = ((java.lang.Long) periodPositionUs.second).longValue();
        if (resolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd()) {
            timeline.getPeriodByUid(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.periodUid, this.period);
            longValue = resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adIndexInAdGroup == this.period.getFirstAdIndexToPlay(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adGroupIndex) ? this.period.getAdResumePositionUs() : 0L;
        }
        return android.util.Pair.create(resolveMediaPeriodIdForAdsAfterPeriodPositionChange, java.lang.Long.valueOf(longValue));
    }

    private void sendMessageInternal(com.google.android.exoplayer2.PlayerMessage playerMessage) throws com.google.android.exoplayer2.ExoPlaybackException {
        if (playerMessage.getPositionMs() == -9223372036854775807L) {
            sendMessageToTarget(playerMessage);
            return;
        }
        if (this.playbackInfo.timeline.isEmpty()) {
            this.pendingMessages.add(new com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo(playerMessage));
            return;
        }
        com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo pendingMessageInfo = new com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo(playerMessage);
        if (resolvePendingMessagePosition(pendingMessageInfo, this.playbackInfo.timeline, this.playbackInfo.timeline, this.repeatMode, this.shuffleModeEnabled, this.window, this.period)) {
            this.pendingMessages.add(pendingMessageInfo);
            java.util.Collections.sort(this.pendingMessages);
        } else {
            playerMessage.markAsProcessed(false);
        }
    }

    private void sendMessageToTarget(com.google.android.exoplayer2.PlayerMessage playerMessage) throws com.google.android.exoplayer2.ExoPlaybackException {
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

    private void sendMessageToTargetThread(final com.google.android.exoplayer2.PlayerMessage playerMessage) {
        android.os.Looper looper = playerMessage.getLooper();
        if (!looper.getThread().isAlive()) {
            com.google.android.exoplayer2.util.Log.w("TAG", "Trying to send message on a dead thread.");
            playerMessage.markAsProcessed(false);
        } else {
            this.clock.createHandler(looper, null).post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.ExoPlayerImplInternal$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.exoplayer2.ExoPlayerImplInternal.this.m5373xacec0129(playerMessage);
                }
            });
        }
    }

    /* renamed from: lambda$sendMessageToTargetThread$1$com-google-android-exoplayer2-ExoPlayerImplInternal, reason: not valid java name */
    /* synthetic */ void m5373xacec0129(com.google.android.exoplayer2.PlayerMessage playerMessage) {
        try {
            deliverMessage(playerMessage);
        } catch (com.google.android.exoplayer2.ExoPlaybackException e) {
            com.google.android.exoplayer2.util.Log.e(TAG, "Unexpected error delivering message on external thread.", e);
            throw new java.lang.RuntimeException(e);
        }
    }

    private void deliverMessage(com.google.android.exoplayer2.PlayerMessage playerMessage) throws com.google.android.exoplayer2.ExoPlaybackException {
        if (playerMessage.isCanceled()) {
            return;
        }
        try {
            playerMessage.getTarget().handleMessage(playerMessage.getType(), playerMessage.getPayload());
        } finally {
            playerMessage.markAsProcessed(true);
        }
    }

    private void resolvePendingMessagePositions(com.google.android.exoplayer2.Timeline timeline, com.google.android.exoplayer2.Timeline timeline2) {
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
    private void maybeTriggerPendingMessages(long j, long j2) throws com.google.android.exoplayer2.ExoPlaybackException {
        com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo pendingMessageInfo;
        if (this.pendingMessages.isEmpty() || this.playbackInfo.periodId.isAd()) {
            return;
        }
        if (this.deliverPendingMessageAtStartPositionRequired) {
            j--;
            this.deliverPendingMessageAtStartPositionRequired = false;
        }
        int indexOfPeriod = this.playbackInfo.timeline.getIndexOfPeriod(this.playbackInfo.periodId.periodUid);
        int min = java.lang.Math.min(this.nextPendingMessageIndexHint, this.pendingMessages.size());
        com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo pendingMessageInfo2 = min > 0 ? this.pendingMessages.get(min - 1) : null;
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

    private void ensureStopped(com.google.android.exoplayer2.Renderer renderer) throws com.google.android.exoplayer2.ExoPlaybackException {
        if (renderer.getState() == 2) {
            renderer.stop();
        }
    }

    private void disableRenderer(com.google.android.exoplayer2.Renderer renderer) throws com.google.android.exoplayer2.ExoPlaybackException {
        if (isRendererEnabled(renderer)) {
            this.mediaClock.onRendererDisabled(renderer);
            ensureStopped(renderer);
            renderer.disable();
            this.enabledRendererCount--;
        }
    }

    private void reselectTracksInternal() throws com.google.android.exoplayer2.ExoPlaybackException {
        float f = this.mediaClock.getPlaybackParameters().speed;
        com.google.android.exoplayer2.MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        boolean z = true;
        for (com.google.android.exoplayer2.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null && playingPeriod.prepared; playingPeriod = playingPeriod.getNext()) {
            com.google.android.exoplayer2.trackselection.TrackSelectorResult selectTracks = playingPeriod.selectTracks(f, this.playbackInfo.timeline);
            if (selectTracks.isEquivalent(playingPeriod.getTrackSelectorResult())) {
                if (playingPeriod == readingPeriod) {
                    z = false;
                }
            } else {
                if (z) {
                    com.google.android.exoplayer2.MediaPeriodHolder playingPeriod2 = this.queue.getPlayingPeriod();
                    boolean removeAfter = this.queue.removeAfter(playingPeriod2);
                    boolean[] zArr = new boolean[this.renderers.length];
                    long applyTrackSelection = playingPeriod2.applyTrackSelection(selectTracks, this.playbackInfo.positionUs, removeAfter, zArr);
                    boolean z2 = (this.playbackInfo.playbackState == 4 || applyTrackSelection == this.playbackInfo.positionUs) ? false : true;
                    this.playbackInfo = handlePositionDiscontinuity(this.playbackInfo.periodId, applyTrackSelection, this.playbackInfo.requestedContentPositionUs, this.playbackInfo.discontinuityStartPositionUs, z2, 5);
                    if (z2) {
                        resetRendererPosition(applyTrackSelection);
                    }
                    boolean[] zArr2 = new boolean[this.renderers.length];
                    int i = 0;
                    while (true) {
                        com.google.android.exoplayer2.Renderer[] rendererArr = this.renderers;
                        if (i >= rendererArr.length) {
                            break;
                        }
                        com.google.android.exoplayer2.Renderer renderer = rendererArr[i];
                        zArr2[i] = isRendererEnabled(renderer);
                        com.google.android.exoplayer2.source.SampleStream sampleStream = playingPeriod2.sampleStreams[i];
                        if (zArr2[i]) {
                            if (sampleStream != renderer.getStream()) {
                                disableRenderer(renderer);
                            } else if (zArr[i]) {
                                renderer.resetPosition(this.rendererPositionUs);
                            }
                        }
                        i++;
                    }
                    enableRenderers(zArr2);
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
        for (com.google.android.exoplayer2.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (com.google.android.exoplayer2.trackselection.ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlaybackSpeed(f);
                }
            }
        }
    }

    private void notifyTrackSelectionDiscontinuity() {
        for (com.google.android.exoplayer2.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (com.google.android.exoplayer2.trackselection.ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
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
        long targetLiveOffsetUs = shouldUseLivePlaybackSpeedControl(this.playbackInfo.timeline, this.queue.getPlayingPeriod().info.id) ? this.livePlaybackSpeedControl.getTargetLiveOffsetUs() : -9223372036854775807L;
        com.google.android.exoplayer2.MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        return (loadingPeriod.isFullyBuffered() && loadingPeriod.info.isFinal) || (loadingPeriod.info.id.isAd() && !loadingPeriod.prepared) || this.loadControl.shouldStartPlayback(getTotalBufferedDurationUs(), this.mediaClock.getPlaybackParameters().speed, this.isRebuffering, targetLiveOffsetUs);
    }

    private boolean isTimelineReady() {
        com.google.android.exoplayer2.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long j = playingPeriod.info.durationUs;
        return playingPeriod.prepared && (j == -9223372036854775807L || this.playbackInfo.positionUs < j || !shouldPlayWhenReady());
    }

    private void handleMediaSourceListInfoRefreshed(com.google.android.exoplayer2.Timeline timeline, boolean z) throws com.google.android.exoplayer2.ExoPlaybackException {
        boolean z2;
        com.google.android.exoplayer2.ExoPlayerImplInternal.PositionUpdateForPlaylistChange resolvePositionForPlaylistChange = resolvePositionForPlaylistChange(timeline, this.playbackInfo, this.pendingInitialSeekPosition, this.queue, this.repeatMode, this.shuffleModeEnabled, this.window, this.period);
        com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId = resolvePositionForPlaylistChange.periodId;
        long j = resolvePositionForPlaylistChange.requestedContentPositionUs;
        boolean z3 = resolvePositionForPlaylistChange.forceBufferingState;
        long j2 = resolvePositionForPlaylistChange.periodPositionUs;
        boolean z4 = (this.playbackInfo.periodId.equals(mediaPeriodId) && j2 == this.playbackInfo.positionUs) ? false : true;
        com.google.android.exoplayer2.ExoPlayerImplInternal.SeekPosition seekPosition = null;
        try {
            if (resolvePositionForPlaylistChange.endPlayback) {
                if (this.playbackInfo.playbackState != 1) {
                    setState(4);
                }
                resetInternal(false, false, false, true);
            }
            try {
                if (z4) {
                    z2 = false;
                    if (!timeline.isEmpty()) {
                        for (com.google.android.exoplayer2.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
                            if (playingPeriod.info.id.equals(mediaPeriodId)) {
                                playingPeriod.info = this.queue.getUpdatedMediaPeriodInfo(timeline, playingPeriod.info);
                                playingPeriod.updateClipping();
                            }
                        }
                        j2 = seekToPeriodPosition(mediaPeriodId, j2, z3);
                    }
                } else {
                    try {
                        z2 = false;
                        if (!this.queue.updateQueuedPeriods(timeline, this.rendererPositionUs, getMaxRendererReadPositionUs())) {
                            seekToCurrentPosition(false);
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        seekPosition = null;
                        com.google.android.exoplayer2.ExoPlayerImplInternal.SeekPosition seekPosition2 = seekPosition;
                        updatePlaybackSpeedSettingsForNewPeriod(timeline, mediaPeriodId, this.playbackInfo.timeline, this.playbackInfo.periodId, resolvePositionForPlaylistChange.setTargetLiveOffset ? j2 : -9223372036854775807L);
                        if (z4 || j != this.playbackInfo.requestedContentPositionUs) {
                            java.lang.Object obj = this.playbackInfo.periodId.periodUid;
                            com.google.android.exoplayer2.Timeline timeline2 = this.playbackInfo.timeline;
                            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j2, j, this.playbackInfo.discontinuityStartPositionUs, z4 && z && !timeline2.isEmpty() && !timeline2.getPeriodByUid(obj, this.period).isPlaceholder, timeline.getIndexOfPeriod(obj) == -1 ? 4 : 3);
                        }
                        resetPendingPauseAtEndOfPeriod();
                        resolvePendingMessagePositions(timeline, this.playbackInfo.timeline);
                        this.playbackInfo = this.playbackInfo.copyWithTimeline(timeline);
                        if (!timeline.isEmpty()) {
                            this.pendingInitialSeekPosition = seekPosition2;
                        }
                        handleLoadingMediaPeriodChanged(false);
                        throw th;
                    }
                }
                updatePlaybackSpeedSettingsForNewPeriod(timeline, mediaPeriodId, this.playbackInfo.timeline, this.playbackInfo.periodId, resolvePositionForPlaylistChange.setTargetLiveOffset ? j2 : -9223372036854775807L);
                if (z4 || j != this.playbackInfo.requestedContentPositionUs) {
                    java.lang.Object obj2 = this.playbackInfo.periodId.periodUid;
                    com.google.android.exoplayer2.Timeline timeline3 = this.playbackInfo.timeline;
                    this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j2, j, this.playbackInfo.discontinuityStartPositionUs, z4 && z && !timeline3.isEmpty() && !timeline3.getPeriodByUid(obj2, this.period).isPlaceholder, timeline.getIndexOfPeriod(obj2) == -1 ? 4 : 3);
                }
                resetPendingPauseAtEndOfPeriod();
                resolvePendingMessagePositions(timeline, this.playbackInfo.timeline);
                this.playbackInfo = this.playbackInfo.copyWithTimeline(timeline);
                if (!timeline.isEmpty()) {
                    this.pendingInitialSeekPosition = null;
                }
                handleLoadingMediaPeriodChanged(z2);
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    private void updatePlaybackSpeedSettingsForNewPeriod(com.google.android.exoplayer2.Timeline timeline, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.Timeline timeline2, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId2, long j) {
        if (!shouldUseLivePlaybackSpeedControl(timeline, mediaPeriodId)) {
            com.google.android.exoplayer2.PlaybackParameters playbackParameters = mediaPeriodId.isAd() ? com.google.android.exoplayer2.PlaybackParameters.DEFAULT : this.playbackInfo.playbackParameters;
            if (this.mediaClock.getPlaybackParameters().equals(playbackParameters)) {
                return;
            }
            this.mediaClock.setPlaybackParameters(playbackParameters);
            return;
        }
        timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, this.window);
        this.livePlaybackSpeedControl.setLiveConfiguration((com.google.android.exoplayer2.MediaItem.LiveConfiguration) com.google.android.exoplayer2.util.Util.castNonNull(this.window.liveConfiguration));
        if (j != -9223372036854775807L) {
            this.livePlaybackSpeedControl.setTargetLiveOffsetOverrideUs(getLiveOffsetUs(timeline, mediaPeriodId.periodUid, j));
            return;
        }
        if (com.google.android.exoplayer2.util.Util.areEqual(!timeline2.isEmpty() ? timeline2.getWindow(timeline2.getPeriodByUid(mediaPeriodId2.periodUid, this.period).windowIndex, this.window).uid : null, this.window.uid)) {
            return;
        }
        this.livePlaybackSpeedControl.setTargetLiveOffsetOverrideUs(-9223372036854775807L);
    }

    private long getMaxRendererReadPositionUs() {
        com.google.android.exoplayer2.MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod == null) {
            return 0L;
        }
        long rendererOffset = readingPeriod.getRendererOffset();
        if (!readingPeriod.prepared) {
            return rendererOffset;
        }
        int i = 0;
        while (true) {
            com.google.android.exoplayer2.Renderer[] rendererArr = this.renderers;
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

    private void updatePeriods() throws com.google.android.exoplayer2.ExoPlaybackException, java.io.IOException {
        if (this.playbackInfo.timeline.isEmpty() || !this.mediaSourceList.isPrepared()) {
            return;
        }
        maybeUpdateLoadingPeriod();
        maybeUpdateReadingPeriod();
        maybeUpdateReadingRenderers();
        maybeUpdatePlayingPeriod();
    }

    private void maybeUpdateLoadingPeriod() throws com.google.android.exoplayer2.ExoPlaybackException {
        com.google.android.exoplayer2.MediaPeriodInfo nextMediaPeriodInfo;
        this.queue.reevaluateBuffer(this.rendererPositionUs);
        if (this.queue.shouldLoadNextMediaPeriod() && (nextMediaPeriodInfo = this.queue.getNextMediaPeriodInfo(this.rendererPositionUs, this.playbackInfo)) != null) {
            com.google.android.exoplayer2.MediaPeriodHolder enqueueNextMediaPeriodHolder = this.queue.enqueueNextMediaPeriodHolder(this.rendererCapabilities, this.trackSelector, this.loadControl.getAllocator(), this.mediaSourceList, nextMediaPeriodInfo, this.emptyTrackSelectorResult);
            enqueueNextMediaPeriodHolder.mediaPeriod.prepare(this, nextMediaPeriodInfo.startPositionUs);
            if (this.queue.getPlayingPeriod() == enqueueNextMediaPeriodHolder) {
                resetRendererPosition(nextMediaPeriodInfo.startPositionUs);
            }
            handleLoadingMediaPeriodChanged(false);
        }
        if (this.shouldContinueLoading) {
            this.shouldContinueLoading = isLoadingPossible();
            updateIsLoading();
        } else {
            maybeContinueLoading();
        }
    }

    private void maybeUpdateReadingPeriod() {
        com.google.android.exoplayer2.MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod == null) {
            return;
        }
        int i = 0;
        if (readingPeriod.getNext() == null || this.pendingPauseAtEndOfPeriod) {
            if (!readingPeriod.info.isFinal && !this.pendingPauseAtEndOfPeriod) {
                return;
            }
            while (true) {
                com.google.android.exoplayer2.Renderer[] rendererArr = this.renderers;
                if (i >= rendererArr.length) {
                    return;
                }
                com.google.android.exoplayer2.Renderer renderer = rendererArr[i];
                com.google.android.exoplayer2.source.SampleStream sampleStream = readingPeriod.sampleStreams[i];
                if (sampleStream != null && renderer.getStream() == sampleStream && renderer.hasReadStreamToEnd()) {
                    setCurrentStreamFinal(renderer, (readingPeriod.info.durationUs == -9223372036854775807L || readingPeriod.info.durationUs == Long.MIN_VALUE) ? -9223372036854775807L : readingPeriod.getRendererOffset() + readingPeriod.info.durationUs);
                }
                i++;
            }
        } else if (hasReadingPeriodFinishedReading()) {
            if (readingPeriod.getNext().prepared || this.rendererPositionUs >= readingPeriod.getNext().getStartPositionRendererTime()) {
                com.google.android.exoplayer2.trackselection.TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
                com.google.android.exoplayer2.MediaPeriodHolder advanceReadingPeriod = this.queue.advanceReadingPeriod();
                com.google.android.exoplayer2.trackselection.TrackSelectorResult trackSelectorResult2 = advanceReadingPeriod.getTrackSelectorResult();
                updatePlaybackSpeedSettingsForNewPeriod(this.playbackInfo.timeline, advanceReadingPeriod.info.id, this.playbackInfo.timeline, readingPeriod.info.id, -9223372036854775807L);
                if (advanceReadingPeriod.prepared && advanceReadingPeriod.mediaPeriod.readDiscontinuity() != -9223372036854775807L) {
                    setAllRendererStreamsFinal(advanceReadingPeriod.getStartPositionRendererTime());
                    return;
                }
                for (int i2 = 0; i2 < this.renderers.length; i2++) {
                    boolean isRendererEnabled = trackSelectorResult.isRendererEnabled(i2);
                    boolean isRendererEnabled2 = trackSelectorResult2.isRendererEnabled(i2);
                    if (isRendererEnabled && !this.renderers[i2].isCurrentStreamFinal()) {
                        boolean z = this.rendererCapabilities[i2].getTrackType() == -2;
                        com.google.android.exoplayer2.RendererConfiguration rendererConfiguration = trackSelectorResult.rendererConfigurations[i2];
                        com.google.android.exoplayer2.RendererConfiguration rendererConfiguration2 = trackSelectorResult2.rendererConfigurations[i2];
                        if (!isRendererEnabled2 || !rendererConfiguration2.equals(rendererConfiguration) || z) {
                            setCurrentStreamFinal(this.renderers[i2], advanceReadingPeriod.getStartPositionRendererTime());
                        }
                    }
                }
            }
        }
    }

    private void maybeUpdateReadingRenderers() throws com.google.android.exoplayer2.ExoPlaybackException {
        com.google.android.exoplayer2.MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod == null || this.queue.getPlayingPeriod() == readingPeriod || readingPeriod.allRenderersInCorrectState || !replaceStreamsOrDisableRendererForTransition()) {
            return;
        }
        enableRenderers();
    }

    private boolean replaceStreamsOrDisableRendererForTransition() throws com.google.android.exoplayer2.ExoPlaybackException {
        com.google.android.exoplayer2.MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        com.google.android.exoplayer2.trackselection.TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        int i = 0;
        boolean z = false;
        while (true) {
            com.google.android.exoplayer2.Renderer[] rendererArr = this.renderers;
            if (i >= rendererArr.length) {
                return !z;
            }
            com.google.android.exoplayer2.Renderer renderer = rendererArr[i];
            if (isRendererEnabled(renderer)) {
                boolean z2 = renderer.getStream() != readingPeriod.sampleStreams[i];
                if (!trackSelectorResult.isRendererEnabled(i) || z2) {
                    if (!renderer.isCurrentStreamFinal()) {
                        renderer.replaceStream(getFormats(trackSelectorResult.selections[i]), readingPeriod.sampleStreams[i], readingPeriod.getStartPositionRendererTime(), readingPeriod.getRendererOffset());
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

    private void maybeUpdatePlayingPeriod() throws com.google.android.exoplayer2.ExoPlaybackException {
        boolean z = false;
        while (shouldAdvancePlayingPeriod()) {
            if (z) {
                maybeNotifyPlaybackInfoChanged();
            }
            com.google.android.exoplayer2.MediaPeriodHolder mediaPeriodHolder = (com.google.android.exoplayer2.MediaPeriodHolder) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.queue.advancePlayingPeriod());
            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodHolder.info.id, mediaPeriodHolder.info.startPositionUs, mediaPeriodHolder.info.requestedContentPositionUs, mediaPeriodHolder.info.startPositionUs, !(this.playbackInfo.periodId.periodUid.equals(mediaPeriodHolder.info.id.periodUid) && this.playbackInfo.periodId.adGroupIndex == -1 && mediaPeriodHolder.info.id.adGroupIndex == -1 && this.playbackInfo.periodId.nextAdGroupIndex != mediaPeriodHolder.info.id.nextAdGroupIndex), 0);
            resetPendingPauseAtEndOfPeriod();
            updatePlaybackPositions();
            z = true;
        }
    }

    private void resetPendingPauseAtEndOfPeriod() {
        com.google.android.exoplayer2.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        this.pendingPauseAtEndOfPeriod = playingPeriod != null && playingPeriod.info.isLastInTimelineWindow && this.pauseAtEndOfWindow;
    }

    private boolean shouldAdvancePlayingPeriod() {
        com.google.android.exoplayer2.MediaPeriodHolder playingPeriod;
        com.google.android.exoplayer2.MediaPeriodHolder next;
        return shouldPlayWhenReady() && !this.pendingPauseAtEndOfPeriod && (playingPeriod = this.queue.getPlayingPeriod()) != null && (next = playingPeriod.getNext()) != null && this.rendererPositionUs >= next.getStartPositionRendererTime() && next.allRenderersInCorrectState;
    }

    private boolean hasReadingPeriodFinishedReading() {
        com.google.android.exoplayer2.MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (!readingPeriod.prepared) {
            return false;
        }
        int i = 0;
        while (true) {
            com.google.android.exoplayer2.Renderer[] rendererArr = this.renderers;
            if (i >= rendererArr.length) {
                return true;
            }
            com.google.android.exoplayer2.Renderer renderer = rendererArr[i];
            com.google.android.exoplayer2.source.SampleStream sampleStream = readingPeriod.sampleStreams[i];
            if (renderer.getStream() != sampleStream || (sampleStream != null && !renderer.hasReadStreamToEnd() && !hasReachedServerSideInsertedAdsTransition(renderer, readingPeriod))) {
                break;
            }
            i++;
        }
        return false;
    }

    private boolean hasReachedServerSideInsertedAdsTransition(com.google.android.exoplayer2.Renderer renderer, com.google.android.exoplayer2.MediaPeriodHolder mediaPeriodHolder) {
        com.google.android.exoplayer2.MediaPeriodHolder next = mediaPeriodHolder.getNext();
        return mediaPeriodHolder.info.isFollowedByTransitionToSameStream && next.prepared && ((renderer instanceof com.google.android.exoplayer2.text.TextRenderer) || (renderer instanceof com.google.android.exoplayer2.metadata.MetadataRenderer) || renderer.getReadingPositionUs() >= next.getStartPositionRendererTime());
    }

    private void setAllRendererStreamsFinal(long j) {
        for (com.google.android.exoplayer2.Renderer renderer : this.renderers) {
            if (renderer.getStream() != null) {
                setCurrentStreamFinal(renderer, j);
            }
        }
    }

    private void setCurrentStreamFinal(com.google.android.exoplayer2.Renderer renderer, long j) {
        renderer.setCurrentStreamFinal();
        if (renderer instanceof com.google.android.exoplayer2.text.TextRenderer) {
            ((com.google.android.exoplayer2.text.TextRenderer) renderer).setFinalStreamEndPositionUs(j);
        }
    }

    private void handlePeriodPrepared(com.google.android.exoplayer2.source.MediaPeriod mediaPeriod) throws com.google.android.exoplayer2.ExoPlaybackException {
        if (this.queue.isLoading(mediaPeriod)) {
            com.google.android.exoplayer2.MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
            loadingPeriod.handlePrepared(this.mediaClock.getPlaybackParameters().speed, this.playbackInfo.timeline);
            updateLoadControlTrackSelection(loadingPeriod.getTrackGroups(), loadingPeriod.getTrackSelectorResult());
            if (loadingPeriod == this.queue.getPlayingPeriod()) {
                resetRendererPosition(loadingPeriod.info.startPositionUs);
                enableRenderers();
                this.playbackInfo = handlePositionDiscontinuity(this.playbackInfo.periodId, loadingPeriod.info.startPositionUs, this.playbackInfo.requestedContentPositionUs, loadingPeriod.info.startPositionUs, false, 5);
            }
            maybeContinueLoading();
        }
    }

    private void handleContinueLoadingRequested(com.google.android.exoplayer2.source.MediaPeriod mediaPeriod) {
        if (this.queue.isLoading(mediaPeriod)) {
            this.queue.reevaluateBuffer(this.rendererPositionUs);
            maybeContinueLoading();
        }
    }

    private void handlePlaybackParameters(com.google.android.exoplayer2.PlaybackParameters playbackParameters, boolean z) throws com.google.android.exoplayer2.ExoPlaybackException {
        handlePlaybackParameters(playbackParameters, playbackParameters.speed, true, z);
    }

    private void handlePlaybackParameters(com.google.android.exoplayer2.PlaybackParameters playbackParameters, float f, boolean z, boolean z2) throws com.google.android.exoplayer2.ExoPlaybackException {
        if (z) {
            if (z2) {
                this.playbackInfoUpdate.incrementPendingOperationAcks(1);
            }
            this.playbackInfo = this.playbackInfo.copyWithPlaybackParameters(playbackParameters);
        }
        updateTrackSelectionPlaybackSpeed(playbackParameters.speed);
        for (com.google.android.exoplayer2.Renderer renderer : this.renderers) {
            if (renderer != null) {
                renderer.setPlaybackSpeed(f, playbackParameters.speed);
            }
        }
    }

    private void maybeContinueLoading() {
        boolean shouldContinueLoading = shouldContinueLoading();
        this.shouldContinueLoading = shouldContinueLoading;
        if (shouldContinueLoading) {
            this.queue.getLoadingPeriod().continueLoading(this.rendererPositionUs);
        }
        updateIsLoading();
    }

    private boolean shouldContinueLoading() {
        long periodTime;
        if (!isLoadingPossible()) {
            return false;
        }
        com.google.android.exoplayer2.MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        long totalBufferedDurationUs = getTotalBufferedDurationUs(loadingPeriod.getNextLoadPositionUs());
        if (loadingPeriod == this.queue.getPlayingPeriod()) {
            periodTime = loadingPeriod.toPeriodTime(this.rendererPositionUs);
        } else {
            periodTime = loadingPeriod.toPeriodTime(this.rendererPositionUs) - loadingPeriod.info.startPositionUs;
        }
        long j = periodTime;
        boolean shouldContinueLoading = this.loadControl.shouldContinueLoading(j, totalBufferedDurationUs, this.mediaClock.getPlaybackParameters().speed);
        if (shouldContinueLoading || totalBufferedDurationUs >= PLAYBACK_BUFFER_EMPTY_THRESHOLD_US) {
            return shouldContinueLoading;
        }
        if (this.backBufferDurationUs <= 0 && !this.retainBackBufferFromKeyframe) {
            return shouldContinueLoading;
        }
        this.queue.getPlayingPeriod().mediaPeriod.discardBuffer(this.playbackInfo.positionUs, false);
        return this.loadControl.shouldContinueLoading(j, totalBufferedDurationUs, this.mediaClock.getPlaybackParameters().speed);
    }

    private boolean isLoadingPossible() {
        com.google.android.exoplayer2.MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        return (loadingPeriod == null || loadingPeriod.getNextLoadPositionUs() == Long.MIN_VALUE) ? false : true;
    }

    private void updateIsLoading() {
        com.google.android.exoplayer2.MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        boolean z = this.shouldContinueLoading || (loadingPeriod != null && loadingPeriod.mediaPeriod.isLoading());
        if (z != this.playbackInfo.isLoading) {
            this.playbackInfo = this.playbackInfo.copyWithIsLoading(z);
        }
    }

    private com.google.android.exoplayer2.PlaybackInfo handlePositionDiscontinuity(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, long j3, boolean z, int i) {
        com.google.android.exoplayer2.source.TrackGroupArray trackGroupArray;
        com.google.android.exoplayer2.trackselection.TrackSelectorResult trackSelectorResult;
        java.util.List list;
        com.google.android.exoplayer2.source.TrackGroupArray trackGroups;
        com.google.android.exoplayer2.trackselection.TrackSelectorResult trackSelectorResult2;
        this.deliverPendingMessageAtStartPositionRequired = (!this.deliverPendingMessageAtStartPositionRequired && j == this.playbackInfo.positionUs && mediaPeriodId.equals(this.playbackInfo.periodId)) ? false : true;
        resetPendingPauseAtEndOfPeriod();
        com.google.android.exoplayer2.source.TrackGroupArray trackGroupArray2 = this.playbackInfo.trackGroups;
        com.google.android.exoplayer2.trackselection.TrackSelectorResult trackSelectorResult3 = this.playbackInfo.trackSelectorResult;
        java.util.List list2 = this.playbackInfo.staticMetadata;
        if (this.mediaSourceList.isPrepared()) {
            com.google.android.exoplayer2.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
            if (playingPeriod == null) {
                trackGroups = com.google.android.exoplayer2.source.TrackGroupArray.EMPTY;
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
            trackGroupArray = trackGroups;
            trackSelectorResult = trackSelectorResult2;
            list = extractMetadataFromTrackSelectionArray;
        } else {
            if (!mediaPeriodId.equals(this.playbackInfo.periodId)) {
                trackGroupArray2 = com.google.android.exoplayer2.source.TrackGroupArray.EMPTY;
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

    private com.google.common.collect.ImmutableList<com.google.android.exoplayer2.metadata.Metadata> extractMetadataFromTrackSelectionArray(com.google.android.exoplayer2.trackselection.ExoTrackSelection[] exoTrackSelectionArr) {
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        boolean z = false;
        for (com.google.android.exoplayer2.trackselection.ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
            if (exoTrackSelection != null) {
                com.google.android.exoplayer2.Format format = exoTrackSelection.getFormat(0);
                if (format.metadata == null) {
                    builder.add((com.google.common.collect.ImmutableList.Builder) new com.google.android.exoplayer2.metadata.Metadata(new com.google.android.exoplayer2.metadata.Metadata.Entry[0]));
                } else {
                    builder.add((com.google.common.collect.ImmutableList.Builder) format.metadata);
                    z = true;
                }
            }
        }
        return z ? builder.build() : com.google.common.collect.ImmutableList.of();
    }

    private void enableRenderers() throws com.google.android.exoplayer2.ExoPlaybackException {
        enableRenderers(new boolean[this.renderers.length]);
    }

    private void enableRenderers(boolean[] zArr) throws com.google.android.exoplayer2.ExoPlaybackException {
        com.google.android.exoplayer2.MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        com.google.android.exoplayer2.trackselection.TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        for (int i = 0; i < this.renderers.length; i++) {
            if (!trackSelectorResult.isRendererEnabled(i) && this.renderersToReset.remove(this.renderers[i])) {
                this.renderers[i].reset();
            }
        }
        for (int i2 = 0; i2 < this.renderers.length; i2++) {
            if (trackSelectorResult.isRendererEnabled(i2)) {
                enableRenderer(i2, zArr[i2]);
            }
        }
        readingPeriod.allRenderersInCorrectState = true;
    }

    private void enableRenderer(int i, boolean z) throws com.google.android.exoplayer2.ExoPlaybackException {
        com.google.android.exoplayer2.Renderer renderer = this.renderers[i];
        if (isRendererEnabled(renderer)) {
            return;
        }
        com.google.android.exoplayer2.MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        boolean z2 = readingPeriod == this.queue.getPlayingPeriod();
        com.google.android.exoplayer2.trackselection.TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        com.google.android.exoplayer2.RendererConfiguration rendererConfiguration = trackSelectorResult.rendererConfigurations[i];
        com.google.android.exoplayer2.Format[] formats = getFormats(trackSelectorResult.selections[i]);
        boolean z3 = shouldPlayWhenReady() && this.playbackInfo.playbackState == 3;
        boolean z4 = !z && z3;
        this.enabledRendererCount++;
        this.renderersToReset.add(renderer);
        renderer.enable(rendererConfiguration, formats, readingPeriod.sampleStreams[i], this.rendererPositionUs, z4, z2, readingPeriod.getStartPositionRendererTime(), readingPeriod.getRendererOffset());
        renderer.handleMessage(11, new com.google.android.exoplayer2.Renderer.WakeupListener() { // from class: com.google.android.exoplayer2.ExoPlayerImplInternal.1
            @Override // com.google.android.exoplayer2.Renderer.WakeupListener
            public void onSleep() {
                com.google.android.exoplayer2.ExoPlayerImplInternal.this.requestForRendererSleep = true;
            }

            @Override // com.google.android.exoplayer2.Renderer.WakeupListener
            public void onWakeup() {
                com.google.android.exoplayer2.ExoPlayerImplInternal.this.handler.sendEmptyMessage(2);
            }
        });
        this.mediaClock.onRendererEnabled(renderer);
        if (z3) {
            renderer.start();
        }
    }

    private void handleLoadingMediaPeriodChanged(boolean z) {
        long bufferedPositionUs;
        com.google.android.exoplayer2.MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId = loadingPeriod == null ? this.playbackInfo.periodId : loadingPeriod.info.id;
        boolean z2 = !this.playbackInfo.loadingMediaPeriodId.equals(mediaPeriodId);
        if (z2) {
            this.playbackInfo = this.playbackInfo.copyWithLoadingMediaPeriodId(mediaPeriodId);
        }
        com.google.android.exoplayer2.PlaybackInfo playbackInfo = this.playbackInfo;
        if (loadingPeriod == null) {
            bufferedPositionUs = playbackInfo.positionUs;
        } else {
            bufferedPositionUs = loadingPeriod.getBufferedPositionUs();
        }
        playbackInfo.bufferedPositionUs = bufferedPositionUs;
        this.playbackInfo.totalBufferedDurationUs = getTotalBufferedDurationUs();
        if ((z2 || z) && loadingPeriod != null && loadingPeriod.prepared) {
            updateLoadControlTrackSelection(loadingPeriod.getTrackGroups(), loadingPeriod.getTrackSelectorResult());
        }
    }

    private long getTotalBufferedDurationUs() {
        return getTotalBufferedDurationUs(this.playbackInfo.bufferedPositionUs);
    }

    private long getTotalBufferedDurationUs(long j) {
        com.google.android.exoplayer2.MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        if (loadingPeriod == null) {
            return 0L;
        }
        return java.lang.Math.max(0L, j - loadingPeriod.toPeriodTime(this.rendererPositionUs));
    }

    private void updateLoadControlTrackSelection(com.google.android.exoplayer2.source.TrackGroupArray trackGroupArray, com.google.android.exoplayer2.trackselection.TrackSelectorResult trackSelectorResult) {
        this.loadControl.onTracksSelected(this.renderers, trackGroupArray, trackSelectorResult.selections);
    }

    private boolean shouldPlayWhenReady() {
        return this.playbackInfo.playWhenReady && this.playbackInfo.playbackSuppressionReason == 0;
    }

    private static com.google.android.exoplayer2.ExoPlayerImplInternal.PositionUpdateForPlaylistChange resolvePositionForPlaylistChange(com.google.android.exoplayer2.Timeline timeline, com.google.android.exoplayer2.PlaybackInfo playbackInfo, com.google.android.exoplayer2.ExoPlayerImplInternal.SeekPosition seekPosition, com.google.android.exoplayer2.MediaPeriodQueue mediaPeriodQueue, int i, boolean z, com.google.android.exoplayer2.Timeline.Window window, com.google.android.exoplayer2.Timeline.Period period) {
        long j;
        int i2;
        com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId;
        long j2;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        boolean z5;
        com.google.android.exoplayer2.MediaPeriodQueue mediaPeriodQueue2;
        long j3;
        boolean z6;
        int i6;
        boolean z7;
        boolean z8;
        if (timeline.isEmpty()) {
            return new com.google.android.exoplayer2.ExoPlayerImplInternal.PositionUpdateForPlaylistChange(com.google.android.exoplayer2.PlaybackInfo.getDummyPeriodForEmptyTimeline(), 0L, -9223372036854775807L, false, true, false);
        }
        com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId2 = playbackInfo.periodId;
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
                i6 = timeline.getFirstWindowIndex(z);
                j2 = j4;
                z6 = false;
                z7 = false;
                z8 = true;
            } else {
                if (seekPosition.windowPositionUs == -9223372036854775807L) {
                    i6 = timeline.getPeriodByUid(resolveSeekPositionUs.first, period).windowIndex;
                    j2 = j4;
                    z6 = false;
                } else {
                    obj = resolveSeekPositionUs.first;
                    j2 = ((java.lang.Long) resolveSeekPositionUs.second).longValue();
                    z6 = true;
                    i6 = -1;
                }
                z7 = playbackInfo.playbackState == 4;
                z8 = false;
            }
            z4 = z6;
            z2 = z7;
            z3 = z8;
            i3 = i6;
            mediaPeriodId = mediaPeriodId2;
        } else {
            i2 = -1;
            if (playbackInfo.timeline.isEmpty()) {
                i4 = timeline.getFirstWindowIndex(z);
            } else if (timeline.getIndexOfPeriod(obj) == -1) {
                java.lang.Object resolveSubsequentPeriod = resolveSubsequentPeriod(window, period, i, z, obj, playbackInfo.timeline, timeline);
                if (resolveSubsequentPeriod == null) {
                    i5 = timeline.getFirstWindowIndex(z);
                    z5 = true;
                } else {
                    i5 = timeline.getPeriodByUid(resolveSubsequentPeriod, period).windowIndex;
                    z5 = false;
                }
                i3 = i5;
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
        com.google.android.exoplayer2.source.MediaSource.MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange = mediaPeriodQueue2.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(timeline, obj, j2);
        boolean z9 = mediaPeriodId.periodUid.equals(obj) && !mediaPeriodId.isAd() && !resolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd() && (resolveMediaPeriodIdForAdsAfterPeriodPositionChange.nextAdGroupIndex == i2 || (mediaPeriodId.nextAdGroupIndex != i2 && resolveMediaPeriodIdForAdsAfterPeriodPositionChange.nextAdGroupIndex >= mediaPeriodId.nextAdGroupIndex));
        com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId3 = mediaPeriodId;
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
        return new com.google.android.exoplayer2.ExoPlayerImplInternal.PositionUpdateForPlaylistChange(resolveMediaPeriodIdForAdsAfterPeriodPositionChange, j2, j3, z2, z3, z4);
    }

    private static boolean isIgnorableServerSideAdInsertionPeriodChange(boolean z, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, long j, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId2, com.google.android.exoplayer2.Timeline.Period period, long j2) {
        if (!z && j == j2 && mediaPeriodId.periodUid.equals(mediaPeriodId2.periodUid)) {
            return (mediaPeriodId.isAd() && period.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex)) ? (period.getAdState(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup) == 4 || period.getAdState(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup) == 2) ? false : true : mediaPeriodId2.isAd() && period.isServerSideInsertedAdGroup(mediaPeriodId2.adGroupIndex);
        }
        return false;
    }

    private static boolean isUsingPlaceholderPeriod(com.google.android.exoplayer2.PlaybackInfo playbackInfo, com.google.android.exoplayer2.Timeline.Period period) {
        com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
        com.google.android.exoplayer2.Timeline timeline = playbackInfo.timeline;
        return timeline.isEmpty() || timeline.getPeriodByUid(mediaPeriodId.periodUid, period).isPlaceholder;
    }

    private static boolean resolvePendingMessagePosition(com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo pendingMessageInfo, com.google.android.exoplayer2.Timeline timeline, com.google.android.exoplayer2.Timeline timeline2, int i, boolean z, com.google.android.exoplayer2.Timeline.Window window, com.google.android.exoplayer2.Timeline.Period period) {
        if (pendingMessageInfo.resolvedPeriodUid == null) {
            android.util.Pair<java.lang.Object, java.lang.Long> resolveSeekPositionUs = resolveSeekPositionUs(timeline, new com.google.android.exoplayer2.ExoPlayerImplInternal.SeekPosition(pendingMessageInfo.message.getTimeline(), pendingMessageInfo.message.getMediaItemIndex(), pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE ? -9223372036854775807L : com.google.android.exoplayer2.util.Util.msToUs(pendingMessageInfo.message.getPositionMs())), false, i, z, window, period);
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

    private static void resolvePendingMessageEndOfStreamPosition(com.google.android.exoplayer2.Timeline timeline, com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo pendingMessageInfo, com.google.android.exoplayer2.Timeline.Window window, com.google.android.exoplayer2.Timeline.Period period) {
        int i = timeline.getWindow(timeline.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, period).windowIndex, window).lastPeriodIndex;
        pendingMessageInfo.setResolvedPosition(i, period.durationUs != -9223372036854775807L ? period.durationUs - 1 : Long.MAX_VALUE, timeline.getPeriod(i, period, true).uid);
    }

    private static android.util.Pair<java.lang.Object, java.lang.Long> resolveSeekPositionUs(com.google.android.exoplayer2.Timeline timeline, com.google.android.exoplayer2.ExoPlayerImplInternal.SeekPosition seekPosition, boolean z, int i, boolean z2, com.google.android.exoplayer2.Timeline.Window window, com.google.android.exoplayer2.Timeline.Period period) {
        android.util.Pair<java.lang.Object, java.lang.Long> periodPositionUs;
        java.lang.Object resolveSubsequentPeriod;
        com.google.android.exoplayer2.Timeline timeline2 = seekPosition.timeline;
        if (timeline.isEmpty()) {
            return null;
        }
        com.google.android.exoplayer2.Timeline timeline3 = timeline2.isEmpty() ? timeline : timeline2;
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
        if (z && (resolveSubsequentPeriod = resolveSubsequentPeriod(window, period, i, z2, periodPositionUs.first, timeline3, timeline)) != null) {
            return timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(resolveSubsequentPeriod, period).windowIndex, -9223372036854775807L);
        }
        return null;
    }

    static java.lang.Object resolveSubsequentPeriod(com.google.android.exoplayer2.Timeline.Window window, com.google.android.exoplayer2.Timeline.Period period, int i, boolean z, java.lang.Object obj, com.google.android.exoplayer2.Timeline timeline, com.google.android.exoplayer2.Timeline timeline2) {
        int indexOfPeriod = timeline.getIndexOfPeriod(obj);
        int periodCount = timeline.getPeriodCount();
        int i2 = indexOfPeriod;
        int i3 = -1;
        for (int i4 = 0; i4 < periodCount && i3 == -1; i4++) {
            i2 = timeline.getNextPeriodIndex(i2, period, window, i, z);
            if (i2 == -1) {
                break;
            }
            i3 = timeline2.getIndexOfPeriod(timeline.getUidOfPeriod(i2));
        }
        if (i3 == -1) {
            return null;
        }
        return timeline2.getUidOfPeriod(i3);
    }

    private static com.google.android.exoplayer2.Format[] getFormats(com.google.android.exoplayer2.trackselection.ExoTrackSelection exoTrackSelection) {
        int length = exoTrackSelection != null ? exoTrackSelection.length() : 0;
        com.google.android.exoplayer2.Format[] formatArr = new com.google.android.exoplayer2.Format[length];
        for (int i = 0; i < length; i++) {
            formatArr[i] = exoTrackSelection.getFormat(i);
        }
        return formatArr;
    }

    private static boolean isRendererEnabled(com.google.android.exoplayer2.Renderer renderer) {
        return renderer.getState() != 0;
    }

    private static final class SeekPosition {
        public final com.google.android.exoplayer2.Timeline timeline;
        public final int windowIndex;
        public final long windowPositionUs;

        public SeekPosition(com.google.android.exoplayer2.Timeline timeline, int i, long j) {
            this.timeline = timeline;
            this.windowIndex = i;
            this.windowPositionUs = j;
        }
    }

    private static final class PositionUpdateForPlaylistChange {
        public final boolean endPlayback;
        public final boolean forceBufferingState;
        public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId periodId;
        public final long periodPositionUs;
        public final long requestedContentPositionUs;
        public final boolean setTargetLiveOffset;

        public PositionUpdateForPlaylistChange(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.periodId = mediaPeriodId;
            this.periodPositionUs = j;
            this.requestedContentPositionUs = j2;
            this.forceBufferingState = z;
            this.endPlayback = z2;
            this.setTargetLiveOffset = z3;
        }
    }

    private static final class PendingMessageInfo implements java.lang.Comparable<com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo> {
        public final com.google.android.exoplayer2.PlayerMessage message;
        public int resolvedPeriodIndex;
        public long resolvedPeriodTimeUs;
        public java.lang.Object resolvedPeriodUid;

        public PendingMessageInfo(com.google.android.exoplayer2.PlayerMessage playerMessage) {
            this.message = playerMessage;
        }

        public void setResolvedPosition(int i, long j, java.lang.Object obj) {
            this.resolvedPeriodIndex = i;
            this.resolvedPeriodTimeUs = j;
            this.resolvedPeriodUid = obj;
        }

        @Override // java.lang.Comparable
        public int compareTo(com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo pendingMessageInfo) {
            java.lang.Object obj = this.resolvedPeriodUid;
            if ((obj == null) != (pendingMessageInfo.resolvedPeriodUid == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.resolvedPeriodIndex - pendingMessageInfo.resolvedPeriodIndex;
            return i != 0 ? i : com.google.android.exoplayer2.util.Util.compareLong(this.resolvedPeriodTimeUs, pendingMessageInfo.resolvedPeriodTimeUs);
        }
    }

    private static final class MediaSourceListUpdateMessage {
        private final java.util.List<com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder> mediaSourceHolders;
        private final long positionUs;
        private final com.google.android.exoplayer2.source.ShuffleOrder shuffleOrder;
        private final int windowIndex;

        private MediaSourceListUpdateMessage(java.util.List<com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder> list, com.google.android.exoplayer2.source.ShuffleOrder shuffleOrder, int i, long j) {
            this.mediaSourceHolders = list;
            this.shuffleOrder = shuffleOrder;
            this.windowIndex = i;
            this.positionUs = j;
        }
    }

    private static class MoveMediaItemsMessage {
        public final int fromIndex;
        public final int newFromIndex;
        public final com.google.android.exoplayer2.source.ShuffleOrder shuffleOrder;
        public final int toIndex;

        public MoveMediaItemsMessage(int i, int i2, int i3, com.google.android.exoplayer2.source.ShuffleOrder shuffleOrder) {
            this.fromIndex = i;
            this.toIndex = i2;
            this.newFromIndex = i3;
            this.shuffleOrder = shuffleOrder;
        }
    }
}
