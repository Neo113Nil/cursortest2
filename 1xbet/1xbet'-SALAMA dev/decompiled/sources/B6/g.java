package B6;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements Iterable, u6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C6.c f1208a;

    public g(C6.c cVar) {
        this.f1208a = cVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C6.b(this.f1208a);
    }
}
