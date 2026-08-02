package P0;

import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;
import w1.InterfaceC10406a;

/* renamed from: P0.q1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3767q1 implements InterfaceC10406a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3787x1 f21308a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<Float, Unit> f21309b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ EnumC9142v f21310c;

    /* JADX WARN: Multi-variable type inference failed */
    C3767q1(C3787x1 c3787x1, Function1<? super Float, Unit> function1, EnumC9142v enumC9142v) {
        this.f21308a = c3787x1;
        this.f21309b = function1;
        this.f21310c = enumC9142v;
    }

    @Override // w1.InterfaceC10406a
    public final Object O(long j11, long j12, @NotNull kotlin.coroutines.d<? super Z1.w> dVar) {
        this.f21309b.invoke(new Float(this.f21310c == EnumC9142v.Horizontal ? Z1.w.c(j12) : Z1.w.d(j12)));
        return Z1.w.a(j12);
    }

    @Override // w1.InterfaceC10406a
    public final long f0(int i11, long j11, long j12) {
        if (i11 != 1) {
            return 0L;
        }
        androidx.compose.material3.internal.p<EnumC3790y1> c11 = this.f21308a.c();
        EnumC9142v enumC9142v = EnumC9142v.Horizontal;
        EnumC9142v enumC9142v2 = this.f21310c;
        float k11 = c11.k(enumC9142v2 == enumC9142v ? C7459e.g(j12) : C7459e.h(j12));
        float f7 = enumC9142v2 == enumC9142v ? k11 : 0.0f;
        if (enumC9142v2 != EnumC9142v.Vertical) {
            k11 = 0.0f;
        }
        return P9.a.a(f7, k11);
    }

    @Override // w1.InterfaceC10406a
    /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
    public final Object mo11onPreFlingQWom1Mo(long j11, @NotNull kotlin.coroutines.d<? super Z1.w> dVar) {
        float c11 = this.f21310c == EnumC9142v.Horizontal ? Z1.w.c(j11) : Z1.w.d(j11);
        C3787x1 c3787x1 = this.f21308a;
        float l11 = c3787x1.l();
        float d11 = c3787x1.c().l().d();
        if (c11 >= 0.0f || l11 <= d11) {
            j11 = 0;
        } else {
            this.f21309b.invoke(new Float(c11));
        }
        return Z1.w.a(j11);
    }

    @Override // w1.InterfaceC10406a
    /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
    public final long mo12onPreScrollOzD1aCk(long j11, int i11) {
        EnumC9142v enumC9142v = EnumC9142v.Horizontal;
        EnumC9142v enumC9142v2 = this.f21310c;
        float g10 = enumC9142v2 == enumC9142v ? C7459e.g(j11) : C7459e.h(j11);
        if (g10 >= 0.0f || i11 != 1) {
            return 0L;
        }
        float k11 = this.f21308a.c().k(g10);
        return P9.a.a(enumC9142v2 == enumC9142v ? k11 : 0.0f, enumC9142v2 == EnumC9142v.Vertical ? k11 : 0.0f);
    }
}
