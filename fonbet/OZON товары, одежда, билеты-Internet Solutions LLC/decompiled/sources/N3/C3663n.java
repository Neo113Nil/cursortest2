package N3;

import N3.M;
import j3.C7272n;
import j3.InterfaceC7268j;
import java.io.EOFException;
import java.io.IOException;
import m3.C8050C;

/* renamed from: N3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3663n implements M {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f18632a = new byte[4096];

    @Override // N3.M
    public final void a(C7272n c7272n) {
    }

    @Override // N3.M
    public final void b(long j11, int i11, int i12, int i13, M.a aVar) {
    }

    @Override // N3.M
    public final int c(InterfaceC7268j interfaceC7268j, int i11, boolean z11) throws IOException {
        byte[] bArr = this.f18632a;
        int read = interfaceC7268j.read(bArr, 0, Math.min(bArr.length, i11));
        if (read != -1) {
            return read;
        }
        if (z11) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // N3.M
    public final void f(C8050C c8050c, int i11, int i12) {
        c8050c.S(i11);
    }
}
