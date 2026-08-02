package H3;

import k4.i;
import k4.m;
import k4.n;
import k4.o;

/* loaded from: classes8.dex */
final class b extends k4.h {

    /* renamed from: n, reason: collision with root package name */
    private final o f10524n;

    public b(o oVar) {
        super(new m[2], new n[2]);
        p();
        this.f10524n = oVar;
    }

    @Override // k4.h
    protected final i r(byte[] bArr, int i11, boolean z11) {
        o oVar = this.f10524n;
        if (z11) {
            oVar.reset();
        }
        return oVar.b(0, i11, bArr);
    }
}
