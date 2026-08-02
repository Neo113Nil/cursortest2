package T9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class c extends S9.d {

    /* renamed from: b, reason: collision with root package name */
    private final char f26915b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull S9.d child, char c11) {
        super(child);
        Intrinsics.checkNotNullParameter(child, "child");
        this.f26915b = c11;
    }

    @Override // S9.d
    public final S9.b a(char c11) {
        char c12 = this.f26915b;
        return c12 == c11 ? new S9.b(d(), Character.valueOf(c11), true, null) : new S9.b(d(), Character.valueOf(c12), false, null);
    }

    @Override // S9.d
    public final S9.b b() {
        return new S9.b(d(), Character.valueOf(this.f26915b), false, null);
    }

    public final char e() {
        return this.f26915b;
    }

    @Override // S9.d
    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("");
        sb2.append(this.f26915b);
        sb2.append(" -> ");
        sb2.append(c() == null ? "null" : c().toString());
        return sb2.toString();
    }
}
