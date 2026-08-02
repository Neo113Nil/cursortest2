package B20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final t20.f f2189a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f2190b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f2191c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f2192d;

    /* renamed from: B20.a$a, reason: collision with other inner class name */
    static final class C0053a extends AbstractC7737t implements Function0<List<? extends D20.a>> {
        C0053a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends D20.a> invoke() {
            a aVar = a.this;
            return C7714v.l0(a.b(aVar), a.c(aVar));
        }
    }

    static final class b extends AbstractC7737t implements Function0<List<? extends D20.a>> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends D20.a> invoke() {
            List b11 = a.b(a.this);
            ArrayList arrayList = new ArrayList();
            for (Object obj : b11) {
                if (kotlin.text.h.e0(((D20.a) obj).b(), "ru.ozon", false)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    static final class c extends AbstractC7737t implements Function0<List<? extends D20.a>> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends D20.a> invoke() {
            return a.a(a.this);
        }
    }

    public a(@NotNull t20.f dependencyProvider) {
        Intrinsics.checkNotNullParameter(dependencyProvider, "dependencyProvider");
        this.f2189a = dependencyProvider;
        Sc.n nVar = Sc.n.NONE;
        this.f2190b = Sc.k.a(nVar, new c());
        this.f2191c = Sc.k.a(nVar, new b());
        this.f2192d = Sc.k.a(nVar, new C0053a());
    }

    public static final List a(a aVar) {
        aVar.f2189a.getClass();
        return C7714v.I0(Vc.a.a(B20.b.f2196b, B20.c.f2197b), C7714v.p0(f(t20.f.c(), true), f(t20.f.b(), false)));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final List b(a aVar) {
        return (List) aVar.f2190b.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final List c(a aVar) {
        return (List) aVar.f2191c.getValue();
    }

    private static ArrayList f(List list, boolean z11) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List l11 = kotlin.text.h.l((String) it.next(), new char[]{':'}, 0, 6);
            D20.a aVar = l11.size() != 3 ? null : new D20.a((String) l11.get(0), (String) l11.get(1), (String) l11.get(2), z11);
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @NotNull
    public final List<D20.a> d() {
        return (List) this.f2192d.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @NotNull
    public final List<D20.a> e() {
        return (List) this.f2191c.getValue();
    }
}
