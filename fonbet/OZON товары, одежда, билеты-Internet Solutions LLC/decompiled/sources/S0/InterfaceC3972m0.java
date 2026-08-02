package S0;

import org.jetbrains.annotations.NotNull;

/* renamed from: S0.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3972m0 extends InterfaceC3978p0<Integer>, A1<Integer> {
    void d(int i11);

    default void f(int i11) {
        d(i11);
    }

    int getIntValue();

    @Override // S0.InterfaceC3978p0
    /* bridge */ /* synthetic */ default void setValue(Integer num) {
        f(num.intValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // S0.A1
    @NotNull
    default Integer getValue() {
        return Integer.valueOf(getIntValue());
    }
}
