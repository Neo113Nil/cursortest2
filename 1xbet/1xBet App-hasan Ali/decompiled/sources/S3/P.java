package S3;

import M.u0;
import P.C0315s;
import o0.C2201e;
import t3.AbstractC2425d;
import z.AbstractC2701c;
import z.C2687K;

/* loaded from: classes.dex */
public final class P implements i4.f {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5402k;

    public P(int i) {
        this.f5402k = i;
    }

    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        C0315s c0315s = (C0315s) obj2;
        int intValue = ((Number) obj3).intValue();
        kotlin.jvm.internal.l.f("$this$Button", (C2687K) obj);
        if ((intValue & 17) == 16 && c0315s.B()) {
            c0315s.S();
        } else {
            C2201e u5 = AbstractC2425d.u();
            b0.m mVar = b0.m.f7161k;
            M.G.a(u5, null, androidx.compose.foundation.layout.c.f(mVar, 18), 0L, c0315s, 432, 8);
            AbstractC2701c.b(c0315s, androidx.compose.foundation.layout.c.f(mVar, 8));
            u0.b("Proceed with " + this.f5402k, null, 0L, 0L, O0.l.f4031q, 0L, null, 0L, 0, false, 0, 0, null, c0315s, 196608, 0, 131038);
        }
        return W3.o.f6046a;
    }
}
