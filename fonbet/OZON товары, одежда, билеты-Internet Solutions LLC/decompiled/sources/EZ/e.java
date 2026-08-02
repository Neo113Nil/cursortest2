package EZ;

import GZ.j;
import T7.P;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;

/* loaded from: classes3.dex */
public final class e<D extends pZ.f> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final D f7726a;

    /* renamed from: b, reason: collision with root package name */
    private final j f7727b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<Class<? extends Object>, Object> f7728c;

    private e() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(pZ.f fVar, j jVar, Map map) {
        this.f7726a = fVar;
        this.f7727b = jVar;
        this.f7728c = map;
    }

    @NotNull
    public final D b() {
        return this.f7726a;
    }

    public final j c() {
        return this.f7727b;
    }

    public final boolean d() {
        Intrinsics.checkNotNullParameter(BZ.c.class, "type");
        return this.f7728c.containsKey(BZ.c.class);
    }

    @NotNull
    public final <New extends pZ.f> e<New> e(@NotNull New destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return new a(destination, this).a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f7726a, eVar.f7726a) && Intrinsics.d(this.f7727b, eVar.f7727b) && Intrinsics.d(this.f7728c, eVar.f7728c);
    }

    public final int hashCode() {
        int hashCode = this.f7726a.hashCode() * 31;
        j jVar = this.f7727b;
        return this.f7728c.hashCode() + ((hashCode + (jVar != null ? jVar.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavigationResponse(destination=");
        sb2.append(this.f7726a);
        sb2.append(", route=");
        sb2.append(this.f7727b);
        sb2.append(", tags=");
        return P.f(sb2, this.f7728c, ")");
    }

    public static final class a<D extends pZ.f> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final D f7729a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final HashMap<Class<? extends Object>, Object> f7730b;

        /* renamed from: c, reason: collision with root package name */
        private j f7731c;

        public a(@NotNull D destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.f7729a = destination;
            this.f7731c = null;
            this.f7730b = new HashMap<>();
        }

        @NotNull
        public final e<D> a() {
            return new e<>(this.f7729a, this.f7731c, U.t(this.f7730b));
        }

        @NotNull
        public final void b(@NotNull j route) {
            Intrinsics.checkNotNullParameter(route, "route");
            this.f7731c = route;
        }

        @NotNull
        public final void c(BZ.c cVar) {
            Intrinsics.checkNotNullParameter(BZ.c.class, "type");
            HashMap<Class<? extends Object>, Object> hashMap = this.f7730b;
            if (cVar == null) {
                hashMap.remove(BZ.c.class);
                return;
            }
            Object cast = BZ.c.class.cast(cVar);
            Intrinsics.f(cast);
            hashMap.put(BZ.c.class, cast);
        }

        public a(@NotNull D destination, @NotNull e<?> response) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            Intrinsics.checkNotNullParameter(response, "response");
            this.f7729a = destination;
            this.f7731c = response.c();
            this.f7730b = new HashMap<>(((e) response).f7728c);
        }
    }
}
