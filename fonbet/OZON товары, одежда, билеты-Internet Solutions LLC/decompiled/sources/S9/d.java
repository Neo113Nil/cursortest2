package S9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private final d f26058a;

    public d(d dVar) {
        this.f26058a = dVar;
    }

    public abstract b a(char c11);

    public b b() {
        return null;
    }

    public final d c() {
        return this.f26058a;
    }

    @NotNull
    public d d() {
        d dVar = this.f26058a;
        Intrinsics.f(dVar);
        return dVar;
    }

    @NotNull
    public abstract String toString();
}
