package Q1;

import K1.C3422b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3422b f22865a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final D f22866b;

    public W(@NotNull C3422b c3422b, @NotNull D d11) {
        this.f22865a = c3422b;
        this.f22866b = d11;
    }

    @NotNull
    public final D a() {
        return this.f22866b;
    }

    @NotNull
    public final C3422b b() {
        return this.f22865a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w11 = (W) obj;
        return Intrinsics.d(this.f22865a, w11.f22865a) && Intrinsics.d(this.f22866b, w11.f22866b);
    }

    public final int hashCode() {
        return this.f22866b.hashCode() + (this.f22865a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f22865a) + ", offsetMapping=" + this.f22866b + ')';
    }
}
