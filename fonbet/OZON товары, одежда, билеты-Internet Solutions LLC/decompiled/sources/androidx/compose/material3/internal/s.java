package androidx.compose.material3.internal;

import Je.InterfaceC3394a;
import androidx.compose.material3.internal.r;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material3.internal.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {180, 103}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class s extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<Object>, Object> {

    /* renamed from: d, reason: collision with root package name */
    InterfaceC3394a f40310d;

    /* renamed from: e, reason: collision with root package name */
    Object f40311e;

    /* renamed from: f, reason: collision with root package name */
    r f40312f;

    /* renamed from: g, reason: collision with root package name */
    int f40313g;

    /* renamed from: h, reason: collision with root package name */
    private /* synthetic */ Object f40314h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ EnumC8372M f40315i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ r f40316j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f40317k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    s(EnumC8372M enumC8372M, r rVar, Function1<? super kotlin.coroutines.d<Object>, ? extends Object> function1, kotlin.coroutines.d<? super s> dVar) {
        super(2, dVar);
        this.f40315i = enumC8372M;
        this.f40316j = rVar;
        this.f40317k = (kotlin.coroutines.jvm.internal.j) function1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        s sVar = new s(this.f40315i, this.f40316j, this.f40317k, dVar);
        sVar.f40314h = obj;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<Object> dVar) {
        return ((s) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [Je.a, int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        r rVar;
        InterfaceC3394a interfaceC3394a;
        ?? r32;
        r.a aVar;
        InterfaceC3394a interfaceC3394a2;
        r rVar2;
        Throwable th2;
        r.a aVar2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        ?? r12 = this.f40313g;
        try {
            try {
                if (r12 == 0) {
                    Sc.s.b(obj);
                    CoroutineContext.Element element = ((M) this.f40314h).getCoroutineContext().get(B0.f105374o0);
                    Intrinsics.f(element);
                    r.a aVar4 = new r.a(this.f40315i, (B0) element);
                    rVar = this.f40316j;
                    r.c(rVar, aVar4);
                    interfaceC3394a = rVar.f40307b;
                    this.f40314h = aVar4;
                    this.f40310d = interfaceC3394a;
                    kotlin.coroutines.jvm.internal.j jVar = this.f40317k;
                    this.f40311e = jVar;
                    this.f40312f = rVar;
                    this.f40313g = 1;
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
                    rVar2 = (r) this.f40311e;
                    interfaceC3394a2 = this.f40310d;
                    aVar2 = (r.a) this.f40314h;
                    try {
                        Sc.s.b(obj);
                        atomicReference2 = rVar2.f40306a;
                        while (!atomicReference2.compareAndSet(aVar2, null) && atomicReference2.get() == aVar2) {
                        }
                        interfaceC3394a2.c(null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        atomicReference = rVar2.f40306a;
                        while (!atomicReference.compareAndSet(aVar2, null)) {
                        }
                        throw th2;
                    }
                }
                r rVar3 = this.f40312f;
                Function1 function1 = (Function1) this.f40311e;
                interfaceC3394a = this.f40310d;
                aVar = (r.a) this.f40314h;
                Sc.s.b(obj);
                rVar = rVar3;
                r32 = function1;
                this.f40314h = aVar;
                this.f40310d = interfaceC3394a2;
                this.f40311e = rVar;
                this.f40312f = null;
                this.f40313g = 2;
                Object invoke = r32.invoke(this);
                if (invoke != aVar3) {
                    rVar2 = rVar;
                    obj = invoke;
                    aVar2 = aVar;
                    atomicReference2 = rVar2.f40306a;
                    while (!atomicReference2.compareAndSet(aVar2, null)) {
                    }
                    interfaceC3394a2.c(null);
                    return obj;
                }
                return aVar3;
            } catch (Throwable th4) {
                rVar2 = rVar;
                th2 = th4;
                aVar2 = aVar;
                atomicReference = rVar2.f40306a;
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
