package androidx.media3.exoplayer.hls;

import N3.C3659j;
import N3.G;
import N3.InterfaceC3665p;
import g4.C6622d;
import h4.C6798d;
import j3.C7272n;
import java.io.IOException;
import m3.C8056I;
import u4.C9948b;
import u4.C9950d;
import u4.C9953g;
import u4.I;

/* loaded from: classes8.dex */
public final class b implements x3.c {

    /* renamed from: f, reason: collision with root package name */
    private static final G f43899f = new G();

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC3665p f43900a;

    /* renamed from: b, reason: collision with root package name */
    private final C7272n f43901b;

    /* renamed from: c, reason: collision with root package name */
    private final C8056I f43902c;

    /* renamed from: d, reason: collision with root package name */
    private final k4.e f43903d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f43904e;

    b(InterfaceC3665p interfaceC3665p, C7272n c7272n, C8056I c8056i, k4.e eVar, boolean z11) {
        this.f43900a = interfaceC3665p;
        this.f43901b = c7272n;
        this.f43902c = c8056i;
        this.f43903d = eVar;
        this.f43904e = z11;
    }

    public final boolean a(C3659j c3659j) throws IOException {
        return this.f43900a.f(c3659j, f43899f) == 0;
    }

    public final b b() {
        InterfaceC3665p c6622d;
        InterfaceC3665p interfaceC3665p = this.f43900a;
        InterfaceC3665p c11 = interfaceC3665p.c();
        G10.a.h(!((c11 instanceof I) || (c11 instanceof C6798d)));
        G10.a.g("Can't recreate wrapped extractors. Outer type: " + interfaceC3665p.getClass(), interfaceC3665p.c() == interfaceC3665p);
        if (interfaceC3665p instanceof x3.g) {
            c6622d = new x3.g(this.f43901b.f69116d, this.f43902c, this.f43903d, this.f43904e);
        } else if (interfaceC3665p instanceof C9953g) {
            c6622d = new C9953g();
        } else if (interfaceC3665p instanceof C9948b) {
            c6622d = new C9948b();
        } else if (interfaceC3665p instanceof C9950d) {
            c6622d = new C9950d();
        } else {
            if (!(interfaceC3665p instanceof C6622d)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(interfaceC3665p.getClass().getSimpleName()));
            }
            c6622d = new C6622d();
        }
        return new b(c6622d, this.f43901b, this.f43902c, this.f43903d, this.f43904e);
    }
}
