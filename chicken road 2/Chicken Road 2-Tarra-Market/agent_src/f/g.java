package f;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f1027a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f1030d;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1029c = false;

    /* renamed from: b, reason: collision with root package name */
    public int f1028b = -1;

    public g(a aVar) {
        this.f1030d = aVar;
        this.f1027a = aVar.d() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f1029c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i2 = this.f1028b;
        a aVar = this.f1030d;
        Object b2 = aVar.b(i2, 0);
        if (key != b2 && (key == null || !key.equals(b2))) {
            return false;
        }
        Object value = entry.getValue();
        Object b3 = aVar.b(this.f1028b, 1);
        return value == b3 || (value != null && value.equals(b3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f1029c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f1030d.b(this.f1028b, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f1029c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f1030d.b(this.f1028b, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1028b < this.f1027a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f1029c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = this.f1028b;
        a aVar = this.f1030d;
        Object b2 = aVar.b(i2, 0);
        Object b3 = aVar.b(this.f1028b, 1);
        return (b2 == null ? 0 : b2.hashCode()) ^ (b3 != null ? b3.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f1028b++;
        this.f1029c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f1029c) {
            throw new IllegalStateException();
        }
        this.f1030d.g(this.f1028b);
        this.f1028b--;
        this.f1027a--;
        this.f1029c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f1029c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        a aVar = this.f1030d;
        int i2 = this.f1028b;
        switch (aVar.f1005d) {
            case 0:
                int i3 = (i2 << 1) + 1;
                Object[] objArr = ((b) aVar.f1006e).f1037b;
                Object obj2 = objArr[i3];
                objArr[i3] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
