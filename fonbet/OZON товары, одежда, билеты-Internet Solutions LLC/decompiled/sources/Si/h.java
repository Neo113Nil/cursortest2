package Si;

import Ae.InterfaceC2397i;
import F4.C3040u;
import F4.F;
import Qi.InterfaceC3877a;
import androidx.lifecycle.P;
import fd.InterfaceC6511n;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.media.presentation.GalleryViewModel$1$2$invokeSuspend$$inlined$combine$1$3", f = "GalleryViewModel.kt", l = {238}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class h extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<InterfaceC2397i<? super P<F<InterfaceC4010a>>>, Object[], kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f26314d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ InterfaceC2397i f26315e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object[] f26316f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ e f26317g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e eVar, kotlin.coroutines.d dVar) {
        super(3, dVar);
        this.f26317g = eVar;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC2397i<? super P<F<InterfaceC4010a>>> interfaceC2397i, Object[] objArr, kotlin.coroutines.d<? super Unit> dVar) {
        h hVar = new h(this.f26317g, dVar);
        hVar.f26315e = interfaceC2397i;
        hVar.f26316f = objArr;
        return hVar.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        InterfaceC3877a interfaceC3877a;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f26314d;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC2397i interfaceC2397i = this.f26315e;
            Object[] objArr = this.f26316f;
            Object obj2 = objArr[0];
            Intrinsics.g(obj2, "null cannot be cast to non-null type ru.ozon.android.gallery.data.OzAlbum");
            Hi.j jVar = (Hi.j) obj2;
            Object obj3 = objArr[1];
            Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            Set set = (Set) obj3;
            Object obj4 = objArr[2];
            Intrinsics.g(obj4, "null cannot be cast to non-null type ru.ozon.android.gallery.data.GalleryMediaFilter");
            Hi.h hVar = (Hi.h) obj4;
            Object obj5 = objArr[3];
            Intrinsics.g(obj5, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) obj5).booleanValue();
            Object obj6 = objArr[4];
            Intrinsics.g(obj6, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
            Object obj7 = objArr[5];
            Intrinsics.g(obj7, "null cannot be cast to non-null type ru.ozon.android.gallery.core.config.GalleryMediaListPaginationConfig");
            e eVar = this.f26317g;
            interfaceC3877a = eVar.f26269c;
            C3040u g02 = e.g0(eVar, jVar, interfaceC3877a, set, hVar, booleanValue, booleanValue2, (Ci.h) obj7);
            this.f26314d = 1;
            if (interfaceC2397i.emit(g02, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
