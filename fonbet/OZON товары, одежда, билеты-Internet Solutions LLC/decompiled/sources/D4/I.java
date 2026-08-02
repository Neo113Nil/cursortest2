package D4;

import B4.C2581j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m0.C7989f0;
import m0.C8004n;
import m0.D0;
import m0.T0;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "androidx.navigation.compose.NavHostKt$NavHost$29$1", f = "NavHost.kt", l = {619, 626}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class I extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f5812d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f5813e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C7989f0<C2581j> f5814f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C2581j f5815g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ D0<C2581j> f5816h;

    static final class a extends AbstractC7737t implements Function2<Float, Float, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ xe.M f5817b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C7989f0<C2581j> f5818c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2581j f5819d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xe.M m11, C7989f0<C2581j> c7989f0, C2581j c2581j) {
            super(2);
            this.f5817b = m11;
            this.f5818c = c7989f0;
            this.f5819d = c2581j;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Float f7, Float f11) {
            float floatValue = f7.floatValue();
            f11.floatValue();
            C10727i.c(this.f5817b, null, null, new H(floatValue, this.f5818c, this.f5819d, null), 3);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I(C7989f0<C2581j> c7989f0, C2581j c2581j, D0<C2581j> d02, kotlin.coroutines.d<? super I> dVar) {
        super(2, dVar);
        this.f5814f = c7989f0;
        this.f5815g = c2581j;
        this.f5816h = d02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        I i11 = new I(this.f5814f, this.f5815g, this.f5816h, dVar);
        i11.f5813e = obj;
        return i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((I) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (m0.C7989f0.A(r1, r5, r12) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (m0.B0.d(r6, 0.0f, r8, r9, r12, 4) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f5812d;
        if (i11 == 0) {
            Sc.s.b(obj);
            xe.M m11 = (xe.M) this.f5813e;
            C7989f0<C2581j> c7989f0 = this.f5814f;
            C2581j a11 = c7989f0.a();
            C2581j c2581j = this.f5815g;
            if (Intrinsics.d(a11, c2581j)) {
                long o11 = this.f5816h.o() / 1000000;
                float F11 = c7989f0.F();
                T0 d11 = C8004n.d((int) (c7989f0.F() * o11), 0, null, 6);
                a aVar2 = new a(m11, c7989f0, c2581j);
                this.f5812d = 2;
            } else {
                this.f5812d = 1;
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
