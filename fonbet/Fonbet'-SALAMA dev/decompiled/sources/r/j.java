package r;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class j implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f15996a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q3.d f15999d;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15998c = false;

    /* renamed from: b, reason: collision with root package name */
    public int f15997b = -1;

    public j(Q3.d dVar) {
        this.f15999d = dVar;
        this.f15996a = dVar.d() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f15998c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i7 = this.f15997b;
        Q3.d dVar = this.f15999d;
        Object b7 = dVar.b(i7, 0);
        if (key != b7 && (key == null || !key.equals(b7))) {
            return false;
        }
        Object value = entry.getValue();
        Object b8 = dVar.b(this.f15997b, 1);
        return value == b8 || (value != null && value.equals(b8));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f15998c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f15999d.b(this.f15997b, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f15998c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f15999d.b(this.f15997b, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15997b < this.f15996a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f15998c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i7 = this.f15997b;
        Q3.d dVar = this.f15999d;
        Object b7 = dVar.b(i7, 0);
        Object b8 = dVar.b(this.f15997b, 1);
        return (b7 == null ? 0 : b7.hashCode()) ^ (b8 != null ? b8.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f15997b++;
        this.f15998c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f15998c) {
            throw new IllegalStateException();
        }
        this.f15999d.h(this.f15997b);
        this.f15997b--;
        this.f15996a--;
        this.f15998c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f15998c) {
            return this.f15999d.i(this.f15997b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
