package androidx.compose.foundation.text.input.internal;

import B0.O0;
import D1.AbstractC2794c0;
import E0.AbstractC2923g0;
import E0.C2917d0;
import I0.W0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifier;", "LD1/c0;", "LE0/d0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class LegacyAdaptingPlatformTextInputModifier extends AbstractC2794c0<C2917d0> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC2923g0 f39786a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final O0 f39787b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final W0 f39788c;

    public LegacyAdaptingPlatformTextInputModifier(@NotNull AbstractC2923g0 abstractC2923g0, @NotNull O0 o02, @NotNull W0 w02) {
        this.f39786a = abstractC2923g0;
        this.f39787b = o02;
        this.f39788c = w02;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final C2917d0 getF41119a() {
        return new C2917d0(this.f39786a, this.f39787b, this.f39788c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return Intrinsics.d(this.f39786a, legacyAdaptingPlatformTextInputModifier.f39786a) && Intrinsics.d(this.f39787b, legacyAdaptingPlatformTextInputModifier.f39787b) && Intrinsics.d(this.f39788c, legacyAdaptingPlatformTextInputModifier.f39788c);
    }

    public final int hashCode() {
        return this.f39788c.hashCode() + ((this.f39787b.hashCode() + (this.f39786a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f39786a + ", legacyTextFieldState=" + this.f39787b + ", textFieldSelectionManager=" + this.f39788c + ')';
    }

    @Override // D1.AbstractC2794c0
    public final void update(C2917d0 c2917d0) {
        C2917d0 c2917d02 = c2917d0;
        c2917d02.K1(this.f39786a);
        c2917d02.J1(this.f39787b);
        c2917d02.L1(this.f39788c);
    }
}
