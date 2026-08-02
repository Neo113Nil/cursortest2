package P;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class c1 implements Iterable, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public final M0 f4454k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4455l;

    /* renamed from: m, reason: collision with root package name */
    public final C0282b f4456m;

    public c1(M0 m02, int i, P p5, C0282b c0282b) {
        this.f4454k = m02;
        this.f4455l = i;
        this.f4456m = c0282b;
        p5.getClass();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new O(this.f4454k, this.f4455l, null, this.f4456m);
    }
}
