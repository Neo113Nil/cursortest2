package If0;

import B90.C2618u;
import Kk.C3532b;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import qf0.EnumC9053a;

/* loaded from: classes3.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f12358a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12359b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f12360c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Lf0.a f12361d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Lf0.a f12362e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<a> f12363f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f12364a;

        /* renamed from: b, reason: collision with root package name */
        private final b f12365b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f12366c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final EnumC9053a f12367d;

        /* renamed from: e, reason: collision with root package name */
        private final C0246a f12368e;

        /* renamed from: f, reason: collision with root package name */
        private final Long f12369f;

        /* renamed from: If0.J$a$a, reason: collision with other inner class name */
        public static final class C0246a {

            /* renamed from: a, reason: collision with root package name */
            private final int f12370a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final qf0.b f12371b;

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private final Lf0.d f12372c;

            /* renamed from: d, reason: collision with root package name */
            private final int f12373d;

            public C0246a(int i11, @NotNull qf0.b networkMode, @NotNull Lf0.d protocolType, int i12) {
                Intrinsics.checkNotNullParameter(networkMode, "networkMode");
                Intrinsics.checkNotNullParameter(protocolType, "protocolType");
                this.f12370a = i11;
                this.f12371b = networkMode;
                this.f12372c = protocolType;
                this.f12373d = i12;
            }

            @NotNull
            public final qf0.b a() {
                return this.f12371b;
            }

            public final int b() {
                return this.f12373d;
            }

            @NotNull
            public final Lf0.d c() {
                return this.f12372c;
            }

            public final int d() {
                return this.f12370a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0246a)) {
                    return false;
                }
                C0246a c0246a = (C0246a) obj;
                return this.f12370a == c0246a.f12370a && this.f12371b == c0246a.f12371b && this.f12372c == c0246a.f12372c && this.f12373d == c0246a.f12373d;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f12373d) + ((this.f12372c.hashCode() + ((this.f12371b.hashCode() + (Integer.hashCode(this.f12370a) * 31)) * 31)) * 31);
            }

            @NotNull
            public final String toString() {
                return "PingConfig(retryAttempts=" + this.f12370a + ", networkMode=" + this.f12371b + ", protocolType=" + this.f12372c + ", port=" + this.f12373d + ")";
            }
        }

        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            private final long f12374a;

            /* renamed from: b, reason: collision with root package name */
            private final long f12375b;

            public b(long j11, long j12) {
                this.f12374a = j11;
                this.f12375b = j12;
            }

            public final long a() {
                return this.f12374a;
            }

            public final long b() {
                return this.f12375b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return kotlin.time.b.g(this.f12374a, bVar.f12374a) && kotlin.time.b.g(this.f12375b, bVar.f12375b);
            }

            public final int hashCode() {
                b.Companion companion = kotlin.time.b.INSTANCE;
                return Long.hashCode(this.f12375b) + (Long.hashCode(this.f12374a) * 31);
            }

            @NotNull
            public final String toString() {
                return V.e.a("PingMode(retryAvailableDomainAfter=", kotlin.time.b.p(this.f12374a), ", retryNotAvailableDomainAfter=", kotlin.time.b.p(this.f12375b), ")");
            }
        }

        public a(@NotNull String domain, b bVar, boolean z11, @NotNull EnumC9053a status, C0246a c0246a, Long l11) {
            Intrinsics.checkNotNullParameter(domain, "domain");
            Intrinsics.checkNotNullParameter(status, "status");
            this.f12364a = domain;
            this.f12365b = bVar;
            this.f12366c = z11;
            this.f12367d = status;
            this.f12368e = c0246a;
            this.f12369f = l11;
        }

        @NotNull
        public final String a() {
            return this.f12364a;
        }

        public final Long b() {
            return this.f12369f;
        }

        public final boolean c() {
            return this.f12366c;
        }

        public final C0246a d() {
            return this.f12368e;
        }

        public final b e() {
            return this.f12365b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f12364a, aVar.f12364a) && Intrinsics.d(this.f12365b, aVar.f12365b) && this.f12366c == aVar.f12366c && this.f12367d == aVar.f12367d && Intrinsics.d(this.f12368e, aVar.f12368e) && Intrinsics.d(this.f12369f, aVar.f12369f);
        }

        @NotNull
        public final EnumC9053a f() {
            return this.f12367d;
        }

        public final int hashCode() {
            int hashCode = this.f12364a.hashCode() * 31;
            b bVar = this.f12365b;
            int hashCode2 = (this.f12367d.hashCode() + C3532b.a((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f12366c)) * 31;
            C0246a c0246a = this.f12368e;
            int hashCode3 = (hashCode2 + (c0246a == null ? 0 : c0246a.hashCode())) * 31;
            Long l11 = this.f12369f;
            return hashCode3 + (l11 != null ? l11.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "DomainListItem(domain=" + this.f12364a + ", pingMode=" + this.f12365b + ", observing=" + this.f12366c + ", status=" + this.f12367d + ", pingConfig=" + this.f12368e + ", lastUpdateTimestamp=" + this.f12369f + ")";
        }
    }

    public J(boolean z11, boolean z12, boolean z13, @NotNull Lf0.a domainsLimit, @NotNull Lf0.a parallelPingLimit, @NotNull List<a> domains) {
        Intrinsics.checkNotNullParameter(domainsLimit, "domainsLimit");
        Intrinsics.checkNotNullParameter(parallelPingLimit, "parallelPingLimit");
        Intrinsics.checkNotNullParameter(domains, "domains");
        this.f12358a = z11;
        this.f12359b = z12;
        this.f12360c = z13;
        this.f12361d = domainsLimit;
        this.f12362e = parallelPingLimit;
        this.f12363f = domains;
    }

    public static J a(J j11, boolean z11, boolean z12, int i11) {
        boolean z13 = (i11 & 1) != 0 ? j11.f12358a : true;
        if ((i11 & 2) != 0) {
            z11 = j11.f12359b;
        }
        boolean z14 = z11;
        if ((i11 & 4) != 0) {
            z12 = j11.f12360c;
        }
        Lf0.a domainsLimit = j11.f12361d;
        Lf0.a parallelPingLimit = j11.f12362e;
        List<a> domains = j11.f12363f;
        j11.getClass();
        Intrinsics.checkNotNullParameter(domainsLimit, "domainsLimit");
        Intrinsics.checkNotNullParameter(parallelPingLimit, "parallelPingLimit");
        Intrinsics.checkNotNullParameter(domains, "domains");
        return new J(z13, z14, z12, domainsLimit, parallelPingLimit, domains);
    }

    @NotNull
    public final List<a> b() {
        return this.f12363f;
    }

    @NotNull
    public final Lf0.a c() {
        return this.f12361d;
    }

    public final boolean d() {
        return this.f12359b;
    }

    public final boolean e() {
        return this.f12358a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j11 = (J) obj;
        return this.f12358a == j11.f12358a && this.f12359b == j11.f12359b && this.f12360c == j11.f12360c && Intrinsics.d(this.f12361d, j11.f12361d) && Intrinsics.d(this.f12362e, j11.f12362e) && Intrinsics.d(this.f12363f, j11.f12363f);
    }

    @NotNull
    public final Lf0.a f() {
        return this.f12362e;
    }

    public final boolean g() {
        return this.f12360c;
    }

    public final int hashCode() {
        return this.f12363f.hashCode() + ((this.f12362e.hashCode() + ((this.f12361d.hashCode() + C3532b.a(C3532b.a(Boolean.hashCode(this.f12358a) * 31, 31, this.f12359b), 31, this.f12360c)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DomainReachabilityUiState(initialized=");
        sb2.append(this.f12358a);
        sb2.append(", enabled=");
        sb2.append(this.f12359b);
        sb2.append(", isOptimizationEnabled=");
        sb2.append(this.f12360c);
        sb2.append(", domainsLimit=");
        sb2.append(this.f12361d);
        sb2.append(", parallelPingLimit=");
        sb2.append(this.f12362e);
        sb2.append(", domains=");
        return C2618u.h(sb2, this.f12363f, ")");
    }
}
