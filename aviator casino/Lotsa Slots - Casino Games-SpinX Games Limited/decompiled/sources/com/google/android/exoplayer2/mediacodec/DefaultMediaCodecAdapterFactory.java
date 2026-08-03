package com.google.android.exoplayer2.mediacodec;

/* loaded from: classes3.dex */
public final class DefaultMediaCodecAdapterFactory implements com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory {
    private static final int MODE_DEFAULT = 0;
    private static final int MODE_DISABLED = 2;
    private static final int MODE_ENABLED = 1;
    private static final java.lang.String TAG = "DMCodecAdapterFactory";
    private int asynchronousMode = 0;
    private boolean enableSynchronizeCodecInteractionsWithQueueing;

    public com.google.android.exoplayer2.mediacodec.DefaultMediaCodecAdapterFactory forceEnableAsynchronous() {
        this.asynchronousMode = 1;
        return this;
    }

    public com.google.android.exoplayer2.mediacodec.DefaultMediaCodecAdapterFactory forceDisableAsynchronous() {
        this.asynchronousMode = 2;
        return this;
    }

    public void experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled(boolean z) {
        this.enableSynchronizeCodecInteractionsWithQueueing = z;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory
    public com.google.android.exoplayer2.mediacodec.MediaCodecAdapter createAdapter(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration configuration) throws java.io.IOException {
        int i;
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 23 && ((i = this.asynchronousMode) == 1 || (i == 0 && com.google.android.exoplayer2.util.Util.SDK_INT >= 31))) {
            int trackType = com.google.android.exoplayer2.util.MimeTypes.getTrackType(configuration.format.sampleMimeType);
            com.google.android.exoplayer2.util.Log.i(TAG, "Creating an asynchronous MediaCodec adapter for track type " + com.google.android.exoplayer2.util.Util.getTrackTypeString(trackType));
            return new com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter.Factory(trackType, this.enableSynchronizeCodecInteractionsWithQueueing).createAdapter(configuration);
        }
        return new com.google.android.exoplayer2.mediacodec.SynchronousMediaCodecAdapter.Factory().createAdapter(configuration);
    }
}
