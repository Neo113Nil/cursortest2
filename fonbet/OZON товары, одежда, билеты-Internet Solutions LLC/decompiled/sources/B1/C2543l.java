package B1;

import B1.m0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: B1.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2543l implements InterfaceC2534c, Y {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final D1.F f2120a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private InterfaceC2541j f2121b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2122c;

    public C2543l(@NotNull D1.F f7, @NotNull InterfaceC2541j interfaceC2541j) {
        this.f2120a = f7;
        this.f2121b = interfaceC2541j;
    }

    @Override // Z1.d
    public final float B(int i11) {
        return this.f2120a.B(i11);
    }

    @Override // Z1.d
    public final float C(float f7) {
        return f7 / this.f2120a.g();
    }

    @Override // Z1.d
    public final long D0(long j11) {
        return this.f2120a.D0(j11);
    }

    @Override // Z1.k
    public final long F(float f7) {
        return this.f2120a.F(f7);
    }

    @Override // B1.InterfaceC2553w
    public final boolean R0() {
        return false;
    }

    @Override // Z1.d
    public final int Y0(float f7) {
        return this.f2120a.Y0(f7);
    }

    @Override // Z1.d
    public final float Z0(long j11) {
        return this.f2120a.Z0(j11);
    }

    @Override // B1.Y
    @NotNull
    public final W f1(int i11, int i12, @NotNull Map map, @NotNull Function1 function1) {
        if ((i11 & (-16777216)) == 0 && ((-16777216) & i12) == 0) {
            return new C2542k(i11, i12, map, function1, this);
        }
        A1.a.b("Size(" + i11 + " x " + i12 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @Override // Z1.d
    public final float g() {
        return this.f2120a.g();
    }

    @Override // B1.InterfaceC2553w
    @NotNull
    public final Z1.s getLayoutDirection() {
        return this.f2120a.getLayoutDirection();
    }

    public final boolean m() {
        return this.f2122c;
    }

    @Override // Z1.d
    public final long o(long j11) {
        return this.f2120a.o(j11);
    }

    @Override // Z1.k
    public final float p(long j11) {
        return this.f2120a.p(j11);
    }

    @Override // Z1.d
    public final long r(float f7) {
        return this.f2120a.r(f7);
    }

    @NotNull
    public final InterfaceC2541j s() {
        return this.f2121b;
    }

    @NotNull
    public final D1.F t() {
        return this.f2120a;
    }

    public final long u() {
        D1.Y c22 = this.f2120a.c2();
        Intrinsics.f(c22);
        W g12 = c22.g1();
        return Z1.r.a(g12.getWidth(), g12.getHeight());
    }

    @Override // Z1.k
    public final float u1() {
        return this.f2120a.u1();
    }

    public final void v(boolean z11) {
        this.f2122c = z11;
    }

    @Override // Z1.d
    public final float v1(float f7) {
        return this.f2120a.g() * f7;
    }

    public final void w(@NotNull InterfaceC2541j interfaceC2541j) {
        this.f2121b = interfaceC2541j;
    }

    @Override // B1.Y
    @NotNull
    public final W z0(int i11, int i12, @NotNull Map<AbstractC2531a, Integer> map, @NotNull Function1<? super m0.a, Unit> function1) {
        return this.f2120a.f1(i11, i12, map, function1);
    }
}
