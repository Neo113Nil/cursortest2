package Wc0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Jb0.B;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.view.OtpFragment$observeViewModel$lambda$20$lambda$19$$inlined$collectFlow$4", f = "OtpFragment.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class k extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f33485d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f33486e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ b f33487f;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f33488a;

        public a(b bVar) {
            this.f33488a = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            B b11;
            boolean booleanValue = ((Boolean) t2).booleanValue();
            b11 = this.f33488a.f33457b;
            if (b11 != null) {
                TextFieldCellView textFieldCellView = b11.f14360m;
                if (booleanValue) {
                    cc0.c.d(textFieldCellView);
                } else {
                    ViewExtKt.hideKeyboard(textFieldCellView);
                }
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, b bVar) {
        super(2, dVar);
        this.f33486e = interfaceC2395h;
        this.f33487f = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new k(this.f33486e, dVar, this.f33487f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f33485d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(this.f33487f);
            this.f33485d = 1;
            if (this.f33486e.collect(aVar2, this) == aVar) {
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
