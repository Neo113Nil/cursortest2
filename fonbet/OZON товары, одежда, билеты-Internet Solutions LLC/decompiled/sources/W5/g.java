package W5;

import W5.k;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
final class g<K extends k, V> {

    /* renamed from: a, reason: collision with root package name */
    private final a<K, V> f33255a = new a<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f33256b = new HashMap();

    private static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final K f33257a;

        /* renamed from: b, reason: collision with root package name */
        private ArrayList f33258b;

        /* renamed from: c, reason: collision with root package name */
        a<K, V> f33259c;

        /* renamed from: d, reason: collision with root package name */
        a<K, V> f33260d;

        a() {
            this(null);
        }

        public final void a(V v11) {
            if (this.f33258b == null) {
                this.f33258b = new ArrayList();
            }
            this.f33258b.add(v11);
        }

        public final V b() {
            int c11 = c();
            if (c11 > 0) {
                return (V) this.f33258b.remove(c11 - 1);
            }
            return null;
        }

        public final int c() {
            ArrayList arrayList = this.f33258b;
            if (arrayList != null) {
                return arrayList.size();
            }
            return 0;
        }

        a(K k11) {
            this.f33260d = this;
            this.f33259c = this;
            this.f33257a = k11;
        }
    }

    g() {
    }

    public final V a(K k11) {
        a aVar;
        HashMap hashMap = this.f33256b;
        a aVar2 = (a) hashMap.get(k11);
        if (aVar2 == null) {
            a aVar3 = new a(k11);
            hashMap.put(k11, aVar3);
            aVar = aVar3;
        } else {
            k11.a();
            aVar = aVar2;
        }
        a<K, V> aVar4 = aVar.f33260d;
        aVar4.f33259c = aVar.f33259c;
        aVar.f33259c.f33260d = aVar4;
        a<K, V> aVar5 = this.f33255a;
        aVar.f33260d = aVar5;
        a<K, V> aVar6 = aVar5.f33259c;
        aVar.f33259c = aVar6;
        aVar6.f33260d = aVar;
        aVar.f33260d.f33259c = aVar;
        return (V) aVar.b();
    }

    public final void b(K k11, V v11) {
        HashMap hashMap = this.f33256b;
        a aVar = (a) hashMap.get(k11);
        if (aVar == null) {
            aVar = new a(k11);
            aVar.f33259c = aVar;
            aVar.f33260d = aVar;
            a<K, V> aVar2 = this.f33255a;
            aVar.f33260d = aVar2.f33260d;
            aVar.f33259c = aVar2;
            aVar2.f33260d = aVar;
            aVar.f33260d.f33259c = aVar;
            hashMap.put(k11, aVar);
        } else {
            k11.a();
        }
        aVar.a(v11);
    }

    public final V c() {
        a<K, V> aVar = this.f33255a;
        for (a aVar2 = aVar.f33260d; !aVar2.equals(aVar); aVar2 = aVar2.f33260d) {
            V v11 = (V) aVar2.b();
            if (v11 != null) {
                return v11;
            }
            a<K, V> aVar3 = aVar2.f33260d;
            aVar3.f33259c = aVar2.f33259c;
            aVar2.f33259c.f33260d = aVar3;
            HashMap hashMap = this.f33256b;
            Object obj = aVar2.f33257a;
            hashMap.remove(obj);
            ((k) obj).a();
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a<K, V> aVar = this.f33255a;
        a aVar2 = aVar.f33259c;
        boolean z11 = false;
        while (!aVar2.equals(aVar)) {
            sb2.append('{');
            sb2.append(aVar2.f33257a);
            sb2.append(':');
            sb2.append(aVar2.c());
            sb2.append("}, ");
            aVar2 = aVar2.f33259c;
            z11 = true;
        }
        if (z11) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
