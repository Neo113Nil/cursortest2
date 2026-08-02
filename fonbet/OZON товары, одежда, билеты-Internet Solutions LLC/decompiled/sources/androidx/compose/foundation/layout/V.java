package androidx.compose.foundation.layout;

import B1.m0;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import u0.InterfaceC9914x;

/* loaded from: classes.dex */
final class V extends e.c implements D1.E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private InterfaceC9914x f39416a;

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f39417b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ B1.Y f39418c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ V f39419d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0 m0Var, B1.Y y11, V v11) {
            super(1);
            this.f39417b = m0Var;
            this.f39418c = y11;
            this.f39419d = v11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            V v11 = this.f39419d;
            InterfaceC9914x I12 = v11.I1();
            B1.Y y11 = this.f39418c;
            aVar.d(this.f39417b, y11.Y0(I12.b(y11.getLayoutDirection())), y11.Y0(v11.I1().d()), 0.0f);
            return Unit.f71690a;
        }
    }

    public V(@NotNull InterfaceC9914x interfaceC9914x) {
        this.f39416a = interfaceC9914x;
    }

    @Override // D1.E
    @NotNull
    public final B1.W D(@NotNull B1.Y y11, @NotNull B1.U u11, long j11) {
        B1.W z02;
        float f7 = 0;
        if (Float.compare(this.f39416a.b(y11.getLayoutDirection()), f7) < 0 || Float.compare(this.f39416a.d(), f7) < 0 || Float.compare(this.f39416a.c(y11.getLayoutDirection()), f7) < 0 || Float.compare(this.f39416a.a(), f7) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
        int Y02 = y11.Y0(this.f39416a.c(y11.getLayoutDirection())) + y11.Y0(this.f39416a.b(y11.getLayoutDirection()));
        int Y03 = y11.Y0(this.f39416a.a()) + y11.Y0(this.f39416a.d());
        m0 a02 = u11.a0(Z1.c.k(-Y02, -Y03, j11));
        z02 = y11.z0(Z1.c.h(a02.u0() + Y02, j11), Z1.c.g(a02.l0() + Y03, j11), kotlin.collections.U.c(), new a(a02, y11, this));
        return z02;
    }

    @NotNull
    public final InterfaceC9914x I1() {
        return this.f39416a;
    }

    public final void J1(@NotNull InterfaceC9914x interfaceC9914x) {
        this.f39416a = interfaceC9914x;
    }
}
