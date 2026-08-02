package okio;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* renamed from: okio.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC1192g extends K, ReadableByteChannel {
    void A(long j) throws IOException;

    C1193h C(long j) throws IOException;

    byte[] D() throws IOException;

    boolean E() throws IOException;

    long G() throws IOException;

    long I(C1190e c1190e) throws IOException;

    String J(Charset charset) throws IOException;

    C1193h N() throws IOException;

    int P() throws IOException;

    long Q(long j, C1193h c1193h) throws IOException;

    long T() throws IOException;

    InputStream U();

    int V(A a) throws IOException;

    C1190e a();

    void i(C1190e c1190e, long j) throws IOException;

    String k(long j) throws IOException;

    boolean n(long j, C1193h c1193h) throws IOException;

    boolean p(long j) throws IOException;

    F peek();

    String r() throws IOException;

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    void skip(long j) throws IOException;

    short v() throws IOException;
}
