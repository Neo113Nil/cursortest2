package androidx.media3.exoplayer.source;

@java.lang.Deprecated
/* loaded from: classes2.dex */
public interface MediaSourceFactory extends androidx.media3.exoplayer.source.MediaSource.Factory {
    public static final androidx.media3.exoplayer.source.MediaSourceFactory UNSUPPORTED = new androidx.media3.exoplayer.source.MediaSourceFactory() { // from class: androidx.media3.exoplayer.source.MediaSourceFactory.1
        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public /* synthetic */ androidx.media3.exoplayer.source.MediaSource.Factory experimentalParseSubtitlesDuringExtraction(boolean z) {
            return androidx.media3.exoplayer.source.MediaSource.Factory.CC.$default$experimentalParseSubtitlesDuringExtraction(this, z);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public /* synthetic */ androidx.media3.exoplayer.source.MediaSource.Factory setCmcdConfigurationFactory(androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory factory) {
            return androidx.media3.exoplayer.source.MediaSource.Factory.CC.$default$setCmcdConfigurationFactory(this, factory);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public androidx.media3.exoplayer.source.MediaSourceFactory setDrmSessionManagerProvider(androidx.media3.exoplayer.drm.DrmSessionManagerProvider drmSessionManagerProvider) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public androidx.media3.exoplayer.source.MediaSourceFactory setLoadErrorHandlingPolicy(androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public /* synthetic */ androidx.media3.exoplayer.source.MediaSource.Factory setSubtitleParserFactory(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
            return androidx.media3.exoplayer.source.MediaSource.Factory.CC.$default$setSubtitleParserFactory(this, factory);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public androidx.media3.exoplayer.source.MediaSource createMediaSource(androidx.media3.common.MediaItem mediaItem) {
            throw new java.lang.UnsupportedOperationException();
        }
    };
}
