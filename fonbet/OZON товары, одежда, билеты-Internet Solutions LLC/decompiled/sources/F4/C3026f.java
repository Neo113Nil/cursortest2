package F4;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.paging.ContiguousPagedList$deferBoundaryCallbacks$1", f = "ContiguousPagedList.kt", l = {}, m = "invokeSuspend")
/* renamed from: F4.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3026f extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f8884d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C3027g<Object, Object> f8885e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f8886f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f8887g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3026f(boolean z11, C3027g<Object, Object> c3027g, boolean z12, boolean z13, kotlin.coroutines.d<? super C3026f> dVar) {
        super(2, dVar);
        this.f8884d = z11;
        this.f8885e = c3027g;
        this.f8886f = z12;
        this.f8887g = z13;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new C3026f(this.f8884d, this.f8885e, this.f8886f, this.f8887g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C3026f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        boolean z11 = this.f8884d;
        C3027g<Object, Object> c3027g = this.f8885e;
        if (z11) {
            c3027g.I().c();
        }
        if (this.f8886f) {
            ((C3027g) c3027g).f8893p = true;
        }
        if (this.f8887g) {
            ((C3027g) c3027g).f8894q = true;
        }
        c3027g.N(false);
        return Unit.f71690a;
    }
}
