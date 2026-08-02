package y4;

import L4.InterfaceC0228k;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import o4.AbstractC2223a;

/* loaded from: classes.dex */
public final class A extends Reader implements AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0228k f21277k;

    /* renamed from: l, reason: collision with root package name */
    public final Charset f21278l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f21279m;

    /* renamed from: n, reason: collision with root package name */
    public InputStreamReader f21280n;

    public A(InterfaceC0228k interfaceC0228k, Charset charset) {
        kotlin.jvm.internal.l.f("source", interfaceC0228k);
        kotlin.jvm.internal.l.f("charset", charset);
        this.f21277k = interfaceC0228k;
        this.f21278l = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        W3.o oVar;
        this.f21279m = true;
        InputStreamReader inputStreamReader = this.f21280n;
        if (inputStreamReader != null) {
            inputStreamReader.close();
            oVar = W3.o.f6046a;
        } else {
            oVar = null;
        }
        if (oVar == null) {
            this.f21277k.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i5) {
        kotlin.jvm.internal.l.f("cbuf", cArr);
        if (this.f21279m) {
            throw new IOException("Stream closed");
        }
        InputStreamReader inputStreamReader = this.f21280n;
        if (inputStreamReader == null) {
            InputStream C5 = this.f21277k.C();
            InterfaceC0228k interfaceC0228k = this.f21277k;
            Charset charset = this.f21278l;
            byte[] bArr = z4.b.f21979a;
            kotlin.jvm.internal.l.f("<this>", interfaceC0228k);
            kotlin.jvm.internal.l.f("default", charset);
            int B5 = interfaceC0228k.B(z4.b.f21982d);
            if (B5 != -1) {
                if (B5 == 0) {
                    charset = StandardCharsets.UTF_8;
                    kotlin.jvm.internal.l.e("UTF_8", charset);
                } else if (B5 == 1) {
                    charset = StandardCharsets.UTF_16BE;
                    kotlin.jvm.internal.l.e("UTF_16BE", charset);
                } else if (B5 == 2) {
                    charset = StandardCharsets.UTF_16LE;
                    kotlin.jvm.internal.l.e("UTF_16LE", charset);
                } else if (B5 == 3) {
                    Charset charset2 = AbstractC2223a.f18653a;
                    charset = AbstractC2223a.f18655c;
                    if (charset == null) {
                        charset = Charset.forName("UTF-32BE");
                        kotlin.jvm.internal.l.e("forName(...)", charset);
                        AbstractC2223a.f18655c = charset;
                    }
                } else {
                    if (B5 != 4) {
                        throw new AssertionError();
                    }
                    Charset charset3 = AbstractC2223a.f18653a;
                    charset = AbstractC2223a.f18654b;
                    if (charset == null) {
                        charset = Charset.forName("UTF-32LE");
                        kotlin.jvm.internal.l.e("forName(...)", charset);
                        AbstractC2223a.f18654b = charset;
                    }
                }
            }
            inputStreamReader = new InputStreamReader(C5, charset);
            this.f21280n = inputStreamReader;
        }
        return inputStreamReader.read(cArr, i, i5);
    }
}
