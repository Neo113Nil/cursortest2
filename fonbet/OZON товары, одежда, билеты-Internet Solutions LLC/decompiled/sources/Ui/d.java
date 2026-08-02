package Ui;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.media.view.gallery.GalleryFragment$applyRestorableState$2", f = "GalleryFragment.kt", l = {417}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f27773d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4069c f27774e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Hi.i f27775f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(C4069c c4069c, Hi.i iVar, kotlin.coroutines.d<? super d> dVar) {
        super(2, dVar);
        this.f27774e = c4069c;
        this.f27775f = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new d(this.f27774e, this.f27775f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f27773d;
        C4069c c4069c = this.f27774e;
        if (i11 == 0) {
            Sc.s.b(obj);
            Si.e d02 = c4069c.d0();
            List<Long> g10 = this.f27775f.g();
            this.f27773d = 1;
            d02.s0(g10);
            Object O02 = d02.O0(this);
            if (O02 != aVar) {
                O02 = Unit.f71690a;
            }
            if (O02 == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        c4069c.f27737f = u.NEED_SELECTION_REFRESH;
        return Unit.f71690a;
    }
}
