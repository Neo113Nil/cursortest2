package B1;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class A implements Y, InterfaceC2553w {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Z1.s f2024a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ InterfaceC2553w f2025b;

    public A(@NotNull InterfaceC2553w interfaceC2553w, @NotNull Z1.s sVar) {
        this.f2024a = sVar;
        this.f2025b = interfaceC2553w;
    }

    @Override // Z1.d
    public final float B(int i11) {
        return this.f2025b.B(i11);
    }

    @Override // Z1.d
    public final float C(float f7) {
        return this.f2025b.C(f7);
    }

    @Override // Z1.d
    public final long D0(long j11) {
        return this.f2025b.D0(j11);
    }

    @Override // Z1.k
    public final long F(float f7) {
        return this.f2025b.F(f7);
    }

    @Override // B1.InterfaceC2553w
    public final boolean R0() {
        return this.f2025b.R0();
    }

    @Override // Z1.d
    public final int Y0(float f7) {
        return this.f2025b.Y0(f7);
    }

    @Override // Z1.d
    public final float Z0(long j11) {
        return this.f2025b.Z0(j11);
    }

    @Override // B1.Y
    @NotNull
    public final W f1(int i11, int i12, @NotNull Map map, @NotNull Function1 function1) {
        if (i11 < 0) {
            i11 = 0;
        }
        if (i12 < 0) {
            i12 = 0;
        }
        if ((i11 & (-16777216)) == 0 && ((-16777216) & i12) == 0) {
            return new C2556z(map, i11, i12);
        }
        A1.a.b("Size(" + i11 + " x " + i12 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @Override // Z1.d
    public final float g() {
        return this.f2025b.g();
    }

    @Override // B1.InterfaceC2553w
    @NotNull
    public final Z1.s getLayoutDirection() {
        return this.f2024a;
    }

    @Override // Z1.d
    public final long o(long j11) {
        return this.f2025b.o(j11);
    }

    @Override // Z1.k
    public final float p(long j11) {
        return this.f2025b.p(j11);
    }

    @Override // Z1.d
    public final long r(float f7) {
        return this.f2025b.r(f7);
    }

    @Override // Z1.k
    public final float u1() {
        return this.f2025b.u1();
    }

    @Override // Z1.d
    public final float v1(float f7) {
        return this.f2025b.v1(f7);
    }
}
