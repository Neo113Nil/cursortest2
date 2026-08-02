package B1;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: B1.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2536e implements InterfaceC2534c, Y {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Z1.s f2107a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ InterfaceC2534c f2108b;

    public C2536e(@NotNull InterfaceC2534c interfaceC2534c, @NotNull Z1.s sVar) {
        this.f2107a = sVar;
        this.f2108b = interfaceC2534c;
    }

    @Override // Z1.d
    public final float B(int i11) {
        return this.f2108b.B(i11);
    }

    @Override // Z1.d
    public final float C(float f7) {
        return this.f2108b.C(f7);
    }

    @Override // Z1.d
    public final long D0(long j11) {
        return this.f2108b.D0(j11);
    }

    @Override // Z1.k
    public final long F(float f7) {
        return this.f2108b.F(f7);
    }

    @Override // B1.InterfaceC2553w
    public final boolean R0() {
        return this.f2108b.R0();
    }

    @Override // Z1.d
    public final int Y0(float f7) {
        return this.f2108b.Y0(f7);
    }

    @Override // Z1.d
    public final float Z0(long j11) {
        return this.f2108b.Z0(j11);
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
            return new C2535d(map, i11, i12);
        }
        A1.a.b("Size(" + i11 + " x " + i12 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @Override // Z1.d
    public final float g() {
        return this.f2108b.g();
    }

    @Override // B1.InterfaceC2553w
    @NotNull
    public final Z1.s getLayoutDirection() {
        return this.f2107a;
    }

    @Override // Z1.d
    public final long o(long j11) {
        return this.f2108b.o(j11);
    }

    @Override // Z1.k
    public final float p(long j11) {
        return this.f2108b.p(j11);
    }

    @Override // Z1.d
    public final long r(float f7) {
        return this.f2108b.r(f7);
    }

    @Override // Z1.k
    public final float u1() {
        return this.f2108b.u1();
    }

    @Override // Z1.d
    public final float v1(float f7) {
        return this.f2108b.v1(f7);
    }
}
