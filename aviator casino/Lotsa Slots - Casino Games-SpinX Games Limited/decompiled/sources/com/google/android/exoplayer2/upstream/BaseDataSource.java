package com.google.android.exoplayer2.upstream;

/* loaded from: classes3.dex */
public abstract class BaseDataSource implements com.google.android.exoplayer2.upstream.DataSource {
    private com.google.android.exoplayer2.upstream.DataSpec dataSpec;
    private final boolean isNetwork;
    private int listenerCount;
    private final java.util.ArrayList<com.google.android.exoplayer2.upstream.TransferListener> listeners = new java.util.ArrayList<>(1);

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public /* synthetic */ java.util.Map getResponseHeaders() {
        java.util.Map emptyMap;
        emptyMap = java.util.Collections.emptyMap();
        return emptyMap;
    }

    protected BaseDataSource(boolean z) {
        this.isNetwork = z;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void addTransferListener(com.google.android.exoplayer2.upstream.TransferListener transferListener) {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(transferListener);
        if (this.listeners.contains(transferListener)) {
            return;
        }
        this.listeners.add(transferListener);
        this.listenerCount++;
    }

    protected final void transferInitializing(com.google.android.exoplayer2.upstream.DataSpec dataSpec) {
        for (int i = 0; i < this.listenerCount; i++) {
            this.listeners.get(i).onTransferInitializing(this, dataSpec, this.isNetwork);
        }
    }

    protected final void transferStarted(com.google.android.exoplayer2.upstream.DataSpec dataSpec) {
        this.dataSpec = dataSpec;
        for (int i = 0; i < this.listenerCount; i++) {
            this.listeners.get(i).onTransferStart(this, dataSpec, this.isNetwork);
        }
    }

    protected final void bytesTransferred(int i) {
        com.google.android.exoplayer2.upstream.DataSpec dataSpec = (com.google.android.exoplayer2.upstream.DataSpec) com.google.android.exoplayer2.util.Util.castNonNull(this.dataSpec);
        for (int i2 = 0; i2 < this.listenerCount; i2++) {
            this.listeners.get(i2).onBytesTransferred(this, dataSpec, this.isNetwork, i);
        }
    }

    protected final void transferEnded() {
        com.google.android.exoplayer2.upstream.DataSpec dataSpec = (com.google.android.exoplayer2.upstream.DataSpec) com.google.android.exoplayer2.util.Util.castNonNull(this.dataSpec);
        for (int i = 0; i < this.listenerCount; i++) {
            this.listeners.get(i).onTransferEnd(this, dataSpec, this.isNetwork);
        }
        this.dataSpec = null;
    }
}
