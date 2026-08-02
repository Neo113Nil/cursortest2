package x0;

import java.util.List;
import z0.AbstractC2728D;

/* loaded from: classes.dex */
public final class G extends AbstractC2728D {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f20934b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i4.e f20935c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(K k5, i4.e eVar, String str) {
        super(str);
        this.f20934b = k5;
        this.f20935c = eVar;
    }

    @Override // x0.O
    public final P c(Q q5, List list, long j5) {
        K k5 = this.f20934b;
        W0.m layoutDirection = q5.getLayoutDirection();
        E e3 = k5.f20948r;
        e3.f20925k = layoutDirection;
        e3.f20926l = q5.c();
        e3.f20927m = q5.n();
        boolean t5 = q5.t();
        i4.e eVar = this.f20935c;
        if (t5 || k5.f20941k.f21630q == null) {
            k5.f20944n = 0;
            P p5 = (P) eVar.invoke(e3, new W0.a(j5));
            return new F(p5, k5, k5.f20944n, p5, 1);
        }
        k5.f20945o = 0;
        P p6 = (P) eVar.invoke(k5.f20949s, new W0.a(j5));
        return new F(p6, k5, k5.f20945o, p6, 0);
    }
}
