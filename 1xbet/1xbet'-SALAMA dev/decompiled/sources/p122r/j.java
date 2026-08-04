package p122r;

import Q3.d;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16002a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f16005d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16004c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16003b = -1;

    public j(d dVar) {
        this.f16005d = dVar;
        this.f16002a = dVar.d() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f16004c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i7 = this.f16003b;
        d dVar = this.f16005d;
        Object objB = dVar.b(i7, 0);
        if (key != objB && (key == null || !key.equals(objB))) {
            return false;
        }
        Object value = entry.getValue();
        Object objB2 = dVar.b(this.f16003b, 1);
        return value == objB2 || (value != null && value.equals(objB2));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f16004c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f16005d.b(this.f16003b, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f16004c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f16005d.b(this.f16003b, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16003b < this.f16002a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f16004c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i7 = this.f16003b;
        d dVar = this.f16005d;
        Object objB = dVar.b(i7, 0);
        Object objB2 = dVar.b(this.f16003b, 1);
        return (objB == null ? 0 : objB.hashCode()) ^ (objB2 != null ? objB2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f16003b++;
        this.f16004c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f16004c) {
            throw new IllegalStateException();
        }
        this.f16005d.h(this.f16003b);
        this.f16003b--;
        this.f16002a--;
        this.f16004c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f16004c) {
            return this.f16005d.i(this.f16003b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
