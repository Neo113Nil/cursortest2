package Dc0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import android.content.Context;
import android.widget.Toast;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.fintech.presentation.camera.FintechRecoveryCameraFragment$observeViewModel$lambda$20$$inlined$collectFlow$6", f = "FintechRecoveryCameraFragment.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class x extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f6553d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f6554e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ q f6555f;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f6556a;

        public a(q qVar) {
            this.f6556a = qVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            Context context;
            Integer num = (Integer) t2;
            if (num != null && (context = this.f6556a.getContext()) != null) {
                Toast.makeText(context, context.getString(num.intValue()), 0).show();
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, q qVar) {
        super(2, dVar);
        this.f6554e = interfaceC2395h;
        this.f6555f = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new x(this.f6554e, dVar, this.f6555f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((x) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f6553d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(this.f6555f);
            this.f6553d = 1;
            if (this.f6554e.collect(aVar2, this) == aVar) {
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
