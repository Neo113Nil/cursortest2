package Og0;

import Ae.InterfaceC2397i;
import Sc.s;
import fd.InterfaceC6511n;
import kotlin.Unit;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.push.dialog.internal.data.repository.DialogStateRepositoryImpl$isDisabledObservable$2", f = "DialogStateRepositoryImpl.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class d extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<InterfaceC2397i<? super Boolean>, Throwable, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f20379d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ InterfaceC2397i f20380e;

    d() {
        super(3, null);
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC2397i<? super Boolean> interfaceC2397i, Throwable th2, kotlin.coroutines.d<? super Unit> dVar) {
        d dVar2 = new d(3, dVar);
        dVar2.f20380e = interfaceC2397i;
        return dVar2.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f20379d;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2397i interfaceC2397i = this.f20380e;
            Boolean bool = Boolean.FALSE;
            this.f20379d = 1;
            if (interfaceC2397i.emit(bool, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
