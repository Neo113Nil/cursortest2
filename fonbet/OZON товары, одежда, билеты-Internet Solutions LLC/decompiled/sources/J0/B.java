package J0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m0.C7980b;
import m0.C8008p;
import org.jetbrains.annotations.NotNull;
import t0.C9717f;
import t0.s;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.DefaultButtonElevation$elevation$2$1", f = "Button.kt", l = {556, 564}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class B extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f12664d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7980b<Z1.h, C8008p> f12665e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ float f12666f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f12667g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C f12668h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ t0.n f12669i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B(C7980b<Z1.h, C8008p> c7980b, float f7, boolean z11, C c11, t0.n nVar, kotlin.coroutines.d<? super B> dVar) {
        super(2, dVar);
        this.f12665e = c7980b;
        this.f12666f = f7;
        this.f12667g = z11;
        this.f12668h = c11;
        this.f12669i = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new B(this.f12665e, this.f12666f, this.f12667g, this.f12668h, this.f12669i, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((B) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r8.m(r1, r7) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        if (J0.Z.a(r8, r4, r1, r7.f12669i, r7) == r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        float f7;
        float f11;
        float f12;
        t0.n c9717f;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f12664d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C7980b<Z1.h, C8008p> c7980b = this.f12665e;
            float d11 = c7980b.i().d();
            float f13 = this.f12666f;
            if (!Z1.h.b(d11, f13)) {
                if (this.f12667g) {
                    float d12 = c7980b.i().d();
                    C c11 = this.f12668h;
                    f7 = c11.f12687b;
                    if (Z1.h.b(d12, f7)) {
                        c9717f = new s.b(0L);
                    } else {
                        f11 = c11.f12689d;
                        if (Z1.h.b(d12, f11)) {
                            c9717f = new t0.j();
                        } else {
                            f12 = c11.f12690e;
                            c9717f = Z1.h.b(d12, f12) ? new C9717f() : null;
                        }
                    }
                    this.f12664d = 2;
                } else {
                    Z1.h a11 = Z1.h.a(f13);
                    this.f12664d = 1;
                }
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
