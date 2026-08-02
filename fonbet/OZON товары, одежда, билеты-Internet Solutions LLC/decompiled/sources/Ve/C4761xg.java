package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.xg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4761xg extends AbstractC4245fi {
    public C4761xg() {
        Intrinsics.checkNotNullParameter("Время ожидания ответа от сервера истекло", "description");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4761xg)) {
            return false;
        }
        ((C4761xg) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return 1337660109;
    }

    public final String toString() {
        return "TimeoutException(description=Время ожидания ответа от сервера истекло)";
    }
}
