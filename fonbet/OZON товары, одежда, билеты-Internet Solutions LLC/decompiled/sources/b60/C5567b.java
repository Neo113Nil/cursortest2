package b60;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.contacts.RequestPhotoData;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.contacts.GetPhotoBridgeInterface$handleRequest$1", f = "GetPhotoBridgeInterface.kt", l = {}, m = "invokeSuspend")
/* renamed from: b60.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5567b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C5568c f55556d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ RequestPhotoData f55557e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5567b(C5568c c5568c, RequestPhotoData requestPhotoData, kotlin.coroutines.d<? super C5567b> dVar) {
        super(2, dVar);
        this.f55556d = c5568c;
        this.f55557e = requestPhotoData;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C5567b(this.f55556d, this.f55557e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C5567b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        C5568c.e(this.f55556d, this.f55557e.getPhones());
        return Unit.f71690a;
    }
}
