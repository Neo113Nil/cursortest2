package com.google.android.exoplayer2.metadata;

/* loaded from: classes3.dex */
public final class MetadataRenderer extends com.google.android.exoplayer2.BaseRenderer implements android.os.Handler.Callback {
    private static final int MSG_INVOKE_RENDERER = 0;
    private static final java.lang.String TAG = "MetadataRenderer";
    private final com.google.android.exoplayer2.metadata.MetadataInputBuffer buffer;
    private com.google.android.exoplayer2.metadata.MetadataDecoder decoder;
    private final com.google.android.exoplayer2.metadata.MetadataDecoderFactory decoderFactory;
    private boolean inputStreamEnded;
    private final com.google.android.exoplayer2.metadata.MetadataOutput output;
    private final android.os.Handler outputHandler;
    private final boolean outputMetadataEarly;
    private boolean outputStreamEnded;
    private long outputStreamOffsetUs;
    private com.google.android.exoplayer2.metadata.Metadata pendingMetadata;
    private long subsampleOffsetUs;

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isReady() {
        return true;
    }

    public MetadataRenderer(com.google.android.exoplayer2.metadata.MetadataOutput metadataOutput, android.os.Looper looper) {
        this(metadataOutput, looper, com.google.android.exoplayer2.metadata.MetadataDecoderFactory.DEFAULT);
    }

    public MetadataRenderer(com.google.android.exoplayer2.metadata.MetadataOutput metadataOutput, android.os.Looper looper, com.google.android.exoplayer2.metadata.MetadataDecoderFactory metadataDecoderFactory) {
        this(metadataOutput, looper, metadataDecoderFactory, false);
    }

    public MetadataRenderer(com.google.android.exoplayer2.metadata.MetadataOutput metadataOutput, android.os.Looper looper, com.google.android.exoplayer2.metadata.MetadataDecoderFactory metadataDecoderFactory, boolean z) {
        super(5);
        this.output = (com.google.android.exoplayer2.metadata.MetadataOutput) com.google.android.exoplayer2.util.Assertions.checkNotNull(metadataOutput);
        this.outputHandler = looper == null ? null : com.google.android.exoplayer2.util.Util.createHandler(looper, this);
        this.decoderFactory = (com.google.android.exoplayer2.metadata.MetadataDecoderFactory) com.google.android.exoplayer2.util.Assertions.checkNotNull(metadataDecoderFactory);
        this.outputMetadataEarly = z;
        this.buffer = new com.google.android.exoplayer2.metadata.MetadataInputBuffer();
        this.outputStreamOffsetUs = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public java.lang.String getName() {
        return TAG;
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public int supportsFormat(com.google.android.exoplayer2.Format format) {
        if (this.decoderFactory.supportsFormat(format)) {
            return com.google.android.exoplayer2.RendererCapabilities.CC.create(format.cryptoType == 0 ? 4 : 2);
        }
        return com.google.android.exoplayer2.RendererCapabilities.CC.create(0);
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onStreamChanged(com.google.android.exoplayer2.Format[] formatArr, long j, long j2) {
        this.decoder = this.decoderFactory.createDecoder(formatArr[0]);
        com.google.android.exoplayer2.metadata.Metadata metadata = this.pendingMetadata;
        if (metadata != null) {
            this.pendingMetadata = metadata.copyWithPresentationTimeUs((metadata.presentationTimeUs + this.outputStreamOffsetUs) - j2);
        }
        this.outputStreamOffsetUs = j2;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onPositionReset(long j, boolean z) {
        this.pendingMetadata = null;
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void render(long j, long j2) {
        boolean z = true;
        while (z) {
            readMetadata();
            z = outputMetadata(j);
        }
    }

    private void decodeWrappedMetadata(com.google.android.exoplayer2.metadata.Metadata metadata, java.util.List<com.google.android.exoplayer2.metadata.Metadata.Entry> list) {
        for (int i = 0; i < metadata.length(); i++) {
            com.google.android.exoplayer2.Format wrappedMetadataFormat = metadata.get(i).getWrappedMetadataFormat();
            if (wrappedMetadataFormat != null && this.decoderFactory.supportsFormat(wrappedMetadataFormat)) {
                com.google.android.exoplayer2.metadata.MetadataDecoder createDecoder = this.decoderFactory.createDecoder(wrappedMetadataFormat);
                byte[] bArr = (byte[]) com.google.android.exoplayer2.util.Assertions.checkNotNull(metadata.get(i).getWrappedMetadataBytes());
                this.buffer.clear();
                this.buffer.ensureSpaceForWrite(bArr.length);
                ((java.nio.ByteBuffer) com.google.android.exoplayer2.util.Util.castNonNull(this.buffer.data)).put(bArr);
                this.buffer.flip();
                com.google.android.exoplayer2.metadata.Metadata decode = createDecoder.decode(this.buffer);
                if (decode != null) {
                    decodeWrappedMetadata(decode, list);
                }
            } else {
                list.add(metadata.get(i));
            }
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onDisabled() {
        this.pendingMetadata = null;
        this.decoder = null;
        this.outputStreamOffsetUs = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (message.what == 0) {
            invokeRendererInternal((com.google.android.exoplayer2.metadata.Metadata) message.obj);
            return true;
        }
        throw new java.lang.IllegalStateException();
    }

    private void readMetadata() {
        if (this.inputStreamEnded || this.pendingMetadata != null) {
            return;
        }
        this.buffer.clear();
        com.google.android.exoplayer2.FormatHolder formatHolder = getFormatHolder();
        int readSource = readSource(formatHolder, this.buffer, 0);
        if (readSource != -4) {
            if (readSource == -5) {
                this.subsampleOffsetUs = ((com.google.android.exoplayer2.Format) com.google.android.exoplayer2.util.Assertions.checkNotNull(formatHolder.format)).subsampleOffsetUs;
            }
        } else {
            if (this.buffer.isEndOfStream()) {
                this.inputStreamEnded = true;
                return;
            }
            this.buffer.subsampleOffsetUs = this.subsampleOffsetUs;
            this.buffer.flip();
            com.google.android.exoplayer2.metadata.Metadata decode = ((com.google.android.exoplayer2.metadata.MetadataDecoder) com.google.android.exoplayer2.util.Util.castNonNull(this.decoder)).decode(this.buffer);
            if (decode != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(decode.length());
                decodeWrappedMetadata(decode, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.pendingMetadata = new com.google.android.exoplayer2.metadata.Metadata(getPresentationTimeUs(this.buffer.timeUs), arrayList);
            }
        }
    }

    private boolean outputMetadata(long j) {
        boolean z;
        com.google.android.exoplayer2.metadata.Metadata metadata = this.pendingMetadata;
        if (metadata == null || (!this.outputMetadataEarly && metadata.presentationTimeUs > getPresentationTimeUs(j))) {
            z = false;
        } else {
            invokeRenderer(this.pendingMetadata);
            this.pendingMetadata = null;
            z = true;
        }
        if (this.inputStreamEnded && this.pendingMetadata == null) {
            this.outputStreamEnded = true;
        }
        return z;
    }

    private void invokeRenderer(com.google.android.exoplayer2.metadata.Metadata metadata) {
        android.os.Handler handler = this.outputHandler;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            invokeRendererInternal(metadata);
        }
    }

    private void invokeRendererInternal(com.google.android.exoplayer2.metadata.Metadata metadata) {
        this.output.onMetadata(metadata);
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    private long getPresentationTimeUs(long j) {
        com.google.android.exoplayer2.util.Assertions.checkState(j != -9223372036854775807L);
        com.google.android.exoplayer2.util.Assertions.checkState(this.outputStreamOffsetUs != -9223372036854775807L);
        return j - this.outputStreamOffsetUs;
    }
}
