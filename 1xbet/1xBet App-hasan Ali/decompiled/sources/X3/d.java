package X3;

import a.AbstractC0444a;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class d extends e implements RandomAccess {

    /* renamed from: k, reason: collision with root package name */
    public final e f6078k;

    /* renamed from: l, reason: collision with root package name */
    public final int f6079l;

    /* renamed from: m, reason: collision with root package name */
    public final int f6080m;

    public d(e eVar, int i, int i5) {
        this.f6078k = eVar;
        this.f6079l = i;
        AbstractC0444a.l(i, i5, eVar.c());
        this.f6080m = i5 - i;
    }

    @Override // X3.AbstractC0441a
    public final int c() {
        return this.f6080m;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i5 = this.f6080m;
        if (i < 0 || i >= i5) {
            throw new IndexOutOfBoundsException(L1.a.k(i, i5, "index: ", ", size: "));
        }
        return this.f6078k.get(this.f6079l + i);
    }
}
