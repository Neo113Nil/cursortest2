package Dc0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Fc0.c;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.id.nativeauth.main.ErrorView;
import ru.ozon.id.nativeauth.main.b;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.fintech.presentation.camera.FintechRecoveryCameraFragment$observeViewModel$lambda$20$$inlined$collectFlow$1", f = "FintechRecoveryCameraFragment.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class s extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f6529d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f6530e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ q f6531f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Jb0.g f6532g;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f6533a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Jb0.g f6534b;

        public a(q qVar, Jb0.g gVar) {
            this.f6533a = qVar;
            this.f6534b = gVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            b.c.C2137b c2137b;
            c.b bVar = (c.b) t2;
            q qVar = this.f6533a;
            if (bVar != null) {
                Context requireContext = qVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                c2137b = bVar.a(requireContext);
            } else {
                c2137b = null;
            }
            ErrorView errorView = this.f6534b.f14420e;
            Intrinsics.checkNotNullExpressionValue(errorView, "errorView");
            errorView.setVisibility(c2137b != null ? 0 : 8);
            if (c2137b != null) {
                errorView.j(c2137b);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, q qVar, Jb0.g gVar) {
        super(2, dVar);
        this.f6530e = interfaceC2395h;
        this.f6531f = qVar;
        this.f6532g = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new s(this.f6530e, dVar, this.f6531f, this.f6532g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((s) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f6529d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(this.f6531f, this.f6532g);
            this.f6529d = 1;
            if (this.f6530e.collect(aVar2, this) == aVar) {
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
