package Ui;

import Ae.B0;
import Ae.InterfaceC2397i;
import Fi.d;
import Sc.C4005g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.media.view.gallery.GalleryFragment$observeHostCommands$1", f = "GalleryFragment.kt", l = {961}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class l extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f27793d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4069c f27794e;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4069c f27795a;

        a(C4069c c4069c) {
            this.f27795a = c4069c;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            Fi.d dVar2 = (Fi.d) obj;
            if (dVar2 instanceof d.b) {
                ((d.b) dVar2).getClass();
                C4069c.L(this.f27795a);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(C4069c c4069c, kotlin.coroutines.d<? super l> dVar) {
        super(2, dVar);
        this.f27794e = c4069c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new l(this.f27794e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((l) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f27793d;
        if (i11 == 0) {
            Sc.s.b(obj);
            B0 a11 = Fi.e.a();
            a aVar2 = new a(this.f27794e);
            this.f27793d = 1;
            if (a11.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        throw new C4005g();
    }
}
