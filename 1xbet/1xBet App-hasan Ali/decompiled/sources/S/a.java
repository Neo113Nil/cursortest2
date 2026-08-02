package S;

import T.c;
import X3.e;
import java.util.List;
import k4.AbstractC2036a;

/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: k, reason: collision with root package name */
    public final c f5249k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5250l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5251m;

    public a(c cVar, int i, int i5) {
        this.f5249k = cVar;
        this.f5250l = i;
        AbstractC2036a.s(i, i5, cVar.c());
        this.f5251m = i5 - i;
    }

    @Override // X3.AbstractC0441a
    public final int c() {
        return this.f5251m;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC2036a.n(i, this.f5251m);
        return this.f5249k.get(this.f5250l + i);
    }

    @Override // X3.e, java.util.List
    public final List subList(int i, int i5) {
        AbstractC2036a.s(i, i5, this.f5251m);
        int i6 = this.f5250l;
        return new a(this.f5249k, i + i6, i6 + i5);
    }
}
