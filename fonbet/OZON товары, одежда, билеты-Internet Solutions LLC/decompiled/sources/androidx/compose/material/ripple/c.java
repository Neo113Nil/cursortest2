package androidx.compose.material.ripple;

import Kk.C3532b;
import O0.i;
import Sc.s;
import java.util.ArrayList;
import k1.C7464j;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import m0.C7980b;
import m0.C7984d;
import m0.C8008p;
import m0.T0;
import n1.C8408a;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;
import t0.C9712a;
import t0.C9713b;
import t0.C9714c;
import t0.C9717f;
import t0.C9718g;
import t0.k;
import t0.n;
import xe.C10727i;
import xe.M;

/* loaded from: classes8.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f40110a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f40111b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C7980b<Float, C8008p> f40112c = C7984d.a(0.0f);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ArrayList f40113d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private n f40114e;

    @e(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$1", f = "Ripple.kt", l = {497}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f40115d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f40117f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ T0 f40118g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f7, T0 t02, d dVar) {
            super(2, dVar);
            this.f40117f = f7;
            this.f40118g = t02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final d<Unit> create(Object obj, @NotNull d<?> dVar) {
            return c.this.new a(this.f40117f, this.f40118g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f40115d;
            if (i11 == 0) {
                s.b(obj);
                C7980b c7980b = c.this.f40112c;
                Float f7 = new Float(this.f40117f);
                this.f40115d = 1;
                if (C7980b.f(c7980b, f7, this.f40118g, null, this, 12) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @e(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", f = "Ripple.kt", l = {503}, m = "invokeSuspend")
    static final class b extends j implements Function2<M, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f40119d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ T0 f40121f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(T0 t02, d dVar) {
            super(2, dVar);
            this.f40121f = t02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final d<Unit> create(Object obj, @NotNull d<?> dVar) {
            return c.this.new b(this.f40121f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f40119d;
            if (i11 == 0) {
                s.b(obj);
                C7980b c7980b = c.this.f40112c;
                Float f7 = new Float(0.0f);
                this.f40119d = 1;
                if (C7980b.f(c7980b, f7, this.f40121f, null, this, 12) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(boolean z11, @NotNull Function0<i> function0) {
        this.f40110a = z11;
        this.f40111b = (AbstractC7737t) function0;
    }

    public final void b(@NotNull InterfaceC8410c interfaceC8410c, float f7, long j11) {
        float floatValue = this.f40112c.k().floatValue();
        if (floatValue > 0.0f) {
            long o11 = C7807Z.o(floatValue, j11);
            if (!this.f40110a) {
                InterfaceC8412e.m1(interfaceC8410c, o11, f7, 0L, 124);
                return;
            }
            float f11 = C7464j.f(interfaceC8410c.i());
            float d11 = C7464j.d(interfaceC8410c.i());
            C8408a.b w02 = interfaceC8410c.w0();
            long e11 = w02.e();
            w02.a().save();
            try {
                w02.f().b(0.0f, 0.0f, f11, d11, 1);
                InterfaceC8412e.m1(interfaceC8410c, o11, f7, 0L, 124);
            } finally {
                C3532b.b(w02, e11);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    public final void c(@NotNull n nVar, @NotNull M m11) {
        boolean z11 = nVar instanceof t0.j;
        ArrayList arrayList = this.f40113d;
        if (z11) {
            arrayList.add(nVar);
        } else if (nVar instanceof k) {
            arrayList.remove(((k) nVar).a());
        } else if (nVar instanceof C9717f) {
            arrayList.add(nVar);
        } else if (nVar instanceof C9718g) {
            arrayList.remove(((C9718g) nVar).a());
        } else if (nVar instanceof C9713b) {
            arrayList.add(nVar);
        } else if (nVar instanceof C9714c) {
            arrayList.remove(((C9714c) nVar).a());
        } else if (!(nVar instanceof C9712a)) {
            return;
        } else {
            arrayList.remove(((C9712a) nVar).a());
        }
        n nVar2 = (n) C7714v.Z(arrayList);
        if (Intrinsics.d(this.f40114e, nVar2)) {
            return;
        }
        if (nVar2 != null) {
            i iVar = (i) this.f40111b.invoke();
            C10727i.c(m11, null, null, new a(z11 ? iVar.c() : nVar instanceof C9717f ? iVar.b() : nVar instanceof C9713b ? iVar.a() : 0.0f, O0.s.a(nVar2), null), 3);
        } else {
            C10727i.c(m11, null, null, new b(O0.s.b(this.f40114e), null), 3);
        }
        this.f40114e = nVar2;
    }
}
