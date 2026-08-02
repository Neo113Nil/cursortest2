package F00;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: F00.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0183a extends a {
    }

    public a() {
        b bVar = b.PER_PROCESS;
    }

    @NotNull
    public abstract String a();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.composer.libraries.integrations.abtool.ComposerFlag");
        return Intrinsics.d(a(), ((a) obj).a());
    }

    public final int hashCode() {
        return a().hashCode() + 1926388186;
    }
}
