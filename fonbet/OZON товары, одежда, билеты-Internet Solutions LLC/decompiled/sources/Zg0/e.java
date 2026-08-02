package Zg0;

import B90.C2618u;
import I0.C3173b;
import N3.C3660k;
import Sc.InterfaceC3999a;
import We.B;
import We.C4871m;
import We.C4876s;
import We.InterfaceC4875q;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Fb0.e f35930a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a.C0681a f35931b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final b.a f35932c;

    /* renamed from: d, reason: collision with root package name */
    private final d f35933d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4875q f35934e;

    /* renamed from: f, reason: collision with root package name */
    private final c f35935f;

    /* renamed from: g, reason: collision with root package name */
    private final C4871m f35936g;

    /* renamed from: h, reason: collision with root package name */
    private final C4876s f35937h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final String f35938i;

    public static abstract class a {

        /* renamed from: Zg0.e$a$a, reason: collision with other inner class name */
        public static final class C0681a<T extends B> extends a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final kotlin.reflect.d<T> f35939a;

            public C0681a(@NotNull kotlin.reflect.d<T> interceptorClass) {
                Intrinsics.checkNotNullParameter(interceptorClass, "interceptorClass");
                this.f35939a = interceptorClass;
            }

            @NotNull
            public final kotlin.reflect.d<T> a() {
                return this.f35939a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0681a) && Intrinsics.d(this.f35939a, ((C0681a) obj).f35939a);
            }

            public final int hashCode() {
                return this.f35939a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "ByInterceptor(interceptorClass=" + this.f35939a + ")";
            }
        }

        public static final class b extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                ((b) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            @NotNull
            public final String toString() {
                return "FromValues(appName=null, appVersion=null, userAgent=null)";
            }
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f35940a = new a();
        }

        /* renamed from: Zg0.e$b$b, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static abstract class AbstractC0682b extends b {

            /* renamed from: Zg0.e$b$b$a */
            public static final class a<T extends B> extends AbstractC0682b {
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
                    return "ByInterceptor(interceptorClass=null)";
                }
            }

            /* renamed from: Zg0.e$b$b$b, reason: collision with other inner class name */
            public static final class C0683b extends AbstractC0682b {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0683b)) {
                        return false;
                    }
                    ((C0683b) obj).getClass();
                    return true;
                }

                public final int hashCode() {
                    throw null;
                }

                @NotNull
                public final String toString() {
                    return "FromValue(accessToken=null)";
                }
            }
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final List<B> f35941a;

        public c() {
            this(null, 3);
        }

        public final List<B> a() {
            return this.f35941a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return Intrinsics.d(this.f35941a, ((c) obj).f35941a);
            }
            return false;
        }

        public final int hashCode() {
            List<B> list = this.f35941a;
            return (list == null ? 0 : list.hashCode()) * 31;
        }

        @NotNull
        public final String toString() {
            return C2618u.h(new StringBuilder("Interceptors(interceptors="), this.f35941a, ", networkInterceptors=null)");
        }

        public c(List list, int i11) {
            this.f35941a = (i11 & 1) != 0 ? null : list;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final long f35942a;

        /* renamed from: b, reason: collision with root package name */
        private final long f35943b;

        /* renamed from: c, reason: collision with root package name */
        private final long f35944c;

        /* renamed from: d, reason: collision with root package name */
        private final long f35945d;

        public d(long j11, long j12, long j13, long j14) {
            this.f35942a = j11;
            this.f35943b = j12;
            this.f35944c = j13;
            this.f35945d = j14;
        }

        public final long a() {
            return this.f35945d;
        }

        public final long b() {
            return this.f35942a;
        }

        public final long c() {
            return this.f35943b;
        }

        public final long d() {
            return this.f35944c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.time.b.g(this.f35942a, dVar.f35942a) && kotlin.time.b.g(this.f35943b, dVar.f35943b) && kotlin.time.b.g(this.f35944c, dVar.f35944c) && kotlin.time.b.g(this.f35945d, dVar.f35945d);
        }

        public final int hashCode() {
            b.Companion companion = kotlin.time.b.INSTANCE;
            return Long.hashCode(this.f35945d) + Pk0.c.a(Pk0.c.a(Long.hashCode(this.f35942a) * 31, 31, this.f35943b), 31, this.f35944c);
        }

        @NotNull
        public final String toString() {
            String p11 = kotlin.time.b.p(this.f35942a);
            String p12 = kotlin.time.b.p(this.f35943b);
            return C3173b.c(C3660k.d("Timeouts(connectTimeout=", p11, ", readTimeout=", p12, ", writeTimeout="), kotlin.time.b.p(this.f35944c), ", callTimeout=", kotlin.time.b.p(this.f35945d), ")");
        }
    }

    public e(@NotNull Fb0.e appDomain, @NotNull a.C0681a appData, @NotNull b.a authMethod, d dVar, InterfaceC4875q interfaceC4875q, c cVar, C4871m c4871m, C4876s c4876s) {
        Intrinsics.checkNotNullParameter(appDomain, "appDomain");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(authMethod, "authMethod");
        this.f35930a = appDomain;
        this.f35931b = appData;
        this.f35932c = authMethod;
        this.f35933d = dVar;
        this.f35934e = interfaceC4875q;
        this.f35935f = cVar;
        this.f35936g = c4871m;
        this.f35937h = c4876s;
        this.f35938i = Nk.a.b("https://", appDomain.m());
    }

    @NotNull
    public final String a() {
        return this.f35938i;
    }

    @NotNull
    public final a b() {
        return this.f35931b;
    }

    @NotNull
    public final Fb0.e c() {
        return this.f35930a;
    }

    @NotNull
    public final b d() {
        return this.f35932c;
    }

    public final C4871m e() {
        return this.f35936g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f35930a == eVar.f35930a && this.f35931b.equals(eVar.f35931b) && Intrinsics.d(this.f35932c, eVar.f35932c) && this.f35933d.equals(eVar.f35933d) && Intrinsics.d(this.f35934e, eVar.f35934e) && this.f35935f.equals(eVar.f35935f) && Intrinsics.d(this.f35936g, eVar.f35936g) && Intrinsics.d(this.f35937h, eVar.f35937h);
    }

    public final InterfaceC4875q f() {
        return this.f35934e;
    }

    public final C4876s g() {
        return this.f35937h;
    }

    public final c h() {
        return this.f35935f;
    }

    public final int hashCode() {
        int hashCode = (this.f35933d.hashCode() + ((this.f35932c.hashCode() + ((this.f35931b.hashCode() + (this.f35930a.hashCode() * 31)) * 31)) * 31)) * 31;
        InterfaceC4875q interfaceC4875q = this.f35934e;
        int hashCode2 = (this.f35935f.hashCode() + ((hashCode + (interfaceC4875q == null ? 0 : interfaceC4875q.hashCode())) * 31)) * 31;
        C4871m c4871m = this.f35936g;
        int hashCode3 = (hashCode2 + (c4871m == null ? 0 : c4871m.hashCode())) * 31;
        C4876s c4876s = this.f35937h;
        return hashCode3 + (c4876s != null ? c4876s.hashCode() : 0);
    }

    public final d i() {
        return this.f35933d;
    }

    @NotNull
    public final String toString() {
        return "NetworkClientConfiguration(appDomain=" + this.f35930a + ", appData=" + this.f35931b + ", authMethod=" + this.f35932c + ", timeouts=" + this.f35933d + ", cookieJar=" + this.f35934e + ", interceptors=" + this.f35935f + ", connectionPool=" + this.f35936g + ", dispatcher=" + this.f35937h + ")";
    }
}
