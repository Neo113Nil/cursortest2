package u2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class T implements InterfaceC1636m {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1636m f16753a;

    /* renamed from: b, reason: collision with root package name */
    public long f16754b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f16755c;

    public T(InterfaceC1636m interfaceC1636m) {
        interfaceC1636m.getClass();
        this.f16753a = interfaceC1636m;
        this.f16755c = Uri.EMPTY;
        Collections.emptyMap();
    }

    @Override // u2.InterfaceC1636m
    public final void close() {
        this.f16753a.close();
    }

    @Override // u2.InterfaceC1636m
    public final Map k() {
        return this.f16753a.k();
    }

    @Override // u2.InterfaceC1636m
    public final long o(C1640q c1640q) {
        this.f16755c = c1640q.f16808a;
        Collections.emptyMap();
        InterfaceC1636m interfaceC1636m = this.f16753a;
        long o7 = interfaceC1636m.o(c1640q);
        Uri t7 = interfaceC1636m.t();
        t7.getClass();
        this.f16755c = t7;
        interfaceC1636m.k();
        return o7;
    }

    @Override // u2.InterfaceC1633j
    public final int read(byte[] bArr, int i7, int i8) {
        int read = this.f16753a.read(bArr, i7, i8);
        if (read != -1) {
            this.f16754b += read;
        }
        return read;
    }

    @Override // u2.InterfaceC1636m
    public final Uri t() {
        return this.f16753a.t();
    }

    @Override // u2.InterfaceC1636m
    public final void x(U u4) {
        u4.getClass();
        this.f16753a.x(u4);
    }
}
