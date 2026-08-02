package Gd;

import Md.a;
import ae.C5002d;
import ie.C7056e;
import ie.InterfaceC7061j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9839e;
import ud.InterfaceC10030h;

/* loaded from: classes.dex */
public final class F extends wd.N {

    /* renamed from: n, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f9942n = {kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(F.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(F.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Jd.t f9943g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Fd.k f9944h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Rd.e f9945i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j f9946j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C3076f f9947k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j<List<Sd.c>> f9948l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final InterfaceC10030h f9949m;

    /* loaded from: classes10.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9950a;

        static {
            int[] iArr = new int[a.EnumC0345a.values().length];
            try {
                iArr[a.EnumC0345a.MULTIFILE_CLASS_PART.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EnumC0345a.FILE_FACADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9950a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(@NotNull Fd.k outerContext, @NotNull Jd.t jPackage) {
        super(outerContext.d(), jPackage.c());
        Intrinsics.checkNotNullParameter(outerContext, "outerContext");
        Intrinsics.checkNotNullParameter(jPackage, "jPackage");
        this.f9943g = jPackage;
        Fd.k a11 = Fd.c.a(outerContext, this, null, 6);
        this.f9944h = a11;
        this.f9945i = te.c.a(outerContext.a().b().c().g());
        this.f9946j = ((C7056e) a11.e()).a(new C(this));
        this.f9947k = new C3076f(a11, jPackage, this);
        this.f9948l = ((C7056e) a11.e()).k(new D(this), kotlin.collections.K.f71697a);
        this.f9949m = a11.a().i().b() ? InterfaceC10030h.a.b() : Fd.h.a(a11, jPackage);
        ((C7056e) a11.e()).a(new E(this));
    }

    static Map C0(F f7) {
        Ld.E o11 = f7.f9944h.a().o();
        String b11 = f7.c().b();
        Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
        kotlin.collections.K<String> a11 = o11.a(b11);
        ArrayList arrayList = new ArrayList();
        for (String str : a11) {
            Sd.c topLevelFqName = C5002d.d(str).e();
            Intrinsics.checkNotNullExpressionValue(topLevelFqName, "getFqNameForTopLevelClassMaybeWithDollars(...)");
            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
            Sd.c e11 = topLevelFqName.e();
            Ld.y a12 = Ld.x.a(f7.f9944h.a().j(), new Sd.b(e11, U7.d.a(e11, "parent(...)", topLevelFqName, "shortName(...)")), f7.f9945i);
            Pair pair = a12 != null ? new Pair(str, a12) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return kotlin.collections.U.s(arrayList);
    }

    static ArrayList F0(F f7) {
        kotlin.collections.K h11 = f7.f9943g.h();
        ArrayList arrayList = new ArrayList(C7714v.z(h11, 10));
        Iterator<E> it = h11.iterator();
        while (it.hasNext()) {
            arrayList.add(((Jd.t) it.next()).c());
        }
        return arrayList;
    }

    public final InterfaceC9839e G0(@NotNull Jd.g jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        return this.f9947k.i().I(jClass);
    }

    @NotNull
    public final Map<String, Ld.y> H0() {
        return (Map) ie.n.a(this.f9946j, f9942n[0]);
    }

    @NotNull
    public final List<Sd.c> I0() {
        return this.f9948l.invoke();
    }

    @Override // wd.N, wd.AbstractC10532s, td.InterfaceC9848n
    @NotNull
    public final td.d0 e() {
        return new Ld.z(this);
    }

    @Override // ud.C10024b, ud.InterfaceC10023a
    @NotNull
    public final InterfaceC10030h getAnnotations() {
        return this.f9949m;
    }

    @Override // td.InterfaceC9820K
    public final ce.l p() {
        return this.f9947k;
    }

    @Override // wd.N, wd.r
    @NotNull
    public final String toString() {
        return "Lazy Java package fragment: " + c() + " of module " + this.f9944h.a().m();
    }
}
