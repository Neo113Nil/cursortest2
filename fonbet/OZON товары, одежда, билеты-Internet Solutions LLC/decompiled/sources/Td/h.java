package Td;

import Td.AbstractC4045a;
import Td.g;
import Td.i;
import Td.p;
import g.C6594f;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class h extends AbstractC4045a implements Serializable {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27076a;

        static {
            int[] iArr = new int[z.values().length];
            f27076a = iArr;
            try {
                iArr[z.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27076a[z.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class b<MessageType extends h, BuilderType extends b> extends AbstractC4045a.AbstractC0542a<BuilderType> {

        /* renamed from: a, reason: collision with root package name */
        private Td.c f27077a = Td.c.f27045a;

        protected b() {
        }

        @Override // 
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public final Td.c d() {
            return this.f27077a;
        }

        public abstract BuilderType e(MessageType messagetype);

        public final void f(Td.c cVar) {
            this.f27077a = cVar;
        }
    }

    public static abstract class c<MessageType extends d<MessageType>, BuilderType extends c<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements q {

        /* renamed from: b, reason: collision with root package name */
        private g<e> f27078b = g.e();

        /* renamed from: c, reason: collision with root package name */
        private boolean f27079c;

        protected c() {
        }

        static g g(c cVar) {
            cVar.f27078b.l();
            cVar.f27079c = false;
            return cVar.f27078b;
        }

        protected final void h(MessageType messagetype) {
            if (!this.f27079c) {
                this.f27078b = this.f27078b.clone();
                this.f27079c = true;
            }
            this.f27078b.m(((d) messagetype).f27080a);
        }
    }

    static final class e implements g.b<e> {

        /* renamed from: a, reason: collision with root package name */
        final int f27083a;

        /* renamed from: b, reason: collision with root package name */
        final y f27084b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f27085c;

        e(int i11, y yVar, boolean z11) {
            this.f27083a = i11;
            this.f27084b = yVar;
            this.f27085c = z11;
        }

        @Override // Td.g.b
        public final b K0(p.a aVar, p pVar) {
            return ((b) aVar).e((h) pVar);
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f27083a - ((e) obj).f27083a;
        }

        @Override // Td.g.b
        public final z getLiteJavaType() {
            return this.f27084b.a();
        }

        @Override // Td.g.b
        public final y getLiteType() {
            return this.f27084b;
        }

        @Override // Td.g.b
        public final int getNumber() {
            return this.f27083a;
        }

        @Override // Td.g.b
        public final boolean isPacked() {
            return false;
        }

        @Override // Td.g.b
        public final boolean isRepeated() {
            return this.f27085c;
        }
    }

    public static class f<ContainingType extends p, Type> {

        /* renamed from: a, reason: collision with root package name */
        final d f27086a;

        /* renamed from: b, reason: collision with root package name */
        final Type f27087b;

        /* renamed from: c, reason: collision with root package name */
        final h f27088c;

        /* renamed from: d, reason: collision with root package name */
        final e f27089d;

        /* renamed from: e, reason: collision with root package name */
        final Method f27090e;

        /* JADX WARN: Multi-variable type inference failed */
        f(d dVar, Object obj, h hVar, e eVar, Class cls) {
            if (dVar == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (eVar.f27084b == y.MESSAGE && hVar == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f27086a = dVar;
            this.f27087b = obj;
            this.f27088c = hVar;
            this.f27089d = eVar;
            if (!i.a.class.isAssignableFrom(cls)) {
                this.f27090e = null;
                return;
            }
            try {
                this.f27090e = cls.getMethod("valueOf", Integer.TYPE);
            } catch (NoSuchMethodException e11) {
                String name = cls.getName();
                throw new RuntimeException(C6594f.a("Generated message class \"", name, "\" missing method \"valueOf\".", new StringBuilder(name.length() + 52)), e11);
            }
        }

        final Object a(Object obj) {
            if (this.f27089d.f27084b.a() != z.ENUM) {
                return obj;
            }
            try {
                return this.f27090e.invoke(null, (Integer) obj);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e11);
            } catch (InvocationTargetException e12) {
                Throwable cause = e12.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }

        final Object b(Object obj) {
            return this.f27089d.f27084b.a() == z.ENUM ? Integer.valueOf(((i.a) obj).getNumber()) : obj;
        }
    }

    protected h() {
    }

    public static f b(d dVar, h hVar, int i11, y yVar, Class cls) {
        return new f(dVar, Collections.EMPTY_LIST, hVar, new e(i11, yVar, true), cls);
    }

    public static f d(d dVar, Serializable serializable, h hVar, int i11, y yVar, Class cls) {
        return new f(dVar, serializable, hVar, new e(i11, yVar, false), cls);
    }

    public static abstract class d<MessageType extends d<MessageType>> extends h implements q {

        /* renamed from: a, reason: collision with root package name */
        private final g<e> f27080a;

        protected class a {

            /* renamed from: a, reason: collision with root package name */
            private final Iterator<Map.Entry<e, Object>> f27081a;

            /* renamed from: b, reason: collision with root package name */
            private Map.Entry<e, Object> f27082b;

            a(d dVar) {
                Iterator<Map.Entry<e, Object>> k11 = dVar.f27080a.k();
                this.f27081a = k11;
                if (k11.hasNext()) {
                    this.f27082b = k11.next();
                }
            }

            public final void a(int i11, Td.e eVar) throws IOException {
                while (true) {
                    Map.Entry<e, Object> entry = this.f27082b;
                    if (entry == null || entry.getKey().f27083a >= i11) {
                        return;
                    }
                    g.t(this.f27082b.getKey(), this.f27082b.getValue(), eVar);
                    Iterator<Map.Entry<e, Object>> it = this.f27081a;
                    if (it.hasNext()) {
                        this.f27082b = it.next();
                    } else {
                        this.f27082b = null;
                    }
                }
            }
        }

        protected d() {
            this.f27080a = g.o();
        }

        private void s(f<MessageType, ?> fVar) {
            if (fVar.f27086a != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        protected final boolean f() {
            return this.f27080a.i();
        }

        protected final int g() {
            return this.f27080a.g();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [Type, java.util.ArrayList] */
        public final <Type> Type h(f<MessageType, Type> fVar) {
            s(fVar);
            g<e> gVar = this.f27080a;
            e eVar = fVar.f27089d;
            Type type = (Type) gVar.f(eVar);
            if (type == null) {
                return fVar.f27087b;
            }
            if (!eVar.f27085c) {
                return (Type) fVar.a(type);
            }
            if (eVar.f27084b.a() != z.ENUM) {
                return type;
            }
            ?? r12 = (Type) new ArrayList();
            Iterator it = ((List) type).iterator();
            while (it.hasNext()) {
                r12.add(fVar.a(it.next()));
            }
            return r12;
        }

        public final <Type> Type i(f<MessageType, List<Type>> fVar, int i11) {
            s(fVar);
            g<e> gVar = this.f27080a;
            gVar.getClass();
            e eVar = fVar.f27089d;
            if (!eVar.f27085c) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object f7 = gVar.f(eVar);
            if (f7 != null) {
                return (Type) fVar.a(((List) f7).get(i11));
            }
            throw new IndexOutOfBoundsException();
        }

        public final <Type> int j(f<MessageType, List<Type>> fVar) {
            s(fVar);
            g<e> gVar = this.f27080a;
            gVar.getClass();
            e eVar = fVar.f27089d;
            if (!eVar.f27085c) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object f7 = gVar.f(eVar);
            if (f7 == null) {
                return 0;
            }
            return ((List) f7).size();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean l(f<MessageType, Type> fVar) {
            s(fVar);
            return this.f27080a.h(fVar.f27089d);
        }

        protected final void m() {
            this.f27080a.l();
        }

        protected final d<MessageType>.a n() {
            return new a(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected final boolean p(Td.d dVar, Td.e eVar, Td.f fVar, int i11) throws IOException {
            boolean z11;
            Object build;
            p pVar;
            int i12 = i11 & 7;
            f b11 = fVar.b(i11 >>> 3, getDefaultInstanceForType());
            boolean z12 = false;
            if (b11 != null) {
                e eVar2 = b11.f27089d;
                y yVar = eVar2.f27084b;
                int i13 = g.f27070e;
                if (i12 == yVar.b()) {
                    z11 = false;
                } else if (eVar2.f27085c && eVar2.f27084b.d() && i12 == 2) {
                    z11 = true;
                }
                if (!z12) {
                    return dVar.u(i11, eVar);
                }
                p.a aVar = null;
                g<e> gVar = this.f27080a;
                if (z11) {
                    int e11 = dVar.e(dVar.n());
                    e eVar3 = b11.f27089d;
                    if (eVar3.f27084b != y.ENUM) {
                        while (dVar.b() > 0) {
                            gVar.a(eVar3, g.p(dVar, eVar3.f27084b));
                        }
                    } else if (dVar.b() > 0) {
                        dVar.n();
                        throw null;
                    }
                    dVar.d(e11);
                    return true;
                }
                int i14 = a.f27076a[b11.f27089d.f27084b.a().ordinal()];
                e eVar4 = b11.f27089d;
                if (i14 == 1) {
                    if (!eVar4.f27085c && (pVar = (p) gVar.f(eVar4)) != null) {
                        aVar = pVar.toBuilder();
                    }
                    if (aVar == null) {
                        aVar = b11.f27088c.newBuilderForType();
                    }
                    if (eVar4.f27084b == y.GROUP) {
                        dVar.g(eVar4.f27083a, aVar, fVar);
                    } else {
                        dVar.j(aVar, fVar);
                    }
                    build = aVar.build();
                } else {
                    if (i14 == 2) {
                        dVar.n();
                        eVar4.getClass();
                        throw null;
                    }
                    build = g.p(dVar, eVar4.f27084b);
                }
                if (eVar4.f27085c) {
                    gVar.a(eVar4, b11.b(build));
                    return true;
                }
                gVar.q(eVar4, b11.b(build));
                return true;
            }
            z11 = false;
            z12 = true;
            if (!z12) {
            }
        }

        protected d(c<MessageType, ?> cVar) {
            this.f27080a = c.g(cVar);
        }
    }
}
