package L6;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes8.dex */
public interface d {
    int available() throws IOException;

    InputStream c() throws IOException;

    void close() throws IOException;

    byte peek() throws IOException;

    int position();

    int read(byte[] bArr, int i11, int i12) throws IOException;

    void reset() throws IOException;

    long skip(long j11) throws IOException;
}
