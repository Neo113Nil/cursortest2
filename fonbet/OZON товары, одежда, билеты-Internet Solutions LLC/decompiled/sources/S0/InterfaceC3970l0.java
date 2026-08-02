package S0;

import org.jetbrains.annotations.NotNull;

/* renamed from: S0.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3970l0 extends S, InterfaceC3978p0<Float> {
    default void g(float f7) {
        h(f7);
    }

    @Override // S0.S
    float getFloatValue();

    void h(float f7);

    @Override // S0.InterfaceC3978p0
    /* bridge */ /* synthetic */ default void setValue(Float f7) {
        g(f7.floatValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // S0.A1
    @NotNull
    default Float getValue() {
        return Float.valueOf(getFloatValue());
    }
}
