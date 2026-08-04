package p016b6;

import U5.I;
import com.google.protobuf.AbstractC0847a;
import com.google.protobuf.AbstractC0879q;
import com.google.protobuf.C;
import com.google.protobuf.C0875o;
import com.google.protobuf.InterfaceC0868k0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends InputStream implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC0847a f10148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0868k0 f10149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteArrayInputStream f10150c;

    public a(AbstractC0847a abstractC0847a, InterfaceC0868k0 interfaceC0868k0) {
        this.f10148a = abstractC0847a;
        this.f10149b = interfaceC0868k0;
    }

    @Override // java.io.InputStream
    public final int available() {
        AbstractC0847a abstractC0847a = this.f10148a;
        if (abstractC0847a != null) {
            return ((C) abstractC0847a).c(null);
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
        AbstractC0847a abstractC0847a = this.f10148a;
        if (abstractC0847a != null) {
            int iC = ((C) abstractC0847a).c(null);
            if (iC == 0) {
                this.f10148a = null;
                this.f10150c = null;
                return -1;
            }
            if (i8 >= iC) {
                Logger logger = AbstractC0879q.f12259d;
                C0875o c0875o = new C0875o(bArr, i7, iC);
                this.f10148a.e(c0875o);
                if (c0875o.P0() == 0) {
                    this.f10148a = null;
                    this.f10150c = null;
                    return iC;
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
