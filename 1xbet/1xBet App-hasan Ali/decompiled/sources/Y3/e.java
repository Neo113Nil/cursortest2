package Y3;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class e implements Map.Entry, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public final g f6152k;

    /* renamed from: l, reason: collision with root package name */
    public final int f6153l;

    /* renamed from: m, reason: collision with root package name */
    public final int f6154m;

    public e(g gVar, int i) {
        l.f("map", gVar);
        this.f6152k = gVar;
        this.f6153l = i;
        this.f6154m = gVar.f6167r;
    }

    public final void a() {
        if (this.f6152k.f6167r != this.f6154m) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return l.a(entry.getKey(), getKey()) && l.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f6152k.f6160k[this.f6153l];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f6152k.f6161l;
        l.c(objArr);
        return objArr[this.f6153l];
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
        g gVar = this.f6152k;
        gVar.b();
        Object[] objArr = gVar.f6161l;
        if (objArr == null) {
            int length = gVar.f6160k.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            gVar.f6161l = objArr;
        }
        int i = this.f6153l;
        Object obj2 = objArr[i];
        objArr[i] = obj;
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
