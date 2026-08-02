package S80;

import Ae.C0;
import Ae.x0;
import C.o0;
import T80.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public interface b extends T80.b, T80.a, c {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f26046a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final JSONObject f26047b;

        /* renamed from: c, reason: collision with root package name */
        private final String f26048c;

        public a(@NotNull JSONObject parameters, @NotNull String moduleManifestPath, String str) {
            Intrinsics.checkNotNullParameter(moduleManifestPath, "moduleManifestPath");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.f26046a = moduleManifestPath;
            this.f26047b = parameters;
            this.f26048c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f26046a, aVar.f26046a) && Intrinsics.d(this.f26047b, aVar.f26047b) && Intrinsics.d(this.f26048c, aVar.f26048c);
        }

        public final int hashCode() {
            int hashCode = (this.f26047b.hashCode() + (this.f26046a.hashCode() * 31)) * 31;
            String str = this.f26048c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("JSContextNavigate(moduleManifestPath=");
            sb2.append(this.f26046a);
            sb2.append(", parameters=");
            sb2.append(this.f26047b);
            sb2.append(", source=");
            return o0.c(sb2, this.f26048c, ")");
        }
    }

    void B(boolean z11);

    void D0();

    void I0(boolean z11);

    C0 J();

    void K(@NotNull c cVar);

    x0<String> L();

    boolean Q();

    C0 W();

    C0 c0();

    void g0(@NotNull c cVar);

    x0<c.b> j();

    void l(boolean z11);

    @NotNull
    C0 m0();

    boolean o();

    x0<String> p();

    C0 r0();

    boolean u0();

    boolean y();
}
