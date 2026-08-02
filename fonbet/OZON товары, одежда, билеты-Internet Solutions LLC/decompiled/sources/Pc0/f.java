package Pc0;

import Sc.s;
import android.content.Intent;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.navigation.AuthRouter$openInExternalApp$1", f = "AuthRouter.kt", l = {280}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class f extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f22198d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ c f22199e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Intent f22200f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(c cVar, Intent intent, kotlin.coroutines.d<? super f> dVar) {
        super(2, dVar);
        this.f22199e = cVar;
        this.f22200f = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new f(this.f22199e, this.f22200f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f22198d;
        if (i11 == 0) {
            s.b(obj);
            Nc0.f e11 = c.e(this.f22199e);
            this.f22198d = 1;
            if (e11.a(this.f22200f, this) == aVar) {
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
