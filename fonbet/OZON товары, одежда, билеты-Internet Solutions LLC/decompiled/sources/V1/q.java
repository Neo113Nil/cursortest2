package V1;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final q f27930c = new q(2, false);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final q f27931d = new q(1, true);

    /* renamed from: a, reason: collision with root package name */
    private final int f27932a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f27933b;

    public q(int i11, boolean z11) {
        this.f27932a = i11;
        this.f27933b = z11;
    }

    public final int b() {
        return this.f27932a;
    }

    public final boolean c() {
        return this.f27933b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f27932a == qVar.f27932a && this.f27933b == qVar.f27933b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27933b) + (Integer.hashCode(this.f27932a) * 31);
    }

    @NotNull
    public final String toString() {
        return equals(f27930c) ? "TextMotion.Static" : equals(f27931d) ? "TextMotion.Animated" : "Invalid";
    }
}
