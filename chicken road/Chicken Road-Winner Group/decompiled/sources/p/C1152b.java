package p;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;

/* renamed from: p.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1152b extends C1161k implements Map {

    /* renamed from: h, reason: collision with root package name */
    public C1151a f10185h;

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f10185h == null) {
            this.f10185h = new C1151a(0, this);
        }
        C1151a c1151a = this.f10185h;
        if (c1151a.f10180a == null) {
            c1151a.f10180a = new C1158h(c1151a, 0);
        }
        return c1151a.f10180a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f10185h == null) {
            this.f10185h = new C1151a(0, this);
        }
        C1151a c1151a = this.f10185h;
        if (c1151a.f10181b == null) {
            c1151a.f10181b = new C1158h(c1151a, 1);
        }
        return c1151a.f10181b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f10224c;
        int i3 = this.f10224c;
        int[] iArr = this.f10222a;
        if (iArr.length < size) {
            Object[] objArr = this.f10223b;
            a(size);
            if (this.f10224c > 0) {
                System.arraycopy(iArr, 0, this.f10222a, 0, i3);
                System.arraycopy(objArr, 0, this.f10223b, 0, i3 << 1);
            }
            C1161k.b(iArr, objArr, i3);
        }
        if (this.f10224c != i3) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f10185h == null) {
            this.f10185h = new C1151a(0, this);
        }
        C1151a c1151a = this.f10185h;
        if (c1151a.f10182c == null) {
            c1151a.f10182c = new C1160j(c1151a);
        }
        return c1151a.f10182c;
    }
}
