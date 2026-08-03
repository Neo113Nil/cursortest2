package com.google.android.exoplayer2.source;

/* loaded from: classes3.dex */
public final class DefaultMediaSourceFactory implements com.google.android.exoplayer2.source.MediaSourceFactory {
    private static final java.lang.String TAG = "DMediaSourceFactory";
    private com.google.android.exoplayer2.ui.AdViewProvider adViewProvider;
    private com.google.android.exoplayer2.source.ads.AdsLoader.Provider adsLoaderProvider;
    private com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
    private final com.google.android.exoplayer2.source.DefaultMediaSourceFactory.DelegateFactoryLoader delegateFactoryLoader;
    private long liveMaxOffsetMs;
    private float liveMaxSpeed;
    private long liveMinOffsetMs;
    private float liveMinSpeed;
    private long liveTargetOffsetMs;
    private com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private com.google.android.exoplayer2.source.MediaSource.Factory serverSideAdInsertionMediaSourceFactory;
    private boolean useProgressiveMediaSourceForSubtitles;

    @java.lang.Deprecated
    public interface AdsLoaderProvider extends com.google.android.exoplayer2.source.ads.AdsLoader.Provider {
    }

    public DefaultMediaSourceFactory(android.content.Context context) {
        this(new com.google.android.exoplayer2.upstream.DefaultDataSource.Factory(context));
    }

    public DefaultMediaSourceFactory(android.content.Context context, com.google.android.exoplayer2.extractor.ExtractorsFactory extractorsFactory) {
        this(new com.google.android.exoplayer2.upstream.DefaultDataSource.Factory(context), extractorsFactory);
    }

    public DefaultMediaSourceFactory(com.google.android.exoplayer2.upstream.DataSource.Factory factory) {
        this(factory, new com.google.android.exoplayer2.extractor.DefaultExtractorsFactory());
    }

    public DefaultMediaSourceFactory(com.google.android.exoplayer2.upstream.DataSource.Factory factory, com.google.android.exoplayer2.extractor.ExtractorsFactory extractorsFactory) {
        this.dataSourceFactory = factory;
        com.google.android.exoplayer2.source.DefaultMediaSourceFactory.DelegateFactoryLoader delegateFactoryLoader = new com.google.android.exoplayer2.source.DefaultMediaSourceFactory.DelegateFactoryLoader(extractorsFactory);
        this.delegateFactoryLoader = delegateFactoryLoader;
        delegateFactoryLoader.setDataSourceFactory(factory);
        this.liveTargetOffsetMs = -9223372036854775807L;
        this.liveMinOffsetMs = -9223372036854775807L;
        this.liveMaxOffsetMs = -9223372036854775807L;
        this.liveMinSpeed = -3.4028235E38f;
        this.liveMaxSpeed = -3.4028235E38f;
    }

    public com.google.android.exoplayer2.source.DefaultMediaSourceFactory experimentalUseProgressiveMediaSourceForSubtitles(boolean z) {
        this.useProgressiveMediaSourceForSubtitles = z;
        return this;
    }

    @java.lang.Deprecated
    public com.google.android.exoplayer2.source.DefaultMediaSourceFactory setAdsLoaderProvider(com.google.android.exoplayer2.source.ads.AdsLoader.Provider provider) {
        this.adsLoaderProvider = provider;
        return this;
    }

    @java.lang.Deprecated
    public com.google.android.exoplayer2.source.DefaultMediaSourceFactory setAdViewProvider(com.google.android.exoplayer2.ui.AdViewProvider adViewProvider) {
        this.adViewProvider = adViewProvider;
        return this;
    }

    public com.google.android.exoplayer2.source.DefaultMediaSourceFactory setLocalAdInsertionComponents(com.google.android.exoplayer2.source.ads.AdsLoader.Provider provider, com.google.android.exoplayer2.ui.AdViewProvider adViewProvider) {
        this.adsLoaderProvider = (com.google.android.exoplayer2.source.ads.AdsLoader.Provider) com.google.android.exoplayer2.util.Assertions.checkNotNull(provider);
        this.adViewProvider = (com.google.android.exoplayer2.ui.AdViewProvider) com.google.android.exoplayer2.util.Assertions.checkNotNull(adViewProvider);
        return this;
    }

    public com.google.android.exoplayer2.source.DefaultMediaSourceFactory clearLocalAdInsertionComponents() {
        this.adsLoaderProvider = null;
        this.adViewProvider = null;
        return this;
    }

    public com.google.android.exoplayer2.source.DefaultMediaSourceFactory setDataSourceFactory(com.google.android.exoplayer2.upstream.DataSource.Factory factory) {
        this.dataSourceFactory = factory;
        this.delegateFactoryLoader.setDataSourceFactory(factory);
        return this;
    }

    public com.google.android.exoplayer2.source.DefaultMediaSourceFactory setServerSideAdInsertionMediaSourceFactory(com.google.android.exoplayer2.source.MediaSource.Factory factory) {
        this.serverSideAdInsertionMediaSourceFactory = factory;
        return this;
    }

    public com.google.android.exoplayer2.source.DefaultMediaSourceFactory setLiveTargetOffsetMs(long j) {
        this.liveTargetOffsetMs = j;
        return this;
    }

    public com.google.android.exoplayer2.source.DefaultMediaSourceFactory setLiveMinOffsetMs(long j) {
        this.liveMinOffsetMs = j;
        return this;
    }

    public com.google.android.exoplayer2.source.DefaultMediaSourceFactory setLiveMaxOffsetMs(long j) {
        this.liveMaxOffsetMs = j;
        return this;
    }

    public com.google.android.exoplayer2.source.DefaultMediaSourceFactory setLiveMinSpeed(float f) {
        this.liveMinSpeed = f;
        return this;
    }

    public com.google.android.exoplayer2.source.DefaultMediaSourceFactory setLiveMaxSpeed(float f) {
        this.liveMaxSpeed = f;
        return this;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.Factory
    public com.google.android.exoplayer2.source.DefaultMediaSourceFactory setDrmSessionManagerProvider(com.google.android.exoplayer2.drm.DrmSessionManagerProvider drmSessionManagerProvider) {
        this.delegateFactoryLoader.setDrmSessionManagerProvider((com.google.android.exoplayer2.drm.DrmSessionManagerProvider) com.google.android.exoplayer2.util.Assertions.checkNotNull(drmSessionManagerProvider, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.Factory
    public com.google.android.exoplayer2.source.DefaultMediaSourceFactory setLoadErrorHandlingPolicy(com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        this.loadErrorHandlingPolicy = (com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy) com.google.android.exoplayer2.util.Assertions.checkNotNull(loadErrorHandlingPolicy, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.delegateFactoryLoader.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
        return this;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.Factory
    public int[] getSupportedTypes() {
        return this.delegateFactoryLoader.getSupportedTypes();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.Factory
    public com.google.android.exoplayer2.source.MediaSource createMediaSource(com.google.android.exoplayer2.MediaItem mediaItem) {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(mediaItem.localConfiguration);
        java.lang.String scheme = mediaItem.localConfiguration.uri.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((com.google.android.exoplayer2.source.MediaSource.Factory) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.serverSideAdInsertionMediaSourceFactory)).createMediaSource(mediaItem);
        }
        int inferContentTypeForUriAndMimeType = com.google.android.exoplayer2.util.Util.inferContentTypeForUriAndMimeType(mediaItem.localConfiguration.uri, mediaItem.localConfiguration.mimeType);
        com.google.android.exoplayer2.source.MediaSource.Factory mediaSourceFactory = this.delegateFactoryLoader.getMediaSourceFactory(inferContentTypeForUriAndMimeType);
        com.google.android.exoplayer2.util.Assertions.checkStateNotNull(mediaSourceFactory, "No suitable media source factory found for content type: " + inferContentTypeForUriAndMimeType);
        com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder buildUpon = mediaItem.liveConfiguration.buildUpon();
        if (mediaItem.liveConfiguration.targetOffsetMs == -9223372036854775807L) {
            buildUpon.setTargetOffsetMs(this.liveTargetOffsetMs);
        }
        if (mediaItem.liveConfiguration.minPlaybackSpeed == -3.4028235E38f) {
            buildUpon.setMinPlaybackSpeed(this.liveMinSpeed);
        }
        if (mediaItem.liveConfiguration.maxPlaybackSpeed == -3.4028235E38f) {
            buildUpon.setMaxPlaybackSpeed(this.liveMaxSpeed);
        }
        if (mediaItem.liveConfiguration.minOffsetMs == -9223372036854775807L) {
            buildUpon.setMinOffsetMs(this.liveMinOffsetMs);
        }
        if (mediaItem.liveConfiguration.maxOffsetMs == -9223372036854775807L) {
            buildUpon.setMaxOffsetMs(this.liveMaxOffsetMs);
        }
        com.google.android.exoplayer2.MediaItem.LiveConfiguration build = buildUpon.build();
        if (!build.equals(mediaItem.liveConfiguration)) {
            mediaItem = mediaItem.buildUpon().setLiveConfiguration(build).build();
        }
        com.google.android.exoplayer2.source.MediaSource createMediaSource = mediaSourceFactory.createMediaSource(mediaItem);
        com.google.common.collect.ImmutableList<com.google.android.exoplayer2.MediaItem.SubtitleConfiguration> immutableList = ((com.google.android.exoplayer2.MediaItem.LocalConfiguration) com.google.android.exoplayer2.util.Util.castNonNull(mediaItem.localConfiguration)).subtitleConfigurations;
        if (!immutableList.isEmpty()) {
            com.google.android.exoplayer2.source.MediaSource[] mediaSourceArr = new com.google.android.exoplayer2.source.MediaSource[immutableList.size() + 1];
            mediaSourceArr[0] = createMediaSource;
            for (int i = 0; i < immutableList.size(); i++) {
                if (this.useProgressiveMediaSourceForSubtitles) {
                    final com.google.android.exoplayer2.Format build2 = new com.google.android.exoplayer2.Format.Builder().setSampleMimeType(immutableList.get(i).mimeType).setLanguage(immutableList.get(i).language).setSelectionFlags(immutableList.get(i).selectionFlags).setRoleFlags(immutableList.get(i).roleFlags).setLabel(immutableList.get(i).label).setId(immutableList.get(i).id).build();
                    com.google.android.exoplayer2.source.ProgressiveMediaSource.Factory factory = new com.google.android.exoplayer2.source.ProgressiveMediaSource.Factory(this.dataSourceFactory, new com.google.android.exoplayer2.extractor.ExtractorsFactory() { // from class: com.google.android.exoplayer2.source.DefaultMediaSourceFactory$$ExternalSyntheticLambda0
                        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
                        public final com.google.android.exoplayer2.extractor.Extractor[] createExtractors() {
                            return com.google.android.exoplayer2.source.DefaultMediaSourceFactory.lambda$createMediaSource$0(com.google.android.exoplayer2.Format.this);
                        }

                        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
                        public /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] createExtractors(android.net.Uri uri, java.util.Map map) {
                            com.google.android.exoplayer2.extractor.Extractor[] createExtractors;
                            createExtractors = createExtractors();
                            return createExtractors;
                        }
                    });
                    com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
                    if (loadErrorHandlingPolicy != null) {
                        factory.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
                    }
                    mediaSourceArr[i + 1] = factory.createMediaSource(com.google.android.exoplayer2.MediaItem.fromUri(immutableList.get(i).uri.toString()));
                } else {
                    com.google.android.exoplayer2.source.SingleSampleMediaSource.Factory factory2 = new com.google.android.exoplayer2.source.SingleSampleMediaSource.Factory(this.dataSourceFactory);
                    com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy2 = this.loadErrorHandlingPolicy;
                    if (loadErrorHandlingPolicy2 != null) {
                        factory2.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy2);
                    }
                    mediaSourceArr[i + 1] = factory2.createMediaSource(immutableList.get(i), -9223372036854775807L);
                }
            }
            createMediaSource = new com.google.android.exoplayer2.source.MergingMediaSource(mediaSourceArr);
        }
        return maybeWrapWithAdsMediaSource(mediaItem, maybeClipMediaSource(mediaItem, createMediaSource));
    }

    static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] lambda$createMediaSource$0(com.google.android.exoplayer2.Format format) {
        com.google.android.exoplayer2.extractor.Extractor unknownSubtitlesExtractor;
        com.google.android.exoplayer2.extractor.Extractor[] extractorArr = new com.google.android.exoplayer2.extractor.Extractor[1];
        if (com.google.android.exoplayer2.text.SubtitleDecoderFactory.DEFAULT.supportsFormat(format)) {
            unknownSubtitlesExtractor = new com.google.android.exoplayer2.text.SubtitleExtractor(com.google.android.exoplayer2.text.SubtitleDecoderFactory.DEFAULT.createDecoder(format), format);
        } else {
            unknownSubtitlesExtractor = new com.google.android.exoplayer2.source.DefaultMediaSourceFactory.UnknownSubtitlesExtractor(format);
        }
        extractorArr[0] = unknownSubtitlesExtractor;
        return extractorArr;
    }

    private static com.google.android.exoplayer2.source.MediaSource maybeClipMediaSource(com.google.android.exoplayer2.MediaItem mediaItem, com.google.android.exoplayer2.source.MediaSource mediaSource) {
        return (mediaItem.clippingConfiguration.startPositionMs == 0 && mediaItem.clippingConfiguration.endPositionMs == Long.MIN_VALUE && !mediaItem.clippingConfiguration.relativeToDefaultPosition) ? mediaSource : new com.google.android.exoplayer2.source.ClippingMediaSource(mediaSource, com.google.android.exoplayer2.util.Util.msToUs(mediaItem.clippingConfiguration.startPositionMs), com.google.android.exoplayer2.util.Util.msToUs(mediaItem.clippingConfiguration.endPositionMs), !mediaItem.clippingConfiguration.startsAtKeyFrame, mediaItem.clippingConfiguration.relativeToLiveWindow, mediaItem.clippingConfiguration.relativeToDefaultPosition);
    }

    private com.google.android.exoplayer2.source.MediaSource maybeWrapWithAdsMediaSource(com.google.android.exoplayer2.MediaItem mediaItem, com.google.android.exoplayer2.source.MediaSource mediaSource) {
        java.lang.Object of;
        com.google.android.exoplayer2.util.Assertions.checkNotNull(mediaItem.localConfiguration);
        com.google.android.exoplayer2.MediaItem.AdsConfiguration adsConfiguration = mediaItem.localConfiguration.adsConfiguration;
        if (adsConfiguration == null) {
            return mediaSource;
        }
        com.google.android.exoplayer2.source.ads.AdsLoader.Provider provider = this.adsLoaderProvider;
        com.google.android.exoplayer2.ui.AdViewProvider adViewProvider = this.adViewProvider;
        if (provider == null || adViewProvider == null) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return mediaSource;
        }
        com.google.android.exoplayer2.source.ads.AdsLoader adsLoader = provider.getAdsLoader(adsConfiguration);
        if (adsLoader == null) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Playing media without ads, as no AdsLoader was provided.");
            return mediaSource;
        }
        com.google.android.exoplayer2.upstream.DataSpec dataSpec = new com.google.android.exoplayer2.upstream.DataSpec(adsConfiguration.adTagUri);
        if (adsConfiguration.adsId != null) {
            of = adsConfiguration.adsId;
        } else {
            of = com.google.common.collect.ImmutableList.of((android.net.Uri) mediaItem.mediaId, mediaItem.localConfiguration.uri, adsConfiguration.adTagUri);
        }
        return new com.google.android.exoplayer2.source.ads.AdsMediaSource(mediaSource, dataSpec, of, this, adsLoader, adViewProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class DelegateFactoryLoader {
        private com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
        private com.google.android.exoplayer2.drm.DrmSessionManagerProvider drmSessionManagerProvider;
        private final com.google.android.exoplayer2.extractor.ExtractorsFactory extractorsFactory;
        private com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private final java.util.Map<java.lang.Integer, com.google.common.base.Supplier<com.google.android.exoplayer2.source.MediaSource.Factory>> mediaSourceFactorySuppliers = new java.util.HashMap();
        private final java.util.Set<java.lang.Integer> supportedTypes = new java.util.HashSet();
        private final java.util.Map<java.lang.Integer, com.google.android.exoplayer2.source.MediaSource.Factory> mediaSourceFactories = new java.util.HashMap();

        public DelegateFactoryLoader(com.google.android.exoplayer2.extractor.ExtractorsFactory extractorsFactory) {
            this.extractorsFactory = extractorsFactory;
        }

        public int[] getSupportedTypes() {
            ensureAllSuppliersAreLoaded();
            return com.google.common.primitives.Ints.toArray(this.supportedTypes);
        }

        public com.google.android.exoplayer2.source.MediaSource.Factory getMediaSourceFactory(int i) {
            com.google.android.exoplayer2.source.MediaSource.Factory factory = this.mediaSourceFactories.get(java.lang.Integer.valueOf(i));
            if (factory != null) {
                return factory;
            }
            com.google.common.base.Supplier<com.google.android.exoplayer2.source.MediaSource.Factory> maybeLoadSupplier = maybeLoadSupplier(i);
            if (maybeLoadSupplier == null) {
                return null;
            }
            com.google.android.exoplayer2.source.MediaSource.Factory factory2 = maybeLoadSupplier.get();
            com.google.android.exoplayer2.drm.DrmSessionManagerProvider drmSessionManagerProvider = this.drmSessionManagerProvider;
            if (drmSessionManagerProvider != null) {
                factory2.setDrmSessionManagerProvider(drmSessionManagerProvider);
            }
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
            if (loadErrorHandlingPolicy != null) {
                factory2.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            }
            this.mediaSourceFactories.put(java.lang.Integer.valueOf(i), factory2);
            return factory2;
        }

        public void setDataSourceFactory(com.google.android.exoplayer2.upstream.DataSource.Factory factory) {
            if (factory != this.dataSourceFactory) {
                this.dataSourceFactory = factory;
                this.mediaSourceFactorySuppliers.clear();
                this.mediaSourceFactories.clear();
            }
        }

        public void setDrmSessionManagerProvider(com.google.android.exoplayer2.drm.DrmSessionManagerProvider drmSessionManagerProvider) {
            this.drmSessionManagerProvider = drmSessionManagerProvider;
            java.util.Iterator<com.google.android.exoplayer2.source.MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setDrmSessionManagerProvider(drmSessionManagerProvider);
            }
        }

        public void setLoadErrorHandlingPolicy(com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            java.util.Iterator<com.google.android.exoplayer2.source.MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            }
        }

        private void ensureAllSuppliersAreLoaded() {
            maybeLoadSupplier(0);
            maybeLoadSupplier(1);
            maybeLoadSupplier(2);
            maybeLoadSupplier(3);
            maybeLoadSupplier(4);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private com.google.common.base.Supplier<com.google.android.exoplayer2.source.MediaSource.Factory> maybeLoadSupplier(int i) {
            com.google.common.base.Supplier<com.google.android.exoplayer2.source.MediaSource.Factory> supplier;
            com.google.common.base.Supplier<com.google.android.exoplayer2.source.MediaSource.Factory> supplier2;
            if (this.mediaSourceFactorySuppliers.containsKey(java.lang.Integer.valueOf(i))) {
                return this.mediaSourceFactorySuppliers.get(java.lang.Integer.valueOf(i));
            }
            final com.google.android.exoplayer2.upstream.DataSource.Factory factory = (com.google.android.exoplayer2.upstream.DataSource.Factory) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.dataSourceFactory);
            com.google.common.base.Supplier<com.google.android.exoplayer2.source.MediaSource.Factory> supplier3 = null;
            if (i == 0) {
                final java.lang.Class<? extends U> asSubclass = java.lang.Class.forName("com.google.android.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(com.google.android.exoplayer2.source.MediaSource.Factory.class);
                supplier = new com.google.common.base.Supplier() { // from class: com.google.android.exoplayer2.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda0
                    @Override // com.google.common.base.Supplier
                    public final java.lang.Object get() {
                        com.google.android.exoplayer2.source.MediaSource.Factory newInstance;
                        newInstance = com.google.android.exoplayer2.source.DefaultMediaSourceFactory.newInstance(asSubclass, factory);
                        return newInstance;
                    }
                };
            } else if (i == 1) {
                final java.lang.Class<? extends U> asSubclass2 = java.lang.Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(com.google.android.exoplayer2.source.MediaSource.Factory.class);
                supplier = new com.google.common.base.Supplier() { // from class: com.google.android.exoplayer2.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda1
                    @Override // com.google.common.base.Supplier
                    public final java.lang.Object get() {
                        com.google.android.exoplayer2.source.MediaSource.Factory newInstance;
                        newInstance = com.google.android.exoplayer2.source.DefaultMediaSourceFactory.newInstance(asSubclass2, factory);
                        return newInstance;
                    }
                };
            } else if (i == 2) {
                final java.lang.Class<? extends U> asSubclass3 = java.lang.Class.forName("com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(com.google.android.exoplayer2.source.MediaSource.Factory.class);
                supplier = new com.google.common.base.Supplier() { // from class: com.google.android.exoplayer2.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda2
                    @Override // com.google.common.base.Supplier
                    public final java.lang.Object get() {
                        com.google.android.exoplayer2.source.MediaSource.Factory newInstance;
                        newInstance = com.google.android.exoplayer2.source.DefaultMediaSourceFactory.newInstance(asSubclass3, factory);
                        return newInstance;
                    }
                };
            } else {
                if (i == 3) {
                    final java.lang.Class<? extends U> asSubclass4 = java.lang.Class.forName("com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(com.google.android.exoplayer2.source.MediaSource.Factory.class);
                    supplier2 = new com.google.common.base.Supplier() { // from class: com.google.android.exoplayer2.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda3
                        @Override // com.google.common.base.Supplier
                        public final java.lang.Object get() {
                            com.google.android.exoplayer2.source.MediaSource.Factory newInstance;
                            newInstance = com.google.android.exoplayer2.source.DefaultMediaSourceFactory.newInstance(asSubclass4);
                            return newInstance;
                        }
                    };
                } else {
                    if (i == 4) {
                        supplier2 = new com.google.common.base.Supplier() { // from class: com.google.android.exoplayer2.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda4
                            @Override // com.google.common.base.Supplier
                            public final java.lang.Object get() {
                                return com.google.android.exoplayer2.source.DefaultMediaSourceFactory.DelegateFactoryLoader.this.m5420x654ff537(factory);
                            }
                        };
                    }
                    this.mediaSourceFactorySuppliers.put(java.lang.Integer.valueOf(i), supplier3);
                    if (supplier3 != null) {
                        this.supportedTypes.add(java.lang.Integer.valueOf(i));
                    }
                    return supplier3;
                }
                supplier3 = supplier2;
                this.mediaSourceFactorySuppliers.put(java.lang.Integer.valueOf(i), supplier3);
                if (supplier3 != null) {
                }
                return supplier3;
            }
            supplier3 = supplier;
            this.mediaSourceFactorySuppliers.put(java.lang.Integer.valueOf(i), supplier3);
            if (supplier3 != null) {
            }
            return supplier3;
        }

        /* renamed from: lambda$maybeLoadSupplier$4$com-google-android-exoplayer2-source-DefaultMediaSourceFactory$DelegateFactoryLoader, reason: not valid java name */
        /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory m5420x654ff537(com.google.android.exoplayer2.upstream.DataSource.Factory factory) {
            return new com.google.android.exoplayer2.source.ProgressiveMediaSource.Factory(factory, this.extractorsFactory);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class UnknownSubtitlesExtractor implements com.google.android.exoplayer2.extractor.Extractor {
        private final com.google.android.exoplayer2.Format format;

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public void release() {
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public void seek(long j, long j2) {
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public boolean sniff(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) {
            return true;
        }

        public UnknownSubtitlesExtractor(com.google.android.exoplayer2.Format format) {
            this.format = format;
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public void init(com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput) {
            com.google.android.exoplayer2.extractor.TrackOutput track = extractorOutput.track(0, 3);
            extractorOutput.seekMap(new com.google.android.exoplayer2.extractor.SeekMap.Unseekable(-9223372036854775807L));
            extractorOutput.endTracks();
            track.format(this.format.buildUpon().setSampleMimeType("text/x-unknown").setCodecs(this.format.sampleMimeType).build());
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public int read(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput, com.google.android.exoplayer2.extractor.PositionHolder positionHolder) throws java.io.IOException {
            return extractorInput.skip(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.exoplayer2.source.MediaSource.Factory newInstance(java.lang.Class<? extends com.google.android.exoplayer2.source.MediaSource.Factory> cls, com.google.android.exoplayer2.upstream.DataSource.Factory factory) {
        try {
            return cls.getConstructor(com.google.android.exoplayer2.upstream.DataSource.Factory.class).newInstance(factory);
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.exoplayer2.source.MediaSource.Factory newInstance(java.lang.Class<? extends com.google.android.exoplayer2.source.MediaSource.Factory> cls) {
        try {
            return cls.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalStateException(e);
        }
    }
}
