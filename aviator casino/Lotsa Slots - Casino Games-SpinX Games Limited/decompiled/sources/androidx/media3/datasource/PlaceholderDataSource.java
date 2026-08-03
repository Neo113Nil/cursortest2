package androidx.media3.datasource;

/* loaded from: classes2.dex */
public final class PlaceholderDataSource implements androidx.media3.datasource.DataSource {
    public static final androidx.media3.datasource.PlaceholderDataSource INSTANCE = new androidx.media3.datasource.PlaceholderDataSource();
    public static final androidx.media3.datasource.DataSource.Factory FACTORY = new androidx.media3.datasource.DataSource.Factory() { // from class: androidx.media3.datasource.PlaceholderDataSource$$ExternalSyntheticLambda0
        @Override // androidx.media3.datasource.DataSource.Factory
        public final androidx.media3.datasource.DataSource createDataSource() {
            return androidx.media3.datasource.PlaceholderDataSource.$r8$lambda$HDM3559DY8vWpsat317RpDbLVt0();
        }
    };

    public static /* synthetic */ androidx.media3.datasource.PlaceholderDataSource $r8$lambda$HDM3559DY8vWpsat317RpDbLVt0() {
        return new androidx.media3.datasource.PlaceholderDataSource();
    }

    @Override // androidx.media3.datasource.DataSource
    public void addTransferListener(androidx.media3.datasource.TransferListener transferListener) {
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
    }

    @Override // androidx.media3.datasource.DataSource
    public /* synthetic */ java.util.Map getResponseHeaders() {
        java.util.Map emptyMap;
        emptyMap = java.util.Collections.emptyMap();
        return emptyMap;
    }

    @Override // androidx.media3.datasource.DataSource
    public android.net.Uri getUri() {
        return null;
    }

    private PlaceholderDataSource() {
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(androidx.media3.datasource.DataSpec dataSpec) throws java.io.IOException {
        throw new java.io.IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) {
        throw new java.lang.UnsupportedOperationException();
    }
}
