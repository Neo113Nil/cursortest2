package f;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b extends i implements Map {

    /* renamed from: h, reason: collision with root package name */
    public a f1007h;

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f1007h == null) {
            this.f1007h = new a(0, this);
        }
        a aVar = this.f1007h;
        if (aVar.f1002a == null) {
            aVar.f1002a = new f(aVar, 0);
        }
        return aVar.f1002a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f1007h == null) {
            this.f1007h = new a(0, this);
        }
        a aVar = this.f1007h;
        if (aVar.f1003b == null) {
            aVar.f1003b = new f(aVar, 1);
        }
        return aVar.f1003b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f1038c;
        int i2 = this.f1038c;
        int[] iArr = this.f1036a;
        if (iArr.length < size) {
            Object[] objArr = this.f1037b;
            a(size);
            if (this.f1038c > 0) {
                System.arraycopy(iArr, 0, this.f1036a, 0, i2);
                System.arraycopy(objArr, 0, this.f1037b, 0, i2 << 1);
            }
            i.b(iArr, objArr, i2);
        }
        if (this.f1038c != i2) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f1007h == null) {
            this.f1007h = new a(0, this);
        }
        a aVar = this.f1007h;
        if (aVar.f1004c == null) {
            aVar.f1004c = new h(aVar);
        }
        return aVar.f1004c;
    }
}
