package P0;

import P0.K1;
import androidx.compose.ui.platform.InterfaceC5249h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material3.SnackbarHostKt$SnackbarHost$1$1", f = "SnackbarHost.kt", l = {232}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class I1 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f20653d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC3793z1 f20654e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC5249h f20655f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I1(InterfaceC3793z1 interfaceC3793z1, InterfaceC5249h interfaceC5249h, kotlin.coroutines.d<? super I1> dVar) {
        super(2, dVar);
        this.f20654e = interfaceC3793z1;
        this.f20655f = interfaceC5249h;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new I1(this.f20654e, this.f20655f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((I1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        long j11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f20653d;
        InterfaceC3793z1 interfaceC3793z1 = this.f20654e;
        if (i11 == 0) {
            Sc.s.b(obj);
            if (interfaceC3793z1 != null) {
                A1 duration = interfaceC3793z1.b().getDuration();
                boolean z11 = interfaceC3793z1.b().b() != null;
                int i12 = K1.a.f20669a[duration.ordinal()];
                if (i12 == 1) {
                    j11 = Long.MAX_VALUE;
                } else if (i12 == 2) {
                    j11 = 10000;
                } else {
                    if (i12 != 3) {
                        throw new Sc.o();
                    }
                    j11 = 4000;
                }
                InterfaceC5249h interfaceC5249h = this.f20655f;
                if (interfaceC5249h != null) {
                    j11 = interfaceC5249h.a(j11, z11);
                }
                this.f20653d = 1;
                if (xe.Y.b(j11, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Sc.s.b(obj);
        interfaceC3793z1.dismiss();
        return Unit.f71690a;
    }
}
