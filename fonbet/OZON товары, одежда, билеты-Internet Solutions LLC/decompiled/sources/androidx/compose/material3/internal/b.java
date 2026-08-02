package androidx.compose.material3.internal;

import Q0.InterfaceC3829a;
import Q0.InterfaceC3831c;
import fd.InterfaceC6512o;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.J;
import m0.B0;
import m0.InterfaceC8002m;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {685}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class b extends kotlin.coroutines.jvm.internal.j implements InterfaceC6512o<InterfaceC3829a, InterfaceC3831c<Object>, Object, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f40220d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ InterfaceC3829a f40221e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ InterfaceC3831c f40222f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f40223g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ p<Object> f40224h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ float f40225i;

    static final class a extends AbstractC7737t implements Function2<Float, Float, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3829a f40226b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ J f40227c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3829a interfaceC3829a, J j11) {
            super(2);
            this.f40226b = interfaceC3829a;
            this.f40227c = j11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Float f7, Float f11) {
            float floatValue = f7.floatValue();
            this.f40226b.a(floatValue, f11.floatValue());
            this.f40227c.f71784a = floatValue;
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(p<Object> pVar, float f7, kotlin.coroutines.d<? super b> dVar) {
        super(4, dVar);
        this.f40224h = pVar;
        this.f40225i = f7;
    }

    @Override // fd.InterfaceC6512o
    public final Object invoke(InterfaceC3829a interfaceC3829a, InterfaceC3831c<Object> interfaceC3831c, Object obj, kotlin.coroutines.d<? super Unit> dVar) {
        b bVar = new b(this.f40224h, this.f40225i, dVar);
        bVar.f40221e = interfaceC3829a;
        bVar.f40222f = interfaceC3831c;
        bVar.f40223g = obj;
        return bVar.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f40220d;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC3829a interfaceC3829a = this.f40221e;
            float e11 = this.f40222f.e(this.f40223g);
            if (!Float.isNaN(e11)) {
                J j11 = new J();
                p<Object> pVar = this.f40224h;
                float s11 = Float.isNaN(pVar.s()) ? 0.0f : pVar.s();
                j11.f71784a = s11;
                InterfaceC8002m<Float> m11 = pVar.m();
                a aVar2 = new a(interfaceC3829a, j11);
                this.f40221e = null;
                this.f40222f = null;
                this.f40220d = 1;
                if (B0.b(s11, e11, this.f40225i, m11, aVar2, this) == aVar) {
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
