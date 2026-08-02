package androidx.compose.foundation.gestures;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import m0.B0;
import org.jetbrains.annotations.NotNull;
import r0.C9113N;
import r0.InterfaceC9141u;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", f = "Scrollable.kt", l = {967}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class L extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC9141u, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f39046d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f39047e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C9113N f39048f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f39049g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.J f39050h;

    static final class a extends AbstractC7737t implements Function2<Float, Float, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.J f39051b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C9113N f39052c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC9141u f39053d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.jvm.internal.J j11, C9113N c9113n, InterfaceC9141u interfaceC9141u) {
            super(2);
            this.f39051b = j11;
            this.f39052c = c9113n;
            this.f39053d = interfaceC9141u;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Float f7, Float f11) {
            float floatValue = f7.floatValue();
            f11.floatValue();
            kotlin.jvm.internal.J j11 = this.f39051b;
            float f12 = floatValue - j11.f71784a;
            C9113N c9113n = this.f39052c;
            j11.f71784a += c9113n.r(c9113n.w(this.f39053d.b(c9113n.x(c9113n.r(f12)))));
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L(C9113N c9113n, long j11, kotlin.jvm.internal.J j12, kotlin.coroutines.d<? super L> dVar) {
        super(2, dVar);
        this.f39048f = c9113n;
        this.f39049g = j11;
        this.f39050h = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        L l11 = new L(this.f39048f, this.f39049g, this.f39050h, dVar);
        l11.f39047e = obj;
        return l11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC9141u interfaceC9141u, kotlin.coroutines.d<? super Unit> dVar) {
        return ((L) create(interfaceC9141u, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f39046d;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC9141u interfaceC9141u = (InterfaceC9141u) this.f39047e;
            C9113N c9113n = this.f39048f;
            float w11 = c9113n.w(this.f39049g);
            a aVar2 = new a(this.f39050h, c9113n, interfaceC9141u);
            this.f39046d = 1;
            if (B0.d(0.0f, w11, null, aVar2, this, 12) == aVar) {
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
