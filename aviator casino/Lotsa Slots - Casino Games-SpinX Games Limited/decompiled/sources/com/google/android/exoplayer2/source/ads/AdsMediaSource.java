package com.google.android.exoplayer2.source.ads;

/* loaded from: classes3.dex */
public final class AdsMediaSource extends com.google.android.exoplayer2.source.CompositeMediaSource<com.google.android.exoplayer2.source.MediaSource.MediaPeriodId> {
    private static final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId CHILD_SOURCE_MEDIA_PERIOD_ID = new com.google.android.exoplayer2.source.MediaSource.MediaPeriodId(new java.lang.Object());
    private final com.google.android.exoplayer2.source.MediaSource.Factory adMediaSourceFactory;
    private com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState;
    private final com.google.android.exoplayer2.upstream.DataSpec adTagDataSpec;
    private final com.google.android.exoplayer2.ui.AdViewProvider adViewProvider;
    private final java.lang.Object adsId;
    private final com.google.android.exoplayer2.source.ads.AdsLoader adsLoader;
    private com.google.android.exoplayer2.source.ads.AdsMediaSource.ComponentListener componentListener;
    private final com.google.android.exoplayer2.source.MediaSource contentMediaSource;
    private com.google.android.exoplayer2.Timeline contentTimeline;
    private final android.os.Handler mainHandler = new android.os.Handler(android.os.Looper.getMainLooper());
    private final com.google.android.exoplayer2.Timeline.Period period = new com.google.android.exoplayer2.Timeline.Period();
    private com.google.android.exoplayer2.source.ads.AdsMediaSource.AdMediaSourceHolder[][] adMediaSourceHolders = new com.google.android.exoplayer2.source.ads.AdsMediaSource.AdMediaSourceHolder[0][];

    public static final class AdLoadException extends java.io.IOException {
        public static final int TYPE_AD = 0;
        public static final int TYPE_AD_GROUP = 1;
        public static final int TYPE_ALL_ADS = 2;
        public static final int TYPE_UNEXPECTED = 3;
        public final int type;

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface Type {
        }

        public static com.google.android.exoplayer2.source.ads.AdsMediaSource.AdLoadException createForAd(java.lang.Exception exc) {
            return new com.google.android.exoplayer2.source.ads.AdsMediaSource.AdLoadException(0, exc);
        }

        public static com.google.android.exoplayer2.source.ads.AdsMediaSource.AdLoadException createForAdGroup(java.lang.Exception exc, int i) {
            return new com.google.android.exoplayer2.source.ads.AdsMediaSource.AdLoadException(1, new java.io.IOException("Failed to load ad group " + i, exc));
        }

        public static com.google.android.exoplayer2.source.ads.AdsMediaSource.AdLoadException createForAllAds(java.lang.Exception exc) {
            return new com.google.android.exoplayer2.source.ads.AdsMediaSource.AdLoadException(2, exc);
        }

        public static com.google.android.exoplayer2.source.ads.AdsMediaSource.AdLoadException createForUnexpected(java.lang.RuntimeException runtimeException) {
            return new com.google.android.exoplayer2.source.ads.AdsMediaSource.AdLoadException(3, runtimeException);
        }

        private AdLoadException(int i, java.lang.Exception exc) {
            super(exc);
            this.type = i;
        }

        public java.lang.RuntimeException getRuntimeExceptionForUnexpected() {
            com.google.android.exoplayer2.util.Assertions.checkState(this.type == 3);
            return (java.lang.RuntimeException) com.google.android.exoplayer2.util.Assertions.checkNotNull(getCause());
        }
    }

    public AdsMediaSource(com.google.android.exoplayer2.source.MediaSource mediaSource, com.google.android.exoplayer2.upstream.DataSpec dataSpec, java.lang.Object obj, com.google.android.exoplayer2.source.MediaSource.Factory factory, com.google.android.exoplayer2.source.ads.AdsLoader adsLoader, com.google.android.exoplayer2.ui.AdViewProvider adViewProvider) {
        this.contentMediaSource = mediaSource;
        this.adMediaSourceFactory = factory;
        this.adsLoader = adsLoader;
        this.adViewProvider = adViewProvider;
        this.adTagDataSpec = dataSpec;
        this.adsId = obj;
        adsLoader.setSupportedContentTypes(factory.getSupportedTypes());
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.MediaItem getMediaItem() {
        return this.contentMediaSource.getMediaItem();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected void prepareSourceInternal(com.google.android.exoplayer2.upstream.TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        final com.google.android.exoplayer2.source.ads.AdsMediaSource.ComponentListener componentListener = new com.google.android.exoplayer2.source.ads.AdsMediaSource.ComponentListener();
        this.componentListener = componentListener;
        prepareChildSource(CHILD_SOURCE_MEDIA_PERIOD_ID, this.contentMediaSource);
        this.mainHandler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.source.ads.AdsMediaSource$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.exoplayer2.source.ads.AdsMediaSource.this.m5431x4dfad2b6(componentListener);
            }
        });
    }

    /* renamed from: lambda$prepareSourceInternal$0$com-google-android-exoplayer2-source-ads-AdsMediaSource, reason: not valid java name */
    /* synthetic */ void m5431x4dfad2b6(com.google.android.exoplayer2.source.ads.AdsMediaSource.ComponentListener componentListener) {
        this.adsLoader.start(this, this.adTagDataSpec, this.adsId, this.adViewProvider, componentListener);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.source.MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.upstream.Allocator allocator, long j) {
        if (((com.google.android.exoplayer2.source.ads.AdPlaybackState) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.adPlaybackState)).adGroupCount > 0 && mediaPeriodId.isAd()) {
            int i = mediaPeriodId.adGroupIndex;
            int i2 = mediaPeriodId.adIndexInAdGroup;
            com.google.android.exoplayer2.source.ads.AdsMediaSource.AdMediaSourceHolder[][] adMediaSourceHolderArr = this.adMediaSourceHolders;
            com.google.android.exoplayer2.source.ads.AdsMediaSource.AdMediaSourceHolder[] adMediaSourceHolderArr2 = adMediaSourceHolderArr[i];
            if (adMediaSourceHolderArr2.length <= i2) {
                adMediaSourceHolderArr[i] = (com.google.android.exoplayer2.source.ads.AdsMediaSource.AdMediaSourceHolder[]) java.util.Arrays.copyOf(adMediaSourceHolderArr2, i2 + 1);
            }
            com.google.android.exoplayer2.source.ads.AdsMediaSource.AdMediaSourceHolder adMediaSourceHolder = this.adMediaSourceHolders[i][i2];
            if (adMediaSourceHolder == null) {
                adMediaSourceHolder = new com.google.android.exoplayer2.source.ads.AdsMediaSource.AdMediaSourceHolder(mediaPeriodId);
                this.adMediaSourceHolders[i][i2] = adMediaSourceHolder;
                maybeUpdateAdMediaSources();
            }
            return adMediaSourceHolder.createMediaPeriod(mediaPeriodId, allocator, j);
        }
        com.google.android.exoplayer2.source.MaskingMediaPeriod maskingMediaPeriod = new com.google.android.exoplayer2.source.MaskingMediaPeriod(mediaPeriodId, allocator, j);
        maskingMediaPeriod.setMediaSource(this.contentMediaSource);
        maskingMediaPeriod.createPeriod(mediaPeriodId);
        return maskingMediaPeriod;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(com.google.android.exoplayer2.source.MediaPeriod mediaPeriod) {
        com.google.android.exoplayer2.source.MaskingMediaPeriod maskingMediaPeriod = (com.google.android.exoplayer2.source.MaskingMediaPeriod) mediaPeriod;
        com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId = maskingMediaPeriod.id;
        if (mediaPeriodId.isAd()) {
            com.google.android.exoplayer2.source.ads.AdsMediaSource.AdMediaSourceHolder adMediaSourceHolder = (com.google.android.exoplayer2.source.ads.AdsMediaSource.AdMediaSourceHolder) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup]);
            adMediaSourceHolder.releaseMediaPeriod(maskingMediaPeriod);
            if (adMediaSourceHolder.isInactive()) {
                adMediaSourceHolder.release();
                this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup] = null;
                return;
            }
            return;
        }
        maskingMediaPeriod.releasePeriod();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected void releaseSourceInternal() {
        super.releaseSourceInternal();
        final com.google.android.exoplayer2.source.ads.AdsMediaSource.ComponentListener componentListener = (com.google.android.exoplayer2.source.ads.AdsMediaSource.ComponentListener) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.componentListener);
        this.componentListener = null;
        componentListener.stop();
        this.contentTimeline = null;
        this.adPlaybackState = null;
        this.adMediaSourceHolders = new com.google.android.exoplayer2.source.ads.AdsMediaSource.AdMediaSourceHolder[0][];
        this.mainHandler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.source.ads.AdsMediaSource$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.exoplayer2.source.ads.AdsMediaSource.this.m5432x85e6f6b7(componentListener);
            }
        });
    }

    /* renamed from: lambda$releaseSourceInternal$1$com-google-android-exoplayer2-source-ads-AdsMediaSource, reason: not valid java name */
    /* synthetic */ void m5432x85e6f6b7(com.google.android.exoplayer2.source.ads.AdsMediaSource.ComponentListener componentListener) {
        this.adsLoader.stop(this, componentListener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    /* renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void m5419x365769cd(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.source.MediaSource mediaSource, com.google.android.exoplayer2.Timeline timeline) {
        if (mediaPeriodId.isAd()) {
            ((com.google.android.exoplayer2.source.ads.AdsMediaSource.AdMediaSourceHolder) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup])).handleSourceInfoRefresh(timeline);
        } else {
            com.google.android.exoplayer2.util.Assertions.checkArgument(timeline.getPeriodCount() == 1);
            this.contentTimeline = timeline;
        }
        maybeUpdateSourceInfo();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public com.google.android.exoplayer2.source.MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId2) {
        return mediaPeriodId.isAd() ? mediaPeriodId : mediaPeriodId2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAdPlaybackState(com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState) {
        if (this.adPlaybackState == null) {
            com.google.android.exoplayer2.source.ads.AdsMediaSource.AdMediaSourceHolder[][] adMediaSourceHolderArr = new com.google.android.exoplayer2.source.ads.AdsMediaSource.AdMediaSourceHolder[adPlaybackState.adGroupCount][];
            this.adMediaSourceHolders = adMediaSourceHolderArr;
            java.util.Arrays.fill(adMediaSourceHolderArr, new com.google.android.exoplayer2.source.ads.AdsMediaSource.AdMediaSourceHolder[0]);
        } else {
            com.google.android.exoplayer2.util.Assertions.checkState(adPlaybackState.adGroupCount == this.adPlaybackState.adGroupCount);
        }
        this.adPlaybackState = adPlaybackState;
        maybeUpdateAdMediaSources();
        maybeUpdateSourceInfo();
    }

    private void maybeUpdateAdMediaSources() {
        android.net.Uri uri;
        com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState = this.adPlaybackState;
        if (adPlaybackState == null) {
            return;
        }
        for (int i = 0; i < this.adMediaSourceHolders.length; i++) {
            int i2 = 0;
            while (true) {
                com.google.android.exoplayer2.source.ads.AdsMediaSource.AdMediaSourceHolder[] adMediaSourceHolderArr = this.adMediaSourceHolders[i];
                if (i2 < adMediaSourceHolderArr.length) {
                    com.google.android.exoplayer2.source.ads.AdsMediaSource.AdMediaSourceHolder adMediaSourceHolder = adMediaSourceHolderArr[i2];
                    com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i);
                    if (adMediaSourceHolder != null && !adMediaSourceHolder.hasMediaSource() && i2 < adGroup.uris.length && (uri = adGroup.uris[i2]) != null) {
                        com.google.android.exoplayer2.MediaItem.Builder uri2 = new com.google.android.exoplayer2.MediaItem.Builder().setUri(uri);
                        com.google.android.exoplayer2.MediaItem.LocalConfiguration localConfiguration = this.contentMediaSource.getMediaItem().localConfiguration;
                        if (localConfiguration != null) {
                            uri2.setDrmConfiguration(localConfiguration.drmConfiguration);
                        }
                        adMediaSourceHolder.initializeWithMediaSource(this.adMediaSourceFactory.createMediaSource(uri2.build()), uri);
                    }
                    i2++;
                }
            }
        }
    }

    private void maybeUpdateSourceInfo() {
        com.google.android.exoplayer2.Timeline timeline = this.contentTimeline;
        com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState = this.adPlaybackState;
        if (adPlaybackState == null || timeline == null) {
            return;
        }
        if (adPlaybackState.adGroupCount == 0) {
            refreshSourceInfo(timeline);
        } else {
            this.adPlaybackState = this.adPlaybackState.withAdDurationsUs(getAdDurationsUs());
            refreshSourceInfo(new com.google.android.exoplayer2.source.ads.SinglePeriodAdTimeline(timeline, this.adPlaybackState));
        }
    }

    private long[][] getAdDurationsUs() {
        long[][] jArr = new long[this.adMediaSourceHolders.length][];
        int i = 0;
        while (true) {
            com.google.android.exoplayer2.source.ads.AdsMediaSource.AdMediaSourceHolder[][] adMediaSourceHolderArr = this.adMediaSourceHolders;
            if (i >= adMediaSourceHolderArr.length) {
                return jArr;
            }
            jArr[i] = new long[adMediaSourceHolderArr[i].length];
            int i2 = 0;
            while (true) {
                com.google.android.exoplayer2.source.ads.AdsMediaSource.AdMediaSourceHolder[] adMediaSourceHolderArr2 = this.adMediaSourceHolders[i];
                if (i2 < adMediaSourceHolderArr2.length) {
                    com.google.android.exoplayer2.source.ads.AdsMediaSource.AdMediaSourceHolder adMediaSourceHolder = adMediaSourceHolderArr2[i2];
                    jArr[i][i2] = adMediaSourceHolder == null ? -9223372036854775807L : adMediaSourceHolder.getDurationUs();
                    i2++;
                }
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class ComponentListener implements com.google.android.exoplayer2.source.ads.AdsLoader.EventListener {
        private final android.os.Handler playerHandler = com.google.android.exoplayer2.util.Util.createHandlerForCurrentLooper();
        private volatile boolean stopped;

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public /* synthetic */ void onAdClicked() {
            com.google.android.exoplayer2.source.ads.AdsLoader.EventListener.CC.$default$onAdClicked(this);
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public /* synthetic */ void onAdTapped() {
            com.google.android.exoplayer2.source.ads.AdsLoader.EventListener.CC.$default$onAdTapped(this);
        }

        public ComponentListener() {
        }

        public void stop() {
            this.stopped = true;
            this.playerHandler.removeCallbacksAndMessages(null);
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public void onAdPlaybackState(final com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState) {
            if (this.stopped) {
                return;
            }
            this.playerHandler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.source.ads.AdsMediaSource$ComponentListener$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.exoplayer2.source.ads.AdsMediaSource.ComponentListener.this.m5435x9c1f3358(adPlaybackState);
                }
            });
        }

        /* renamed from: lambda$onAdPlaybackState$0$com-google-android-exoplayer2-source-ads-AdsMediaSource$ComponentListener, reason: not valid java name */
        /* synthetic */ void m5435x9c1f3358(com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState) {
            if (this.stopped) {
                return;
            }
            com.google.android.exoplayer2.source.ads.AdsMediaSource.this.onAdPlaybackState(adPlaybackState);
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public void onAdLoadError(com.google.android.exoplayer2.source.ads.AdsMediaSource.AdLoadException adLoadException, com.google.android.exoplayer2.upstream.DataSpec dataSpec) {
            if (this.stopped) {
                return;
            }
            com.google.android.exoplayer2.source.ads.AdsMediaSource.this.createEventDispatcher(null).loadError(new com.google.android.exoplayer2.source.LoadEventInfo(com.google.android.exoplayer2.source.LoadEventInfo.getNewId(), dataSpec, android.os.SystemClock.elapsedRealtime()), 6, (java.io.IOException) adLoadException, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class AdPrepareListener implements com.google.android.exoplayer2.source.MaskingMediaPeriod.PrepareListener {
        private final android.net.Uri adUri;

        public AdPrepareListener(android.net.Uri uri) {
            this.adUri = uri;
        }

        @Override // com.google.android.exoplayer2.source.MaskingMediaPeriod.PrepareListener
        public void onPrepareComplete(final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
            com.google.android.exoplayer2.source.ads.AdsMediaSource.this.mainHandler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.source.ads.AdsMediaSource$AdPrepareListener$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.exoplayer2.source.ads.AdsMediaSource.AdPrepareListener.this.m5433x605e06cc(mediaPeriodId);
                }
            });
        }

        /* renamed from: lambda$onPrepareComplete$0$com-google-android-exoplayer2-source-ads-AdsMediaSource$AdPrepareListener, reason: not valid java name */
        /* synthetic */ void m5433x605e06cc(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
            com.google.android.exoplayer2.source.ads.AdsMediaSource.this.adsLoader.handlePrepareComplete(com.google.android.exoplayer2.source.ads.AdsMediaSource.this, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        }

        @Override // com.google.android.exoplayer2.source.MaskingMediaPeriod.PrepareListener
        public void onPrepareError(final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, final java.io.IOException iOException) {
            com.google.android.exoplayer2.source.ads.AdsMediaSource.this.createEventDispatcher(mediaPeriodId).loadError(new com.google.android.exoplayer2.source.LoadEventInfo(com.google.android.exoplayer2.source.LoadEventInfo.getNewId(), new com.google.android.exoplayer2.upstream.DataSpec(this.adUri), android.os.SystemClock.elapsedRealtime()), 6, (java.io.IOException) com.google.android.exoplayer2.source.ads.AdsMediaSource.AdLoadException.createForAd(iOException), true);
            com.google.android.exoplayer2.source.ads.AdsMediaSource.this.mainHandler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.source.ads.AdsMediaSource$AdPrepareListener$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.exoplayer2.source.ads.AdsMediaSource.AdPrepareListener.this.m5434x1f837766(mediaPeriodId, iOException);
                }
            });
        }

        /* renamed from: lambda$onPrepareError$1$com-google-android-exoplayer2-source-ads-AdsMediaSource$AdPrepareListener, reason: not valid java name */
        /* synthetic */ void m5434x1f837766(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, java.io.IOException iOException) {
            com.google.android.exoplayer2.source.ads.AdsMediaSource.this.adsLoader.handlePrepareError(com.google.android.exoplayer2.source.ads.AdsMediaSource.this, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, iOException);
        }
    }

    private final class AdMediaSourceHolder {
        private final java.util.List<com.google.android.exoplayer2.source.MaskingMediaPeriod> activeMediaPeriods = new java.util.ArrayList();
        private com.google.android.exoplayer2.source.MediaSource adMediaSource;
        private android.net.Uri adUri;
        private final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId id;
        private com.google.android.exoplayer2.Timeline timeline;

        public AdMediaSourceHolder(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
            this.id = mediaPeriodId;
        }

        public void initializeWithMediaSource(com.google.android.exoplayer2.source.MediaSource mediaSource, android.net.Uri uri) {
            this.adMediaSource = mediaSource;
            this.adUri = uri;
            for (int i = 0; i < this.activeMediaPeriods.size(); i++) {
                com.google.android.exoplayer2.source.MaskingMediaPeriod maskingMediaPeriod = this.activeMediaPeriods.get(i);
                maskingMediaPeriod.setMediaSource(mediaSource);
                maskingMediaPeriod.setPrepareListener(com.google.android.exoplayer2.source.ads.AdsMediaSource.this.new AdPrepareListener(uri));
            }
            com.google.android.exoplayer2.source.ads.AdsMediaSource.this.prepareChildSource(this.id, mediaSource);
        }

        public com.google.android.exoplayer2.source.MediaPeriod createMediaPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.upstream.Allocator allocator, long j) {
            com.google.android.exoplayer2.source.MaskingMediaPeriod maskingMediaPeriod = new com.google.android.exoplayer2.source.MaskingMediaPeriod(mediaPeriodId, allocator, j);
            this.activeMediaPeriods.add(maskingMediaPeriod);
            com.google.android.exoplayer2.source.MediaSource mediaSource = this.adMediaSource;
            if (mediaSource != null) {
                maskingMediaPeriod.setMediaSource(mediaSource);
                maskingMediaPeriod.setPrepareListener(com.google.android.exoplayer2.source.ads.AdsMediaSource.this.new AdPrepareListener((android.net.Uri) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.adUri)));
            }
            com.google.android.exoplayer2.Timeline timeline = this.timeline;
            if (timeline != null) {
                maskingMediaPeriod.createPeriod(new com.google.android.exoplayer2.source.MediaSource.MediaPeriodId(timeline.getUidOfPeriod(0), mediaPeriodId.windowSequenceNumber));
            }
            return maskingMediaPeriod;
        }

        public void handleSourceInfoRefresh(com.google.android.exoplayer2.Timeline timeline) {
            com.google.android.exoplayer2.util.Assertions.checkArgument(timeline.getPeriodCount() == 1);
            if (this.timeline == null) {
                java.lang.Object uidOfPeriod = timeline.getUidOfPeriod(0);
                for (int i = 0; i < this.activeMediaPeriods.size(); i++) {
                    com.google.android.exoplayer2.source.MaskingMediaPeriod maskingMediaPeriod = this.activeMediaPeriods.get(i);
                    maskingMediaPeriod.createPeriod(new com.google.android.exoplayer2.source.MediaSource.MediaPeriodId(uidOfPeriod, maskingMediaPeriod.id.windowSequenceNumber));
                }
            }
            this.timeline = timeline;
        }

        public long getDurationUs() {
            com.google.android.exoplayer2.Timeline timeline = this.timeline;
            if (timeline == null) {
                return -9223372036854775807L;
            }
            return timeline.getPeriod(0, com.google.android.exoplayer2.source.ads.AdsMediaSource.this.period).getDurationUs();
        }

        public void releaseMediaPeriod(com.google.android.exoplayer2.source.MaskingMediaPeriod maskingMediaPeriod) {
            this.activeMediaPeriods.remove(maskingMediaPeriod);
            maskingMediaPeriod.releasePeriod();
        }

        public void release() {
            if (hasMediaSource()) {
                com.google.android.exoplayer2.source.ads.AdsMediaSource.this.releaseChildSource(this.id);
            }
        }

        public boolean hasMediaSource() {
            return this.adMediaSource != null;
        }

        public boolean isInactive() {
            return this.activeMediaPeriods.isEmpty();
        }
    }
}
