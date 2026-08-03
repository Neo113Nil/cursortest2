package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
public class DefaultRenderersFactory implements com.google.android.exoplayer2.RenderersFactory {
    public static final long DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS = 5000;
    public static final int EXTENSION_RENDERER_MODE_OFF = 0;
    public static final int EXTENSION_RENDERER_MODE_ON = 1;
    public static final int EXTENSION_RENDERER_MODE_PREFER = 2;
    public static final int MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY = 50;
    private static final java.lang.String TAG = "DefaultRenderersFactory";
    private final android.content.Context context;
    private boolean enableAudioTrackPlaybackParams;
    private boolean enableDecoderFallback;
    private boolean enableFloatOutput;
    private boolean enableOffload;
    private final com.google.android.exoplayer2.mediacodec.DefaultMediaCodecAdapterFactory codecAdapterFactory = new com.google.android.exoplayer2.mediacodec.DefaultMediaCodecAdapterFactory();
    private int extensionRendererMode = 0;
    private long allowedVideoJoiningTimeMs = 5000;
    private com.google.android.exoplayer2.mediacodec.MediaCodecSelector mediaCodecSelector = com.google.android.exoplayer2.mediacodec.MediaCodecSelector.DEFAULT;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ExtensionRendererMode {
    }

    protected void buildMiscellaneousRenderers(android.content.Context context, android.os.Handler handler, int i, java.util.ArrayList<com.google.android.exoplayer2.Renderer> arrayList) {
    }

    public DefaultRenderersFactory(android.content.Context context) {
        this.context = context;
    }

    public com.google.android.exoplayer2.DefaultRenderersFactory setExtensionRendererMode(int i) {
        this.extensionRendererMode = i;
        return this;
    }

    public com.google.android.exoplayer2.DefaultRenderersFactory forceEnableMediaCodecAsynchronousQueueing() {
        this.codecAdapterFactory.forceEnableAsynchronous();
        return this;
    }

    public com.google.android.exoplayer2.DefaultRenderersFactory forceDisableMediaCodecAsynchronousQueueing() {
        this.codecAdapterFactory.forceDisableAsynchronous();
        return this;
    }

    public com.google.android.exoplayer2.DefaultRenderersFactory experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled(boolean z) {
        this.codecAdapterFactory.experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled(z);
        return this;
    }

    public com.google.android.exoplayer2.DefaultRenderersFactory setEnableDecoderFallback(boolean z) {
        this.enableDecoderFallback = z;
        return this;
    }

    public com.google.android.exoplayer2.DefaultRenderersFactory setMediaCodecSelector(com.google.android.exoplayer2.mediacodec.MediaCodecSelector mediaCodecSelector) {
        this.mediaCodecSelector = mediaCodecSelector;
        return this;
    }

    public com.google.android.exoplayer2.DefaultRenderersFactory setEnableAudioFloatOutput(boolean z) {
        this.enableFloatOutput = z;
        return this;
    }

    public com.google.android.exoplayer2.DefaultRenderersFactory setEnableAudioOffload(boolean z) {
        this.enableOffload = z;
        return this;
    }

    public com.google.android.exoplayer2.DefaultRenderersFactory setEnableAudioTrackPlaybackParams(boolean z) {
        this.enableAudioTrackPlaybackParams = z;
        return this;
    }

    public com.google.android.exoplayer2.DefaultRenderersFactory setAllowedVideoJoiningTimeMs(long j) {
        this.allowedVideoJoiningTimeMs = j;
        return this;
    }

    @Override // com.google.android.exoplayer2.RenderersFactory
    public com.google.android.exoplayer2.Renderer[] createRenderers(android.os.Handler handler, com.google.android.exoplayer2.video.VideoRendererEventListener videoRendererEventListener, com.google.android.exoplayer2.audio.AudioRendererEventListener audioRendererEventListener, com.google.android.exoplayer2.text.TextOutput textOutput, com.google.android.exoplayer2.metadata.MetadataOutput metadataOutput) {
        java.util.ArrayList<com.google.android.exoplayer2.Renderer> arrayList = new java.util.ArrayList<>();
        buildVideoRenderers(this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, handler, videoRendererEventListener, this.allowedVideoJoiningTimeMs, arrayList);
        com.google.android.exoplayer2.audio.AudioSink buildAudioSink = buildAudioSink(this.context, this.enableFloatOutput, this.enableAudioTrackPlaybackParams, this.enableOffload);
        if (buildAudioSink != null) {
            buildAudioRenderers(this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, buildAudioSink, handler, audioRendererEventListener, arrayList);
        }
        buildTextRenderers(this.context, textOutput, handler.getLooper(), this.extensionRendererMode, arrayList);
        buildMetadataRenderers(this.context, metadataOutput, handler.getLooper(), this.extensionRendererMode, arrayList);
        buildCameraMotionRenderers(this.context, this.extensionRendererMode, arrayList);
        buildMiscellaneousRenderers(this.context, handler, this.extensionRendererMode, arrayList);
        return (com.google.android.exoplayer2.Renderer[]) arrayList.toArray(new com.google.android.exoplayer2.Renderer[0]);
    }

    protected void buildVideoRenderers(android.content.Context context, int i, com.google.android.exoplayer2.mediacodec.MediaCodecSelector mediaCodecSelector, boolean z, android.os.Handler handler, com.google.android.exoplayer2.video.VideoRendererEventListener videoRendererEventListener, long j, java.util.ArrayList<com.google.android.exoplayer2.Renderer> arrayList) {
        int i2;
        arrayList.add(new com.google.android.exoplayer2.video.MediaCodecVideoRenderer(context, getCodecAdapterFactory(), mediaCodecSelector, j, z, handler, videoRendererEventListener, 50));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
                try {
                    arrayList.add(size, (com.google.android.exoplayer2.Renderer) java.lang.Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(java.lang.Long.TYPE, android.os.Handler.class, com.google.android.exoplayer2.video.VideoRendererEventListener.class, java.lang.Integer.TYPE).newInstance(java.lang.Long.valueOf(j), handler, videoRendererEventListener, 50));
                    com.google.android.exoplayer2.util.Log.i(TAG, "Loaded LibvpxVideoRenderer.");
                } catch (java.lang.ClassNotFoundException unused) {
                    size = i2;
                    i2 = size;
                    arrayList.add(i2, (com.google.android.exoplayer2.Renderer) java.lang.Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(java.lang.Long.TYPE, android.os.Handler.class, com.google.android.exoplayer2.video.VideoRendererEventListener.class, java.lang.Integer.TYPE).newInstance(java.lang.Long.valueOf(j), handler, videoRendererEventListener, 50));
                    com.google.android.exoplayer2.util.Log.i(TAG, "Loaded Libgav1VideoRenderer.");
                }
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException("Error instantiating VP9 extension", e);
            }
        } catch (java.lang.ClassNotFoundException unused2) {
        }
        try {
            arrayList.add(i2, (com.google.android.exoplayer2.Renderer) java.lang.Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(java.lang.Long.TYPE, android.os.Handler.class, com.google.android.exoplayer2.video.VideoRendererEventListener.class, java.lang.Integer.TYPE).newInstance(java.lang.Long.valueOf(j), handler, videoRendererEventListener, 50));
            com.google.android.exoplayer2.util.Log.i(TAG, "Loaded Libgav1VideoRenderer.");
        } catch (java.lang.ClassNotFoundException unused3) {
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException("Error instantiating AV1 extension", e2);
        }
    }

    protected void buildAudioRenderers(android.content.Context context, int i, com.google.android.exoplayer2.mediacodec.MediaCodecSelector mediaCodecSelector, boolean z, com.google.android.exoplayer2.audio.AudioSink audioSink, android.os.Handler handler, com.google.android.exoplayer2.audio.AudioRendererEventListener audioRendererEventListener, java.util.ArrayList<com.google.android.exoplayer2.Renderer> arrayList) {
        int i2;
        int i3;
        arrayList.add(new com.google.android.exoplayer2.audio.MediaCodecAudioRenderer(context, getCodecAdapterFactory(), mediaCodecSelector, z, handler, audioRendererEventListener, audioSink));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
                try {
                    arrayList.add(size, (com.google.android.exoplayer2.Renderer) java.lang.Class.forName("com.google.android.exoplayer2.decoder.midi.MidiRenderer").getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]));
                    com.google.android.exoplayer2.util.Log.i(TAG, "Loaded MidiRenderer.");
                } catch (java.lang.ClassNotFoundException unused) {
                    size = i2;
                    i2 = size;
                    try {
                        i3 = i2 + 1;
                        try {
                            arrayList.add(i2, (com.google.android.exoplayer2.Renderer) java.lang.Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(android.os.Handler.class, com.google.android.exoplayer2.audio.AudioRendererEventListener.class, com.google.android.exoplayer2.audio.AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                            com.google.android.exoplayer2.util.Log.i(TAG, "Loaded LibopusAudioRenderer.");
                        } catch (java.lang.ClassNotFoundException unused2) {
                            i2 = i3;
                            i3 = i2;
                            int i4 = i3 + 1;
                            try {
                                arrayList.add(i3, (com.google.android.exoplayer2.Renderer) java.lang.Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(android.os.Handler.class, com.google.android.exoplayer2.audio.AudioRendererEventListener.class, com.google.android.exoplayer2.audio.AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                                com.google.android.exoplayer2.util.Log.i(TAG, "Loaded LibflacAudioRenderer.");
                            } catch (java.lang.ClassNotFoundException unused3) {
                                i3 = i4;
                                i4 = i3;
                                arrayList.add(i4, (com.google.android.exoplayer2.Renderer) java.lang.Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(android.os.Handler.class, com.google.android.exoplayer2.audio.AudioRendererEventListener.class, com.google.android.exoplayer2.audio.AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                                com.google.android.exoplayer2.util.Log.i(TAG, "Loaded FfmpegAudioRenderer.");
                            }
                            arrayList.add(i4, (com.google.android.exoplayer2.Renderer) java.lang.Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(android.os.Handler.class, com.google.android.exoplayer2.audio.AudioRendererEventListener.class, com.google.android.exoplayer2.audio.AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                            com.google.android.exoplayer2.util.Log.i(TAG, "Loaded FfmpegAudioRenderer.");
                        }
                    } catch (java.lang.ClassNotFoundException unused4) {
                    }
                    try {
                        int i42 = i3 + 1;
                        arrayList.add(i3, (com.google.android.exoplayer2.Renderer) java.lang.Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(android.os.Handler.class, com.google.android.exoplayer2.audio.AudioRendererEventListener.class, com.google.android.exoplayer2.audio.AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                        com.google.android.exoplayer2.util.Log.i(TAG, "Loaded LibflacAudioRenderer.");
                    } catch (java.lang.ClassNotFoundException unused5) {
                    }
                    arrayList.add(i42, (com.google.android.exoplayer2.Renderer) java.lang.Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(android.os.Handler.class, com.google.android.exoplayer2.audio.AudioRendererEventListener.class, com.google.android.exoplayer2.audio.AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                    com.google.android.exoplayer2.util.Log.i(TAG, "Loaded FfmpegAudioRenderer.");
                }
            } catch (java.lang.ClassNotFoundException unused6) {
            }
            try {
                i3 = i2 + 1;
                arrayList.add(i2, (com.google.android.exoplayer2.Renderer) java.lang.Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(android.os.Handler.class, com.google.android.exoplayer2.audio.AudioRendererEventListener.class, com.google.android.exoplayer2.audio.AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                com.google.android.exoplayer2.util.Log.i(TAG, "Loaded LibopusAudioRenderer.");
                try {
                    int i422 = i3 + 1;
                    arrayList.add(i3, (com.google.android.exoplayer2.Renderer) java.lang.Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(android.os.Handler.class, com.google.android.exoplayer2.audio.AudioRendererEventListener.class, com.google.android.exoplayer2.audio.AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                    com.google.android.exoplayer2.util.Log.i(TAG, "Loaded LibflacAudioRenderer.");
                    try {
                        arrayList.add(i422, (com.google.android.exoplayer2.Renderer) java.lang.Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(android.os.Handler.class, com.google.android.exoplayer2.audio.AudioRendererEventListener.class, com.google.android.exoplayer2.audio.AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                        com.google.android.exoplayer2.util.Log.i(TAG, "Loaded FfmpegAudioRenderer.");
                    } catch (java.lang.ClassNotFoundException unused7) {
                    } catch (java.lang.Exception e) {
                        throw new java.lang.RuntimeException("Error instantiating FFmpeg extension", e);
                    }
                } catch (java.lang.Exception e2) {
                    throw new java.lang.RuntimeException("Error instantiating FLAC extension", e2);
                }
            } catch (java.lang.Exception e3) {
                throw new java.lang.RuntimeException("Error instantiating Opus extension", e3);
            }
        } catch (java.lang.Exception e4) {
            throw new java.lang.RuntimeException("Error instantiating MIDI extension", e4);
        }
    }

    protected void buildTextRenderers(android.content.Context context, com.google.android.exoplayer2.text.TextOutput textOutput, android.os.Looper looper, int i, java.util.ArrayList<com.google.android.exoplayer2.Renderer> arrayList) {
        arrayList.add(new com.google.android.exoplayer2.text.TextRenderer(textOutput, looper));
    }

    protected void buildMetadataRenderers(android.content.Context context, com.google.android.exoplayer2.metadata.MetadataOutput metadataOutput, android.os.Looper looper, int i, java.util.ArrayList<com.google.android.exoplayer2.Renderer> arrayList) {
        arrayList.add(new com.google.android.exoplayer2.metadata.MetadataRenderer(metadataOutput, looper));
    }

    protected void buildCameraMotionRenderers(android.content.Context context, int i, java.util.ArrayList<com.google.android.exoplayer2.Renderer> arrayList) {
        arrayList.add(new com.google.android.exoplayer2.video.spherical.CameraMotionRenderer());
    }

    protected com.google.android.exoplayer2.audio.AudioSink buildAudioSink(android.content.Context context, boolean z, boolean z2, boolean z3) {
        return new com.google.android.exoplayer2.audio.DefaultAudioSink.Builder().setAudioCapabilities(com.google.android.exoplayer2.audio.AudioCapabilities.getCapabilities(context)).setEnableFloatOutput(z).setEnableAudioTrackPlaybackParams(z2).setOffloadMode(z3 ? 1 : 0).build();
    }

    protected com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory getCodecAdapterFactory() {
        return this.codecAdapterFactory;
    }
}
