package a90;

import We.B;
import We.F;
import We.L;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: a90.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4966d implements B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f36465a = new LinkedHashMap();

    /* renamed from: a90.d$a */
    public static final class a {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        @NotNull
        public final String toString() {
            return "MockData(requestUri=null, responseBody=null, responseCode=0, headers=null)";
        }
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (((a) this.f36465a.get(chain.request().j().c())) == null) {
            return chain.proceed(chain.request());
        }
        L.a aVar = new L.a();
        aVar.f(0);
        aVar.r(chain.request());
        aVar.o(F.HTTP_2);
        aVar.l("mocked for tests");
        aVar.b(new C4967e());
        throw null;
    }
}
