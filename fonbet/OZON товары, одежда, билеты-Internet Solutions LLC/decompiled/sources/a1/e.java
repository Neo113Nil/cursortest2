package a1;

import Bl0.k0;
import S0.A0;
import S0.AbstractC3992x;
import S0.B;
import S0.G0;
import S0.G1;
import V0.d;
import X0.t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class e extends X0.d<AbstractC3992x<Object>, G1<Object>> implements A0 {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final e f36181g;

    public static final class a extends X0.f<AbstractC3992x<Object>, G1<Object>> {

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private e f36182g;

        public a(@NotNull e eVar) {
            super(eVar);
            this.f36182g = eVar;
        }

        @Override // X0.f
        @NotNull
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public final e build() {
            e eVar;
            if (n() == this.f36182g.n()) {
                eVar = this.f36182g;
            } else {
                v(new k0());
                eVar = new e(n(), h());
            }
            this.f36182g = eVar;
            return eVar;
        }

        @Override // X0.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof AbstractC3992x) {
                return super.containsKey((AbstractC3992x) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof G1) {
                return super.containsValue((G1) obj);
            }
            return false;
        }

        @Override // X0.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof AbstractC3992x) {
                return (G1) super.get((AbstractC3992x) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof AbstractC3992x) ? obj2 : (G1) super.getOrDefault((AbstractC3992x) obj, (G1) obj2);
        }

        @Override // X0.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof AbstractC3992x) {
                return (G1) super.remove((AbstractC3992x) obj);
            }
            return null;
        }
    }

    static {
        t tVar;
        tVar = t.f33937e;
        f36181g = new e(tVar, 0);
    }

    @Override // S0.A
    public final Object b(@NotNull G0 g02) {
        return B.a(this, g02);
    }

    @Override // X0.d, kotlin.collections.AbstractC7697d, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC3992x) {
            return super.containsKey((AbstractC3992x) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractC7697d, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof G1) {
            return super.containsValue((G1) obj);
        }
        return false;
    }

    @Override // X0.d, V0.d
    public final d.a<AbstractC3992x<Object>, G1<Object>> d() {
        return new a(this);
    }

    @Override // S0.A0
    @NotNull
    public final e g(@NotNull AbstractC3992x abstractC3992x, @NotNull G1 g12) {
        t.a x11 = n().x(abstractC3992x, abstractC3992x.hashCode(), 0, g12);
        if (x11 == null) {
            return this;
        }
        return new e(x11.a(), x11.b() + h());
    }

    @Override // X0.d, kotlin.collections.AbstractC7697d, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC3992x) {
            return (G1) super.get((AbstractC3992x) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC3992x) ? obj2 : (G1) super.getOrDefault((AbstractC3992x) obj, (G1) obj2);
    }

    @Override // X0.d
    /* renamed from: m */
    public final X0.f<AbstractC3992x<Object>, G1<Object>> d() {
        return new a(this);
    }

    @Override // X0.d, V0.d
    /* renamed from: d, reason: avoid collision after fix types in other method */
    public final d.a<AbstractC3992x<Object>, G1<Object>> d2() {
        return new a(this);
    }
}
