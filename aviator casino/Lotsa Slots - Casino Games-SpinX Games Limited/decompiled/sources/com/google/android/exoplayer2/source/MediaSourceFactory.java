package com.google.android.exoplayer2.source;

@java.lang.Deprecated
/* loaded from: classes3.dex */
public interface MediaSourceFactory extends com.google.android.exoplayer2.source.MediaSource.Factory {
    public static final com.google.android.exoplayer2.source.MediaSourceFactory UNSUPPORTED = new com.google.android.exoplayer2.source.MediaSourceFactory() { // from class: com.google.android.exoplayer2.source.MediaSourceFactory.1
        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public com.google.android.exoplayer2.source.MediaSourceFactory setDrmSessionManagerProvider(com.google.android.exoplayer2.drm.DrmSessionManagerProvider drmSessionManagerProvider) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public com.google.android.exoplayer2.source.MediaSourceFactory setLoadErrorHandlingPolicy(com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public com.google.android.exoplayer2.source.MediaSource createMediaSource(com.google.android.exoplayer2.MediaItem mediaItem) {
            throw new java.lang.UnsupportedOperationException();
        }
    };
}
