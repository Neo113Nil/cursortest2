package E;

import h0.C1991e;
import i0.C2006k;
import k4.AbstractC2036a;

/* renamed from: E.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0093d extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1131l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f1132m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0093d(int i, long j5) {
        super(1);
        this.f1131l = i;
        this.f1132m = j5;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f1131l) {
            case 0:
                f0.c cVar = (f0.c) obj;
                float d5 = C1991e.d(cVar.f16923k.d()) / 2.0f;
                return cVar.a(new C0091c(d5, AbstractC2036a.v(cVar, d5), new C2006k(5, this.f1132m)));
            default:
                ((H0.j) obj).f(I.A.f2384c, new I.z(N.f1060k, this.f1132m, 2, true));
                return W3.o.f6046a;
        }
    }
}
