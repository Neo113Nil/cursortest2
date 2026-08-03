package com.google.android.exoplayer2.upstream;

/* loaded from: classes3.dex */
public final class ResolvingDataSource implements com.google.android.exoplayer2.upstream.DataSource {
    private final com.google.android.exoplayer2.upstream.ResolvingDataSource.Resolver resolver;
    private final com.google.android.exoplayer2.upstream.DataSource upstreamDataSource;
    private boolean upstreamOpened;

    public interface Resolver {

        /* renamed from: com.google.android.exoplayer2.upstream.ResolvingDataSource$Resolver$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static android.net.Uri $default$resolveReportedUri(com.google.android.exoplayer2.upstream.ResolvingDataSource.Resolver _this, android.net.Uri uri) {
                return uri;
            }
        }

        com.google.android.exoplayer2.upstream.DataSpec resolveDataSpec(com.google.android.exoplayer2.upstream.DataSpec dataSpec) throws java.io.IOException;

        android.net.Uri resolveReportedUri(android.net.Uri uri);
    }

    public static final class Factory implements com.google.android.exoplayer2.upstream.DataSource.Factory {
        private final com.google.android.exoplayer2.upstream.ResolvingDataSource.Resolver resolver;
        private final com.google.android.exoplayer2.upstream.DataSource.Factory upstreamFactory;

        public Factory(com.google.android.exoplayer2.upstream.DataSource.Factory factory, com.google.android.exoplayer2.upstream.ResolvingDataSource.Resolver resolver) {
            this.upstreamFactory = factory;
            this.resolver = resolver;
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public com.google.android.exoplayer2.upstream.ResolvingDataSource createDataSource() {
            return new com.google.android.exoplayer2.upstream.ResolvingDataSource(this.upstreamFactory.createDataSource(), this.resolver);
        }
    }

    public ResolvingDataSource(com.google.android.exoplayer2.upstream.DataSource dataSource, com.google.android.exoplayer2.upstream.ResolvingDataSource.Resolver resolver) {
        this.upstreamDataSource = dataSource;
        this.resolver = resolver;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(com.google.android.exoplayer2.upstream.TransferListener transferListener) {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(transferListener);
        this.upstreamDataSource.addTransferListener(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(com.google.android.exoplayer2.upstream.DataSpec dataSpec) throws java.io.IOException {
        com.google.android.exoplayer2.upstream.DataSpec resolveDataSpec = this.resolver.resolveDataSpec(dataSpec);
        this.upstreamOpened = true;
        return this.upstreamDataSource.open(resolveDataSpec);
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        return this.upstreamDataSource.read(bArr, i, i2);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public android.net.Uri getUri() {
        android.net.Uri uri = this.upstreamDataSource.getUri();
        if (uri == null) {
            return null;
        }
        return this.resolver.resolveReportedUri(uri);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
        return this.upstreamDataSource.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws java.io.IOException {
        if (this.upstreamOpened) {
            this.upstreamOpened = false;
            this.upstreamDataSource.close();
        }
    }
}
