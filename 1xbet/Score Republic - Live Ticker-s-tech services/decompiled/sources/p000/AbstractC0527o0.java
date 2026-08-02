package p000;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: o0 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0527o0 implements Closeable {
    /* JADX INFO: renamed from: a */
    public final void m3608a(int i) {
        if (mo830q() < i) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean mo3609i() {
        return this instanceof c01;
    }

    /* JADX INFO: renamed from: j */
    public abstract AbstractC0527o0 mo825j(int i);

    /* JADX INFO: renamed from: l */
    public abstract void mo826l(OutputStream outputStream, int i);

    /* JADX INFO: renamed from: m */
    public abstract void mo827m(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: o */
    public abstract void mo828o(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: p */
    public abstract int mo829p();

    /* JADX INFO: renamed from: q */
    public abstract int mo830q();

    /* JADX INFO: renamed from: r */
    public void mo831r() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: s */
    public abstract void mo832s(int i);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* JADX INFO: renamed from: e */
    public void mo824e() {
    }
}
