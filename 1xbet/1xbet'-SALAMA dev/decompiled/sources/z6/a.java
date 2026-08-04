package z6;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements Iterable, u6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f18533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f18534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18535c = 1;

    public a(char c3, char c4) {
        this.f18533a = c3;
        this.f18534b = (char) p113p3.f.N(c3, c4, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f18533a, this.f18534b, this.f18535c);
    }
}
