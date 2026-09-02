package f;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: f.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029e implements Iterator, Map.Entry {

    /* renamed from: b, reason: collision with root package name */
    public int f505b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C.e f508e;

    /* renamed from: d, reason: collision with root package name */
    public boolean f507d = false;

    /* renamed from: c, reason: collision with root package name */
    public int f506c = -1;

    public C0029e(C.e eVar) {
        this.f508e = eVar;
        this.f505b = ((C0025a) eVar.f11d).f494d - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f507d) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i2 = this.f506c;
        C.e eVar = this.f508e;
        Object b2 = eVar.b(i2, 0);
        if (key != b2 && (key == null || !key.equals(b2))) {
            return false;
        }
        Object value = entry.getValue();
        Object b3 = eVar.b(this.f506c, 1);
        return value == b3 || (value != null && value.equals(b3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f507d) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f508e.b(this.f506c, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f507d) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f508e.b(this.f506c, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f506c < this.f505b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f507d) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = this.f506c;
        C.e eVar = this.f508e;
        Object b2 = eVar.b(i2, 0);
        Object b3 = eVar.b(this.f506c, 1);
        return (b2 == null ? 0 : b2.hashCode()) ^ (b3 != null ? b3.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f506c++;
        this.f507d = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f507d) {
            throw new IllegalStateException();
        }
        this.f508e.c(this.f506c);
        this.f506c--;
        this.f505b--;
        this.f507d = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f507d) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = (this.f506c << 1) + 1;
        Object[] objArr = ((C0025a) this.f508e.f11d).f493c;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
