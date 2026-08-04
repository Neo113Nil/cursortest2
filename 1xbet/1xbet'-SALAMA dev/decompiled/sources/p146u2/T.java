package p146u2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class T implements InterfaceC0954m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0954m f16759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f16760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f16761c;

    public T(InterfaceC0954m interfaceC0954m) {
        interfaceC0954m.getClass();
        this.f16759a = interfaceC0954m;
        this.f16761c = Uri.EMPTY;
        Collections.emptyMap();
    }

    @Override // p146u2.InterfaceC0954m
    public final void close() {
        this.f16759a.close();
    }

    @Override // p146u2.InterfaceC0954m
    public final Map k() {
        return this.f16759a.k();
    }

    @Override // p146u2.InterfaceC0954m
    public final long o(C0958q c0958q) {
        this.f16761c = c0958q.f16814a;
        Collections.emptyMap();
        InterfaceC0954m interfaceC0954m = this.f16759a;
        long jO = interfaceC0954m.o(c0958q);
        Uri uriT = interfaceC0954m.t();
        uriT.getClass();
        this.f16761c = uriT;
        interfaceC0954m.k();
        return jO;
    }

    @Override // p146u2.InterfaceC0951j
    public final int read(byte[] bArr, int i7, int i8) {
        int i9 = this.f16759a.read(bArr, i7, i8);
        if (i9 != -1) {
            this.f16760b += (long) i9;
        }
        return i9;
    }

    @Override // p146u2.InterfaceC0954m
    public final Uri t() {
        return this.f16759a.t();
    }

    @Override // p146u2.InterfaceC0954m
    public final void x(U u4) {
        u4.getClass();
        this.f16759a.x(u4);
    }
}
