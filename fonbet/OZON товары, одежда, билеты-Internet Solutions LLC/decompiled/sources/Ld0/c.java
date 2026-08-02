package Ld0;

import Sc.InterfaceC4008j;
import Sc.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<Class<? extends Ld0.e>, Od0.d<Ld0.e>> f16834a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Ld0.d f16835b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f16836c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f16837d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f16838e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<Class<? extends Ld0.e>, Ld0.e> f16839f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<Class<? extends Ld0.e>, Boolean> f16840g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f16841h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Ld0.d f16842a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ConcurrentHashMap<Class<? extends Ld0.e>, Od0.d<Ld0.e>> f16843b;

        public a(@NotNull Ld0.d ozonLibsGlobalConfig) {
            Intrinsics.checkNotNullParameter(ozonLibsGlobalConfig, "ozonLibsGlobalConfig");
            this.f16842a = ozonLibsGlobalConfig;
            this.f16843b = new ConcurrentHashMap<>();
        }

        @NotNull
        public final c a() {
            ConcurrentHashMap<Class<? extends Ld0.e>, Od0.d<Ld0.e>> concurrentHashMap = this.f16843b;
            c cVar = new c(concurrentHashMap, this.f16842a);
            Collection<Od0.d<Ld0.e>> values = concurrentHashMap.values();
            Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                ((Od0.d) it.next()).onDiStoreCreated(cVar);
            }
            cVar.h();
            return cVar;
        }

        @NotNull
        public final void b(@NotNull Od0.d provider) {
            Intrinsics.checkNotNullParameter(provider, "provider");
            this.f16843b.put(provider.getKey(), provider);
        }
    }

    static final class b extends AbstractC7737t implements Function0<Md0.c> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Md0.c invoke() {
            return new Md0.c(c.this);
        }
    }

    /* renamed from: Ld0.c$c, reason: collision with other inner class name */
    static final class C0323c extends AbstractC7737t implements Function0<Ld0.a> {
        C0323c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Ld0.a invoke() {
            return new Ld0.a(c.this);
        }
    }

    static final class d extends AbstractC7737t implements Function1<Class<? extends Ld0.e>, Ld0.e> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Od0.d<Ld0.e> f16846b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f16847c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Od0.d<? extends Ld0.e> dVar, c cVar) {
            super(1);
            this.f16846b = dVar;
            this.f16847c = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Ld0.e invoke(Class<? extends Ld0.e> cls) {
            Class<? extends Ld0.e> it = cls;
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f16846b.create(this.f16847c);
        }
    }

    static final class e extends AbstractC7737t implements Function0<List<? extends f>> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends f> invoke() {
            c cVar = c.this;
            Collection<Od0.d<Ld0.e>> values = cVar.g().values();
            Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                C7714v.p(((Od0.d) it.next()).createPluginProviderIntegration(cVar), arrayList);
            }
            return arrayList;
        }
    }

    private c() {
        throw null;
    }

    public c(ConcurrentHashMap concurrentHashMap, Ld0.d dVar) {
        this.f16834a = concurrentHashMap;
        this.f16835b = dVar;
        this.f16836c = k.b(new C0323c());
        this.f16837d = k.b(new b());
        this.f16838e = k.b(new e());
        this.f16839f = new ConcurrentHashMap<>();
        this.f16840g = new ConcurrentHashMap<>();
        this.f16841h = new AtomicBoolean(false);
    }

    @NotNull
    public final Md0.c a() {
        return (Md0.c) this.f16837d.getValue();
    }

    @NotNull
    public final Ld0.a b() {
        return (Ld0.a) this.f16836c.getValue();
    }

    @NotNull
    public final Ld0.d c() {
        return this.f16835b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Ld0.e> T d(@NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Od0.d<Ld0.e> dVar = this.f16834a.get(clazz);
        if (dVar != null) {
            ConcurrentHashMap<Class<? extends Ld0.e>, Ld0.e> concurrentHashMap = this.f16839f;
            final d dVar2 = new d(dVar, this);
            Ld0.e computeIfAbsent = concurrentHashMap.computeIfAbsent(clazz, new Function() { // from class: Ld0.b
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (e) Function1.this.invoke(obj);
                }
            });
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            T cast = (computeIfAbsent == null || !clazz.isInstance(computeIfAbsent)) ? null : clazz.cast(computeIfAbsent);
            if (cast != null) {
                if (this.f16841h.get() && this.f16840g.putIfAbsent(cast.getClass(), Boolean.TRUE) == null) {
                    cast.onInstantPluginsCreated();
                }
                return cast;
            }
        }
        return null;
    }

    @NotNull
    public final <T extends Ld0.e> T e(@NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        T t2 = (T) d(clazz);
        if (t2 != null) {
            return t2;
        }
        throw new IllegalStateException(Sh.b.c("Required plugin '", clazz.getSimpleName(), "' was not registered. Register this plugin before build ", c.class.getSimpleName()));
    }

    @NotNull
    public final List<f> f() {
        return (List) this.f16838e.getValue();
    }

    @NotNull
    public final ConcurrentHashMap<Class<? extends Ld0.e>, Od0.d<Ld0.e>> g() {
        return this.f16834a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h() {
        ConcurrentHashMap<Class<? extends Ld0.e>, Ld0.e> concurrentHashMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Class<? extends Ld0.e>, Od0.d<Ld0.e>> entry : this.f16834a.entrySet()) {
            if (!entry.getValue().isLazyInitializationEnabled()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            concurrentHashMap = this.f16839f;
            if (!hasNext) {
                break;
            }
            Od0.d dVar = (Od0.d) it.next();
            if (!concurrentHashMap.contains(dVar.getKey())) {
                concurrentHashMap.put(dVar.getKey(), dVar.create(this));
            }
        }
        this.f16841h.set(true);
        Collection<Ld0.e> values = concurrentHashMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        for (Ld0.e eVar : values) {
            Intrinsics.f(eVar);
            if (this.f16840g.putIfAbsent(eVar.getClass(), Boolean.TRUE) == null) {
                eVar.onInstantPluginsCreated();
            }
        }
    }
}
