package Dc0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import V.g;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.fintech.presentation.camera.FintechRecoveryCameraFragment$observeViewModel$lambda$20$$inlined$collectFlow$2", f = "FintechRecoveryCameraFragment.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class t extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f6535d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f6536e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ q f6537f;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f6538a;

        public a(q qVar) {
            this.f6538a = qVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            Fc0.b bVar = (Fc0.b) t2;
            q qVar = this.f6538a;
            if (bVar != null) {
                int i11 = V.g.f27884i;
                Context requireContext = qVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                com.google.common.util.concurrent.m a11 = g.a.a(requireContext);
                ((I.d) a11).a(new p(a11, bVar, qVar, 0), androidx.core.content.a.getMainExecutor(qVar.requireContext()));
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, q qVar) {
        super(2, dVar);
        this.f6536e = interfaceC2395h;
        this.f6537f = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new t(this.f6536e, dVar, this.f6537f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((t) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f6535d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(this.f6537f);
            this.f6535d = 1;
            if (this.f6536e.collect(aVar2, this) == aVar) {
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
