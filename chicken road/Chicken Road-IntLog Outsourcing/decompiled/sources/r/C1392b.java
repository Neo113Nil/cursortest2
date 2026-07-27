package r;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;

/* renamed from: r.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1392b extends C1401k implements Map {

    /* renamed from: h, reason: collision with root package name */
    public C1391a f11672h;

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f11672h == null) {
            this.f11672h = new C1391a(0, this);
        }
        C1391a c1391a = this.f11672h;
        if (((C1398h) c1391a.f3502a) == null) {
            c1391a.f3502a = new C1398h(c1391a, 0);
        }
        return (C1398h) c1391a.f3502a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f11672h == null) {
            this.f11672h = new C1391a(0, this);
        }
        C1391a c1391a = this.f11672h;
        if (((C1398h) c1391a.f3503b) == null) {
            c1391a.f3503b = new C1398h(c1391a, 1);
        }
        return (C1398h) c1391a.f3503b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f11713c;
        int i2 = this.f11713c;
        int[] iArr = this.f11711a;
        if (iArr.length < size) {
            Object[] objArr = this.f11712b;
            a(size);
            if (this.f11713c > 0) {
                System.arraycopy(iArr, 0, this.f11711a, 0, i2);
                System.arraycopy(objArr, 0, this.f11712b, 0, i2 << 1);
            }
            C1401k.c(iArr, objArr, i2);
        }
        if (this.f11713c != i2) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f11672h == null) {
            this.f11672h = new C1391a(0, this);
        }
        C1391a c1391a = this.f11672h;
        if (((C1400j) c1391a.f3504c) == null) {
            c1391a.f3504c = new C1400j(c1391a);
        }
        return (C1400j) c1391a.f3504c;
    }
}
