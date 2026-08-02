package S0;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class E1 implements S {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final A1<Float> f25198a;

    public E1(@NotNull A1<Float> a12) {
        this.f25198a = a12;
    }

    @Override // S0.S
    public final float getFloatValue() {
        return this.f25198a.getValue().floatValue();
    }

    @NotNull
    public final String toString() {
        return "UnboxedFloatState(baseState=" + this.f25198a + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // S0.A1
    @NotNull
    public final Float getValue() {
        return this.f25198a.getValue();
    }
}
