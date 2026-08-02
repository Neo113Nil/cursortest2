package P;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class N0 implements Iterable, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public final M0 f4357k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4358l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4359m;

    public N0(M0 m02, int i, int i5) {
        this.f4357k = m02;
        this.f4358l = i;
        this.f4359m = i5;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        M0 m02 = this.f4357k;
        if (m02.f4350r != this.f4359m) {
            O0.f();
        }
        int i = this.f4358l;
        m02.h(i);
        return new O(m02, i + 1, O0.a(m02.f4343k, i) + i);
    }
}
