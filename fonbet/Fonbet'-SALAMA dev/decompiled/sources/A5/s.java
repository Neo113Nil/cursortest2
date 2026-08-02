package A5;

import B4.V;
import w1.V0;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final f f681a;

    /* renamed from: b, reason: collision with root package name */
    public final String f682b;

    /* renamed from: c, reason: collision with root package name */
    public final t f683c;

    /* renamed from: d, reason: collision with root package name */
    public final V f684d;

    public s(f fVar, String str) {
        this(fVar, str, y.f688b, null);
    }

    public final void a(String str, Object obj, r rVar) {
        this.f681a.k(this.f682b, this.f683c.a(new o(str, obj)), rVar == null ? null : new a(1, this, rVar));
    }

    public final void b(q qVar) {
        String str = this.f682b;
        f fVar = this.f681a;
        V v6 = this.f684d;
        if (v6 != null) {
            fVar.n(str, qVar != null ? new V0(3, this, qVar) : null, v6);
        } else {
            fVar.c(str, qVar != null ? new V0(3, this, qVar) : null);
        }
    }

    public s(f fVar, String str, t tVar, V v6) {
        this.f681a = fVar;
        this.f682b = str;
        this.f683c = tVar;
        this.f684d = v6;
    }
}
