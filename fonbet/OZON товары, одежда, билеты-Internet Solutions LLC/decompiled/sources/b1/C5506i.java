package b1;

import C.C2702w;
import S0.C3969l;
import S0.C3996z;
import S0.InterfaceC3967k;
import S0.J0;
import S0.Q;
import a1.C4912a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* renamed from: b1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5506i implements InterfaceC5505h {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final C5517t f55438d;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<Object, Map<String, List<Object>>> f55439a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f55440b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC5512o f55441c;

    /* renamed from: b1.i$a */
    static final class a extends AbstractC7737t implements Function2<InterfaceC5518u, C5506i, Map<Object, Map<String, ? extends List<? extends Object>>>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f55442b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Map<Object, Map<String, ? extends List<? extends Object>>> invoke(InterfaceC5518u interfaceC5518u, C5506i c5506i) {
            return C5506i.f(c5506i);
        }
    }

    /* renamed from: b1.i$b */
    static final class b extends AbstractC7737t implements Function1<Map<Object, Map<String, ? extends List<? extends Object>>>, C5506i> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f55443b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final C5506i invoke(Map<Object, Map<String, ? extends List<? extends Object>>> map) {
            return new C5506i((Map<Object, Map<String, List<Object>>>) map);
        }
    }

    /* renamed from: b1.i$c */
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Object f55444a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f55445b = true;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final InterfaceC5512o f55446c;

        /* renamed from: b1.i$c$a */
        static final class a extends AbstractC7737t implements Function1<Object, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C5506i f55447b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C5506i c5506i) {
                super(1);
                this.f55447b = c5506i;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                InterfaceC5512o g10 = this.f55447b.g();
                return Boolean.valueOf(g10 != null ? g10.a(obj) : true);
            }
        }

        public c(@NotNull C5506i c5506i, Object obj) {
            this.f55444a = obj;
            Map map = (Map) c5506i.f55439a.get(obj);
            a aVar = new a(c5506i);
            int i11 = C5514q.f55466b;
            this.f55446c = new C5513p(map, aVar);
        }

        @NotNull
        public final InterfaceC5512o a() {
            return this.f55446c;
        }

        public final void b(@NotNull Map<Object, Map<String, List<Object>>> map) {
            if (this.f55445b) {
                Map<String, List<Object>> d11 = ((C5513p) this.f55446c).d();
                boolean isEmpty = d11.isEmpty();
                Object obj = this.f55444a;
                if (isEmpty) {
                    map.remove(obj);
                } else {
                    map.put(obj, d11);
                }
            }
        }

        public final void c() {
            this.f55445b = false;
        }
    }

    static {
        int i11 = C5516s.f55469b;
        f55438d = new C5517t(a.f55442b, b.f55443b);
    }

    public C5506i() {
        this(0);
    }

    public static final LinkedHashMap f(C5506i c5506i) {
        LinkedHashMap u11 = U.u(c5506i.f55439a);
        Iterator it = c5506i.f55440b.values().iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(u11);
        }
        if (u11.isEmpty()) {
            return null;
        }
        return u11;
    }

    @Override // b1.InterfaceC5505h
    public final void c(@NotNull Object obj, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-1198538093);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(obj) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(c4912a) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(this) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            u11.h(obj);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                InterfaceC5512o interfaceC5512o = this.f55441c;
                if (!(interfaceC5512o != null ? interfaceC5512o.a(obj) : true)) {
                    throw new IllegalArgumentException(C2702w.c(obj, "Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                C11 = new c(this, obj);
                u11.x(C11);
            }
            c cVar = (c) C11;
            C3996z.a(C5514q.b().c(cVar.a()), c4912a, u11, (i12 & 112) | 8);
            Unit unit = Unit.f71690a;
            boolean F11 = u11.F(this) | u11.F(obj) | u11.F(cVar);
            Object C12 = u11.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new C5508k(cVar, this, obj);
                u11.x(C12);
            }
            Q.c(unit, (Function1) C12, u11);
            u11.A();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C5509l(this, obj, c4912a, i11));
        }
    }

    @Override // b1.InterfaceC5505h
    public final void e(@NotNull Object obj) {
        c cVar = (c) this.f55440b.get(obj);
        if (cVar != null) {
            cVar.c();
        } else {
            this.f55439a.remove(obj);
        }
    }

    public final InterfaceC5512o g() {
        return this.f55441c;
    }

    public final void h(InterfaceC5512o interfaceC5512o) {
        this.f55441c = interfaceC5512o;
    }

    public C5506i(@NotNull Map<Object, Map<String, List<Object>>> map) {
        this.f55439a = map;
        this.f55440b = new LinkedHashMap();
    }

    public /* synthetic */ C5506i(int i11) {
        this(new LinkedHashMap());
    }
}
