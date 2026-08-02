package Zc0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: Zc0.a$a, reason: collision with other inner class name */
    public static final class C0677a implements a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final NotificationDTO f35815a;

        public C0677a(@NotNull NotificationDTO notification) {
            Intrinsics.checkNotNullParameter(notification, "notification");
            this.f35815a = notification;
        }

        @NotNull
        public final NotificationDTO a() {
            return this.f35815a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0677a) && Intrinsics.d(this.f35815a, ((C0677a) obj).f35815a);
        }

        public final int hashCode() {
            return this.f35815a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "InvalidState(notification=" + this.f35815a + ")";
        }
    }
}
