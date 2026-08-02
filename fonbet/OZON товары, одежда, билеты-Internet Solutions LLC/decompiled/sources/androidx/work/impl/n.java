package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.lifecycle.V;
import androidx.work.r;

/* loaded from: classes.dex */
public final class n implements androidx.work.r {

    /* renamed from: c, reason: collision with root package name */
    private final V<r.a> f45463c = new V<>();

    /* renamed from: d, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c<r.a.c> f45464d = androidx.work.impl.utils.futures.c.k();

    public n() {
        a(androidx.work.r.f45550b);
    }

    public final void a(@NonNull r.a aVar) {
        this.f45463c.postValue(aVar);
        boolean z11 = aVar instanceof r.a.c;
        androidx.work.impl.utils.futures.c<r.a.c> cVar = this.f45464d;
        if (z11) {
            cVar.j((r.a.c) aVar);
        } else if (aVar instanceof r.a.C0824a) {
            cVar.l(((r.a.C0824a) aVar).a());
        }
    }
}
