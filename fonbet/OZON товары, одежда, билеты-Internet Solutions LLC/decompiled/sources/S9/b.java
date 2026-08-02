package S9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d f26054a;

    /* renamed from: b, reason: collision with root package name */
    private final Character f26055b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f26056c;

    /* renamed from: d, reason: collision with root package name */
    private final Character f26057d;

    public b(@NotNull d state, Character ch2, boolean z11, Character ch3) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f26054a = state;
        this.f26055b = ch2;
        this.f26056c = z11;
        this.f26057d = ch3;
    }

    public final Character a() {
        return this.f26055b;
    }

    public final boolean b() {
        return this.f26056c;
    }

    @NotNull
    public final d c() {
        return this.f26054a;
    }

    public final Character d() {
        return this.f26057d;
    }
}
