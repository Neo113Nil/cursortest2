package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
public final class MetadataRetriever {
    private MetadataRetriever() {
    }

    public static com.google.common.util.concurrent.ListenableFuture<com.google.android.exoplayer2.source.TrackGroupArray> retrieveMetadata(android.content.Context context, com.google.android.exoplayer2.MediaItem mediaItem) {
        return retrieveMetadata(context, mediaItem, com.google.android.exoplayer2.util.Clock.DEFAULT);
    }

    public static com.google.common.util.concurrent.ListenableFuture<com.google.android.exoplayer2.source.TrackGroupArray> retrieveMetadata(com.google.android.exoplayer2.source.MediaSource.Factory factory, com.google.android.exoplayer2.MediaItem mediaItem) {
        return retrieveMetadata(factory, mediaItem, com.google.android.exoplayer2.util.Clock.DEFAULT);
    }

    static com.google.common.util.concurrent.ListenableFuture<com.google.android.exoplayer2.source.TrackGroupArray> retrieveMetadata(android.content.Context context, com.google.android.exoplayer2.MediaItem mediaItem, com.google.android.exoplayer2.util.Clock clock) {
        return retrieveMetadata(new com.google.android.exoplayer2.source.DefaultMediaSourceFactory(context, new com.google.android.exoplayer2.extractor.DefaultExtractorsFactory().setMp4ExtractorFlags(6)), mediaItem, clock);
    }

    private static com.google.common.util.concurrent.ListenableFuture<com.google.android.exoplayer2.source.TrackGroupArray> retrieveMetadata(com.google.android.exoplayer2.source.MediaSource.Factory factory, com.google.android.exoplayer2.MediaItem mediaItem, com.google.android.exoplayer2.util.Clock clock) {
        return new com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal(factory, clock).retrieveMetadata(mediaItem);
    }

    private static final class MetadataRetrieverInternal {
        private static final int MESSAGE_CHECK_FOR_FAILURE = 1;
        private static final int MESSAGE_CONTINUE_LOADING = 2;
        private static final int MESSAGE_PREPARE_SOURCE = 0;
        private static final int MESSAGE_RELEASE = 3;
        private final com.google.android.exoplayer2.source.MediaSource.Factory mediaSourceFactory;
        private final com.google.android.exoplayer2.util.HandlerWrapper mediaSourceHandler;
        private final android.os.HandlerThread mediaSourceThread;
        private final com.google.common.util.concurrent.SettableFuture<com.google.android.exoplayer2.source.TrackGroupArray> trackGroupsFuture;

        public MetadataRetrieverInternal(com.google.android.exoplayer2.source.MediaSource.Factory factory, com.google.android.exoplayer2.util.Clock clock) {
            this.mediaSourceFactory = factory;
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExoPlayer:MetadataRetriever");
            this.mediaSourceThread = handlerThread;
            handlerThread.start();
            this.mediaSourceHandler = clock.createHandler(handlerThread.getLooper(), new com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.MediaSourceHandlerCallback());
            this.trackGroupsFuture = com.google.common.util.concurrent.SettableFuture.create();
        }

        public com.google.common.util.concurrent.ListenableFuture<com.google.android.exoplayer2.source.TrackGroupArray> retrieveMetadata(com.google.android.exoplayer2.MediaItem mediaItem) {
            this.mediaSourceHandler.obtainMessage(0, mediaItem).sendToTarget();
            return this.trackGroupsFuture;
        }

        private final class MediaSourceHandlerCallback implements android.os.Handler.Callback {
            private static final int ERROR_POLL_INTERVAL_MS = 100;
            private com.google.android.exoplayer2.source.MediaPeriod mediaPeriod;
            private com.google.android.exoplayer2.source.MediaSource mediaSource;
            private final com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.MediaSourceHandlerCallback.MediaSourceCaller mediaSourceCaller = new com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.MediaSourceHandlerCallback.MediaSourceCaller();

            public MediaSourceHandlerCallback() {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(android.os.Message message) {
                int i = message.what;
                if (i == 0) {
                    com.google.android.exoplayer2.source.MediaSource createMediaSource = com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.this.mediaSourceFactory.createMediaSource((com.google.android.exoplayer2.MediaItem) message.obj);
                    this.mediaSource = createMediaSource;
                    createMediaSource.prepareSource(this.mediaSourceCaller, null, com.google.android.exoplayer2.analytics.PlayerId.UNSET);
                    com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.this.mediaSourceHandler.sendEmptyMessage(1);
                    return true;
                }
                if (i == 1) {
                    try {
                        com.google.android.exoplayer2.source.MediaPeriod mediaPeriod = this.mediaPeriod;
                        if (mediaPeriod == null) {
                            ((com.google.android.exoplayer2.source.MediaSource) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.mediaSource)).maybeThrowSourceInfoRefreshError();
                        } else {
                            mediaPeriod.maybeThrowPrepareError();
                        }
                        com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.this.mediaSourceHandler.sendEmptyMessageDelayed(1, 100);
                    } catch (java.lang.Exception e) {
                        com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.this.trackGroupsFuture.setException(e);
                        com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.this.mediaSourceHandler.obtainMessage(3).sendToTarget();
                    }
                    return true;
                }
                if (i == 2) {
                    ((com.google.android.exoplayer2.source.MediaPeriod) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.mediaPeriod)).continueLoading(0L);
                    return true;
                }
                if (i != 3) {
                    return false;
                }
                if (this.mediaPeriod != null) {
                    ((com.google.android.exoplayer2.source.MediaSource) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.mediaSource)).releasePeriod(this.mediaPeriod);
                }
                ((com.google.android.exoplayer2.source.MediaSource) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.mediaSource)).releaseSource(this.mediaSourceCaller);
                com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.this.mediaSourceHandler.removeCallbacksAndMessages(null);
                com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.this.mediaSourceThread.quit();
                return true;
            }

            private final class MediaSourceCaller implements com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller {
                private boolean mediaPeriodCreated;
                private final com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.MediaSourceHandlerCallback.MediaSourceCaller.MediaPeriodCallback mediaPeriodCallback = new com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.MediaSourceHandlerCallback.MediaSourceCaller.MediaPeriodCallback();
                private final com.google.android.exoplayer2.upstream.Allocator allocator = new com.google.android.exoplayer2.upstream.DefaultAllocator(true, 65536);

                public MediaSourceCaller() {
                }

                @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
                public void onSourceInfoRefreshed(com.google.android.exoplayer2.source.MediaSource mediaSource, com.google.android.exoplayer2.Timeline timeline) {
                    if (this.mediaPeriodCreated) {
                        return;
                    }
                    this.mediaPeriodCreated = true;
                    com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.MediaSourceHandlerCallback.this.mediaPeriod = mediaSource.createPeriod(new com.google.android.exoplayer2.source.MediaSource.MediaPeriodId(timeline.getUidOfPeriod(0)), this.allocator, 0L);
                    com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.MediaSourceHandlerCallback.this.mediaPeriod.prepare(this.mediaPeriodCallback, 0L);
                }

                private final class MediaPeriodCallback implements com.google.android.exoplayer2.source.MediaPeriod.Callback {
                    private MediaPeriodCallback() {
                    }

                    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
                    public void onPrepared(com.google.android.exoplayer2.source.MediaPeriod mediaPeriod) {
                        com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.this.trackGroupsFuture.set(mediaPeriod.getTrackGroups());
                        com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.this.mediaSourceHandler.obtainMessage(3).sendToTarget();
                    }

                    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
                    public void onContinueLoadingRequested(com.google.android.exoplayer2.source.MediaPeriod mediaPeriod) {
                        com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.this.mediaSourceHandler.obtainMessage(2).sendToTarget();
                    }
                }
            }
        }
    }
}
