package H1;

import I1.r;
import I1.u;
import Sc.s;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class g extends kotlin.coroutines.jvm.internal.j implements Function2<Float, kotlin.coroutines.d<? super Float>, Object> {

    /* renamed from: d, reason: collision with root package name */
    boolean f10480d;

    /* renamed from: e, reason: collision with root package name */
    int f10481e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ float f10482f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ d f10483g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(d dVar, kotlin.coroutines.d<? super g> dVar2) {
        super(2, dVar2);
        this.f10483g = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        g gVar = new g(this.f10483g, dVar);
        gVar.f10482f = ((Number) obj).floatValue();
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Float f7, kotlin.coroutines.d<? super Float> dVar) {
        return ((g) create(Float.valueOf(f7.floatValue()), dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        r rVar;
        r rVar2;
        boolean z11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f10481e;
        if (i11 == 0) {
            s.b(obj);
            float f7 = this.f10482f;
            d dVar = this.f10483g;
            rVar = dVar.f10458a;
            Function2 function2 = (Function2) I1.m.a(rVar.q(), I1.k.u());
            if (function2 == null) {
                A1.a.c("Required value was null.");
                throw null;
            }
            rVar2 = dVar.f10458a;
            I1.l q11 = rVar2.q();
            int i12 = u.f11751H;
            boolean b11 = ((I1.j) q11.k(u.G())).b();
            if (b11) {
                f7 = -f7;
            }
            C7459e a11 = C7459e.a(P9.a.a(0.0f, f7));
            this.f10480d = b11;
            this.f10481e = 1;
            obj = function2.invoke(a11, this);
            if (obj == aVar) {
                return aVar;
            }
            z11 = b11;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = this.f10480d;
            s.b(obj);
        }
        float h11 = C7459e.h(((C7459e) obj).n());
        if (z11) {
            h11 = -h11;
        }
        return new Float(h11);
    }
}
