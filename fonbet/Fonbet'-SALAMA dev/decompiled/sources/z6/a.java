package z6;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class a implements Iterable, u6.a {

    /* renamed from: a, reason: collision with root package name */
    public final char f18527a;

    /* renamed from: b, reason: collision with root package name */
    public final char f18528b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18529c = 1;

    public a(char c3, char c4) {
        this.f18527a = c3;
        this.f18528b = (char) p3.f.N(c3, c4, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f18527a, this.f18528b, this.f18529c);
    }
}
