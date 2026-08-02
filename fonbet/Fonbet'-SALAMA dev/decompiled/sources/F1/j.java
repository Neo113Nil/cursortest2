package F1;

import A1.X;
import C1.C0095a;
import java.io.EOFException;
import u2.InterfaceC1633j;

/* loaded from: classes.dex */
public final class j implements v {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2544a = new byte[4096];

    @Override // F1.v
    public final void c(int i7, C0095a c0095a) {
        c0095a.E(i7);
    }

    @Override // F1.v
    public final int d(InterfaceC1633j interfaceC1633j, int i7, boolean z4) {
        byte[] bArr = this.f2544a;
        int read = interfaceC1633j.read(bArr, 0, Math.min(bArr.length, i7));
        if (read != -1) {
            return read;
        }
        if (z4) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // F1.v
    public final void a(X x4) {
    }

    @Override // F1.v
    public final void e(long j, int i7, int i8, int i9, u uVar) {
    }
}
