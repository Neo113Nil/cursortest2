package N3;

import java.io.IOException;

/* loaded from: classes8.dex */
public class z implements q {

    /* renamed from: a, reason: collision with root package name */
    private final C3659j f18667a;

    public z(C3659j c3659j) {
        this.f18667a = c3659j;
    }

    @Override // N3.q
    public final void a(int i11, int i12, byte[] bArr) throws IOException {
        this.f18667a.d(bArr, i11, i12, false);
    }

    @Override // N3.q
    public final boolean b(byte[] bArr, int i11, int i12, boolean z11) throws IOException {
        return this.f18667a.b(bArr, 0, i12, z11);
    }

    @Override // N3.q
    public final int c(int i11) throws IOException {
        return this.f18667a.c(i11);
    }

    @Override // N3.q
    public final boolean d(byte[] bArr, int i11, int i12, boolean z11) throws IOException {
        return this.f18667a.d(bArr, i11, i12, z11);
    }

    @Override // N3.q
    public final void e() {
        this.f18667a.e();
    }

    @Override // N3.q
    public long f() {
        return this.f18667a.f();
    }

    @Override // N3.q
    public final void g(int i11) throws IOException {
        this.f18667a.i(i11, false);
    }

    @Override // N3.q
    public long getLength() {
        return this.f18667a.getLength();
    }

    @Override // N3.q
    public long getPosition() {
        return this.f18667a.getPosition();
    }

    @Override // N3.q
    public final void h(int i11) throws IOException {
        this.f18667a.m(i11, false);
    }

    @Override // j3.InterfaceC7268j
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        return this.f18667a.read(bArr, i11, i12);
    }

    @Override // N3.q
    public final void readFully(byte[] bArr, int i11, int i12) throws IOException {
        this.f18667a.b(bArr, i11, i12, false);
    }
}
