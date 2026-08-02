package Gd;

import Bd.InterfaceC2627a;
import Cd.InterfaceC2757s;
import Cd.t;
import Gd.InterfaceC3073c;
import Ld.w;
import Md.a;
import fe.C6530i;
import ie.C7056e;
import ie.InterfaceC7060i;
import ie.InterfaceC7062k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9839e;
import td.InterfaceC9845k;

/* loaded from: classes.dex */
public final class I extends e0 {

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final Jd.t f9955n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final F f9956o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final InterfaceC7062k<Set<String>> f9957p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final InterfaceC7060i<a, InterfaceC9839e> f9958q;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Sd.f f9959a;

        /* renamed from: b, reason: collision with root package name */
        private final Jd.g f9960b;

        public a(@NotNull Sd.f name, Jd.g gVar) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f9959a = name;
            this.f9960b = gVar;
        }

        public final Jd.g a() {
            return this.f9960b;
        }

        @NotNull
        public final Sd.f b() {
            return this.f9959a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return Intrinsics.d(this.f9959a, ((a) obj).f9959a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f9959a.hashCode();
        }
    }

    private static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final InterfaceC9839e f9961a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull InterfaceC9839e descriptor) {
                super(0);
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                this.f9961a = descriptor;
            }

            @NotNull
            public final InterfaceC9839e a() {
                return this.f9961a;
            }
        }

        /* renamed from: Gd.I$b$b, reason: collision with other inner class name */
        public static final class C0205b extends b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0205b f9962a = new C0205b(0);
        }

        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f9963a = new c(0);
        }

        public b(int i11) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(@NotNull Fd.k c11, @NotNull Jd.t jPackage, @NotNull F ownerDescriptor) {
        super(c11);
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(jPackage, "jPackage");
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        this.f9955n = jPackage;
        this.f9956o = ownerDescriptor;
        this.f9957p = ((C7056e) c11.e()).b(new G(c11, this));
        this.f9958q = ((C7056e) c11.e()).j(new H(c11, this));
    }

    static Set F(Fd.k kVar, I i11) {
        InterfaceC2757s d11 = kVar.a().d();
        Sd.c packageFqName = i11.f9956o.c();
        ((yd.d) d11).getClass();
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        return null;
    }

    static InterfaceC9839e G(I i11, Fd.k kVar, a request) {
        b bVar;
        Intrinsics.checkNotNullParameter(request, "request");
        Sd.b bVar2 = new Sd.b(i11.f9956o.c(), request.b());
        w.a.b c11 = request.a() != null ? ((yd.g) kVar.a().j()).c(request.a(), i11.K()) : ((yd.g) kVar.a().j()).a(bVar2, i11.K());
        Ld.y kotlinClass = c11 != null ? c11.a() : null;
        Sd.b b11 = kotlinClass != null ? ((yd.f) kotlinClass).b() : null;
        if (b11 == null || (!b11.j() && !b11.i())) {
            if (kotlinClass == null) {
                bVar = b.C0205b.f9962a;
            } else {
                yd.f fVar = (yd.f) kotlinClass;
                if (fVar.a().c() == a.EnumC0345a.CLASS) {
                    Ld.q b12 = i11.w().a().b();
                    b12.getClass();
                    Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
                    C6530i f7 = b12.f(kotlinClass);
                    InterfaceC9839e c12 = f7 == null ? null : b12.c().f().c(fVar.b(), f7);
                    bVar = c12 != null ? new b.a(c12) : b.C0205b.f9962a;
                } else {
                    bVar = b.c.f9963a;
                }
            }
            if (bVar instanceof b.a) {
                return ((b.a) bVar).a();
            }
            if (!(bVar instanceof b.c)) {
                if (!(bVar instanceof b.C0205b)) {
                    throw new Sc.o();
                }
                Jd.g javaClass = request.a();
                if (javaClass == null) {
                    javaClass = ((yd.d) kVar.a().d()).a(new InterfaceC2757s.a(bVar2, null, 4));
                }
                if (Jd.C.BINARY == null) {
                    StringBuilder sb2 = new StringBuilder("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: ");
                    sb2.append(javaClass);
                    sb2.append("\nClassId: ");
                    sb2.append(bVar2);
                    sb2.append("\nfindKotlinClass(JavaClass) = ");
                    Ld.w j11 = kVar.a().j();
                    Rd.e jvmMetadataVersion = i11.K();
                    Intrinsics.checkNotNullParameter(j11, "<this>");
                    Intrinsics.checkNotNullParameter(javaClass, "javaClass");
                    Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
                    w.a.b c13 = ((yd.g) j11).c(javaClass, jvmMetadataVersion);
                    sb2.append(c13 != null ? c13.a() : null);
                    sb2.append("\nfindKotlinClass(ClassId) = ");
                    sb2.append(Ld.x.a(kVar.a().j(), bVar2, i11.K()));
                    sb2.append('\n');
                    throw new IllegalStateException(sb2.toString());
                }
                Sd.c c14 = javaClass != null ? javaClass.c() : null;
                if (c14 != null && !c14.d()) {
                    Sd.c e11 = c14.e();
                    F f11 = i11.f9956o;
                    if (e11.equals(f11.c())) {
                        C3085o c3085o = new C3085o(kVar, f11, javaClass, null);
                        ((t.a) kVar.a().e()).a(c3085o);
                        return c3085o;
                    }
                }
            }
        }
        return null;
    }

    private final InterfaceC9839e H(Sd.f name, Jd.g gVar) {
        Sd.f fVar = Sd.h.f26144a;
        Intrinsics.checkNotNullParameter(name, "name");
        String b11 = name.b();
        Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
        if (b11.length() <= 0 || name.g()) {
            return null;
        }
        Set<String> invoke = this.f9957p.invoke();
        if (gVar == null && invoke != null && !invoke.contains(name.b())) {
            return null;
        }
        return this.f9958q.invoke(new a(name, gVar));
    }

    private final Rd.e K() {
        return te.c.a(w().a().b().c().g());
    }

    @Override // Gd.W
    public final InterfaceC9845k A() {
        return this.f9956o;
    }

    public final InterfaceC9839e I(@NotNull Jd.g javaClass) {
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        return H(javaClass.getName(), javaClass);
    }

    @Override // ce.m, ce.o
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final InterfaceC9839e d(@NotNull Sd.f name, @NotNull InterfaceC2627a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return H(name, null);
    }

    @Override // Gd.W, ce.m, ce.l
    @NotNull
    public final Collection b(@NotNull Sd.f name, @NotNull Bd.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return kotlin.collections.K.f71697a;
    }

    @Override // Gd.W, ce.m, ce.o
    @NotNull
    public final Collection<InterfaceC9845k> e(@NotNull ce.d kindFilter, @NotNull Function1<? super Sd.f, Boolean> nameFilter) {
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        i11 = ce.d.f57021k;
        i12 = ce.d.f57014d;
        if (!kindFilter.a(i11 | i12)) {
            return kotlin.collections.K.f71697a;
        }
        Collection<InterfaceC9845k> invoke = v().invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : invoke) {
            InterfaceC9845k interfaceC9845k = (InterfaceC9845k) obj;
            if (interfaceC9845k instanceof InterfaceC9839e) {
                Sd.f name = ((InterfaceC9839e) interfaceC9845k).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (nameFilter.invoke(name).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // Gd.W
    @NotNull
    protected final Set<Sd.f> n(@NotNull ce.d kindFilter, Function1<? super Sd.f, Boolean> function1) {
        int i11;
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        i11 = ce.d.f57014d;
        if (!kindFilter.a(i11)) {
            return kotlin.collections.M.f71699a;
        }
        Set<String> invoke = this.f9957p.invoke();
        if (invoke != null) {
            HashSet hashSet = new HashSet();
            Iterator<T> it = invoke.iterator();
            while (it.hasNext()) {
                hashSet.add(Sd.f.f((String) it.next()));
            }
            return hashSet;
        }
        if (function1 == null) {
            function1 = te.g.a();
        }
        kotlin.collections.K<Jd.g> D11 = this.f9955n.D(function1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Jd.g gVar : D11) {
            gVar.getClass();
            Sd.f name = Jd.C.SOURCE == null ? null : gVar.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // Gd.W
    @NotNull
    protected final Set<Sd.f> o(@NotNull ce.d kindFilter, Function1<? super Sd.f, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return kotlin.collections.M.f71699a;
    }

    @Override // Gd.W
    @NotNull
    protected final InterfaceC3073c q() {
        return InterfaceC3073c.a.f10012a;
    }

    @Override // Gd.W
    protected final void s(@NotNull LinkedHashSet result, @NotNull Sd.f name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // Gd.W
    @NotNull
    protected final Set u(@NotNull ce.d kindFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return kotlin.collections.M.f71699a;
    }
}
