package af;

import af.C5015e;
import gd.InterfaceC6712a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class i implements Iterator<C5015e.c>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    private final Iterator<C5015e.b> f36758a;

    /* renamed from: b, reason: collision with root package name */
    private C5015e.c f36759b;

    /* renamed from: c, reason: collision with root package name */
    private C5015e.c f36760c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C5015e f36761d;

    i(C5015e c5015e) {
        this.f36761d = c5015e;
        Iterator<C5015e.b> it = new ArrayList(c5015e.z().values()).iterator();
        Intrinsics.checkNotNullExpressionValue(it, "ArrayList(lruEntries.values).iterator()");
        this.f36758a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C5015e.c p11;
        if (this.f36759b != null) {
            return true;
        }
        synchronized (this.f36761d) {
            if (this.f36761d.w()) {
                return false;
            }
            while (this.f36758a.hasNext()) {
                C5015e.b next = this.f36758a.next();
                if (next != null && (p11 = next.p()) != null) {
                    this.f36759b = p11;
                    return true;
                }
            }
            Unit unit = Unit.f71690a;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final C5015e.c next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C5015e.c cVar = this.f36759b;
        this.f36760c = cVar;
        this.f36759b = null;
        Intrinsics.f(cVar);
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C5015e.c cVar = this.f36760c;
        if (cVar == null) {
            throw new IllegalStateException("remove() before next()");
        }
        try {
            this.f36761d.W(cVar.j());
        } catch (IOException unused) {
        } finally {
            this.f36760c = null;
        }
    }
}
