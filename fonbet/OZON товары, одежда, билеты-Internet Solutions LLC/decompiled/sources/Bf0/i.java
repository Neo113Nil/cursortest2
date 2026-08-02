package Bf0;

import Sc.s;
import fd.InterfaceC6511n;
import kotlin.Unit;
import qf0.EnumC9053a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.domain.whitelisting.WhitelistingStatusProviderImpl$isWhitelisting$1", f = "WhitelistingStatusProviderImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class i extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<EnumC9053a, EnumC9053a, kotlin.coroutines.d<? super Boolean>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ EnumC9053a f3736d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ EnumC9053a f3737e;

    @Override // fd.InterfaceC6511n
    public final Object invoke(EnumC9053a enumC9053a, EnumC9053a enumC9053a2, kotlin.coroutines.d<? super Boolean> dVar) {
        i iVar = new i(3, dVar);
        iVar.f3736d = enumC9053a;
        iVar.f3737e = enumC9053a2;
        return iVar.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        return Boolean.valueOf(this.f3736d == EnumC9053a.Available && this.f3737e == EnumC9053a.NotAvailable);
    }
}
