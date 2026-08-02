package R2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataStoreImpl$writeData$2", f = "DataStoreImpl.kt", l = {352, 353}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class F extends kotlin.coroutines.jvm.internal.j implements Function2<o0<Object>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    kotlin.jvm.internal.K f24276d;

    /* renamed from: e, reason: collision with root package name */
    int f24277e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f24278f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.K f24279g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C3922p<Object> f24280h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Object f24281i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ boolean f24282j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F(kotlin.jvm.internal.K k11, C3922p<Object> c3922p, Object obj, boolean z11, kotlin.coroutines.d<? super F> dVar) {
        super(2, dVar);
        this.f24279g = k11;
        this.f24280h = c3922p;
        this.f24281i = obj;
        this.f24282j = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        F f7 = new F(this.f24279g, this.f24280h, this.f24281i, this.f24282j, dVar);
        f7.f24278f = obj;
        return f7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o0<Object> o0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((F) create(o0Var, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r6.c(r3, r7) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        o0 o0Var;
        kotlin.jvm.internal.K k11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f24277e;
        kotlin.jvm.internal.K k12 = this.f24279g;
        Object obj2 = this.f24281i;
        C3922p<Object> c3922p = this.f24280h;
        if (i11 == 0) {
            Sc.s.b(obj);
            o0 o0Var2 = (o0) this.f24278f;
            U p11 = c3922p.p();
            this.f24278f = o0Var2;
            this.f24276d = k12;
            this.f24277e = 1;
            Integer d11 = p11.d();
            if (d11 != aVar) {
                o0Var = o0Var2;
                obj = d11;
                k11 = k12;
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            if (this.f24282j) {
                ((C3922p) c3922p).f24418h.c(new C3911e(obj2 != null ? obj2.hashCode() : 0, k12.f71785a, obj2));
            }
            return Unit.f71690a;
        }
        k11 = this.f24276d;
        o0Var = (o0) this.f24278f;
        Sc.s.b(obj);
        k11.f71785a = ((Number) obj).intValue();
        this.f24278f = null;
        this.f24276d = null;
        this.f24277e = 2;
    }
}
