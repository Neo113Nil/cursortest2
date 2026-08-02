package Ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.Y;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.media.view.gallery.GalleryFragment$debounce$1$1", f = "GalleryFragment.kt", l = {1089}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f27776d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f27777e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(Function0 function0, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f27777e = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new e(this.f27777e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f27776d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f27776d = 1;
            if (Y.b(100L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        ((g) this.f27777e).invoke();
        return Unit.f71690a;
    }
}
