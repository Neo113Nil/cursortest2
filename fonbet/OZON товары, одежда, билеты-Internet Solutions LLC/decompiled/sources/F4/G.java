package F4;

import F4.M;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.paging.PagedList$Companion$create$resolvedInitialPage$1", f = "PagedList.kt", l = {184}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class G extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super M.b.C0187b<Object, Object>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f8807d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ M<Object, Object> f8808e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ M.a.c<Object> f8809f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G(M<Object, Object> m11, M.a.c<Object> cVar, kotlin.coroutines.d<? super G> dVar) {
        super(2, dVar);
        this.f8808e = m11;
        this.f8809f = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new G(this.f8808e, this.f8809f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super M.b.C0187b<Object, Object>> dVar) {
        return ((G) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f8807d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f8807d = 1;
            obj = this.f8808e.d(this.f8809f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        M.b bVar = (M.b) obj;
        if (bVar instanceof M.b.C0187b) {
            return (M.b.C0187b) bVar;
        }
        if (!(bVar instanceof M.b.a)) {
            throw new Sc.o();
        }
        ((M.b.a) bVar).getClass();
        throw null;
    }
}
