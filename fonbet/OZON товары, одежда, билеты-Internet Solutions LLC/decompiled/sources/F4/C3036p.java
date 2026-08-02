package F4;

import F4.M;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1", f = "LegacyPageFetcher.kt", l = {53}, m = "invokeSuspend")
/* renamed from: F4.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3036p extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f8935d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f8936e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C3034n<Object, Object> f8937f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ M.a<Object> f8938g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ y f8939h;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1$1", f = "LegacyPageFetcher.kt", l = {}, m = "invokeSuspend")
    /* renamed from: F4.p$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ M.b<Object, Object> f8940d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C3034n<Object, Object> f8941e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ y f8942f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(M.b<Object, Object> bVar, C3034n<Object, Object> c3034n, y yVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f8940d = bVar;
            this.f8941e = c3034n;
            this.f8942f = yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f8940d, this.f8941e, this.f8942f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            M.b<Object, Object> bVar = this.f8940d;
            boolean z11 = bVar instanceof M.b.C0187b;
            y yVar = this.f8942f;
            C3034n<Object, Object> c3034n = this.f8941e;
            if (z11) {
                c3034n.i(yVar, (M.b.C0187b) bVar);
            } else if (bVar instanceof M.b.a) {
                ((M.b.a) bVar).getClass();
                C3034n.b(c3034n, yVar);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3036p(C3034n<Object, Object> c3034n, M.a<Object> aVar, y yVar, kotlin.coroutines.d<? super C3036p> dVar) {
        super(2, dVar);
        this.f8937f = c3034n;
        this.f8938g = aVar;
        this.f8939h = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C3036p c3036p = new C3036p(this.f8937f, this.f8938g, this.f8939h, dVar);
        c3036p.f8936e = obj;
        return c3036p;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C3036p) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        xe.M m11;
        xe.I i11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i12 = this.f8935d;
        C3034n<Object, Object> c3034n = this.f8937f;
        if (i12 == 0) {
            Sc.s.b(obj);
            xe.M m12 = (xe.M) this.f8936e;
            M<Object, Object> g10 = c3034n.g();
            this.f8936e = m12;
            this.f8935d = 1;
            Object d11 = g10.d(this.f8938g, this);
            if (d11 == aVar) {
                return aVar;
            }
            m11 = m12;
            obj = d11;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m11 = (xe.M) this.f8936e;
            Sc.s.b(obj);
        }
        M.b bVar = (M.b) obj;
        if (c3034n.g().a()) {
            c3034n.d();
            return Unit.f71690a;
        }
        i11 = ((C3034n) c3034n).f8927d;
        C10727i.c(m11, i11, null, new a(bVar, c3034n, this.f8939h, null), 2);
        return Unit.f71690a;
    }
}
