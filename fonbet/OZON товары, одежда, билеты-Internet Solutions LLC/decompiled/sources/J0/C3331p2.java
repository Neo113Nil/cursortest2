package J0;

import J0.C3338r2;
import androidx.compose.ui.platform.InterfaceC5249h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.SnackbarHostKt$SnackbarHost$1$1", f = "SnackbarHost.kt", l = {167}, m = "invokeSuspend")
/* renamed from: J0.p2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3331p2 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f13358d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC3295g2 f13359e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC5249h f13360f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3331p2(InterfaceC3295g2 interfaceC3295g2, InterfaceC5249h interfaceC5249h, kotlin.coroutines.d<? super C3331p2> dVar) {
        super(2, dVar);
        this.f13359e = interfaceC3295g2;
        this.f13360f = interfaceC5249h;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new C3331p2(this.f13359e, this.f13360f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C3331p2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        long j11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f13358d;
        InterfaceC3295g2 interfaceC3295g2 = this.f13359e;
        if (i11 == 0) {
            Sc.s.b(obj);
            if (interfaceC3295g2 != null) {
                EnumC3299h2 duration = interfaceC3295g2.getDuration();
                boolean z11 = interfaceC3295g2.b() != null;
                int i12 = C3338r2.a.f13373a[duration.ordinal()];
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
                InterfaceC5249h interfaceC5249h = this.f13360f;
                if (interfaceC5249h != null) {
                    j11 = interfaceC5249h.a(j11, z11);
                }
                this.f13358d = 1;
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
        interfaceC3295g2.dismiss();
        return Unit.f71690a;
    }
}
