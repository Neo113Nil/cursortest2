package Mf0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import pf0.InterfaceC8918a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.debugMenu.screen.main.ONDebugMenuViewModel$setExtraHeader$1", f = "ONDebugMenuViewModel.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class T extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f18006d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ O f18007e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f18008f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f18009g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    T(O o11, String str, String str2, kotlin.coroutines.d<? super T> dVar) {
        super(2, dVar);
        this.f18007e = o11;
        this.f18008f = str;
        this.f18009g = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new T(this.f18007e, this.f18008f, this.f18009g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((T) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f18006d;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC8918a e02 = O.e0(this.f18007e);
            this.f18006d = 1;
            if (e02.c(this.f18008f, this.f18009g, this) == aVar) {
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
