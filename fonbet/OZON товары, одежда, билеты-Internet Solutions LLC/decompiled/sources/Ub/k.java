package Ub;

import Ub.j;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<? extends Hf.u>, t> f27505a;

    static class a implements j.a {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f27506a = new HashMap(3);

        a() {
        }

        @Override // Ub.j.a
        @NonNull
        public final t a() {
            t tVar = (t) this.f27506a.get(Hf.t.class);
            if (tVar != null) {
                return tVar;
            }
            throw new NullPointerException(Hf.t.class.getName());
        }

        @Override // Ub.j.a
        @NonNull
        public final <N extends Hf.u> j.a b(@NonNull Class<N> cls, t tVar) {
            this.f27506a.put(cls, tVar);
            return this;
        }

        @Override // Ub.j.a
        @NonNull
        public final j.a c(@NonNull HH.b bVar) {
            HashMap hashMap = this.f27506a;
            t tVar = (t) hashMap.get(Hf.l.class);
            if (tVar == null) {
                hashMap.put(Hf.l.class, bVar);
                return this;
            }
            if (tVar instanceof b) {
                ((b) tVar).f27507a.add(0, bVar);
                return this;
            }
            hashMap.put(Hf.l.class, new b(bVar, tVar));
            return this;
        }

        @NonNull
        public final j d() {
            return new k(Collections.unmodifiableMap(this.f27506a));
        }
    }

    /* loaded from: classes9.dex */
    static class b implements t {

        /* renamed from: a, reason: collision with root package name */
        final ArrayList f27507a;

        b(@NonNull HH.b bVar, @NonNull t tVar) {
            ArrayList arrayList = new ArrayList(3);
            this.f27507a = arrayList;
            arrayList.add(bVar);
            arrayList.add(tVar);
        }

        @Override // Ub.t
        public final Object a(@NonNull f fVar, @NonNull r rVar) {
            ArrayList arrayList = this.f27507a;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i11 = 0; i11 < size; i11++) {
                objArr[i11] = ((t) arrayList.get(i11)).a(fVar, rVar);
            }
            return objArr;
        }
    }

    k(@NonNull Map<Class<? extends Hf.u>, t> map) {
        this.f27505a = map;
    }

    @Override // Ub.j
    public final <N extends Hf.u> t a(@NonNull Class<N> cls) {
        return this.f27505a.get(cls);
    }
}
