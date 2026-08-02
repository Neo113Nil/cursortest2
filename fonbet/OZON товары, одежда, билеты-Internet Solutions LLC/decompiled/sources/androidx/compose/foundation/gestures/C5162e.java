package androidx.compose.foundation.gestures;

import B0.C0;
import fd.InterfaceC6512o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import m0.C8000l;
import m0.C8006o;
import m0.C8008p;
import m0.InterfaceC7976A;
import org.jetbrains.annotations.NotNull;
import r0.InterfaceC9122b;
import r0.InterfaceC9133m;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2", f = "AnchoredDraggable.kt", l = {1059, 1077, 1092}, m = "invokeSuspend")
/* renamed from: androidx.compose.foundation.gestures.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5162e extends kotlin.coroutines.jvm.internal.j implements InterfaceC6512o<InterfaceC9122b, InterfaceC9133m<Object>, Object, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f39124d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ InterfaceC9122b f39125e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ InterfaceC9133m f39126f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f39127g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C5167j<Object> f39128h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ float f39129i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.J f39130j;

    /* renamed from: androidx.compose.foundation.gestures.e$a */
    static final class a extends AbstractC7737t implements Function1<C8000l<Float, C8008p>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f39131b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC9122b f39132c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.J f39133d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.J f39134e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f7, InterfaceC9122b interfaceC9122b, kotlin.jvm.internal.J j11, kotlin.jvm.internal.J j12) {
            super(1);
            this.f39131b = f7;
            this.f39132c = interfaceC9122b;
            this.f39133d = j11;
            this.f39134e = j12;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C8000l<Float, C8008p> c8000l) {
            C8000l<Float, C8008p> c8000l2 = c8000l;
            float abs = Math.abs(c8000l2.e().floatValue());
            float f7 = this.f39131b;
            float abs2 = Math.abs(f7);
            kotlin.jvm.internal.J j11 = this.f39134e;
            kotlin.jvm.internal.J j12 = this.f39133d;
            InterfaceC9122b interfaceC9122b = this.f39132c;
            if (abs >= abs2) {
                float floatValue = c8000l2.e().floatValue();
                int i11 = C5158a.f39111b;
                if (f7 == 0.0f) {
                    f7 = 0.0f;
                } else if (f7 <= 0.0f ? floatValue >= f7 : floatValue <= f7) {
                    f7 = floatValue;
                }
                interfaceC9122b.a(f7, c8000l2.f().floatValue());
                j12.f71784a = Float.isNaN(c8000l2.f().floatValue()) ? 0.0f : c8000l2.f().floatValue();
                j11.f71784a = f7;
                c8000l2.a();
            } else {
                interfaceC9122b.a(c8000l2.e().floatValue(), c8000l2.f().floatValue());
                j12.f71784a = c8000l2.f().floatValue();
                j11.f71784a = c8000l2.e().floatValue();
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5162e(C5167j<Object> c5167j, float f7, kotlin.jvm.internal.J j11, kotlin.coroutines.d<? super C5162e> dVar) {
        super(4, dVar);
        this.f39128h = c5167j;
        this.f39129i = f7;
        this.f39130j = j11;
    }

    @Override // fd.InterfaceC6512o
    public final Object invoke(InterfaceC9122b interfaceC9122b, InterfaceC9133m<Object> interfaceC9133m, Object obj, kotlin.coroutines.d<? super Unit> dVar) {
        kotlin.jvm.internal.J j11 = this.f39130j;
        C5162e c5162e = new C5162e(this.f39128h, this.f39129i, j11, dVar);
        c5162e.f39125e = interfaceC9122b;
        c5162e.f39126f = interfaceC9133m;
        c5162e.f39127g = obj;
        return c5162e.invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b4, code lost:
    
        if (androidx.compose.foundation.gestures.C5158a.b(r14.f39128h, r8, r9, r10, r11, r14) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        if (m0.B0.e(r3, r5, false, r6, r14) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c6, code lost:
    
        if (androidx.compose.foundation.gestures.C5158a.b(r14.f39128h, r8, r9, r10, r11, r14) == r0) goto L42;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f39124d;
        kotlin.jvm.internal.J j11 = this.f39130j;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC9122b interfaceC9122b = this.f39125e;
            InterfaceC9133m interfaceC9133m = this.f39126f;
            Object obj2 = this.f39127g;
            float e11 = interfaceC9133m.e(obj2);
            if (!Float.isNaN(e11)) {
                kotlin.jvm.internal.J j12 = new kotlin.jvm.internal.J();
                C5167j<Object> c5167j = this.f39128h;
                float o11 = Float.isNaN(c5167j.o()) ? 0.0f : c5167j.o();
                j12.f71784a = o11;
                if (o11 != e11) {
                    float f7 = e11 - o11;
                    float f11 = this.f39129i;
                    if (f7 * f11 < 0.0f || f11 == 0.0f) {
                        this.f39125e = null;
                        this.f39126f = null;
                        this.f39124d = 1;
                    } else {
                        float a11 = m0.C.a(c5167j.m(), j12.f71784a, this.f39129i);
                        float f12 = this.f39129i;
                        if (f12 <= 0.0f ? a11 > e11 : a11 < e11) {
                            this.f39125e = null;
                            this.f39126f = null;
                            this.f39124d = 3;
                        } else {
                            C8006o a12 = C0.a(j12.f71784a, 28, f12);
                            InterfaceC7976A<Float> m11 = c5167j.m();
                            a aVar2 = new a(e11, interfaceC9122b, j11, j12);
                            this.f39125e = null;
                            this.f39126f = null;
                            this.f39124d = 2;
                        }
                    }
                    return aVar;
                }
            }
        } else if (i11 == 1) {
            Sc.s.b(obj);
            j11.f71784a = 0.0f;
        } else if (i11 == 2) {
            Sc.s.b(obj);
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            j11.f71784a = 0.0f;
        }
        return Unit.f71690a;
    }
}
