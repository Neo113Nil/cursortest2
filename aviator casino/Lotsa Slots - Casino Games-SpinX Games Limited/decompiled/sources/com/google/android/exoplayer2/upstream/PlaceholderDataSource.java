package com.google.android.exoplayer2.upstream;

/* loaded from: classes3.dex */
public final class PlaceholderDataSource implements com.google.android.exoplayer2.upstream.DataSource {
    public static final com.google.android.exoplayer2.upstream.PlaceholderDataSource INSTANCE = new com.google.android.exoplayer2.upstream.PlaceholderDataSource();
    public static final com.google.android.exoplayer2.upstream.DataSource.Factory FACTORY = new com.google.android.exoplayer2.upstream.DataSource.Factory() { // from class: com.google.android.exoplayer2.upstream.PlaceholderDataSource$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public final com.google.android.exoplayer2.upstream.DataSource createDataSource() {
            return com.google.android.exoplayer2.upstream.PlaceholderDataSource.$r8$lambda$vDuk6rTp1JuQSAVZdUUcM4qsx4k();
        }
    };

    public static /* synthetic */ com.google.android.exoplayer2.upstream.PlaceholderDataSource $r8$lambda$vDuk6rTp1JuQSAVZdUUcM4qsx4k() {
        return new com.google.android.exoplayer2.upstream.PlaceholderDataSource();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(com.google.android.exoplayer2.upstream.TransferListener transferListener) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public /* synthetic */ java.util.Map getResponseHeaders() {
        java.util.Map emptyMap;
        emptyMap = java.util.Collections.emptyMap();
        return emptyMap;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public android.net.Uri getUri() {
        return null;
    }

    private PlaceholderDataSource() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(com.google.android.exoplayer2.upstream.DataSpec dataSpec) throws java.io.IOException {
        throw new java.io.IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) {
        throw new java.lang.UnsupportedOperationException();
    }
}
