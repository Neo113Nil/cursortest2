package l;

/* renamed from: l.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0924b extends l.k implements java.util.Map {

    /* renamed from: h, reason: collision with root package name */
    public l.C0923a f7967h;

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        if (this.f7967h == null) {
            this.f7967h = new l.C0923a(0, this);
        }
        l.C0923a c0923a = this.f7967h;
        if (c0923a.f7962a == null) {
            c0923a.f7962a = new l.h(c0923a, 0);
        }
        return c0923a.f7962a;
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        if (this.f7967h == null) {
            this.f7967h = new l.C0923a(0, this);
        }
        l.C0923a c0923a = this.f7967h;
        if (c0923a.f7963b == null) {
            c0923a.f7963b = new l.h(c0923a, 1);
        }
        return c0923a.f7963b;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        int size = map.size() + this.f8008c;
        int i2 = this.f8008c;
        int[] iArr = this.f8006a;
        if (iArr.length < size) {
            java.lang.Object[] objArr = this.f8007b;
            a(size);
            if (this.f8008c > 0) {
                java.lang.System.arraycopy(iArr, 0, this.f8006a, 0, i2);
                java.lang.System.arraycopy(objArr, 0, this.f8007b, 0, i2 << 1);
            }
            l.k.b(iArr, objArr, i2);
        }
        if (this.f8008c != i2) {
            throw new java.util.ConcurrentModificationException();
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        if (this.f7967h == null) {
            this.f7967h = new l.C0923a(0, this);
        }
        l.C0923a c0923a = this.f7967h;
        if (c0923a.f7964c == null) {
            c0923a.f7964c = new l.j(c0923a);
        }
        return c0923a.f7964c;
    }
}
