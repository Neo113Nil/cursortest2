package v;

import h0.C1989c;
import h0.C1991e;
import i0.C1995B;

/* renamed from: v.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2505C implements i0.J {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20138a;

    @Override // i0.J
    public final i0.D a(long j5, W0.m mVar, W0.c cVar) {
        switch (this.f20138a) {
            case 0:
                float K = cVar.K(D.f20139a);
                return new C1995B(new C1989c(0.0f, -K, C1991e.d(j5), C1991e.b(j5) + K));
            default:
                float K5 = cVar.K(D.f20139a);
                return new C1995B(new C1989c(-K5, 0.0f, C1991e.d(j5) + K5, C1991e.b(j5)));
        }
    }
}
