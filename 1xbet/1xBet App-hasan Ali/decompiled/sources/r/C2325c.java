package r;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: r.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2325c implements Iterator, Map.Entry {

    /* renamed from: k, reason: collision with root package name */
    public int f18986k;

    /* renamed from: l, reason: collision with root package name */
    public int f18987l = -1;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18988m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2327e f18989n;

    public C2325c(C2327e c2327e) {
        this.f18989n = c2327e;
        this.f18986k = c2327e.f18961m - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f18988m) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f18987l;
        C2327e c2327e = this.f18989n;
        return kotlin.jvm.internal.l.a(key, c2327e.f(i)) && kotlin.jvm.internal.l.a(entry.getValue(), c2327e.i(this.f18987l));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f18988m) {
            return this.f18989n.f(this.f18987l);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f18988m) {
            return this.f18989n.i(this.f18987l);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18987l < this.f18986k;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f18988m) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f18987l;
        C2327e c2327e = this.f18989n;
        Object f = c2327e.f(i);
        Object i5 = c2327e.i(this.f18987l);
        return (f == null ? 0 : f.hashCode()) ^ (i5 != null ? i5.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f18987l++;
        this.f18988m = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f18988m) {
            throw new IllegalStateException();
        }
        this.f18989n.g(this.f18987l);
        this.f18987l--;
        this.f18986k--;
        this.f18988m = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f18988m) {
            return this.f18989n.h(this.f18987l, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
