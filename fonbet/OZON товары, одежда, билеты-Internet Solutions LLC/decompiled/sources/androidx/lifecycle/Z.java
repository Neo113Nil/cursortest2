package androidx.lifecycle;

import androidx.lifecycle.AbstractC5434v;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.jvm.kt", l = {205}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class Z extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<Object>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f43251d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f43252e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC5434v f43253f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC5434v.b f43254g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f43255h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Z(AbstractC5434v abstractC5434v, AbstractC5434v.b bVar, Function2<? super xe.M, ? super kotlin.coroutines.d<Object>, ? extends Object> function2, kotlin.coroutines.d<? super Z> dVar) {
        super(2, dVar);
        this.f43253f = abstractC5434v;
        this.f43254g = bVar;
        this.f43255h = (kotlin.coroutines.jvm.internal.j) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        Z z11 = new Z(this.f43253f, this.f43254g, this.f43255h, dVar);
        z11.f43252e = obj;
        return z11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<Object> dVar) {
        return ((Z) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Type inference failed for: r8v8, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        C5436x c5436x;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f43251d;
        if (i11 == 0) {
            Sc.s.b(obj);
            xe.B0 b02 = (xe.B0) ((xe.M) this.f43252e).getCoroutineContext().get(xe.B0.f105374o0);
            if (b02 == null) {
                throw new IllegalStateException("when[State] methods should have a parent job");
            }
            Y y11 = new Y();
            C5436x c5436x2 = new C5436x(this.f43253f, this.f43254g, y11.f43250b, b02);
            try {
                ?? r82 = this.f43255h;
                this.f43252e = c5436x2;
                this.f43251d = 1;
                obj = C10727i.f(y11, r82, this);
                if (obj == aVar) {
                    return aVar;
                }
                c5436x = c5436x2;
            } catch (Throwable th2) {
                th = th2;
                c5436x = c5436x2;
                c5436x.b();
                throw th;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c5436x = (C5436x) this.f43252e;
            try {
                Sc.s.b(obj);
            } catch (Throwable th3) {
                th = th3;
                c5436x.b();
                throw th;
            }
        }
        c5436x.b();
        return obj;
    }
}
