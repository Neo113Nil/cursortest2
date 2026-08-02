package S0;

import Sc.InterfaceC4008j;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* renamed from: S0.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3949d0<T> implements G1<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f25374a;

    public C3949d0(@NotNull Function0<? extends T> function0) {
        this.f25374a = Sc.k.b(function0);
    }

    @Override // S0.G1
    public final T a(@NotNull A0 a02) {
        return (T) this.f25374a.getValue();
    }
}
