package B0;

import k1.C7460f;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import z0.InterfaceC10969b;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1", f = "CoreTextField.kt", l = {340}, m = "invokeSuspend")
/* renamed from: B0.a0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2455a0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f1653d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC10969b f1654e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Q1.K f1655f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ O0 f1656g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ R1 f1657h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Q1.D f1658i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2455a0(InterfaceC10969b interfaceC10969b, Q1.K k11, O0 o02, R1 r12, Q1.D d11, kotlin.coroutines.d<? super C2455a0> dVar) {
        super(2, dVar);
        this.f1654e = interfaceC10969b;
        this.f1655f = k11;
        this.f1656g = o02;
        this.f1657h = r12;
        this.f1658i = d11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new C2455a0(this.f1654e, this.f1655f, this.f1656g, this.f1657h, this.f1658i, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C2455a0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        long a11;
        C7460f c7460f;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f1653d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C2471f1 v11 = this.f1656g.v();
            K1.K e11 = this.f1657h.e();
            this.f1653d = 1;
            int originalToTransformed = this.f1658i.originalToTransformed(K1.Q.g(this.f1655f.e()));
            if (originalToTransformed < e11.k().j().length()) {
                c7460f = e11.d(originalToTransformed);
            } else if (originalToTransformed != 0) {
                c7460f = e11.d(originalToTransformed - 1);
            } else {
                a11 = C2501p1.a(v11.i(), v11.a(), v11.b(), C2501p1.f1895a, 1);
                c7460f = new C7460f(0.0f, 0.0f, 1.0f, (int) (a11 & 4294967295L));
            }
            Object a12 = this.f1654e.a(c7460f, this);
            if (a12 != aVar) {
                a12 = Unit.f71690a;
            }
            if (a12 == aVar) {
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
