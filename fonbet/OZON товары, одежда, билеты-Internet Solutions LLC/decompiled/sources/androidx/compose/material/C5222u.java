package androidx.compose.material;

import Je.InterfaceC3394a;
import androidx.compose.material.C5221t;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.log.Logger;
import xe.B0;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {177, Logger.NONE}, m = "invokeSuspend")
/* renamed from: androidx.compose.material.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5222u extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<Object>, Object> {

    /* renamed from: d, reason: collision with root package name */
    InterfaceC3394a f40133d;

    /* renamed from: e, reason: collision with root package name */
    Object f40134e;

    /* renamed from: f, reason: collision with root package name */
    C5221t f40135f;

    /* renamed from: g, reason: collision with root package name */
    int f40136g;

    /* renamed from: h, reason: collision with root package name */
    private /* synthetic */ Object f40137h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ EnumC8372M f40138i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ C5221t f40139j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f40140k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C5222u(EnumC8372M enumC8372M, C5221t c5221t, Function1<? super kotlin.coroutines.d<Object>, ? extends Object> function1, kotlin.coroutines.d<? super C5222u> dVar) {
        super(2, dVar);
        this.f40138i = enumC8372M;
        this.f40139j = c5221t;
        this.f40140k = (kotlin.coroutines.jvm.internal.j) function1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C5222u c5222u = new C5222u(this.f40138i, this.f40139j, this.f40140k, dVar);
        c5222u.f40137h = obj;
        return c5222u;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<Object> dVar) {
        return ((C5222u) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [Je.a, int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        C5221t c5221t;
        InterfaceC3394a interfaceC3394a;
        ?? r32;
        C5221t.a aVar;
        InterfaceC3394a interfaceC3394a2;
        C5221t c5221t2;
        Throwable th2;
        C5221t.a aVar2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        ?? r12 = this.f40136g;
        try {
            try {
                if (r12 == 0) {
                    Sc.s.b(obj);
                    CoroutineContext.Element element = ((xe.M) this.f40137h).getCoroutineContext().get(B0.f105374o0);
                    Intrinsics.f(element);
                    C5221t.a aVar4 = new C5221t.a(this.f40138i, (B0) element);
                    c5221t = this.f40139j;
                    C5221t.c(c5221t, aVar4);
                    interfaceC3394a = c5221t.f40130b;
                    this.f40137h = aVar4;
                    this.f40133d = interfaceC3394a;
                    kotlin.coroutines.jvm.internal.j jVar = this.f40140k;
                    this.f40134e = jVar;
                    this.f40135f = c5221t;
                    this.f40136g = 1;
                    if (interfaceC3394a.a(this) != aVar3) {
                        r32 = jVar;
                        aVar = aVar4;
                    }
                    return aVar3;
                }
                if (r12 != 1) {
                    if (r12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c5221t2 = (C5221t) this.f40134e;
                    interfaceC3394a2 = this.f40133d;
                    aVar2 = (C5221t.a) this.f40137h;
                    try {
                        Sc.s.b(obj);
                        atomicReference2 = c5221t2.f40129a;
                        while (!atomicReference2.compareAndSet(aVar2, null) && atomicReference2.get() == aVar2) {
                        }
                        interfaceC3394a2.c(null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        atomicReference = c5221t2.f40129a;
                        while (!atomicReference.compareAndSet(aVar2, null)) {
                        }
                        throw th2;
                    }
                }
                C5221t c5221t3 = this.f40135f;
                Function1 function1 = (Function1) this.f40134e;
                interfaceC3394a = this.f40133d;
                aVar = (C5221t.a) this.f40137h;
                Sc.s.b(obj);
                c5221t = c5221t3;
                r32 = function1;
                this.f40137h = aVar;
                this.f40133d = interfaceC3394a2;
                this.f40134e = c5221t;
                this.f40135f = null;
                this.f40136g = 2;
                Object invoke = r32.invoke(this);
                if (invoke != aVar3) {
                    c5221t2 = c5221t;
                    obj = invoke;
                    aVar2 = aVar;
                    atomicReference2 = c5221t2.f40129a;
                    while (!atomicReference2.compareAndSet(aVar2, null)) {
                    }
                    interfaceC3394a2.c(null);
                    return obj;
                }
                return aVar3;
            } catch (Throwable th4) {
                c5221t2 = c5221t;
                th2 = th4;
                aVar2 = aVar;
                atomicReference = c5221t2.f40129a;
                while (!atomicReference.compareAndSet(aVar2, null) && atomicReference.get() == aVar2) {
                }
                throw th2;
            }
            interfaceC3394a2 = interfaceC3394a;
        } catch (Throwable th5) {
            r12.c(null);
            throw th5;
        }
    }
}
