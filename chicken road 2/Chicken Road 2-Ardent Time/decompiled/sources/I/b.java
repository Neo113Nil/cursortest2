package I;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f643a;

    /* renamed from: b, reason: collision with root package name */
    public final C.j f644b;

    public b(java.util.Map preferencesMap, boolean z2) {
        kotlin.jvm.internal.i.e(preferencesMap, "preferencesMap");
        this.f643a = preferencesMap;
        this.f644b = new C.j(z2);
    }

    public final java.util.Map a() {
        h1.C0172d c0172d;
        java.util.Set<java.util.Map.Entry> entrySet = this.f643a.entrySet();
        int E2 = i1.AbstractC0203v.E(i1.AbstractC0192k.K(entrySet));
        if (E2 < 16) {
            E2 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(E2);
        for (java.util.Map.Entry entry : entrySet) {
            java.lang.Object value = entry.getValue();
            if (value instanceof byte[]) {
                java.lang.Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.i.d(copyOf, "copyOf(this, size)");
                c0172d = new h1.C0172d(key, copyOf);
            } else {
                c0172d = new h1.C0172d(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(c0172d.f3295a, c0172d.f3296b);
        }
        java.util.Map unmodifiableMap = java.util.Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.i.d(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    public final void b() {
        if (((java.util.concurrent.atomic.AtomicBoolean) this.f644b.f88b).get()) {
            throw new java.lang.IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final java.lang.Object c(I.d key) {
        kotlin.jvm.internal.i.e(key, "key");
        java.lang.Object obj = this.f643a.get(key);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public final void d(I.d dVar, java.lang.Object obj) {
        b();
        java.util.Map map = this.f643a;
        if (obj == null) {
            b();
            map.remove(dVar);
            return;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set unmodifiableSet = java.util.Collections.unmodifiableSet(i1.AbstractC0190i.b0((java.util.Set) obj));
            kotlin.jvm.internal.i.d(unmodifiableSet, "unmodifiableSet(set.toSet())");
            map.put(dVar, unmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                map.put(dVar, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(this, size)");
            map.put(dVar, copyOf);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[LOOP:0: B:16:0x002d->B:31:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(java.lang.Object obj) {
        boolean z2;
        if (!(obj instanceof I.b)) {
            return false;
        }
        I.b bVar = (I.b) obj;
        java.util.Map map = bVar.f643a;
        java.util.Map map2 = this.f643a;
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        java.util.Map map3 = bVar.f643a;
        if (!map3.isEmpty()) {
            for (java.util.Map.Entry entry : map3.entrySet()) {
                java.lang.Object obj2 = map2.get(entry.getKey());
                if (obj2 != null) {
                    java.lang.Object value = entry.getValue();
                    if (!(value instanceof byte[])) {
                        z2 = kotlin.jvm.internal.i.a(value, obj2);
                    } else if ((obj2 instanceof byte[]) && java.util.Arrays.equals((byte[]) value, (byte[]) obj2)) {
                        z2 = true;
                    }
                    if (z2) {
                        return false;
                    }
                }
                z2 = false;
                if (z2) {
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        java.util.Iterator it = this.f643a.entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            java.lang.Object value = ((java.util.Map.Entry) it.next()).getValue();
            i2 += value instanceof byte[] ? java.util.Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i2;
    }

    public final java.lang.String toString() {
        return i1.AbstractC0190i.Q(this.f643a.entrySet(), ",\n", "{\n", "\n}", I.a.f642e, 24);
    }

    public /* synthetic */ b(boolean z2) {
        this(new java.util.LinkedHashMap(), z2);
    }
}
