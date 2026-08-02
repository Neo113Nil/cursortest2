package androidx.compose.animation;

import D1.AbstractC2794c0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m0.H;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierElement;", "LD1/c0;", "Landroidx/compose/animation/u;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* data */ class SizeAnimationModifierElement extends AbstractC2794c0<u> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final H<Z1.q> f38761a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final e1.d f38762b;

    public SizeAnimationModifierElement(@NotNull H h11, @NotNull e1.d dVar) {
        this.f38761a = h11;
        this.f38762b = dVar;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final u getF41119a() {
        return new u(this.f38761a, this.f38762b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) obj;
        return Intrinsics.d(this.f38761a, sizeAnimationModifierElement.f38761a) && Intrinsics.d(this.f38762b, sizeAnimationModifierElement.f38762b);
    }

    public final int hashCode() {
        return (this.f38762b.hashCode() + (this.f38761a.hashCode() * 31)) * 31;
    }

    @NotNull
    public final String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.f38761a + ", alignment=" + this.f38762b + ", finishedListener=null)";
    }

    @Override // D1.AbstractC2794c0
    public final void update(u uVar) {
        u uVar2 = uVar;
        uVar2.L1(this.f38761a);
        uVar2.K1(this.f38762b);
    }
}
