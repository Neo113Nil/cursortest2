package I0;

import androidx.compose.foundation.gestures.C5177u;
import k1.C7459e;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import x1.C10639n;
import x1.InterfaceC10628c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1", f = "SelectionGestures.kt", l = {277}, m = "invokeSuspend")
/* renamed from: I0.i0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3188i0 extends kotlin.coroutines.jvm.internal.i implements Function2<InterfaceC10628c, kotlin.coroutines.d<? super EnumC3199o>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f11536d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f11537e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f11538f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.L f11539g;

    /* renamed from: I0.i0$a */
    static final class a extends AbstractC7737t implements Function2<x1.x, C7459e, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.L f11540b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.jvm.internal.L l11) {
            super(2);
            this.f11540b = l11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(x1.x xVar, C7459e c7459e) {
            long n11 = c7459e.n();
            xVar.a();
            this.f11540b.f71786a = n11;
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3188i0(long j11, kotlin.jvm.internal.L l11, kotlin.coroutines.d<? super C3188i0> dVar) {
        super(2, dVar);
        this.f11538f = j11;
        this.f11539g = l11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C3188i0 c3188i0 = new C3188i0(this.f11538f, this.f11539g, dVar);
        c3188i0.f11537e = obj;
        return c3188i0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC10628c interfaceC10628c, kotlin.coroutines.d<? super EnumC3199o> dVar) {
        return ((C3188i0) create(interfaceC10628c, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        InterfaceC10628c interfaceC10628c;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f11536d;
        kotlin.jvm.internal.L l11 = this.f11539g;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC10628c interfaceC10628c2 = (InterfaceC10628c) this.f11537e;
            a aVar2 = new a(l11);
            this.f11537e = interfaceC10628c2;
            this.f11536d = 1;
            Object e11 = C5177u.e(interfaceC10628c2, this.f11538f, aVar2, this);
            if (e11 == aVar) {
                return aVar;
            }
            interfaceC10628c = interfaceC10628c2;
            obj = e11;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC10628c = (InterfaceC10628c) this.f11537e;
            Sc.s.b(obj);
        }
        if (((x1.x) obj) != null && P9.a.d(l11.f71786a)) {
            return EnumC3199o.Drag;
        }
        x1.x xVar = (x1.x) C7714v.K(interfaceC10628c.b1().b());
        if (!C10639n.c(xVar)) {
            return EnumC3199o.Cancel;
        }
        xVar.a();
        return EnumC3199o.Up;
    }
}
