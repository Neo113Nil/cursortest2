package r2;

import j2.C1305b;
import j2.InterfaceC1309f;
import java.util.Collections;
import java.util.List;
import v2.AbstractC1664a;

/* renamed from: r2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1572b implements InterfaceC1309f {

    /* renamed from: b, reason: collision with root package name */
    public static final C1572b f16021b = new C1572b();

    /* renamed from: a, reason: collision with root package name */
    public final List f16022a;

    public C1572b(C1305b c1305b) {
        this.f16022a = Collections.singletonList(c1305b);
    }

    @Override // j2.InterfaceC1309f
    public final int d(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // j2.InterfaceC1309f
    public final long h(int i7) {
        AbstractC1664a.f(i7 == 0);
        return 0L;
    }

    @Override // j2.InterfaceC1309f
    public final List m(long j) {
        return j >= 0 ? this.f16022a : Collections.emptyList();
    }

    @Override // j2.InterfaceC1309f
    public final int p() {
        return 1;
    }

    public C1572b() {
        this.f16022a = Collections.emptyList();
    }
}
