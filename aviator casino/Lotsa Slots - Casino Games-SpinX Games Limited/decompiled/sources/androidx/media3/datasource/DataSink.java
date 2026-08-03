package androidx.media3.datasource;

/* loaded from: classes2.dex */
public interface DataSink {

    public interface Factory {
        androidx.media3.datasource.DataSink createDataSink();
    }

    void close() throws java.io.IOException;

    void open(androidx.media3.datasource.DataSpec dataSpec) throws java.io.IOException;

    void write(byte[] bArr, int i, int i2) throws java.io.IOException;
}
