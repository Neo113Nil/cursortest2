package S0;

import org.jetbrains.annotations.NotNull;

/* renamed from: S0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3965j extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f25423a;

    public C3965j(@NotNull String str) {
        this.f25423a = str;
    }

    @Override // java.lang.Throwable
    @NotNull
    public final String getMessage() {
        return this.f25423a;
    }
}
