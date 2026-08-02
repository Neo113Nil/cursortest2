package n4;

import java.util.Iterator;
import o4.C2224b;

/* loaded from: classes.dex */
public final class k implements Iterable, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f f18488k;

    public k(f fVar) {
        this.f18488k = fVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2224b(this.f18488k);
    }
}
