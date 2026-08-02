package F3;

import F3.O;
import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import m3.C8050C;
import p3.InterfaceC8846f;

/* loaded from: classes8.dex */
final class r implements InterfaceC8846f {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8846f f8715a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8716b;

    /* renamed from: c, reason: collision with root package name */
    private final a f8717c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f8718d;

    /* renamed from: e, reason: collision with root package name */
    private int f8719e;

    public interface a {
    }

    public r(InterfaceC8846f interfaceC8846f, int i11, a aVar) {
        G10.a.c(i11 > 0);
        this.f8715a = interfaceC8846f;
        this.f8716b = i11;
        this.f8717c = aVar;
        this.f8718d = new byte[1];
        this.f8719e = i11;
    }

    @Override // p3.InterfaceC8846f
    public final void addTransferListener(p3.z zVar) {
        zVar.getClass();
        this.f8715a.addTransferListener(zVar);
    }

    @Override // p3.InterfaceC8846f
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p3.InterfaceC8846f
    public final Map<String, List<String>> getResponseHeaders() {
        return this.f8715a.getResponseHeaders();
    }

    @Override // p3.InterfaceC8846f
    public final Uri getUri() {
        return this.f8715a.getUri();
    }

    @Override // p3.InterfaceC8846f
    public final long open(p3.i iVar) {
        throw new UnsupportedOperationException();
    }

    @Override // j3.InterfaceC7268j
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = this.f8719e;
        InterfaceC8846f interfaceC8846f = this.f8715a;
        if (i13 == 0) {
            byte[] bArr2 = this.f8718d;
            int i14 = 0;
            if (interfaceC8846f.read(bArr2, 0, 1) != -1) {
                int i15 = (bArr2[0] & 255) << 4;
                if (i15 != 0) {
                    byte[] bArr3 = new byte[i15];
                    int i16 = i15;
                    while (i16 > 0) {
                        int read = interfaceC8846f.read(bArr3, i14, i16);
                        if (read != -1) {
                            i14 += read;
                            i16 -= read;
                        }
                    }
                    while (i15 > 0 && bArr3[i15 - 1] == 0) {
                        i15--;
                    }
                    if (i15 > 0) {
                        ((O.b) this.f8717c).g(new C8050C(i15, bArr3));
                    }
                }
                this.f8719e = this.f8716b;
            }
            return -1;
        }
        int read2 = interfaceC8846f.read(bArr, i11, Math.min(this.f8719e, i12));
        if (read2 != -1) {
            this.f8719e -= read2;
        }
        return read2;
    }
}
