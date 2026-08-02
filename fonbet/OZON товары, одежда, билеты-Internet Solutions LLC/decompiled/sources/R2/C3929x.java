package R2;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", l = {298, 300}, m = "invokeSuspend")
/* renamed from: R2.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3929x extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Pair<? extends g0<Object>, ? extends Boolean>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Throwable f24484d;

    /* renamed from: e, reason: collision with root package name */
    int f24485e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C3922p<Object> f24486f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3929x(C3922p<Object> c3922p, kotlin.coroutines.d<? super C3929x> dVar) {
        super(1, dVar);
        this.f24486f = c3922p;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
        return new C3929x(this.f24486f, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Pair<? extends g0<Object>, ? extends Boolean>> dVar) {
        return ((C3929x) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Throwable th2;
        g0 g0Var;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f24485e;
        C3922p<Object> c3922p = this.f24486f;
        try {
        } catch (Throwable th3) {
            U p11 = c3922p.p();
            this.f24484d = th3;
            this.f24485e = 2;
            Integer version = p11.getVersion();
            if (version != aVar) {
                th2 = th3;
                obj = version;
            }
        }
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f24485e = 1;
            obj = C3922p.n(c3922p, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th2 = this.f24484d;
                Sc.s.b(obj);
                g0Var = new W(((Number) obj).intValue(), th2);
                return new Pair(g0Var, Boolean.TRUE);
            }
            Sc.s.b(obj);
        }
        g0Var = (g0) obj;
        return new Pair(g0Var, Boolean.TRUE);
    }
}
