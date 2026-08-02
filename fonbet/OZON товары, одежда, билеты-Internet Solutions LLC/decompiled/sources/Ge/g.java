package Ge;

import org.jetbrains.annotations.NotNull;
import xe.AbstractC10711a;

/* loaded from: classes.dex */
public final class g implements qc.f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC10711a f10090a;

    public g(@NotNull AbstractC10711a abstractC10711a) {
        this.f10090a = abstractC10711a;
    }

    @Override // qc.f
    public final void cancel() {
        this.f10090a.j(null);
    }
}
