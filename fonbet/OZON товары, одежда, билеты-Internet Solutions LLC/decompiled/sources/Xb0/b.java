package Xb0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.AuthTokenDTO;

/* loaded from: classes3.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f34275a = new a(0);
    }

    /* renamed from: Xb0.b$b, reason: collision with other inner class name */
    public static final class C0613b extends b {

        /* renamed from: a, reason: collision with root package name */
        private final AuthTokenDTO f34276a;

        public C0613b() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0613b) && Intrinsics.d(this.f34276a, ((C0613b) obj).f34276a);
        }

        public final int hashCode() {
            AuthTokenDTO authTokenDTO = this.f34276a;
            if (authTokenDTO == null) {
                return 0;
            }
            return authTokenDTO.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Done(authToken=" + this.f34276a + ")";
        }

        public C0613b(AuthTokenDTO authTokenDTO) {
            super(0);
            this.f34276a = authTokenDTO;
        }
    }

    public b(int i11) {
    }
}
