package F4;

import F4.AbstractC3028h;
import F4.M;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.paging.LegacyPagingSource$load$2", f = "LegacyPagingSource.kt", l = {111}, m = "invokeSuspend")
/* renamed from: F4.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3038s extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super M.b.C0187b<Object, Object>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f8950d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C3037q<Object, Object> f8951e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC3028h.e<Object> f8952f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ M.a<Object> f8953g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3038s(C3037q<Object, Object> c3037q, AbstractC3028h.e<Object> eVar, M.a<Object> aVar, kotlin.coroutines.d<? super C3038s> dVar) {
        super(2, dVar);
        this.f8951e = c3037q;
        this.f8952f = eVar;
        this.f8953g = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new C3038s(this.f8951e, this.f8952f, this.f8953g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super M.b.C0187b<Object, Object>> dVar) {
        return ((C3038s) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f8950d;
        if (i11 == 0) {
            Sc.s.b(obj);
            AbstractC3028h<Object, Object> g10 = this.f8951e.g();
            this.f8950d = 1;
            obj = g10.f(this.f8952f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        AbstractC3028h.a aVar2 = (AbstractC3028h.a) obj;
        List<Value> list = aVar2.f8905a;
        boolean isEmpty = list.isEmpty();
        M.a<Object> aVar3 = this.f8953g;
        return new M.b.C0187b(list, (isEmpty && (aVar3 instanceof M.a.b)) ? null : aVar2.d(), (aVar2.f8905a.isEmpty() && (aVar3 instanceof M.a.C0186a)) ? null : aVar2.c(), aVar2.b(), aVar2.a());
    }
}
