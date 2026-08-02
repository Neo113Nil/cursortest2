package P0;

import com.google.protobuf.DescriptorProtos$Edition;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m0.C7980b;
import m0.C8008p;
import org.jetbrains.annotations.NotNull;
import t0.C9713b;
import t0.C9717f;
import t0.s;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material3.ButtonElevation$animateElevation$2$1", f = "Button.kt", l = {989, DescriptorProtos$Edition.EDITION_PROTO2_VALUE}, m = "invokeSuspend")
/* renamed from: P0.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3729e extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f21003d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7980b<Z1.h, C8008p> f21004e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ float f21005f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f21006g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C3732f f21007h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ t0.n f21008i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3729e(C7980b<Z1.h, C8008p> c7980b, float f7, boolean z11, C3732f c3732f, t0.n nVar, kotlin.coroutines.d<? super C3729e> dVar) {
        super(2, dVar);
        this.f21004e = c7980b;
        this.f21005f = f7;
        this.f21006g = z11;
        this.f21007h = c3732f;
        this.f21008i = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new C3729e(this.f21004e, this.f21005f, this.f21006g, this.f21007h, this.f21008i, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C3729e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fc, code lost:
    
        if (r13 == r0) goto L66;
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
        Object m11;
        Object obj2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f21003d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C7980b<Z1.h, C8008p> c7980b = this.f21004e;
            float d11 = c7980b.i().d();
            float f13 = this.f21005f;
            if (!Z1.h.b(d11, f13)) {
                if (this.f21006g) {
                    float d12 = c7980b.i().d();
                    C3732f c3732f = this.f21007h;
                    f7 = c3732f.f21022b;
                    m0.T0 t02 = null;
                    if (Z1.h.b(d12, f7)) {
                        c9717f = new s.b(0L);
                    } else {
                        f11 = c3732f.f21024d;
                        if (Z1.h.b(d12, f11)) {
                            c9717f = new t0.j();
                        } else {
                            f12 = c3732f.f21023c;
                            c9717f = Z1.h.b(d12, f12) ? new C9717f() : null;
                        }
                    }
                    this.f21003d = 2;
                    int i12 = Q0.e.f22758d;
                    t0.n nVar = this.f21008i;
                    if (nVar != null) {
                        if (nVar instanceof s.b) {
                            t02 = Q0.e.f22755a;
                        } else if (nVar instanceof C9713b) {
                            t02 = Q0.e.f22755a;
                        } else if (nVar instanceof t0.j) {
                            t02 = Q0.e.f22755a;
                        } else if (nVar instanceof C9717f) {
                            t02 = Q0.e.f22755a;
                        }
                    } else if (c9717f != null) {
                        if (c9717f instanceof s.b) {
                            t02 = Q0.e.f22756b;
                        } else if (c9717f instanceof C9713b) {
                            t02 = Q0.e.f22756b;
                        } else if (c9717f instanceof t0.j) {
                            t02 = Q0.e.f22757c;
                        } else if (c9717f instanceof C9717f) {
                            t02 = Q0.e.f22756b;
                        }
                    }
                    m0.T0 t03 = t02;
                    C7980b<Z1.h, C8008p> c7980b2 = this.f21004e;
                    if (t03 != null) {
                        m11 = C7980b.f(c7980b2, Z1.h.a(f13), t03, null, this, 12);
                        if (m11 != obj2) {
                            m11 = Unit.f71690a;
                        }
                    } else {
                        m11 = c7980b2.m(Z1.h.a(f13), this);
                        if (m11 != obj2) {
                            m11 = Unit.f71690a;
                        }
                    }
                } else {
                    Z1.h a11 = Z1.h.a(f13);
                    this.f21003d = 1;
                    if (c7980b.m(a11, this) == obj2) {
                    }
                }
                return obj2;
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
