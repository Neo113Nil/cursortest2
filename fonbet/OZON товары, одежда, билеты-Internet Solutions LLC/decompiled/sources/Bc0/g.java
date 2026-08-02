package Bc0;

import Sc.s;
import android.net.Network;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.C10737n;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.di.MobileIdDiModule$provideMobileNetwork$2", f = "MobileIdDiModule.kt", l = {124}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Network>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f3535d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ f f3536e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(f fVar, kotlin.coroutines.d<? super g> dVar) {
        super(2, dVar);
        this.f3536e = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new g(this.f3536e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Network> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f3535d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        f fVar = this.f3536e;
        this.f3535d = 1;
        C10737n c10737n = new C10737n(1, Wc.b.b(this));
        c10737n.o();
        f.c(fVar, c10737n);
        Object n11 = c10737n.n();
        if (n11 == aVar) {
            Intrinsics.checkNotNullParameter(this, "frame");
        }
        return n11 == aVar ? aVar : n11;
    }
}
