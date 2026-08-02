package n4;

import X3.C0442b;
import java.util.Iterator;

/* renamed from: n4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2190b implements g, c {

    /* renamed from: a, reason: collision with root package name */
    public final g f18474a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18475b;

    public C2190b(g gVar, int i) {
        this.f18474a = gVar;
        this.f18475b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // n4.c
    public final g a(int i) {
        int i5 = this.f18475b + i;
        return i5 < 0 ? new C2190b(this, i) : new C2190b(this.f18474a, i5);
    }

    @Override // n4.g
    public final Iterator iterator() {
        return new C0442b(this);
    }
}
