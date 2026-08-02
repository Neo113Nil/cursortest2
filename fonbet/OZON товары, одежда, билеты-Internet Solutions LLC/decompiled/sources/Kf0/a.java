package Kf0;

import Cf0.J;
import Sc.InterfaceC4008j;
import Sc.k;
import V2.e;
import androidx.lifecycle.ProcessLifecycleOwner;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    private static volatile a f15948i;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ld0.c f15949a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f15950b = k.b(c.f15955b);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final e f15951c = V2.b.a("domain_reachability_config", null, null, null, 14);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f15952d = k.b(new d());

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f15953e = k.b(new b());

    /* renamed from: g, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f15946g = {N.i(new G(a.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"))};

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static final C0305a f15945f = new C0305a();

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final Object f15947h = new Object();

    /* renamed from: Kf0.a$a, reason: collision with other inner class name */
    public static final class C0305a {
        @NotNull
        public static a a(@NotNull Ld0.c store) {
            a aVar;
            Intrinsics.checkNotNullParameter(store, "store");
            a aVar2 = a.f15948i;
            if (aVar2 != null) {
                return aVar2;
            }
            synchronized (a.f15947h) {
                aVar = a.f15948i;
                if (aVar == null) {
                    aVar = new a(store);
                    a.f15948i = aVar;
                }
            }
            return aVar;
        }
    }

    static final class b extends AbstractC7737t implements Function0<Af0.a> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Af0.a invoke() {
            return new Af0.a(new Kf0.b(a.this));
        }
    }

    static final class c extends AbstractC7737t implements Function0<J> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f15955b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final J invoke() {
            J j11 = pf0.m.f80514a;
            if (j11 != null) {
                return j11;
            }
            throw new RuntimeException("NetworkDi must be initialized.");
        }
    }

    static final class d extends AbstractC7737t implements Function0<Jf0.b> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Jf0.b invoke() {
            ProcessLifecycleOwner processLifecycleOwner;
            a aVar = a.this;
            Jf0.a a11 = a.a(aVar);
            processLifecycleOwner = ProcessLifecycleOwner.f43230i;
            return new Jf0.b(a11, processLifecycleOwner, aVar.f15949a);
        }
    }

    public a(Ld0.c cVar) {
        this.f15949a = cVar;
    }

    public static final Jf0.a a(a aVar) {
        return new Jf0.a(aVar.f15951c.getValue(aVar.f15949a.c().a(), f15946g[0]));
    }

    public static final J d(a aVar) {
        return (J) aVar.f15950b.getValue();
    }

    @NotNull
    public final Af0.a g() {
        return (Af0.a) this.f15953e.getValue();
    }

    @NotNull
    public final Jf0.b h() {
        return (Jf0.b) this.f15952d.getValue();
    }
}
