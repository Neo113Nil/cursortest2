package S0;

import org.jetbrains.annotations.NotNull;

/* renamed from: S0.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3974n0 extends InterfaceC3978p0<Long>, A1<Long> {
    default void e(long j11) {
        t(j11);
    }

    long n();

    @Override // S0.InterfaceC3978p0
    /* bridge */ /* synthetic */ default void setValue(Long l11) {
        e(l11.longValue());
    }

    void t(long j11);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // S0.A1
    @NotNull
    default Long getValue() {
        return Long.valueOf(n());
    }
}
