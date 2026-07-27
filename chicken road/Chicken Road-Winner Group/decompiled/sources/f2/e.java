package f2;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class e implements Map.Entry, p2.a {

    /* renamed from: a, reason: collision with root package name */
    public final f f4905a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4906b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4907c;

    public e(f map, int i3) {
        j.e(map, "map");
        this.f4905a = map;
        this.f4906b = i3;
        this.f4907c = map.f4915h;
    }

    public final void a() {
        if (this.f4905a.f4915h != this.f4907c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return j.a(entry.getKey(), getKey()) && j.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f4905a.f4909a[this.f4906b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f4905a.f4910b;
        j.b(objArr);
        return objArr[this.f4906b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        f fVar = this.f4905a;
        fVar.b();
        Object[] objArr = fVar.f4910b;
        if (objArr == null) {
            int length = fVar.f4909a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            fVar.f4910b = objArr;
        }
        int i3 = this.f4906b;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
