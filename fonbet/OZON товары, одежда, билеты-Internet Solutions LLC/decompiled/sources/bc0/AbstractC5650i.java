package bc0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.logout.data.ConfirmTrustedDeviceDTO;

/* renamed from: bc0.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5650i {

    /* renamed from: bc0.i$a */
    public static final class a extends AbstractC5650i {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f55926a = new a(0);
    }

    /* renamed from: bc0.i$b */
    public static final class b extends AbstractC5650i {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ConfirmTrustedDeviceDTO f55927a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull ConfirmTrustedDeviceDTO content) {
            super(0);
            Intrinsics.checkNotNullParameter(content, "content");
            this.f55927a = content;
        }

        @NotNull
        public final ConfirmTrustedDeviceDTO a() {
            return this.f55927a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f55927a, ((b) obj).f55927a);
        }

        public final int hashCode() {
            return this.f55927a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Idle(content=" + this.f55927a + ")";
        }
    }

    public /* synthetic */ AbstractC5650i(int i11) {
        this();
    }

    private AbstractC5650i() {
    }
}
