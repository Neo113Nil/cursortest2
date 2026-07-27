package p;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: p.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1159i implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f10214a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1151a f10217d;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10216c = false;

    /* renamed from: b, reason: collision with root package name */
    public int f10215b = -1;

    public C1159i(C1151a c1151a) {
        this.f10217d = c1151a;
        this.f10214a = c1151a.d() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f10216c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i3 = this.f10215b;
        C1151a c1151a = this.f10217d;
        Object b3 = c1151a.b(i3, 0);
        if (key != b3 && (key == null || !key.equals(b3))) {
            return false;
        }
        Object value = entry.getValue();
        Object b4 = c1151a.b(this.f10215b, 1);
        return value == b4 || (value != null && value.equals(b4));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f10216c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f10217d.b(this.f10215b, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f10216c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f10217d.b(this.f10215b, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10215b < this.f10214a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f10216c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i3 = this.f10215b;
        C1151a c1151a = this.f10217d;
        Object b3 = c1151a.b(i3, 0);
        Object b4 = c1151a.b(this.f10215b, 1);
        return (b3 == null ? 0 : b3.hashCode()) ^ (b4 != null ? b4.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f10215b++;
        this.f10216c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f10216c) {
            throw new IllegalStateException();
        }
        this.f10217d.g(this.f10215b);
        this.f10215b--;
        this.f10214a--;
        this.f10216c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f10216c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        C1151a c1151a = this.f10217d;
        int i3 = this.f10215b;
        switch (c1151a.f10183d) {
            case 0:
                int i4 = (i3 << 1) + 1;
                Object[] objArr = ((C1152b) c1151a.f10184e).f10223b;
                Object obj2 = objArr[i4];
                objArr[i4] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
