package com.google.android.exoplayer2.upstream;

/* loaded from: classes3.dex */
public final class StatsDataSource implements com.google.android.exoplayer2.upstream.DataSource {
    private long bytesRead;
    private final com.google.android.exoplayer2.upstream.DataSource dataSource;
    private android.net.Uri lastOpenedUri = android.net.Uri.EMPTY;
    private java.util.Map<java.lang.String, java.util.List<java.lang.String>> lastResponseHeaders = java.util.Collections.emptyMap();

    public StatsDataSource(com.google.android.exoplayer2.upstream.DataSource dataSource) {
        this.dataSource = (com.google.android.exoplayer2.upstream.DataSource) com.google.android.exoplayer2.util.Assertions.checkNotNull(dataSource);
    }

    public void resetBytesRead() {
        this.bytesRead = 0L;
    }

    public long getBytesRead() {
        return this.bytesRead;
    }

    public android.net.Uri getLastOpenedUri() {
        return this.lastOpenedUri;
    }

    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getLastResponseHeaders() {
        return this.lastResponseHeaders;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(com.google.android.exoplayer2.upstream.TransferListener transferListener) {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(transferListener);
        this.dataSource.addTransferListener(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(com.google.android.exoplayer2.upstream.DataSpec dataSpec) throws java.io.IOException {
        this.lastOpenedUri = dataSpec.uri;
        this.lastResponseHeaders = java.util.Collections.emptyMap();
        long open = this.dataSource.open(dataSpec);
        this.lastOpenedUri = (android.net.Uri) com.google.android.exoplayer2.util.Assertions.checkNotNull(getUri());
        this.lastResponseHeaders = getResponseHeaders();
        return open;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int read = this.dataSource.read(bArr, i, i2);
        if (read != -1) {
            this.bytesRead += read;
        }
        return read;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public android.net.Uri getUri() {
        return this.dataSource.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
        return this.dataSource.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws java.io.IOException {
        this.dataSource.close();
    }
}
