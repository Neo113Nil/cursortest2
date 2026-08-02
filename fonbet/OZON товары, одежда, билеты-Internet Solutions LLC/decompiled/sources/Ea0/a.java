package Ea0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Pa0.c;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kb0.EnumC7626a;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import mb0.C8124b;
import org.jetbrains.annotations.NotNull;
import za0.InterfaceC11014a;

/* loaded from: classes3.dex */
public final class a implements Na0.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Fa0.a f7748a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final EnumC7626a f7749b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC11014a f7750c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f7751d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f7752e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f7753f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final c f7754g;

    /* renamed from: Ea0.a$a, reason: collision with other inner class name */
    static final class C0170a extends AbstractC7737t implements Function0<List<? extends EnumC7626a>> {
        C0170a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends EnumC7626a> invoke() {
            return C8124b.a(a.this.f7750c.m());
        }
    }

    public static final class b implements InterfaceC2395h<Da0.a> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f7756a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f7757b;

        /* renamed from: Ea0.a$b$a, reason: collision with other inner class name */
        public static final class C0171a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2397i f7758a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f7759b;

            @e(c = "ru.ozon.host.config.debug.menu.data.repository.HostAppEnvironmentsRepositoryImpl$special$$inlined$map$1$2", f = "HostAppEnvironmentsRepositoryImpl.kt", l = {223}, m = "emit")
            /* renamed from: Ea0.a$b$a$a, reason: collision with other inner class name */
            public static final class C0172a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f7760d;

                /* renamed from: e, reason: collision with root package name */
                int f7761e;

                public C0172a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f7760d = obj;
                    this.f7761e |= LinearLayoutManager.INVALID_OFFSET;
                    return C0171a.this.emit(null, this);
                }
            }

            public C0171a(InterfaceC2397i interfaceC2397i, a aVar) {
                this.f7758a = interfaceC2397i;
                this.f7759b = aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                C0172a c0172a;
                int i11;
                if (dVar instanceof C0172a) {
                    c0172a = (C0172a) dVar;
                    int i12 = c0172a.f7761e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c0172a.f7761e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c0172a.f7760d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c0172a.f7761e;
                        if (i11 != 0) {
                            s.b(obj2);
                            String str = (String) obj;
                            a aVar2 = this.f7759b;
                            Da0.a k11 = str != null ? a.k(aVar2, str) : null;
                            if (str != null && !h.K(str) && k11 == null) {
                                aVar2.f7752e.set(true);
                            }
                            c0172a.f7761e = 1;
                            if (this.f7758a.emit(k11, c0172a) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj2);
                        }
                        return Unit.f71690a;
                    }
                }
                c0172a = new C0172a(dVar);
                Object obj22 = c0172a.f7760d;
                Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c0172a.f7761e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            }
        }

        public b(InterfaceC2395h interfaceC2395h, a aVar) {
            this.f7756a = interfaceC2395h;
            this.f7757b = aVar;
        }

        @Override // Ae.InterfaceC2395h
        public final Object collect(@NotNull InterfaceC2397i<? super Da0.a> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
            Object collect = this.f7756a.collect(new C0171a(interfaceC2397i, this.f7757b), dVar);
            return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
        }
    }

    public static final class c implements InterfaceC2395h<List<? extends Da0.a>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f7763a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f7764b;

        /* renamed from: Ea0.a$c$a, reason: collision with other inner class name */
        public static final class C0173a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2397i f7765a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f7766b;

            @e(c = "ru.ozon.host.config.debug.menu.data.repository.HostAppEnvironmentsRepositoryImpl$special$$inlined$map$2$2", f = "HostAppEnvironmentsRepositoryImpl.kt", l = {223}, m = "emit")
            /* renamed from: Ea0.a$c$a$a, reason: collision with other inner class name */
            public static final class C0174a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f7767d;

                /* renamed from: e, reason: collision with root package name */
                int f7768e;

                public C0174a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f7767d = obj;
                    this.f7768e |= LinearLayoutManager.INVALID_OFFSET;
                    return C0173a.this.emit(null, this);
                }
            }

            public C0173a(InterfaceC2397i interfaceC2397i, a aVar) {
                this.f7765a = interfaceC2397i;
                this.f7766b = aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                C0174a c0174a;
                int i11;
                ArrayList arrayList;
                if (dVar instanceof C0174a) {
                    c0174a = (C0174a) dVar;
                    int i12 = c0174a.f7768e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c0174a.f7768e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c0174a.f7767d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c0174a.f7768e;
                        if (i11 != 0) {
                            s.b(obj2);
                            Da0.a aVar2 = (Da0.a) obj;
                            if (aVar2 == null) {
                                arrayList = null;
                            } else {
                                a aVar3 = this.f7766b;
                                List<EnumC7626a> f7 = a.f(aVar3);
                                ArrayList arrayList2 = new ArrayList(C7714v.z(f7, 10));
                                for (EnumC7626a enumC7626a : f7) {
                                    boolean D11 = h.D(enumC7626a.b(), aVar2.a(), true);
                                    arrayList2.add(new Da0.a(enumC7626a.b(), D11, D11 && !h.D(aVar3.f7749b.b(), aVar2.a(), true)));
                                }
                                arrayList = arrayList2;
                            }
                            c0174a.f7768e = 1;
                            if (this.f7765a.emit(arrayList, c0174a) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj2);
                        }
                        return Unit.f71690a;
                    }
                }
                c0174a = new C0174a(dVar);
                Object obj22 = c0174a.f7767d;
                Wc.a aVar4 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c0174a.f7768e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            }
        }

        public c(b bVar, a aVar) {
            this.f7763a = bVar;
            this.f7764b = aVar;
        }

        @Override // Ae.InterfaceC2395h
        public final Object collect(@NotNull InterfaceC2397i<? super List<? extends Da0.a>> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
            Object collect = this.f7763a.collect(new C0173a(interfaceC2397i, this.f7764b), dVar);
            return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
        }
    }

    public a(@NotNull Fa0.a environmentsDataSource, @NotNull EnumC7626a defaultHostAppEnv, @NotNull InterfaceC11014a hostConfigBaseApi) {
        Intrinsics.checkNotNullParameter(environmentsDataSource, "environmentsDataSource");
        Intrinsics.checkNotNullParameter(defaultHostAppEnv, "defaultHostAppEnv");
        Intrinsics.checkNotNullParameter(hostConfigBaseApi, "hostConfigBaseApi");
        this.f7748a = environmentsDataSource;
        this.f7749b = defaultHostAppEnv;
        this.f7750c = hostConfigBaseApi;
        this.f7751d = k.b(new C0170a());
        this.f7752e = new AtomicBoolean(false);
        this.f7753f = defaultHostAppEnv.b();
        this.f7754g = new c(new b(environmentsDataSource.b(), this), this);
    }

    public static final List f(a aVar) {
        return (List) aVar.f7751d.getValue();
    }

    public static final boolean j(a aVar, String str) {
        return aVar.l(str) != null;
    }

    public static final Da0.a k(a aVar, String str) {
        String l11 = aVar.l(str);
        if (l11 != null) {
            return new Da0.a(l11, true, !l11.equals(aVar.f7749b.b()));
        }
        return null;
    }

    private final String l(String str) {
        Object obj;
        Iterator it = ((List) this.f7751d.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (h.D(((EnumC7626a) obj).b(), str, true)) {
                break;
            }
        }
        EnumC7626a enumC7626a = (EnumC7626a) obj;
        if (enumC7626a != null) {
            return enumC7626a.b();
        }
        return null;
    }

    @Override // Na0.a
    @NotNull
    public final c a() {
        return this.f7754g;
    }

    @Override // Na0.a
    public final boolean b() {
        return this.f7752e.get();
    }

    @Override // Na0.a
    public final Object c(@NotNull String str, @NotNull j jVar) {
        Object a11 = this.f7748a.a(new Ea0.c(this, str, this), jVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    @Override // Na0.a
    @NotNull
    public final String d() {
        return this.f7753f;
    }

    @Override // Na0.a
    public final Object e(@NotNull c.a.C0437a c0437a) {
        Object a11 = this.f7748a.a(new Ea0.b(this, this.f7749b.b()), c0437a);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }
}
