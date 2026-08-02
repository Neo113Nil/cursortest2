package Vf0;

import Cf0.J;
import Sc.s;
import We.B;
import We.G;
import We.L;
import java.io.Serializable;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf0.InterfaceC8918a;
import xe.C10727i;
import xe.M;

/* loaded from: classes7.dex */
public final class g implements B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ld0.c f32708a;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.extraHeaders.ExtraHeadersInterceptor$intercept$extraHeaders$1", f = "ExtraHeadersInterceptor.kt", l = {13}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Map<String, ? extends String>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f32709d;

        a() {
            super(2, null);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(2, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Map<String, ? extends String>> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f32709d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            J j11 = pf0.m.f80514a;
            if (j11 == null) {
                throw new RuntimeException("NetworkDi must be initialized.");
            }
            InterfaceC8918a i12 = j11.i();
            this.f32709d = 1;
            Serializable a11 = i12.a(this);
            return a11 == aVar ? aVar : a11;
        }
    }

    public g(@NotNull Ld0.c store) {
        Intrinsics.checkNotNullParameter(store, "store");
        this.f32708a = store;
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (o.a(this.f32708a)) {
            return chain.proceed(chain.request());
        }
        Map map = (Map) C10727i.d(kotlin.coroutines.g.f71771a, new a());
        G request = chain.request();
        request.getClass();
        G.a aVar = new G.a(request);
        for (Map.Entry entry : map.entrySet()) {
            aVar.h((String) entry.getKey());
            aVar.a((String) entry.getKey(), (String) entry.getValue());
        }
        return chain.proceed(aVar.b());
    }
}
