package Ld;

import Ld.AbstractC3579f.a;
import Ld.B;
import Nd.b;
import Qd.C3856a;
import Rd.d;
import Td.h;
import ae.C5002d;
import fe.EnumC6525d;
import fe.InterfaceC6529h;
import fe.N;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pd.C8898a;
import td.d0;
import yd.C10884b;

/* renamed from: Ld.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3579f<A, S extends a<? extends A>> implements InterfaceC6529h<A> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final yd.g f16766a;

    /* renamed from: Ld.f$a */
    public static abstract class a<A> {
    }

    /* renamed from: Ld.f$b */
    public static final class b {
        public static y a(@NotNull N container, boolean z11, boolean z12, Boolean bool, boolean z13, @NotNull w kotlinClassFinder, @NotNull Rd.e jvmMetadataVersion) {
            N.a h11;
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
            Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
            if (z11) {
                if (bool == null) {
                    throw new IllegalStateException(("isConst should not be null for property (container=" + container + ')').toString());
                }
                if (container instanceof N.a) {
                    N.a aVar = (N.a) container;
                    if (aVar.g() == b.c.INTERFACE) {
                        Sd.b e11 = aVar.e();
                        Sd.f f7 = Sd.f.f("DefaultImpls");
                        Intrinsics.checkNotNullExpressionValue(f7, "identifier(...)");
                        return x.a(kotlinClassFinder, e11.d(f7), jvmMetadataVersion);
                    }
                }
                if (bool.booleanValue() && (container instanceof N.b)) {
                    d0 c11 = container.c();
                    t tVar = c11 instanceof t ? (t) c11 : null;
                    C5002d d11 = tVar != null ? tVar.d() : null;
                    if (d11 != null) {
                        String f11 = d11.f();
                        Intrinsics.checkNotNullExpressionValue(f11, "getInternalName(...)");
                        Sd.c topLevelFqName = new Sd.c(kotlin.text.h.Y(f11, '/', '.'));
                        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
                        Sd.c e12 = topLevelFqName.e();
                        return x.a(kotlinClassFinder, new Sd.b(e12, U7.d.a(e12, "parent(...)", topLevelFqName, "shortName(...)")), jvmMetadataVersion);
                    }
                }
            }
            if (z12 && (container instanceof N.a)) {
                N.a aVar2 = (N.a) container;
                if (aVar2.g() == b.c.COMPANION_OBJECT && (h11 = aVar2.h()) != null && (h11.g() == b.c.CLASS || h11.g() == b.c.ENUM_CLASS || (z13 && (h11.g() == b.c.INTERFACE || h11.g() == b.c.ANNOTATION_CLASS)))) {
                    d0 c12 = h11.c();
                    A a11 = c12 instanceof A ? (A) c12 : null;
                    if (a11 != null) {
                        return a11.c();
                    }
                    return null;
                }
            }
            if ((container instanceof N.b) && (container.c() instanceof t)) {
                d0 c13 = container.c();
                Intrinsics.g(c13, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
                t tVar2 = (t) c13;
                y e13 = tVar2.e();
                return e13 == null ? x.a(kotlinClassFinder, tVar2.c(), jvmMetadataVersion) : e13;
            }
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: Ld.f$c */
    private static final class c {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c BACKING_FIELD;
        public static final c DELEGATE_FIELD;
        public static final c PROPERTY;

        static {
            c cVar = new c("PROPERTY", 0);
            PROPERTY = cVar;
            c cVar2 = new c("BACKING_FIELD", 1);
            BACKING_FIELD = cVar2;
            c cVar3 = new c("DELEGATE_FIELD", 2);
            DELEGATE_FIELD = cVar3;
            c[] cVarArr = {cVar, cVar2, cVar3};
            $VALUES = cVarArr;
            $ENTRIES = Xc.b.a(cVarArr);
        }

        private c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* renamed from: Ld.f$d */
    /* loaded from: classes10.dex */
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16767a;

        static {
            int[] iArr = new int[EnumC6525d.values().length];
            try {
                iArr[EnumC6525d.PROPERTY_GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6525d.PROPERTY_SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6525d.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16767a = iArr;
        }
    }

    public AbstractC3579f(@NotNull yd.g kotlinClassFinder) {
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        this.f16766a = kotlinClassFinder;
    }

    private final List<A> l(N n11, B b11, boolean z11, boolean z12, Boolean bool, boolean z13) {
        List<A> list;
        y n12 = n(n11, b.a(n11, z11, z12, bool, z13, this.f16766a, q()));
        return (n12 == null || (list = (List) ((HashMap) o(n12).b()).get(b11)) == null) ? K.f71697a : list;
    }

    static /* synthetic */ List m(AbstractC3579f abstractC3579f, N n11, B b11, Boolean bool, boolean z11, int i11) {
        boolean z12 = (i11 & 4) == 0;
        if ((i11 & 16) != 0) {
            bool = null;
        }
        return abstractC3579f.l(n11, b11, z12, false, bool, (i11 & 32) != 0 ? false : z11);
    }

    protected static y n(@NotNull N container, y yVar) {
        Intrinsics.checkNotNullParameter(container, "container");
        if (yVar != null) {
            return yVar;
        }
        if (container instanceof N.a) {
            d0 c11 = ((N.a) container).c();
            A a11 = c11 instanceof A ? (A) c11 : null;
            if (a11 != null) {
                return a11.c();
            }
        }
        return null;
    }

    protected static B p(@NotNull h.d proto, @NotNull Pd.c nameResolver, @NotNull Pd.g typeTable, @NotNull EnumC6525d kind, boolean z11) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (proto instanceof Nd.c) {
            int i11 = Rd.h.f25024b;
            d.b b11 = Rd.h.b((Nd.c) proto, nameResolver, typeTable);
            if (b11 == null) {
                return null;
            }
            return B.a.a(b11);
        }
        if (proto instanceof Nd.h) {
            int i12 = Rd.h.f25024b;
            d.b d11 = Rd.h.d((Nd.h) proto, nameResolver, typeTable);
            if (d11 == null) {
                return null;
            }
            return B.a.a(d11);
        }
        if (!(proto instanceof Nd.m)) {
            return null;
        }
        h.f<Nd.m, C3856a.c> propertySignature = C3856a.f23235d;
        Intrinsics.checkNotNullExpressionValue(propertySignature, "propertySignature");
        C3856a.c cVar = (C3856a.c) Pd.e.a(proto, propertySignature);
        if (cVar == null) {
            return null;
        }
        int i13 = d.f16767a[kind.ordinal()];
        if (i13 == 1) {
            if (!cVar.B()) {
                return null;
            }
            C3856a.b signature = cVar.s();
            Intrinsics.checkNotNullExpressionValue(signature, "getGetter(...)");
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            Intrinsics.checkNotNullParameter(signature, "signature");
            String name = nameResolver.getString(signature.l());
            String desc = nameResolver.getString(signature.j());
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            return new B(U7.d.e(name, desc));
        }
        if (i13 != 2) {
            if (i13 != 3) {
                return null;
            }
            return C3581h.a((Nd.m) proto, nameResolver, typeTable, true, true, z11);
        }
        if (!cVar.C()) {
            return null;
        }
        C3856a.b signature2 = cVar.u();
        Intrinsics.checkNotNullExpressionValue(signature2, "getSetter(...)");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(signature2, "signature");
        String name2 = nameResolver.getString(signature2.l());
        String desc2 = nameResolver.getString(signature2.j());
        Intrinsics.checkNotNullParameter(name2, "name");
        Intrinsics.checkNotNullParameter(desc2, "desc");
        return new B(U7.d.e(name2, desc2));
    }

    private final List<A> v(N n11, Nd.m mVar, c cVar) {
        B a11;
        B a12;
        Boolean d11 = Pd.b.f22215B.d(mVar.U());
        Intrinsics.checkNotNullExpressionValue(d11, "get(...)");
        boolean e11 = Rd.h.e(mVar);
        if (cVar == c.PROPERTY) {
            a12 = C3581h.a(mVar, n11.b(), n11.d(), (r12 & 8) == 0, (r12 & 16) == 0, true);
            return a12 == null ? K.f71697a : m(this, n11, a12, d11, e11, 8);
        }
        a11 = C3581h.a(mVar, n11.b(), n11.d(), (r12 & 8) == 0, (r12 & 16) == 0, true);
        if (a11 == null) {
            return K.f71697a;
        }
        return kotlin.text.h.t(a11.a(), "$delegate", false) != (cVar == c.DELEGATE_FIELD) ? K.f71697a : l(n11, a11, true, true, d11, e11);
    }

    @Override // fe.InterfaceC6529h
    @NotNull
    public final ArrayList a(@NotNull N.a container) {
        Intrinsics.checkNotNullParameter(container, "container");
        d0 c11 = container.c();
        A a11 = c11 instanceof A ? (A) c11 : null;
        y kotlinClass = a11 != null ? a11.c() : null;
        if (kotlinClass == null) {
            throw new IllegalStateException(("Class for loading annotations is not found: " + container.a()).toString());
        }
        ArrayList arrayList = new ArrayList(1);
        C3580g c3580g = new C3580g(this, arrayList);
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        kotlinClass.d(c3580g);
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r8.k0() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r8.i() != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r8.l0() == false) goto L26;
     */
    @Override // fe.InterfaceC6529h
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List b(@NotNull N container, @NotNull h.d callableProto, @NotNull EnumC6525d kind, int i11, @NotNull Nd.t proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(callableProto, "callableProto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        int i12 = 0;
        B signature = p(callableProto, container.b(), container.d(), kind, false);
        if (signature == null) {
            return K.f71697a;
        }
        if (callableProto instanceof Nd.h) {
            Nd.h hVar = (Nd.h) callableProto;
            Intrinsics.checkNotNullParameter(hVar, "<this>");
            if (!hVar.k0()) {
            }
            i12 = 1;
        } else if (callableProto instanceof Nd.m) {
            Nd.m mVar = (Nd.m) callableProto;
            Intrinsics.checkNotNullParameter(mVar, "<this>");
            if (!mVar.j0()) {
            }
            i12 = 1;
        } else {
            if (!(callableProto instanceof Nd.c)) {
                throw new UnsupportedOperationException("Unsupported message: " + callableProto.getClass());
            }
            N.a aVar = (N.a) container;
            if (aVar.g() == b.c.ENUM_CLASS) {
                i12 = 2;
            }
        }
        Intrinsics.checkNotNullParameter(signature, "signature");
        return m(this, container, new B(signature.a() + '@' + (i11 + i12)), null, false, 60);
    }

    @Override // fe.InterfaceC6529h
    @NotNull
    public final List e(@NotNull N container, @NotNull h.d proto, @NotNull EnumC6525d kind) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        B signature = p(proto, container.b(), container.d(), kind, false);
        if (signature == null) {
            return K.f71697a;
        }
        Intrinsics.checkNotNullParameter(signature, "signature");
        return m(this, container, new B(signature.a() + "@0"), null, false, 60);
    }

    @Override // fe.InterfaceC6529h
    @NotNull
    public final List<A> f(@NotNull N container, @NotNull Nd.m proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        return v(container, proto, c.DELEGATE_FIELD);
    }

    @Override // fe.InterfaceC6529h
    @NotNull
    public final List g(@NotNull N.a container, @NotNull Nd.f proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        String name = container.b().getString(proto.B());
        String desc = Rd.b.b(container.e().b());
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        return m(this, container, new B(name + '#' + desc), null, false, 60);
    }

    @Override // fe.InterfaceC6529h
    @NotNull
    public final List h(@NotNull N container, @NotNull h.d proto, @NotNull EnumC6525d kind) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (kind == EnumC6525d.PROPERTY) {
            return v(container, (Nd.m) proto, c.PROPERTY);
        }
        B p11 = p(proto, container.b(), container.d(), kind, false);
        return p11 == null ? K.f71697a : m(this, container, p11, null, false, 60);
    }

    @Override // fe.InterfaceC6529h
    @NotNull
    public final ArrayList i(@NotNull Nd.r proto, @NotNull Pd.c nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Object h11 = proto.h(C3856a.f23239h);
        Intrinsics.checkNotNullExpressionValue(h11, "getExtension(...)");
        Iterable<Nd.a> iterable = (Iterable) h11;
        ArrayList arrayList = new ArrayList(C7714v.z(iterable, 10));
        for (Nd.a aVar : iterable) {
            Intrinsics.f(aVar);
            arrayList.add(((j) this).y(aVar, nameResolver));
        }
        return arrayList;
    }

    @Override // fe.InterfaceC6529h
    @NotNull
    public final List<A> j(@NotNull N container, @NotNull Nd.m proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        return v(container, proto, c.BACKING_FIELD);
    }

    @Override // fe.InterfaceC6529h
    @NotNull
    public final ArrayList k(@NotNull Nd.p proto, @NotNull Pd.c nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Object h11 = proto.h(C3856a.f23237f);
        Intrinsics.checkNotNullExpressionValue(h11, "getExtension(...)");
        Iterable<Nd.a> iterable = (Iterable) h11;
        ArrayList arrayList = new ArrayList(C7714v.z(iterable, 10));
        for (Nd.a aVar : iterable) {
            Intrinsics.f(aVar);
            arrayList.add(((j) this).y(aVar, nameResolver));
        }
        return arrayList;
    }

    @NotNull
    protected abstract C3582i o(@NotNull y yVar);

    @NotNull
    public abstract Rd.e q();

    @NotNull
    protected final w r() {
        return this.f16766a;
    }

    protected final boolean s(@NotNull Sd.b classId) {
        y a11;
        Intrinsics.checkNotNullParameter(classId, "classId");
        return classId.e() != null && Intrinsics.d(classId.h().b(), "Container") && (a11 = x.a(this.f16766a, classId, q())) != null && C8898a.c(a11);
    }

    protected abstract k t(@NotNull Sd.b bVar, @NotNull d0 d0Var, @NotNull List list);

    protected final k u(@NotNull Sd.b annotationClassId, @NotNull C10884b source, @NotNull List result) {
        Intrinsics.checkNotNullParameter(annotationClassId, "annotationClassId");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(result, "result");
        if (C8898a.b().contains(annotationClassId)) {
            return null;
        }
        return t(annotationClassId, source, result);
    }
}
