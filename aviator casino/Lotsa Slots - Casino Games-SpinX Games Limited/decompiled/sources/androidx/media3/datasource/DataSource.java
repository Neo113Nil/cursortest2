package androidx.media3.datasource;

/* loaded from: classes2.dex */
public interface DataSource extends androidx.media3.common.DataReader {

    public interface Factory {
        androidx.media3.datasource.DataSource createDataSource();
    }

    void addTransferListener(androidx.media3.datasource.TransferListener transferListener);

    void close() throws java.io.IOException;

    java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders();

    android.net.Uri getUri();

    long open(androidx.media3.datasource.DataSpec dataSpec) throws java.io.IOException;

    /* renamed from: androidx.media3.datasource.DataSource$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }
}
