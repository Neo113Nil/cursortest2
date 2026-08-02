package b6;

import U5.I;
import com.google.protobuf.AbstractC0891a;
import com.google.protobuf.AbstractC0923q;
import com.google.protobuf.C;
import com.google.protobuf.C0919o;
import com.google.protobuf.InterfaceC0912k0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.logging.Logger;

/* renamed from: b6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0789a extends InputStream implements I {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0891a f10148a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0912k0 f10149b;

    /* renamed from: c, reason: collision with root package name */
    public ByteArrayInputStream f10150c;

    public C0789a(AbstractC0891a abstractC0891a, InterfaceC0912k0 interfaceC0912k0) {
        this.f10148a = abstractC0891a;
        this.f10149b = interfaceC0912k0;
    }

    @Override // java.io.InputStream
    public final int available() {
        AbstractC0891a abstractC0891a = this.f10148a;
        if (abstractC0891a != null) {
            return ((C) abstractC0891a).c(null);
        }
        ByteArrayInputStream byteArrayInputStream = this.f10150c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f10148a != null) {
            this.f10150c = new ByteArrayInputStream(this.f10148a.d());
            this.f10148a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f10150c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        AbstractC0891a abstractC0891a = this.f10148a;
        if (abstractC0891a != null) {
            int c3 = ((C) abstractC0891a).c(null);
            if (c3 == 0) {
                this.f10148a = null;
                this.f10150c = null;
                return -1;
            }
            if (i8 >= c3) {
                Logger logger = AbstractC0923q.f12259d;
                C0919o c0919o = new C0919o(bArr, i7, c3);
                this.f10148a.e(c0919o);
                if (c0919o.P0() == 0) {
                    this.f10148a = null;
                    this.f10150c = null;
                    return c3;
                }
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            this.f10150c = new ByteArrayInputStream(this.f10148a.d());
            this.f10148a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f10150c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i7, i8);
        }
        return -1;
    }
}
