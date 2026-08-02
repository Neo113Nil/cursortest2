package S0;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* renamed from: S0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3992x<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3949d0 f25581a;

    private AbstractC3992x() {
        throw null;
    }

    public AbstractC3992x(Function0 function0) {
        this.f25581a = new C3949d0(function0);
    }

    @NotNull
    public G1<T> a() {
        return this.f25581a;
    }

    @NotNull
    public abstract G1<T> b(@NotNull H0<T> h02, G1<T> g12);
}
