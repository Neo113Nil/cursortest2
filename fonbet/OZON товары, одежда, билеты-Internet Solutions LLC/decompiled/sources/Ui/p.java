package Ui;

import Ae.B0;
import Ae.InterfaceC2397i;
import Sc.C4005g;
import Si.InterfaceC4011b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.media.view.gallery.GalleryFragment$observeUiState$3", f = "GalleryFragment.kt", l = {951}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class p extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f27814d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4069c f27815e;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4069c f27816a;

        a(C4069c c4069c) {
            this.f27816a = c4069c;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            InterfaceC4011b interfaceC4011b = (InterfaceC4011b) obj;
            if (!(interfaceC4011b instanceof InterfaceC4011b.a)) {
                throw new Sc.o();
            }
            C4069c.W(this.f27816a, (InterfaceC4011b.a) interfaceC4011b);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(C4069c c4069c, kotlin.coroutines.d<? super p> dVar) {
        super(2, dVar);
        this.f27815e = c4069c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new p(this.f27815e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((p) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f27814d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4069c c4069c = this.f27815e;
            B0<InterfaceC4011b> E02 = c4069c.d0().E0();
            a aVar2 = new a(c4069c);
            this.f27814d = 1;
            if (E02.collect(aVar2, this) == aVar) {
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
