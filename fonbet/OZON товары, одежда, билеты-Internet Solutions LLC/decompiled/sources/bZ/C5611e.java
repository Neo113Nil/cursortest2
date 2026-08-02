package bZ;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import ru.ozon.cdn.chooser.internal.data.dto.CdnConfigResponse;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.cdn.chooser.internal.data.CdnChooserRepository$getCdnConfig$2", f = "CdnChooserRepository.kt", l = {12}, m = "invokeSuspend")
/* renamed from: bZ.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C5611e extends j implements Function1<kotlin.coroutines.d<? super CdnConfigResponse>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f55783d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C5612f f55784e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5611e(C5612f c5612f, kotlin.coroutines.d<? super C5611e> dVar) {
        super(1, dVar);
        this.f55784e = c5612f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new C5611e(this.f55784e, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super CdnConfigResponse> dVar) {
        return ((C5611e) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC5607a interfaceC5607a;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f55783d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        interfaceC5607a = this.f55784e.f55785a;
        this.f55783d = 1;
        Object cDNConfig = interfaceC5607a.getCDNConfig(this);
        return cDNConfig == aVar ? aVar : cDNConfig;
    }
}
