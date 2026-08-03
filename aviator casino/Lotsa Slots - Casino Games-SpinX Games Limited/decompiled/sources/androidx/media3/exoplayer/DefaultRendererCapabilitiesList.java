package androidx.media3.exoplayer;

/* loaded from: classes2.dex */
public final class DefaultRendererCapabilitiesList implements androidx.media3.exoplayer.RendererCapabilitiesList {
    private final androidx.media3.exoplayer.Renderer[] renderers;

    public static final class Factory implements androidx.media3.exoplayer.RendererCapabilitiesList.Factory {
        private final androidx.media3.exoplayer.RenderersFactory renderersFactory;

        static /* synthetic */ void lambda$createRendererCapabilitiesList$0(androidx.media3.common.text.CueGroup cueGroup) {
        }

        static /* synthetic */ void lambda$createRendererCapabilitiesList$1(androidx.media3.common.Metadata metadata) {
        }

        public Factory(android.content.Context context) {
            this.renderersFactory = new androidx.media3.exoplayer.DefaultRenderersFactory(context);
        }

        public Factory(androidx.media3.exoplayer.RenderersFactory renderersFactory) {
            this.renderersFactory = renderersFactory;
        }

        @Override // androidx.media3.exoplayer.RendererCapabilitiesList.Factory
        public androidx.media3.exoplayer.DefaultRendererCapabilitiesList createRendererCapabilitiesList() {
            return new androidx.media3.exoplayer.DefaultRendererCapabilitiesList(this.renderersFactory.createRenderers(androidx.media3.common.util.Util.createHandlerForCurrentOrMainLooper(), new androidx.media3.exoplayer.video.VideoRendererEventListener() { // from class: androidx.media3.exoplayer.DefaultRendererCapabilitiesList.Factory.1
                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public /* synthetic */ void onDroppedFrames(int i, long j) {
                    androidx.media3.exoplayer.video.VideoRendererEventListener.CC.$default$onDroppedFrames(this, i, j);
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public /* synthetic */ void onRenderedFirstFrame(java.lang.Object obj, long j) {
                    androidx.media3.exoplayer.video.VideoRendererEventListener.CC.$default$onRenderedFirstFrame(this, obj, j);
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public /* synthetic */ void onVideoCodecError(java.lang.Exception exc) {
                    androidx.media3.exoplayer.video.VideoRendererEventListener.CC.$default$onVideoCodecError(this, exc);
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public /* synthetic */ void onVideoDecoderInitialized(java.lang.String str, long j, long j2) {
                    androidx.media3.exoplayer.video.VideoRendererEventListener.CC.$default$onVideoDecoderInitialized(this, str, j, j2);
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public /* synthetic */ void onVideoDecoderReleased(java.lang.String str) {
                    androidx.media3.exoplayer.video.VideoRendererEventListener.CC.$default$onVideoDecoderReleased(this, str);
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public /* synthetic */ void onVideoDisabled(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
                    androidx.media3.exoplayer.video.VideoRendererEventListener.CC.$default$onVideoDisabled(this, decoderCounters);
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public /* synthetic */ void onVideoEnabled(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
                    androidx.media3.exoplayer.video.VideoRendererEventListener.CC.$default$onVideoEnabled(this, decoderCounters);
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public /* synthetic */ void onVideoFrameProcessingOffset(long j, int i) {
                    androidx.media3.exoplayer.video.VideoRendererEventListener.CC.$default$onVideoFrameProcessingOffset(this, j, i);
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public /* synthetic */ void onVideoInputFormatChanged(androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
                    androidx.media3.exoplayer.video.VideoRendererEventListener.CC.$default$onVideoInputFormatChanged(this, format, decoderReuseEvaluation);
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public /* synthetic */ void onVideoSizeChanged(androidx.media3.common.VideoSize videoSize) {
                    androidx.media3.exoplayer.video.VideoRendererEventListener.CC.$default$onVideoSizeChanged(this, videoSize);
                }
            }, new androidx.media3.exoplayer.audio.AudioRendererEventListener() { // from class: androidx.media3.exoplayer.DefaultRendererCapabilitiesList.Factory.2
                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public /* synthetic */ void onAudioCodecError(java.lang.Exception exc) {
                    androidx.media3.exoplayer.audio.AudioRendererEventListener.CC.$default$onAudioCodecError(this, exc);
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public /* synthetic */ void onAudioDecoderInitialized(java.lang.String str, long j, long j2) {
                    androidx.media3.exoplayer.audio.AudioRendererEventListener.CC.$default$onAudioDecoderInitialized(this, str, j, j2);
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public /* synthetic */ void onAudioDecoderReleased(java.lang.String str) {
                    androidx.media3.exoplayer.audio.AudioRendererEventListener.CC.$default$onAudioDecoderReleased(this, str);
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public /* synthetic */ void onAudioDisabled(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
                    androidx.media3.exoplayer.audio.AudioRendererEventListener.CC.$default$onAudioDisabled(this, decoderCounters);
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public /* synthetic */ void onAudioEnabled(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
                    androidx.media3.exoplayer.audio.AudioRendererEventListener.CC.$default$onAudioEnabled(this, decoderCounters);
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public /* synthetic */ void onAudioInputFormatChanged(androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
                    androidx.media3.exoplayer.audio.AudioRendererEventListener.CC.$default$onAudioInputFormatChanged(this, format, decoderReuseEvaluation);
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public /* synthetic */ void onAudioPositionAdvancing(long j) {
                    androidx.media3.exoplayer.audio.AudioRendererEventListener.CC.$default$onAudioPositionAdvancing(this, j);
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public /* synthetic */ void onAudioSinkError(java.lang.Exception exc) {
                    androidx.media3.exoplayer.audio.AudioRendererEventListener.CC.$default$onAudioSinkError(this, exc);
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public /* synthetic */ void onAudioTrackInitialized(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
                    androidx.media3.exoplayer.audio.AudioRendererEventListener.CC.$default$onAudioTrackInitialized(this, audioTrackConfig);
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public /* synthetic */ void onAudioTrackReleased(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
                    androidx.media3.exoplayer.audio.AudioRendererEventListener.CC.$default$onAudioTrackReleased(this, audioTrackConfig);
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public /* synthetic */ void onAudioUnderrun(int i, long j, long j2) {
                    androidx.media3.exoplayer.audio.AudioRendererEventListener.CC.$default$onAudioUnderrun(this, i, j, j2);
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
                    androidx.media3.exoplayer.audio.AudioRendererEventListener.CC.$default$onSkipSilenceEnabledChanged(this, z);
                }
            }, new androidx.media3.exoplayer.text.TextOutput() { // from class: androidx.media3.exoplayer.DefaultRendererCapabilitiesList$Factory$$ExternalSyntheticLambda0
                @Override // androidx.media3.exoplayer.text.TextOutput
                public final void onCues(androidx.media3.common.text.CueGroup cueGroup) {
                    androidx.media3.exoplayer.DefaultRendererCapabilitiesList.Factory.lambda$createRendererCapabilitiesList$0(cueGroup);
                }

                @Override // androidx.media3.exoplayer.text.TextOutput
                public /* synthetic */ void onCues(java.util.List list) {
                    androidx.media3.exoplayer.text.TextOutput.CC.$default$onCues(this, list);
                }
            }, new androidx.media3.exoplayer.metadata.MetadataOutput() { // from class: androidx.media3.exoplayer.DefaultRendererCapabilitiesList$Factory$$ExternalSyntheticLambda1
                @Override // androidx.media3.exoplayer.metadata.MetadataOutput
                public final void onMetadata(androidx.media3.common.Metadata metadata) {
                    androidx.media3.exoplayer.DefaultRendererCapabilitiesList.Factory.lambda$createRendererCapabilitiesList$1(metadata);
                }
            }));
        }
    }

    private DefaultRendererCapabilitiesList(androidx.media3.exoplayer.Renderer[] rendererArr) {
        this.renderers = (androidx.media3.exoplayer.Renderer[]) java.util.Arrays.copyOf(rendererArr, rendererArr.length);
        for (int i = 0; i < rendererArr.length; i++) {
            this.renderers[i].init(i, androidx.media3.exoplayer.analytics.PlayerId.UNSET, androidx.media3.common.util.SystemClock.DEFAULT);
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilitiesList
    public androidx.media3.exoplayer.RendererCapabilities[] getRendererCapabilities() {
        androidx.media3.exoplayer.RendererCapabilities[] rendererCapabilitiesArr = new androidx.media3.exoplayer.RendererCapabilities[this.renderers.length];
        int i = 0;
        while (true) {
            androidx.media3.exoplayer.Renderer[] rendererArr = this.renderers;
            if (i >= rendererArr.length) {
                return rendererCapabilitiesArr;
            }
            rendererCapabilitiesArr[i] = rendererArr[i].getCapabilities();
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilitiesList
    public int size() {
        return this.renderers.length;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilitiesList
    public void release() {
        for (androidx.media3.exoplayer.Renderer renderer : this.renderers) {
            renderer.release();
        }
    }
}
