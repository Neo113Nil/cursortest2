package R1;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Locale f24232a;

    public static final class a {
    }

    public b(@NotNull Locale locale) {
        this.f24232a = locale;
    }

    @NotNull
    public final Locale a() {
        return this.f24232a;
    }

    @NotNull
    public final String b() {
        return e.a(this.f24232a);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return Intrinsics.d(e.a(this.f24232a), e.a(((b) obj).f24232a));
    }

    public final int hashCode() {
        return e.a(this.f24232a).hashCode();
    }

    @NotNull
    public final String toString() {
        return e.a(this.f24232a);
    }
}
