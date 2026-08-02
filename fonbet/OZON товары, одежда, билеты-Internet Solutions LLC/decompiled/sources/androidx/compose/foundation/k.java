package androidx.compose.foundation;

import fd.InterfaceC6511n;
import k1.C7459e;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import r0.InterfaceC9143w;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.ClickableNode$clickPointerInput$2", f = "Clickable.kt", l = {636}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class k extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<InterfaceC9143w, C7459e, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f39292d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ InterfaceC9143w f39293e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ long f39294f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ m f39295g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(m mVar, kotlin.coroutines.d<? super k> dVar) {
        super(3, dVar);
        this.f39295g = mVar;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC9143w interfaceC9143w, C7459e c7459e, kotlin.coroutines.d<? super Unit> dVar) {
        long n11 = c7459e.n();
        k kVar = new k(this.f39295g, dVar);
        kVar.f39293e = interfaceC9143w;
        kVar.f39294f = n11;
        return kVar.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f39292d;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC9143w interfaceC9143w = this.f39293e;
            long j11 = this.f39294f;
            m mVar = this.f39295g;
            if (mVar.V1()) {
                this.f39292d = 1;
                if (mVar.X1(interfaceC9143w, j11, this) == aVar) {
                    return aVar;
                }
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
