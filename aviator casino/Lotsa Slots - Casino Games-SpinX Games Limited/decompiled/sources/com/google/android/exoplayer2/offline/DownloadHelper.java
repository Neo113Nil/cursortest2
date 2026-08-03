package com.google.android.exoplayer2.offline;

/* loaded from: classes3.dex */
public final class DownloadHelper {
    public static final com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.DEFAULT_WITHOUT_CONTEXT.buildUpon().setForceHighestSupportedBitrate(true).setConstrainAudioChannelCountToDeviceCapabilities(false).build();
    private com.google.android.exoplayer2.offline.DownloadHelper.Callback callback;
    private final android.os.Handler callbackHandler;
    private java.util.List<com.google.android.exoplayer2.trackselection.ExoTrackSelection>[][] immutableTrackSelectionsByPeriodAndRenderer;
    private boolean isPreparedWithMedia;
    private final com.google.android.exoplayer2.MediaItem.LocalConfiguration localConfiguration;
    private com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo[] mappedTrackInfos;
    private com.google.android.exoplayer2.offline.DownloadHelper.MediaPreparer mediaPreparer;
    private final com.google.android.exoplayer2.source.MediaSource mediaSource;
    private final com.google.android.exoplayer2.RendererCapabilities[] rendererCapabilities;
    private final android.util.SparseIntArray scratchSet;
    private com.google.android.exoplayer2.source.TrackGroupArray[] trackGroupArrays;
    private java.util.List<com.google.android.exoplayer2.trackselection.ExoTrackSelection>[][] trackSelectionsByPeriodAndRenderer;
    private final com.google.android.exoplayer2.trackselection.DefaultTrackSelector trackSelector;
    private final com.google.android.exoplayer2.Timeline.Window window;

    public interface Callback {
        void onPrepareError(com.google.android.exoplayer2.offline.DownloadHelper downloadHelper, java.io.IOException iOException);

        void onPrepared(com.google.android.exoplayer2.offline.DownloadHelper downloadHelper);
    }

    public static class LiveContentUnsupportedException extends java.io.IOException {
    }

    static /* synthetic */ com.google.android.exoplayer2.drm.DrmSessionManager lambda$createMediaSourceInternal$6(com.google.android.exoplayer2.drm.DrmSessionManager drmSessionManager, com.google.android.exoplayer2.MediaItem mediaItem) {
        return drmSessionManager;
    }

    static /* synthetic */ void lambda$getRendererCapabilities$0(com.google.android.exoplayer2.text.CueGroup cueGroup) {
    }

    static /* synthetic */ void lambda$getRendererCapabilities$1(com.google.android.exoplayer2.metadata.Metadata metadata) {
    }

    static /* synthetic */ void lambda$new$2() {
    }

    public static com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters getDefaultTrackSelectorParameters(android.content.Context context) {
        return com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.getDefaults(context).buildUpon().setForceHighestSupportedBitrate(true).setConstrainAudioChannelCountToDeviceCapabilities(false).build();
    }

    public static com.google.android.exoplayer2.RendererCapabilities[] getRendererCapabilities(com.google.android.exoplayer2.RenderersFactory renderersFactory) {
        com.google.android.exoplayer2.Renderer[] createRenderers = renderersFactory.createRenderers(com.google.android.exoplayer2.util.Util.createHandlerForCurrentOrMainLooper(), new com.google.android.exoplayer2.video.VideoRendererEventListener() { // from class: com.google.android.exoplayer2.offline.DownloadHelper.1
            @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
            public /* synthetic */ void onDroppedFrames(int i, long j) {
                com.google.android.exoplayer2.video.VideoRendererEventListener.CC.$default$onDroppedFrames(this, i, j);
            }

            @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
            public /* synthetic */ void onRenderedFirstFrame(java.lang.Object obj, long j) {
                com.google.android.exoplayer2.video.VideoRendererEventListener.CC.$default$onRenderedFirstFrame(this, obj, j);
            }

            @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
            public /* synthetic */ void onVideoCodecError(java.lang.Exception exc) {
                com.google.android.exoplayer2.video.VideoRendererEventListener.CC.$default$onVideoCodecError(this, exc);
            }

            @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
            public /* synthetic */ void onVideoDecoderInitialized(java.lang.String str, long j, long j2) {
                com.google.android.exoplayer2.video.VideoRendererEventListener.CC.$default$onVideoDecoderInitialized(this, str, j, j2);
            }

            @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
            public /* synthetic */ void onVideoDecoderReleased(java.lang.String str) {
                com.google.android.exoplayer2.video.VideoRendererEventListener.CC.$default$onVideoDecoderReleased(this, str);
            }

            @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
            public /* synthetic */ void onVideoDisabled(com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
                com.google.android.exoplayer2.video.VideoRendererEventListener.CC.$default$onVideoDisabled(this, decoderCounters);
            }

            @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
            public /* synthetic */ void onVideoEnabled(com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
                com.google.android.exoplayer2.video.VideoRendererEventListener.CC.$default$onVideoEnabled(this, decoderCounters);
            }

            @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
            public /* synthetic */ void onVideoFrameProcessingOffset(long j, int i) {
                com.google.android.exoplayer2.video.VideoRendererEventListener.CC.$default$onVideoFrameProcessingOffset(this, j, i);
            }

            @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
            public /* synthetic */ void onVideoInputFormatChanged(com.google.android.exoplayer2.Format format) {
                com.google.android.exoplayer2.video.VideoRendererEventListener.CC.$default$onVideoInputFormatChanged(this, format);
            }

            @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
            public /* synthetic */ void onVideoInputFormatChanged(com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation decoderReuseEvaluation) {
                com.google.android.exoplayer2.video.VideoRendererEventListener.CC.$default$onVideoInputFormatChanged(this, format, decoderReuseEvaluation);
            }

            @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
            public /* synthetic */ void onVideoSizeChanged(com.google.android.exoplayer2.video.VideoSize videoSize) {
                com.google.android.exoplayer2.video.VideoRendererEventListener.CC.$default$onVideoSizeChanged(this, videoSize);
            }
        }, new com.google.android.exoplayer2.audio.AudioRendererEventListener() { // from class: com.google.android.exoplayer2.offline.DownloadHelper.2
            @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
            public /* synthetic */ void onAudioCodecError(java.lang.Exception exc) {
                com.google.android.exoplayer2.audio.AudioRendererEventListener.CC.$default$onAudioCodecError(this, exc);
            }

            @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
            public /* synthetic */ void onAudioDecoderInitialized(java.lang.String str, long j, long j2) {
                com.google.android.exoplayer2.audio.AudioRendererEventListener.CC.$default$onAudioDecoderInitialized(this, str, j, j2);
            }

            @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
            public /* synthetic */ void onAudioDecoderReleased(java.lang.String str) {
                com.google.android.exoplayer2.audio.AudioRendererEventListener.CC.$default$onAudioDecoderReleased(this, str);
            }

            @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
            public /* synthetic */ void onAudioDisabled(com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
                com.google.android.exoplayer2.audio.AudioRendererEventListener.CC.$default$onAudioDisabled(this, decoderCounters);
            }

            @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
            public /* synthetic */ void onAudioEnabled(com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
                com.google.android.exoplayer2.audio.AudioRendererEventListener.CC.$default$onAudioEnabled(this, decoderCounters);
            }

            @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
            public /* synthetic */ void onAudioInputFormatChanged(com.google.android.exoplayer2.Format format) {
                com.google.android.exoplayer2.audio.AudioRendererEventListener.CC.$default$onAudioInputFormatChanged(this, format);
            }

            @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
            public /* synthetic */ void onAudioInputFormatChanged(com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation decoderReuseEvaluation) {
                com.google.android.exoplayer2.audio.AudioRendererEventListener.CC.$default$onAudioInputFormatChanged(this, format, decoderReuseEvaluation);
            }

            @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
            public /* synthetic */ void onAudioPositionAdvancing(long j) {
                com.google.android.exoplayer2.audio.AudioRendererEventListener.CC.$default$onAudioPositionAdvancing(this, j);
            }

            @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
            public /* synthetic */ void onAudioSinkError(java.lang.Exception exc) {
                com.google.android.exoplayer2.audio.AudioRendererEventListener.CC.$default$onAudioSinkError(this, exc);
            }

            @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
            public /* synthetic */ void onAudioUnderrun(int i, long j, long j2) {
                com.google.android.exoplayer2.audio.AudioRendererEventListener.CC.$default$onAudioUnderrun(this, i, j, j2);
            }

            @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
            public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
                com.google.android.exoplayer2.audio.AudioRendererEventListener.CC.$default$onSkipSilenceEnabledChanged(this, z);
            }
        }, new com.google.android.exoplayer2.text.TextOutput() { // from class: com.google.android.exoplayer2.offline.DownloadHelper$$ExternalSyntheticLambda4
            @Override // com.google.android.exoplayer2.text.TextOutput
            public final void onCues(com.google.android.exoplayer2.text.CueGroup cueGroup) {
                com.google.android.exoplayer2.offline.DownloadHelper.lambda$getRendererCapabilities$0(cueGroup);
            }

            @Override // com.google.android.exoplayer2.text.TextOutput
            public /* synthetic */ void onCues(java.util.List list) {
                com.google.android.exoplayer2.text.TextOutput.CC.$default$onCues(this, list);
            }
        }, new com.google.android.exoplayer2.metadata.MetadataOutput() { // from class: com.google.android.exoplayer2.offline.DownloadHelper$$ExternalSyntheticLambda5
            @Override // com.google.android.exoplayer2.metadata.MetadataOutput
            public final void onMetadata(com.google.android.exoplayer2.metadata.Metadata metadata) {
                com.google.android.exoplayer2.offline.DownloadHelper.lambda$getRendererCapabilities$1(metadata);
            }
        });
        com.google.android.exoplayer2.RendererCapabilities[] rendererCapabilitiesArr = new com.google.android.exoplayer2.RendererCapabilities[createRenderers.length];
        for (int i = 0; i < createRenderers.length; i++) {
            rendererCapabilitiesArr[i] = createRenderers[i].getCapabilities();
        }
        return rendererCapabilitiesArr;
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.offline.DownloadHelper forProgressive(android.content.Context context, android.net.Uri uri) {
        return forMediaItem(context, new com.google.android.exoplayer2.MediaItem.Builder().setUri(uri).build());
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.offline.DownloadHelper forProgressive(android.content.Context context, android.net.Uri uri, java.lang.String str) {
        return forMediaItem(context, new com.google.android.exoplayer2.MediaItem.Builder().setUri(uri).setCustomCacheKey(str).build());
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.offline.DownloadHelper forDash(android.content.Context context, android.net.Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, com.google.android.exoplayer2.RenderersFactory renderersFactory) {
        return forDash(uri, factory, renderersFactory, null, getDefaultTrackSelectorParameters(context));
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.offline.DownloadHelper forDash(android.net.Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, com.google.android.exoplayer2.RenderersFactory renderersFactory, com.google.android.exoplayer2.drm.DrmSessionManager drmSessionManager, com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters) {
        return forMediaItem(new com.google.android.exoplayer2.MediaItem.Builder().setUri(uri).setMimeType("application/dash+xml").build(), trackSelectionParameters, renderersFactory, factory, drmSessionManager);
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.offline.DownloadHelper forHls(android.content.Context context, android.net.Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, com.google.android.exoplayer2.RenderersFactory renderersFactory) {
        return forHls(uri, factory, renderersFactory, null, getDefaultTrackSelectorParameters(context));
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.offline.DownloadHelper forHls(android.net.Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, com.google.android.exoplayer2.RenderersFactory renderersFactory, com.google.android.exoplayer2.drm.DrmSessionManager drmSessionManager, com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters) {
        return forMediaItem(new com.google.android.exoplayer2.MediaItem.Builder().setUri(uri).setMimeType("application/x-mpegURL").build(), trackSelectionParameters, renderersFactory, factory, drmSessionManager);
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.offline.DownloadHelper forSmoothStreaming(android.net.Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, com.google.android.exoplayer2.RenderersFactory renderersFactory) {
        return forSmoothStreaming(uri, factory, renderersFactory, null, DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT);
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.offline.DownloadHelper forSmoothStreaming(android.content.Context context, android.net.Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, com.google.android.exoplayer2.RenderersFactory renderersFactory) {
        return forSmoothStreaming(uri, factory, renderersFactory, null, getDefaultTrackSelectorParameters(context));
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.offline.DownloadHelper forSmoothStreaming(android.net.Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, com.google.android.exoplayer2.RenderersFactory renderersFactory, com.google.android.exoplayer2.drm.DrmSessionManager drmSessionManager, com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters) {
        return forMediaItem(new com.google.android.exoplayer2.MediaItem.Builder().setUri(uri).setMimeType("application/vnd.ms-sstr+xml").build(), trackSelectionParameters, renderersFactory, factory, drmSessionManager);
    }

    public static com.google.android.exoplayer2.offline.DownloadHelper forMediaItem(android.content.Context context, com.google.android.exoplayer2.MediaItem mediaItem) {
        com.google.android.exoplayer2.util.Assertions.checkArgument(isProgressive((com.google.android.exoplayer2.MediaItem.LocalConfiguration) com.google.android.exoplayer2.util.Assertions.checkNotNull(mediaItem.localConfiguration)));
        return forMediaItem(mediaItem, getDefaultTrackSelectorParameters(context), null, null, null);
    }

    public static com.google.android.exoplayer2.offline.DownloadHelper forMediaItem(android.content.Context context, com.google.android.exoplayer2.MediaItem mediaItem, com.google.android.exoplayer2.RenderersFactory renderersFactory, com.google.android.exoplayer2.upstream.DataSource.Factory factory) {
        return forMediaItem(mediaItem, getDefaultTrackSelectorParameters(context), renderersFactory, factory, null);
    }

    public static com.google.android.exoplayer2.offline.DownloadHelper forMediaItem(com.google.android.exoplayer2.MediaItem mediaItem, com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters, com.google.android.exoplayer2.RenderersFactory renderersFactory, com.google.android.exoplayer2.upstream.DataSource.Factory factory) {
        return forMediaItem(mediaItem, trackSelectionParameters, renderersFactory, factory, null);
    }

    public static com.google.android.exoplayer2.offline.DownloadHelper forMediaItem(com.google.android.exoplayer2.MediaItem mediaItem, com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters, com.google.android.exoplayer2.RenderersFactory renderersFactory, com.google.android.exoplayer2.upstream.DataSource.Factory factory, com.google.android.exoplayer2.drm.DrmSessionManager drmSessionManager) {
        com.google.android.exoplayer2.RendererCapabilities[] rendererCapabilitiesArr;
        boolean isProgressive = isProgressive((com.google.android.exoplayer2.MediaItem.LocalConfiguration) com.google.android.exoplayer2.util.Assertions.checkNotNull(mediaItem.localConfiguration));
        com.google.android.exoplayer2.util.Assertions.checkArgument(isProgressive || factory != null);
        com.google.android.exoplayer2.source.MediaSource createMediaSourceInternal = isProgressive ? null : createMediaSourceInternal(mediaItem, (com.google.android.exoplayer2.upstream.DataSource.Factory) com.google.android.exoplayer2.util.Util.castNonNull(factory), drmSessionManager);
        if (renderersFactory != null) {
            rendererCapabilitiesArr = getRendererCapabilities(renderersFactory);
        } else {
            rendererCapabilitiesArr = new com.google.android.exoplayer2.RendererCapabilities[0];
        }
        return new com.google.android.exoplayer2.offline.DownloadHelper(mediaItem, createMediaSourceInternal, trackSelectionParameters, rendererCapabilitiesArr);
    }

    public static com.google.android.exoplayer2.source.MediaSource createMediaSource(com.google.android.exoplayer2.offline.DownloadRequest downloadRequest, com.google.android.exoplayer2.upstream.DataSource.Factory factory) {
        return createMediaSource(downloadRequest, factory, null);
    }

    public static com.google.android.exoplayer2.source.MediaSource createMediaSource(com.google.android.exoplayer2.offline.DownloadRequest downloadRequest, com.google.android.exoplayer2.upstream.DataSource.Factory factory, com.google.android.exoplayer2.drm.DrmSessionManager drmSessionManager) {
        return createMediaSourceInternal(downloadRequest.toMediaItem(), factory, drmSessionManager);
    }

    public DownloadHelper(com.google.android.exoplayer2.MediaItem mediaItem, com.google.android.exoplayer2.source.MediaSource mediaSource, com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters, com.google.android.exoplayer2.RendererCapabilities[] rendererCapabilitiesArr) {
        this.localConfiguration = (com.google.android.exoplayer2.MediaItem.LocalConfiguration) com.google.android.exoplayer2.util.Assertions.checkNotNull(mediaItem.localConfiguration);
        this.mediaSource = mediaSource;
        com.google.android.exoplayer2.trackselection.DefaultTrackSelector defaultTrackSelector = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector(trackSelectionParameters, new com.google.android.exoplayer2.offline.DownloadHelper.DownloadTrackSelection.Factory());
        this.trackSelector = defaultTrackSelector;
        this.rendererCapabilities = rendererCapabilitiesArr;
        this.scratchSet = new android.util.SparseIntArray();
        defaultTrackSelector.init(new com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener() { // from class: com.google.android.exoplayer2.offline.DownloadHelper$$ExternalSyntheticLambda2
            @Override // com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener
            public final void onTrackSelectionsInvalidated() {
                com.google.android.exoplayer2.offline.DownloadHelper.lambda$new$2();
            }
        }, new com.google.android.exoplayer2.offline.DownloadHelper.FakeBandwidthMeter());
        this.callbackHandler = com.google.android.exoplayer2.util.Util.createHandlerForCurrentOrMainLooper();
        this.window = new com.google.android.exoplayer2.Timeline.Window();
    }

    public void prepare(final com.google.android.exoplayer2.offline.DownloadHelper.Callback callback) {
        com.google.android.exoplayer2.util.Assertions.checkState(this.callback == null);
        this.callback = callback;
        com.google.android.exoplayer2.source.MediaSource mediaSource = this.mediaSource;
        if (mediaSource != null) {
            this.mediaPreparer = new com.google.android.exoplayer2.offline.DownloadHelper.MediaPreparer(mediaSource, this);
        } else {
            this.callbackHandler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.offline.DownloadHelper$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.exoplayer2.offline.DownloadHelper.this.m5411xf9781d7d(callback);
                }
            });
        }
    }

    /* renamed from: lambda$prepare$3$com-google-android-exoplayer2-offline-DownloadHelper, reason: not valid java name */
    /* synthetic */ void m5411xf9781d7d(com.google.android.exoplayer2.offline.DownloadHelper.Callback callback) {
        callback.onPrepared(this);
    }

    public void release() {
        com.google.android.exoplayer2.offline.DownloadHelper.MediaPreparer mediaPreparer = this.mediaPreparer;
        if (mediaPreparer != null) {
            mediaPreparer.release();
        }
        this.trackSelector.release();
    }

    public java.lang.Object getManifest() {
        if (this.mediaSource == null) {
            return null;
        }
        assertPreparedWithMedia();
        if (this.mediaPreparer.timeline.getWindowCount() > 0) {
            return this.mediaPreparer.timeline.getWindow(0, this.window).manifest;
        }
        return null;
    }

    public int getPeriodCount() {
        if (this.mediaSource == null) {
            return 0;
        }
        assertPreparedWithMedia();
        return this.trackGroupArrays.length;
    }

    public com.google.android.exoplayer2.Tracks getTracks(int i) {
        assertPreparedWithMedia();
        return com.google.android.exoplayer2.trackselection.TrackSelectionUtil.buildTracks(this.mappedTrackInfos[i], this.immutableTrackSelectionsByPeriodAndRenderer[i]);
    }

    public com.google.android.exoplayer2.source.TrackGroupArray getTrackGroups(int i) {
        assertPreparedWithMedia();
        return this.trackGroupArrays[i];
    }

    public com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo getMappedTrackInfo(int i) {
        assertPreparedWithMedia();
        return this.mappedTrackInfos[i];
    }

    public java.util.List<com.google.android.exoplayer2.trackselection.ExoTrackSelection> getTrackSelections(int i, int i2) {
        assertPreparedWithMedia();
        return this.immutableTrackSelectionsByPeriodAndRenderer[i][i2];
    }

    public void clearTrackSelections(int i) {
        assertPreparedWithMedia();
        for (int i2 = 0; i2 < this.rendererCapabilities.length; i2++) {
            this.trackSelectionsByPeriodAndRenderer[i][i2].clear();
        }
    }

    public void replaceTrackSelections(int i, com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters) {
        try {
            assertPreparedWithMedia();
            clearTrackSelections(i);
            addTrackSelectionInternal(i, trackSelectionParameters);
        } catch (com.google.android.exoplayer2.ExoPlaybackException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public void addTrackSelection(int i, com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters) {
        try {
            assertPreparedWithMedia();
            addTrackSelectionInternal(i, trackSelectionParameters);
        } catch (com.google.android.exoplayer2.ExoPlaybackException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public void addAudioLanguagesToSelection(java.lang.String... strArr) {
        try {
            assertPreparedWithMedia();
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder buildUpon = DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT.buildUpon();
            buildUpon.setForceHighestSupportedBitrate(true);
            for (com.google.android.exoplayer2.RendererCapabilities rendererCapabilities : this.rendererCapabilities) {
                int trackType = rendererCapabilities.getTrackType();
                buildUpon.setTrackTypeDisabled(trackType, trackType != 1);
            }
            int periodCount = getPeriodCount();
            for (java.lang.String str : strArr) {
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters build = buildUpon.setPreferredAudioLanguage(str).build();
                for (int i = 0; i < periodCount; i++) {
                    addTrackSelectionInternal(i, build);
                }
            }
        } catch (com.google.android.exoplayer2.ExoPlaybackException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public void addTextLanguagesToSelection(boolean z, java.lang.String... strArr) {
        try {
            assertPreparedWithMedia();
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder buildUpon = DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT.buildUpon();
            buildUpon.setSelectUndeterminedTextLanguage(z);
            buildUpon.setForceHighestSupportedBitrate(true);
            for (com.google.android.exoplayer2.RendererCapabilities rendererCapabilities : this.rendererCapabilities) {
                int trackType = rendererCapabilities.getTrackType();
                buildUpon.setTrackTypeDisabled(trackType, trackType != 3);
            }
            int periodCount = getPeriodCount();
            for (java.lang.String str : strArr) {
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters build = buildUpon.setPreferredTextLanguage(str).build();
                for (int i = 0; i < periodCount; i++) {
                    addTrackSelectionInternal(i, build);
                }
            }
        } catch (com.google.android.exoplayer2.ExoPlaybackException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public void addTrackSelectionForSingleRenderer(int i, int i2, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters parameters, java.util.List<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride> list) {
        try {
            assertPreparedWithMedia();
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder buildUpon = parameters.buildUpon();
            int i3 = 0;
            while (i3 < this.mappedTrackInfos[i].getRendererCount()) {
                buildUpon.setRendererDisabled(i3, i3 != i2);
                i3++;
            }
            if (list.isEmpty()) {
                addTrackSelectionInternal(i, buildUpon.build());
                return;
            }
            com.google.android.exoplayer2.source.TrackGroupArray trackGroups = this.mappedTrackInfos[i].getTrackGroups(i2);
            for (int i4 = 0; i4 < list.size(); i4++) {
                buildUpon.setSelectionOverride(i2, trackGroups, list.get(i4));
                addTrackSelectionInternal(i, buildUpon.build());
            }
        } catch (com.google.android.exoplayer2.ExoPlaybackException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public com.google.android.exoplayer2.offline.DownloadRequest getDownloadRequest(byte[] bArr) {
        return getDownloadRequest(this.localConfiguration.uri.toString(), bArr);
    }

    public com.google.android.exoplayer2.offline.DownloadRequest getDownloadRequest(java.lang.String str, byte[] bArr) {
        com.google.android.exoplayer2.offline.DownloadRequest.Builder data = new com.google.android.exoplayer2.offline.DownloadRequest.Builder(str, this.localConfiguration.uri).setMimeType(this.localConfiguration.mimeType).setKeySetId(this.localConfiguration.drmConfiguration != null ? this.localConfiguration.drmConfiguration.getKeySetId() : null).setCustomCacheKey(this.localConfiguration.customCacheKey).setData(bArr);
        if (this.mediaSource == null) {
            return data.build();
        }
        assertPreparedWithMedia();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int length = this.trackSelectionsByPeriodAndRenderer.length;
        for (int i = 0; i < length; i++) {
            arrayList2.clear();
            int length2 = this.trackSelectionsByPeriodAndRenderer[i].length;
            for (int i2 = 0; i2 < length2; i2++) {
                arrayList2.addAll(this.trackSelectionsByPeriodAndRenderer[i][i2]);
            }
            arrayList.addAll(this.mediaPreparer.mediaPeriods[i].getStreamKeys(arrayList2));
        }
        return data.setStreamKeys(arrayList).build();
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackGroupArrays", "trackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline"})
    private void addTrackSelectionInternal(int i, com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters) throws com.google.android.exoplayer2.ExoPlaybackException {
        this.trackSelector.setParameters(trackSelectionParameters);
        runTrackSelection(i);
        com.google.common.collect.UnmodifiableIterator<com.google.android.exoplayer2.trackselection.TrackSelectionOverride> it = trackSelectionParameters.overrides.values().iterator();
        while (it.hasNext()) {
            this.trackSelector.setParameters(trackSelectionParameters.buildUpon().setOverrideForType(it.next()).build());
            runTrackSelection(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaPrepared() throws com.google.android.exoplayer2.ExoPlaybackException {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(this.mediaPreparer);
        com.google.android.exoplayer2.util.Assertions.checkNotNull(this.mediaPreparer.mediaPeriods);
        com.google.android.exoplayer2.util.Assertions.checkNotNull(this.mediaPreparer.timeline);
        int length = this.mediaPreparer.mediaPeriods.length;
        int length2 = this.rendererCapabilities.length;
        this.trackSelectionsByPeriodAndRenderer = (java.util.List[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.util.List.class, length, length2);
        this.immutableTrackSelectionsByPeriodAndRenderer = (java.util.List[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.util.List.class, length, length2);
        for (int i = 0; i < length; i++) {
            for (int i2 = 0; i2 < length2; i2++) {
                this.trackSelectionsByPeriodAndRenderer[i][i2] = new java.util.ArrayList();
                this.immutableTrackSelectionsByPeriodAndRenderer[i][i2] = java.util.Collections.unmodifiableList(this.trackSelectionsByPeriodAndRenderer[i][i2]);
            }
        }
        this.trackGroupArrays = new com.google.android.exoplayer2.source.TrackGroupArray[length];
        this.mappedTrackInfos = new com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo[length];
        for (int i3 = 0; i3 < length; i3++) {
            this.trackGroupArrays[i3] = this.mediaPreparer.mediaPeriods[i3].getTrackGroups();
            this.trackSelector.onSelectionActivated(runTrackSelection(i3).info);
            this.mappedTrackInfos[i3] = (com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.trackSelector.getCurrentMappedTrackInfo());
        }
        setPreparedWithMedia();
        ((android.os.Handler) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.callbackHandler)).post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.offline.DownloadHelper$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.exoplayer2.offline.DownloadHelper.this.m5410xbc158121();
            }
        });
    }

    /* renamed from: lambda$onMediaPrepared$4$com-google-android-exoplayer2-offline-DownloadHelper, reason: not valid java name */
    /* synthetic */ void m5410xbc158121() {
        ((com.google.android.exoplayer2.offline.DownloadHelper.Callback) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.callback)).onPrepared(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaPreparationFailed(final java.io.IOException iOException) {
        ((android.os.Handler) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.callbackHandler)).post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.offline.DownloadHelper$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.exoplayer2.offline.DownloadHelper.this.m5409xa7571479(iOException);
            }
        });
    }

    /* renamed from: lambda$onMediaPreparationFailed$5$com-google-android-exoplayer2-offline-DownloadHelper, reason: not valid java name */
    /* synthetic */ void m5409xa7571479(java.io.IOException iOException) {
        ((com.google.android.exoplayer2.offline.DownloadHelper.Callback) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.callback)).onPrepareError(this, iOException);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    private void setPreparedWithMedia() {
        this.isPreparedWithMedia = true;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    private void assertPreparedWithMedia() {
        com.google.android.exoplayer2.util.Assertions.checkState(this.isPreparedWithMedia);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackGroupArrays", "trackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline"})
    private com.google.android.exoplayer2.trackselection.TrackSelectorResult runTrackSelection(int i) throws com.google.android.exoplayer2.ExoPlaybackException {
        com.google.android.exoplayer2.trackselection.TrackSelectorResult selectTracks = this.trackSelector.selectTracks(this.rendererCapabilities, this.trackGroupArrays[i], new com.google.android.exoplayer2.source.MediaSource.MediaPeriodId(this.mediaPreparer.timeline.getUidOfPeriod(i)), this.mediaPreparer.timeline);
        for (int i2 = 0; i2 < selectTracks.length; i2++) {
            com.google.android.exoplayer2.trackselection.ExoTrackSelection exoTrackSelection = selectTracks.selections[i2];
            if (exoTrackSelection != null) {
                java.util.List<com.google.android.exoplayer2.trackselection.ExoTrackSelection> list = this.trackSelectionsByPeriodAndRenderer[i][i2];
                int i3 = 0;
                while (true) {
                    if (i3 < list.size()) {
                        com.google.android.exoplayer2.trackselection.ExoTrackSelection exoTrackSelection2 = list.get(i3);
                        if (exoTrackSelection2.getTrackGroup().equals(exoTrackSelection.getTrackGroup())) {
                            this.scratchSet.clear();
                            for (int i4 = 0; i4 < exoTrackSelection2.length(); i4++) {
                                this.scratchSet.put(exoTrackSelection2.getIndexInTrackGroup(i4), 0);
                            }
                            for (int i5 = 0; i5 < exoTrackSelection.length(); i5++) {
                                this.scratchSet.put(exoTrackSelection.getIndexInTrackGroup(i5), 0);
                            }
                            int[] iArr = new int[this.scratchSet.size()];
                            for (int i6 = 0; i6 < this.scratchSet.size(); i6++) {
                                iArr[i6] = this.scratchSet.keyAt(i6);
                            }
                            list.set(i3, new com.google.android.exoplayer2.offline.DownloadHelper.DownloadTrackSelection(exoTrackSelection2.getTrackGroup(), iArr));
                        } else {
                            i3++;
                        }
                    } else {
                        list.add(exoTrackSelection);
                        break;
                    }
                }
            }
        }
        return selectTracks;
    }

    private static com.google.android.exoplayer2.source.MediaSource createMediaSourceInternal(com.google.android.exoplayer2.MediaItem mediaItem, com.google.android.exoplayer2.upstream.DataSource.Factory factory, final com.google.android.exoplayer2.drm.DrmSessionManager drmSessionManager) {
        com.google.android.exoplayer2.source.DefaultMediaSourceFactory defaultMediaSourceFactory = new com.google.android.exoplayer2.source.DefaultMediaSourceFactory(factory, com.google.android.exoplayer2.extractor.ExtractorsFactory.EMPTY);
        if (drmSessionManager != null) {
            defaultMediaSourceFactory.setDrmSessionManagerProvider(new com.google.android.exoplayer2.drm.DrmSessionManagerProvider() { // from class: com.google.android.exoplayer2.offline.DownloadHelper$$ExternalSyntheticLambda0
                @Override // com.google.android.exoplayer2.drm.DrmSessionManagerProvider
                public final com.google.android.exoplayer2.drm.DrmSessionManager get(com.google.android.exoplayer2.MediaItem mediaItem2) {
                    return com.google.android.exoplayer2.offline.DownloadHelper.lambda$createMediaSourceInternal$6(com.google.android.exoplayer2.drm.DrmSessionManager.this, mediaItem2);
                }
            });
        }
        return defaultMediaSourceFactory.createMediaSource(mediaItem);
    }

    private static boolean isProgressive(com.google.android.exoplayer2.MediaItem.LocalConfiguration localConfiguration) {
        return com.google.android.exoplayer2.util.Util.inferContentTypeForUriAndMimeType(localConfiguration.uri, localConfiguration.mimeType) == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class MediaPreparer implements com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller, com.google.android.exoplayer2.source.MediaPeriod.Callback, android.os.Handler.Callback {
        private static final int DOWNLOAD_HELPER_CALLBACK_MESSAGE_FAILED = 1;
        private static final int DOWNLOAD_HELPER_CALLBACK_MESSAGE_PREPARED = 0;
        private static final int MESSAGE_CHECK_FOR_FAILURE = 1;
        private static final int MESSAGE_CONTINUE_LOADING = 2;
        private static final int MESSAGE_PREPARE_SOURCE = 0;
        private static final int MESSAGE_RELEASE = 3;
        private final com.google.android.exoplayer2.offline.DownloadHelper downloadHelper;
        public com.google.android.exoplayer2.source.MediaPeriod[] mediaPeriods;
        private final com.google.android.exoplayer2.source.MediaSource mediaSource;
        private final android.os.Handler mediaSourceHandler;
        private final android.os.HandlerThread mediaSourceThread;
        private boolean released;
        public com.google.android.exoplayer2.Timeline timeline;
        private final com.google.android.exoplayer2.upstream.Allocator allocator = new com.google.android.exoplayer2.upstream.DefaultAllocator(true, 65536);
        private final java.util.ArrayList<com.google.android.exoplayer2.source.MediaPeriod> pendingMediaPeriods = new java.util.ArrayList<>();
        private final android.os.Handler downloadHelperHandler = com.google.android.exoplayer2.util.Util.createHandlerForCurrentOrMainLooper(new android.os.Handler.Callback() { // from class: com.google.android.exoplayer2.offline.DownloadHelper$MediaPreparer$$ExternalSyntheticLambda0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(android.os.Message message) {
                boolean handleDownloadHelperCallbackMessage;
                handleDownloadHelperCallbackMessage = com.google.android.exoplayer2.offline.DownloadHelper.MediaPreparer.this.handleDownloadHelperCallbackMessage(message);
                return handleDownloadHelperCallbackMessage;
            }
        });

        public MediaPreparer(com.google.android.exoplayer2.source.MediaSource mediaSource, com.google.android.exoplayer2.offline.DownloadHelper downloadHelper) {
            this.mediaSource = mediaSource;
            this.downloadHelper = downloadHelper;
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExoPlayer:DownloadHelper");
            this.mediaSourceThread = handlerThread;
            handlerThread.start();
            android.os.Handler createHandler = com.google.android.exoplayer2.util.Util.createHandler(handlerThread.getLooper(), this);
            this.mediaSourceHandler = createHandler;
            createHandler.sendEmptyMessage(0);
        }

        public void release() {
            if (this.released) {
                return;
            }
            this.released = true;
            this.mediaSourceHandler.sendEmptyMessage(3);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            int i = message.what;
            if (i == 0) {
                this.mediaSource.prepareSource(this, null, com.google.android.exoplayer2.analytics.PlayerId.UNSET);
                this.mediaSourceHandler.sendEmptyMessage(1);
                return true;
            }
            int i2 = 0;
            if (i == 1) {
                try {
                    if (this.mediaPeriods == null) {
                        this.mediaSource.maybeThrowSourceInfoRefreshError();
                    } else {
                        while (i2 < this.pendingMediaPeriods.size()) {
                            this.pendingMediaPeriods.get(i2).maybeThrowPrepareError();
                            i2++;
                        }
                    }
                    this.mediaSourceHandler.sendEmptyMessageDelayed(1, 100L);
                } catch (java.io.IOException e) {
                    this.downloadHelperHandler.obtainMessage(1, e).sendToTarget();
                }
                return true;
            }
            if (i == 2) {
                com.google.android.exoplayer2.source.MediaPeriod mediaPeriod = (com.google.android.exoplayer2.source.MediaPeriod) message.obj;
                if (this.pendingMediaPeriods.contains(mediaPeriod)) {
                    mediaPeriod.continueLoading(0L);
                }
                return true;
            }
            if (i != 3) {
                return false;
            }
            com.google.android.exoplayer2.source.MediaPeriod[] mediaPeriodArr = this.mediaPeriods;
            if (mediaPeriodArr != null) {
                int length = mediaPeriodArr.length;
                while (i2 < length) {
                    this.mediaSource.releasePeriod(mediaPeriodArr[i2]);
                    i2++;
                }
            }
            this.mediaSource.releaseSource(this);
            this.mediaSourceHandler.removeCallbacksAndMessages(null);
            this.mediaSourceThread.quit();
            return true;
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
        public void onSourceInfoRefreshed(com.google.android.exoplayer2.source.MediaSource mediaSource, com.google.android.exoplayer2.Timeline timeline) {
            com.google.android.exoplayer2.source.MediaPeriod[] mediaPeriodArr;
            if (this.timeline != null) {
                return;
            }
            if (timeline.getWindow(0, new com.google.android.exoplayer2.Timeline.Window()).isLive()) {
                this.downloadHelperHandler.obtainMessage(1, new com.google.android.exoplayer2.offline.DownloadHelper.LiveContentUnsupportedException()).sendToTarget();
                return;
            }
            this.timeline = timeline;
            this.mediaPeriods = new com.google.android.exoplayer2.source.MediaPeriod[timeline.getPeriodCount()];
            int i = 0;
            while (true) {
                mediaPeriodArr = this.mediaPeriods;
                if (i >= mediaPeriodArr.length) {
                    break;
                }
                com.google.android.exoplayer2.source.MediaPeriod createPeriod = this.mediaSource.createPeriod(new com.google.android.exoplayer2.source.MediaSource.MediaPeriodId(timeline.getUidOfPeriod(i)), this.allocator, 0L);
                this.mediaPeriods[i] = createPeriod;
                this.pendingMediaPeriods.add(createPeriod);
                i++;
            }
            for (com.google.android.exoplayer2.source.MediaPeriod mediaPeriod : mediaPeriodArr) {
                mediaPeriod.prepare(this, 0L);
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
        public void onPrepared(com.google.android.exoplayer2.source.MediaPeriod mediaPeriod) {
            this.pendingMediaPeriods.remove(mediaPeriod);
            if (this.pendingMediaPeriods.isEmpty()) {
                this.mediaSourceHandler.removeMessages(1);
                this.downloadHelperHandler.sendEmptyMessage(0);
            }
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(com.google.android.exoplayer2.source.MediaPeriod mediaPeriod) {
            if (this.pendingMediaPeriods.contains(mediaPeriod)) {
                this.mediaSourceHandler.obtainMessage(2, mediaPeriod).sendToTarget();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean handleDownloadHelperCallbackMessage(android.os.Message message) {
            if (this.released) {
                return false;
            }
            int i = message.what;
            if (i == 0) {
                try {
                    this.downloadHelper.onMediaPrepared();
                } catch (com.google.android.exoplayer2.ExoPlaybackException e) {
                    this.downloadHelperHandler.obtainMessage(1, new java.io.IOException(e)).sendToTarget();
                }
                return true;
            }
            if (i != 1) {
                return false;
            }
            release();
            this.downloadHelper.onMediaPreparationFailed((java.io.IOException) com.google.android.exoplayer2.util.Util.castNonNull(message.obj));
            return true;
        }
    }

    private static final class DownloadTrackSelection extends com.google.android.exoplayer2.trackselection.BaseTrackSelection {
        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectedIndex() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public java.lang.Object getSelectionData() {
            return null;
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectionReason() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void updateSelectedTrack(long j, long j2, long j3, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> list, com.google.android.exoplayer2.source.chunk.MediaChunkIterator[] mediaChunkIteratorArr) {
        }

        private static final class Factory implements com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory {
            private Factory() {
            }

            @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory
            public com.google.android.exoplayer2.trackselection.ExoTrackSelection[] createTrackSelections(com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition[] definitionArr, com.google.android.exoplayer2.upstream.BandwidthMeter bandwidthMeter, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.Timeline timeline) {
                com.google.android.exoplayer2.trackselection.ExoTrackSelection[] exoTrackSelectionArr = new com.google.android.exoplayer2.trackselection.ExoTrackSelection[definitionArr.length];
                for (int i = 0; i < definitionArr.length; i++) {
                    com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition definition = definitionArr[i];
                    exoTrackSelectionArr[i] = definition == null ? null : new com.google.android.exoplayer2.offline.DownloadHelper.DownloadTrackSelection(definition.group, definitionArr[i].tracks);
                }
                return exoTrackSelectionArr;
            }
        }

        public DownloadTrackSelection(com.google.android.exoplayer2.source.TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr);
        }
    }

    private static final class FakeBandwidthMeter implements com.google.android.exoplayer2.upstream.BandwidthMeter {
        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        public void addEventListener(android.os.Handler handler, com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener eventListener) {
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        public long getBitrateEstimate() {
            return 0L;
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        public /* synthetic */ long getTimeToFirstByteEstimateUs() {
            return com.google.android.exoplayer2.upstream.BandwidthMeter.CC.$default$getTimeToFirstByteEstimateUs(this);
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        public com.google.android.exoplayer2.upstream.TransferListener getTransferListener() {
            return null;
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        public void removeEventListener(com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener eventListener) {
        }

        private FakeBandwidthMeter() {
        }
    }
}
