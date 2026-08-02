package Gd;

import Jd.InterfaceC3391a;
import Jd.InterfaceC3392b;
import Jd.InterfaceC3393c;
import Xd.C4884a;
import Xd.t;
import ie.C7056e;
import ie.InterfaceC7061j;
import ie.InterfaceC7062k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import je.G0;
import je.L0;
import je.y0;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qd.s;
import sd.C9662d;
import td.C9856v;
import td.InterfaceC9815F;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.i0;
import td.p0;

/* renamed from: Gd.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3080j implements Ed.g {

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f10030i = {kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(C3080j.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(C3080j.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(C3080j.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Fd.k f10031a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC3391a f10032b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC7062k f10033c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j f10034d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Id.a f10035e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j f10036f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f10037g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f10038h;

    public C3080j(@NotNull Fd.k c11, @NotNull InterfaceC3391a javaAnnotation, boolean z11) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(javaAnnotation, "javaAnnotation");
        this.f10031a = c11;
        this.f10032b = javaAnnotation;
        this.f10033c = ((C7056e) c11.e()).b(new C3077g(this));
        this.f10034d = ((C7056e) c11.e()).a(new C3078h(this));
        this.f10035e = ((yd.k) c11.a().t()).a(javaAnnotation);
        this.f10036f = ((C7056e) c11.e()).a(new C3079i(this));
        this.f10037g = false;
        this.f10038h = z11;
    }

    static Sd.c d(C3080j c3080j) {
        return c3080j.f10032b.b().a();
    }

    static je.Y f(C3080j c3080j) {
        Sd.c topLevelFqName = c3080j.c();
        InterfaceC3391a interfaceC3391a = c3080j.f10032b;
        if (topLevelFqName == null) {
            return le.l.c(le.k.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, interfaceC3391a.toString());
        }
        Fd.k kVar = c3080j.f10031a;
        InterfaceC9839e b11 = C9662d.b(topLevelFqName, ((wd.L) kVar.d()).n());
        if (b11 == null) {
            b11 = kVar.a().n().a(interfaceC3391a.i());
            if (b11 == null) {
                InterfaceC9815F d11 = kVar.d();
                Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
                Sd.c e11 = topLevelFqName.e();
                b11 = C9856v.c(d11, new Sd.b(e11, U7.d.a(e11, "parent(...)", topLevelFqName, "shortName(...)")), kVar.a().b().c().r());
            }
        }
        return b11.q();
    }

    static Map g(C3080j c3080j) {
        ArrayList<InterfaceC3392b> e11 = c3080j.f10032b.e();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC3392b interfaceC3392b : e11) {
            Sd.f name = interfaceC3392b.getName();
            if (name == null) {
                name = Cd.F.f4691b;
            }
            Xd.g<?> i11 = c3080j.i(interfaceC3392b);
            Pair pair = i11 != null ? new Pair(name, i11) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return kotlin.collections.U.s(arrayList);
    }

    private final Xd.g<?> i(InterfaceC3392b interfaceC3392b) {
        je.N type;
        if (interfaceC3392b instanceof Jd.o) {
            return Xd.i.f34402a.b(((Jd.o) interfaceC3392b).getValue(), null);
        }
        if (interfaceC3392b instanceof Jd.m) {
            Jd.m mVar = (Jd.m) interfaceC3392b;
            return new Xd.k(mVar.d(), mVar.e());
        }
        boolean z11 = interfaceC3392b instanceof Jd.e;
        Fd.k kVar = this.f10031a;
        if (z11) {
            Jd.e eVar = (Jd.e) interfaceC3392b;
            Sd.f name = eVar.getName();
            if (name == null) {
                name = Cd.F.f4691b;
            }
            Intrinsics.f(name);
            ArrayList b11 = eVar.b();
            if (!je.S.a((je.Y) ie.n.a(this.f10034d, f10030i[1]))) {
                InterfaceC9839e d11 = Zd.e.d(this);
                Intrinsics.f(d11);
                p0 b12 = Dd.b.b(name, d11);
                if (b12 == null || (type = b12.getType()) == null) {
                    type = ((wd.L) kVar.a().m()).n().m(L0.INVARIANT, le.l.c(le.k.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
                    Intrinsics.checkNotNullExpressionValue(type, "getArrayType(...)");
                }
                ArrayList value = new ArrayList(C7714v.z(b11, 10));
                Iterator it = b11.iterator();
                while (it.hasNext()) {
                    Xd.g<?> i11 = i((InterfaceC3392b) it.next());
                    if (i11 == null) {
                        i11 = new Xd.v(null);
                    }
                    value.add(i11);
                }
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(type, "type");
                return new Xd.z(value, type);
            }
        } else {
            if (interfaceC3392b instanceof InterfaceC3393c) {
                C3080j value2 = new C3080j(kVar, ((InterfaceC3393c) interfaceC3392b).a(), false);
                Intrinsics.checkNotNullParameter(value2, "value");
                return new C4884a(value2);
            }
            if (interfaceC3392b instanceof Jd.h) {
                je.N argumentType = kVar.g().e(((Jd.h) interfaceC3392b).c(), Hd.b.d(G0.COMMON, false, null, 7));
                Intrinsics.checkNotNullParameter(argumentType, "argumentType");
                if (!je.S.a(argumentType)) {
                    je.N n11 = argumentType;
                    int i12 = 0;
                    while (qd.m.S(n11)) {
                        n11 = ((y0) C7714v.B0(n11.F0())).getType();
                        i12++;
                    }
                    InterfaceC9842h p11 = n11.H0().p();
                    if (p11 instanceof InterfaceC9839e) {
                        Sd.b f7 = Zd.e.f(p11);
                        if (f7 != null) {
                            return new Xd.t(f7, i12);
                        }
                        t.a.C0620a value3 = new t.a.C0620a(argumentType);
                        Intrinsics.checkNotNullParameter(value3, "value");
                        return new Xd.t(value3);
                    }
                    if (p11 instanceof i0) {
                        Sd.c topLevelFqName = s.a.f81897a.l();
                        Intrinsics.checkNotNullExpressionValue(topLevelFqName, "toSafe(...)");
                        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
                        Sd.c e11 = topLevelFqName.e();
                        return new Xd.t(new Sd.b(e11, U7.d.a(e11, "parent(...)", topLevelFqName, "shortName(...)")), 0);
                    }
                }
            }
        }
        return null;
    }

    @Override // Ed.g
    public final boolean a() {
        return this.f10037g;
    }

    @Override // ud.InterfaceC10025c
    @NotNull
    public final Map<Sd.f, Xd.g<?>> b() {
        return (Map) ie.n.a(this.f10036f, f10030i[2]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ud.InterfaceC10025c
    public final Sd.c c() {
        kotlin.reflect.m<Object> p11 = f10030i[0];
        InterfaceC7062k interfaceC7062k = this.f10033c;
        Intrinsics.checkNotNullParameter(interfaceC7062k, "<this>");
        Intrinsics.checkNotNullParameter(p11, "p");
        return (Sd.c) interfaceC7062k.invoke();
    }

    @Override // ud.InterfaceC10025c
    public final td.d0 e() {
        return this.f10035e;
    }

    @Override // ud.InterfaceC10025c
    public final je.N getType() {
        return (je.Y) ie.n.a(this.f10034d, f10030i[1]);
    }

    public final boolean h() {
        return this.f10038h;
    }

    @NotNull
    public final String toString() {
        return Ud.n.f27602a.F(this, null);
    }
}
