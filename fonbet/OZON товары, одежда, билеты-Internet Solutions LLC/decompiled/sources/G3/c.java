package G3;

import Hj0.T;
import j3.C7272n;
import java.io.IOException;
import java.util.Arrays;
import m3.N;
import p3.InterfaceC8846f;
import p3.i;

/* loaded from: classes8.dex */
public abstract class c extends b {

    /* renamed from: j, reason: collision with root package name */
    private byte[] f9679j;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f9680k;

    public c(InterfaceC8846f interfaceC8846f, i iVar, C7272n c7272n, int i11, Object obj, byte[] bArr) {
        super(interfaceC8846f, iVar, 3, c7272n, i11, obj, -9223372036854775807L, -9223372036854775807L);
        this.f9679j = bArr == null ? N.f74291c : bArr;
    }

    @Override // J3.j.d
    public final void cancelLoad() {
        this.f9680k = true;
    }

    protected abstract void d(int i11, byte[] bArr) throws IOException;

    public final byte[] e() {
        return this.f9679j;
    }

    @Override // J3.j.d
    public final void load() throws IOException {
        try {
            this.f9678i.open(this.f9671b);
            int i11 = 0;
            int i12 = 0;
            while (i11 != -1 && !this.f9680k) {
                byte[] bArr = this.f9679j;
                if (bArr.length < i12 + 16384) {
                    this.f9679j = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i11 = this.f9678i.read(this.f9679j, i12, 16384);
                if (i11 != -1) {
                    i12 += i11;
                }
            }
            if (!this.f9680k) {
                d(i12, this.f9679j);
            }
            T.b(this.f9678i);
        } catch (Throwable th2) {
            T.b(this.f9678i);
            throw th2;
        }
    }
}
