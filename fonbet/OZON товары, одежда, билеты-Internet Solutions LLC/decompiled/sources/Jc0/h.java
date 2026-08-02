package Jc0;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.AuthTokenDTO;

/* loaded from: classes3.dex */
public interface h {

    public static final class a implements h {

        /* renamed from: a, reason: collision with root package name */
        private final String f14605a;

        public a() {
            this(null);
        }

        public final String a() {
            return this.f14605a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f14605a, ((a) obj).f14605a);
        }

        public final int hashCode() {
            String str = this.f14605a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("Failed(message="), this.f14605a, ")");
        }

        public a(String str) {
            this.f14605a = str;
        }
    }

    public static final class b implements h {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final AuthTokenDTO f14606a;

        /* renamed from: b, reason: collision with root package name */
        private final String f14607b;

        public b(@NotNull AuthTokenDTO authTokenDTO, String str) {
            Intrinsics.checkNotNullParameter(authTokenDTO, "authTokenDTO");
            this.f14606a = authTokenDTO;
            this.f14607b = str;
        }

        public final String a() {
            return this.f14607b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f14606a, bVar.f14606a) && Intrinsics.d(this.f14607b, bVar.f14607b);
        }

        public final int hashCode() {
            int hashCode = this.f14606a.hashCode() * 31;
            String str = this.f14607b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            return "Success(authTokenDTO=" + this.f14606a + ", message=" + this.f14607b + ")";
        }
    }
}
