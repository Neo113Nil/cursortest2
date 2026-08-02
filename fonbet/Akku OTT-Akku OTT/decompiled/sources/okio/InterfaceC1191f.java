package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* renamed from: okio.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC1191f extends J, WritableByteChannel {
    InterfaceC1191f B(long j) throws IOException;

    InterfaceC1191f L(long j) throws IOException;

    InterfaceC1191f O(int i, int i2, String str) throws IOException;

    InterfaceC1191f R(C1193h c1193h) throws IOException;

    OutputStream S();

    C1190e a();

    InterfaceC1191f e() throws IOException;

    InterfaceC1191f f(int i) throws IOException;

    @Override // okio.J, java.io.Flushable
    void flush() throws IOException;

    InterfaceC1191f j() throws IOException;

    InterfaceC1191f m(String str) throws IOException;

    long o(K k) throws IOException;

    InterfaceC1191f write(byte[] bArr) throws IOException;

    InterfaceC1191f write(byte[] bArr, int i, int i2) throws IOException;

    InterfaceC1191f writeByte(int i) throws IOException;

    InterfaceC1191f writeInt(int i) throws IOException;

    InterfaceC1191f writeShort(int i) throws IOException;
}
