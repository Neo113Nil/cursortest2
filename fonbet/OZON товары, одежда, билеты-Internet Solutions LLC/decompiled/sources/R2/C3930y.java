package R2;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", l = {306, 309}, m = "invokeSuspend")
/* renamed from: R2.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3930y extends kotlin.coroutines.jvm.internal.j implements Function2<Boolean, kotlin.coroutines.d<? super Pair<? extends g0<Object>, ? extends Boolean>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Throwable f24487d;

    /* renamed from: e, reason: collision with root package name */
    int f24488e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ boolean f24489f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C3922p<Object> f24490g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f24491h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3930y(C3922p<Object> c3922p, int i11, kotlin.coroutines.d<? super C3930y> dVar) {
        super(2, dVar);
        this.f24490g = c3922p;
        this.f24491h = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C3930y c3930y = new C3930y(this.f24490g, this.f24491h, dVar);
        c3930y.f24489f = ((Boolean) obj).booleanValue();
        return c3930y;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, kotlin.coroutines.d<? super Pair<? extends g0<Object>, ? extends Boolean>> dVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((C3930y) create(bool2, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Throwable th2;
        int i11;
        boolean z11;
        g0 g0Var;
        boolean z12;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        boolean z13 = this.f24488e;
        C3922p<Object> c3922p = this.f24490g;
        try {
        } catch (Throwable th3) {
            if (z13 != 0) {
                U p11 = c3922p.p();
                this.f24487d = th3;
                this.f24489f = z13;
                this.f24488e = 2;
                Integer version = p11.getVersion();
                if (version != aVar) {
                    z11 = z13;
                    th2 = th3;
                    obj = version;
                }
            } else {
                boolean z14 = z13;
                th2 = th3;
                i11 = this.f24491h;
                z11 = z14;
            }
        }
        if (z13 == 0) {
            Sc.s.b(obj);
            boolean z15 = this.f24489f;
            this.f24489f = z15;
            this.f24488e = 1;
            obj = C3922p.n(c3922p, z15, this);
            z13 = z15;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (z13 != 1) {
                if (z13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z11 = this.f24489f;
                th2 = this.f24487d;
                Sc.s.b(obj);
                i11 = ((Number) obj).intValue();
                W w11 = new W(i11, th2);
                z12 = z11;
                g0Var = w11;
                return new Pair(g0Var, Boolean.valueOf(z12));
            }
            boolean z16 = this.f24489f;
            Sc.s.b(obj);
            z13 = z16;
        }
        g0Var = (g0) obj;
        z12 = z13;
        return new Pair(g0Var, Boolean.valueOf(z12));
    }
}
