package com.amplitude.core;

import com.amplitude.android.x;
import com.amplitude.core.platform.k;
import com.amplitude.core.platform.m;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.C1101n0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.M;
import kotlinx.coroutines.S;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.H;
import kotlinx.coroutines.flow.L;
import kotlinx.coroutines.internal.C1086c;

@SourceDebugExtension({"SMAP\nAmplitude.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Amplitude.kt\ncom/amplitude/core/Amplitude\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,565:1\n1#2:566\n215#3,2:567\n*S KotlinDebug\n*F\n+ 1 Amplitude.kt\ncom/amplitude/core/Amplitude\n*L\n538#1:567,2\n*E\n"})
/* loaded from: classes3.dex */
public class b {
    public final com.amplitude.android.h a;
    public final j b;
    public final C1086c c;
    public final C1101n0 d;
    public final C1101n0 e;
    public final C1101n0 f;
    public final m g;
    public final Lazy h;
    public k i;
    public com.amplitude.id.h j;
    public final Lazy k;
    public com.amplitude.id.e l;
    public final S<Boolean> m;
    public final com.amplitude.core.utilities.c n;
    public final Lazy o;
    public final H p;

    @DebugMetadata(c = "com.amplitude.core.Amplitude$flush$1", f = "Amplitude.kt", i = {}, l = {528}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
        public int a;

        /* renamed from: com.amplitude.core.b$a$a, reason: collision with other inner class name */
        public static final class C0041a extends Lambda implements Function1<com.amplitude.core.platform.k, Unit> {
            public static final C0041a a = new C0041a(1);

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(com.amplitude.core.platform.k kVar) {
                com.amplitude.core.platform.k it = kVar;
                Intrinsics.checkNotNullParameter(it, "it");
                com.amplitude.core.platform.h hVar = it instanceof com.amplitude.core.platform.h ? (com.amplitude.core.platform.h) it : null;
                if (hVar != null) {
                    hVar.flush();
                }
                return Unit.INSTANCE;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(K k, Continuation<? super Unit> continuation) {
            return ((a) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            b bVar = b.this;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                S<Boolean> s = bVar.m;
                this.a = 1;
                if (s.await(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            m mVar = bVar.g;
            mVar.getClass();
            C0041a closure = C0041a.a;
            Intrinsics.checkNotNullParameter(closure, "closure");
            Iterator<Map.Entry<k.a, com.amplitude.core.platform.i>> it = mVar.a.entrySet().iterator();
            while (it.hasNext()) {
                com.amplitude.core.platform.i value = it.next().getValue();
                value.getClass();
                Intrinsics.checkNotNullParameter(closure, "closure");
                Iterator<com.amplitude.core.platform.k> it2 = value.a.iterator();
                while (it2.hasNext()) {
                    com.amplitude.core.platform.k next = it2.next();
                    Intrinsics.checkNotNull(next);
                    closure.invoke(next);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public b(com.amplitude.android.h configuration, j store, C1086c amplitudeScope, C1101n0 amplitudeDispatcher, C1101n0 networkIODispatcher, C1101n0 storageIODispatcher) {
        Integer num;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(amplitudeScope, "amplitudeScope");
        Intrinsics.checkNotNullParameter(amplitudeDispatcher, "amplitudeDispatcher");
        Intrinsics.checkNotNullParameter(networkIODispatcher, "networkIODispatcher");
        Intrinsics.checkNotNullParameter(storageIODispatcher, "storageIODispatcher");
        this.a = configuration;
        this.b = store;
        this.c = amplitudeScope;
        this.d = amplitudeDispatcher;
        this.e = networkIODispatcher;
        this.f = storageIODispatcher;
        com.amplitude.android.a aVar = (com.amplitude.android.a) this;
        this.h = LazyKt.lazy(new g(aVar));
        this.k = LazyKt.lazy(new c(aVar));
        com.amplitude.core.utilities.c cVar = new com.amplitude.core.utilities.c();
        Set<String> synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        Intrinsics.checkNotNullExpressionValue(synchronizedSet, "synchronizedSet(...)");
        cVar.b = synchronizedSet;
        this.n = cVar;
        this.o = LazyKt.lazy(new d(aVar));
        kotlinx.coroutines.channels.a aVar2 = kotlinx.coroutines.channels.a.a;
        this.p = new H(new L(1000));
        if (StringsKt.isBlank(configuration.a) || configuration.c <= 0 || configuration.d <= 0 || ((num = configuration.i) != null && num.intValue() <= 0)) {
            throw new IllegalArgumentException("invalid configuration");
        }
        x xVar = new x(null);
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        xVar.b = aVar;
        this.g = xVar;
        T b = b();
        this.m = b;
        b.start();
    }

    public static void m(b bVar, String eventType, Map map, int i) {
        if ((i & 2) != 0) {
            map = null;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        com.amplitude.core.events.a aVar = new com.amplitude.core.events.a();
        Intrinsics.checkNotNullParameter(eventType, "<set-?>");
        aVar.O = eventType;
        aVar.P = map != null ? MapsKt.toMutableMap(map) : null;
        bVar.k(aVar);
    }

    public final void a(com.amplitude.core.platform.k plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        if (!(plugin instanceof com.amplitude.core.platform.j)) {
            this.g.a(plugin);
            return;
        }
        j jVar = this.b;
        com.amplitude.core.platform.j plugin2 = (com.amplitude.core.platform.j) plugin;
        Intrinsics.checkNotNullParameter(plugin2, "plugin");
        Intrinsics.checkNotNullParameter(this, "amplitude");
        synchronized (jVar.c) {
            plugin2.c(this);
            jVar.c.add(plugin2);
        }
    }

    public T b() {
        return C1082i.a(this.c, this.d, M.b, new com.amplitude.core.a(this, this, null));
    }

    public Object c(com.amplitude.id.d dVar, com.amplitude.core.a aVar) {
        throw null;
    }

    public com.amplitude.id.d d() {
        throw null;
    }

    public final void e() {
        C1082i.c(this.c, this.d, null, new a(null), 2);
    }

    public final com.amplitude.id.e f() {
        com.amplitude.id.e eVar = this.l;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("idContainer");
        return null;
    }

    public final k g() {
        k kVar = this.i;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("identifyInterceptStorage");
        return null;
    }

    public final com.amplitude.id.h h() {
        com.amplitude.id.h hVar = this.j;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("identityStorage");
        return null;
    }

    public final com.amplitude.common.a i() {
        return (com.amplitude.common.a) this.k.getValue();
    }

    public final k j() {
        return (k) this.h.getValue();
    }

    public final void k(com.amplitude.core.events.a aVar) {
        if (this.a.f) {
            i().a();
            return;
        }
        if (aVar.c == null) {
            aVar.c = Long.valueOf(System.currentTimeMillis());
        }
        i().c("Logged event with type: " + aVar.a());
        this.g.d(aVar);
    }

    public final void l(String deviceId) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        com.amplitude.id.g gVar = f().a;
        gVar.b(new com.amplitude.id.c(gVar.a().a, deviceId), com.amplitude.id.i.b);
    }
}
