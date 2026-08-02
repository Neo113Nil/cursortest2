package Le0;

import Ae.C0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.LibreCameraController$1$finishCallback$1$1", f = "LibreCameraController.kt", l = {120}, m = "invokeSuspend")
/* renamed from: Le0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3589f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f16950d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C3588e f16951e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ we0.h f16952f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3589f(C3588e c3588e, we0.h hVar, kotlin.coroutines.d<? super C3589f> dVar) {
        super(2, dVar);
        this.f16951e = c3588e;
        this.f16952f = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C3589f(this.f16951e, this.f16952f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C3589f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f16950d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C0 c02 = this.f16951e.f16914d;
            this.f16950d = 1;
            if (c02.emit(this.f16952f, this) == aVar) {
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
