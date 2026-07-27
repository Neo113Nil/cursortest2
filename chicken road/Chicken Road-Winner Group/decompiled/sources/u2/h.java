package u2;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class h implements Iterable, p2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v2.c f10389a;

    public h(v2.c cVar) {
        this.f10389a = cVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new v2.b(this.f10389a);
    }
}
