package We;

import B4.V;
import Sc.InterfaceC3999a;
import We.C4869k;
import We.P;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: We.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4872n {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final C4872n f33772e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static final C4872n f33773f;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f33774a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f33775b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f33776c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f33777d;

    /* renamed from: We.n$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f33778a;

        /* renamed from: b, reason: collision with root package name */
        private String[] f33779b;

        /* renamed from: c, reason: collision with root package name */
        private String[] f33780c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f33781d;

        public a(boolean z11) {
            this.f33778a = z11;
        }

        @NotNull
        public final C4872n a() {
            return new C4872n(this.f33778a, this.f33781d, this.f33779b, this.f33780c);
        }

        @NotNull
        public final void b(@NotNull C4869k... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f33778a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (C4869k c4869k : cipherSuites) {
                arrayList.add(c4869k.c());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            c((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @NotNull
        public final void c(@NotNull String... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f33778a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            Object clone = cipherSuites.clone();
            if (clone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            this.f33779b = (String[]) clone;
        }

        @InterfaceC3999a
        @NotNull
        public final void d() {
            if (!this.f33778a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.f33781d = true;
        }

        @NotNull
        public final void e(@NotNull P... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f33778a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (P p11 : tlsVersions) {
                arrayList.add(p11.a());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            f((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @NotNull
        public final void f(@NotNull String... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f33778a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            Object clone = tlsVersions.clone();
            if (clone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            this.f33780c = (String[]) clone;
        }

        public a(@NotNull C4872n connectionSpec) {
            Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
            this.f33778a = connectionSpec.f();
            this.f33779b = connectionSpec.f33776c;
            this.f33780c = connectionSpec.f33777d;
            this.f33781d = connectionSpec.g();
        }
    }

    static {
        C4869k c4869k = C4869k.f33766q;
        C4869k c4869k2 = C4869k.f33767r;
        C4869k c4869k3 = C4869k.f33768s;
        C4869k c4869k4 = C4869k.f33760k;
        C4869k c4869k5 = C4869k.f33762m;
        C4869k c4869k6 = C4869k.f33761l;
        C4869k c4869k7 = C4869k.f33763n;
        C4869k c4869k8 = C4869k.f33765p;
        C4869k c4869k9 = C4869k.f33764o;
        C4869k[] c4869kArr = {c4869k, c4869k2, c4869k3, c4869k4, c4869k5, c4869k6, c4869k7, c4869k8, c4869k9};
        C4869k[] c4869kArr2 = {c4869k, c4869k2, c4869k3, c4869k4, c4869k5, c4869k6, c4869k7, c4869k8, c4869k9, C4869k.f33758i, C4869k.f33759j, C4869k.f33756g, C4869k.f33757h, C4869k.f33754e, C4869k.f33755f, C4869k.f33753d};
        a aVar = new a(true);
        aVar.b((C4869k[]) Arrays.copyOf(c4869kArr, 9));
        P p11 = P.TLS_1_3;
        P p12 = P.TLS_1_2;
        aVar.e(p11, p12);
        aVar.d();
        aVar.a();
        a aVar2 = new a(true);
        aVar2.b((C4869k[]) Arrays.copyOf(c4869kArr2, 16));
        aVar2.e(p11, p12);
        aVar2.d();
        f33772e = aVar2.a();
        a aVar3 = new a(true);
        aVar3.b((C4869k[]) Arrays.copyOf(c4869kArr2, 16));
        aVar3.e(p11, p12, P.TLS_1_1, P.TLS_1_0);
        aVar3.d();
        aVar3.a();
        f33773f = new a(false).a();
    }

    public C4872n(boolean z11, boolean z12, String[] strArr, String[] strArr2) {
        this.f33774a = z11;
        this.f33775b = z12;
        this.f33776c = strArr;
        this.f33777d = strArr2;
    }

    public final void c(@NotNull SSLSocket sslSocket, boolean z11) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        C4869k.a comparator;
        C4869k.a aVar;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String[] strArr = this.f33776c;
        if (strArr != null) {
            String[] enabledCipherSuites = sslSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            C4869k.f33769t.getClass();
            aVar = C4869k.f33751b;
            cipherSuitesIntersection = Ye.b.r(enabledCipherSuites, strArr, aVar);
        } else {
            cipherSuitesIntersection = sslSocket.getEnabledCipherSuites();
        }
        String[] strArr2 = this.f33777d;
        if (strArr2 != null) {
            String[] enabledProtocols = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = Ye.b.r(enabledProtocols, strArr2, Vc.a.e());
        } else {
            tlsVersionsIntersection = sslSocket.getEnabledProtocols();
        }
        String[] indexOf = sslSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(indexOf, "supportedCipherSuites");
        C4869k.f33769t.getClass();
        comparator = C4869k.f33751b;
        byte[] bArr = Ye.b.f34900a;
        Intrinsics.checkNotNullParameter(indexOf, "$this$indexOf");
        Intrinsics.checkNotNullParameter("TLS_FALLBACK_SCSV", AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = indexOf.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            } else if (comparator.compare(indexOf[i11], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i11++;
            }
        }
        if (z11 && i11 != -1) {
            Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
            String value = indexOf[i11];
            Intrinsics.checkNotNullExpressionValue(value, "supportedCipherSuites[indexOfFallbackScsv]");
            Intrinsics.checkNotNullParameter(cipherSuitesIntersection, "$this$concat");
            Intrinsics.checkNotNullParameter(value, "value");
            Object[] copyOf = Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
            Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            cipherSuitesIntersection = (String[]) copyOf;
            cipherSuitesIntersection[C7705l.I(cipherSuitesIntersection)] = value;
        }
        a aVar2 = new a(this);
        Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
        aVar2.c((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
        aVar2.f((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
        C4872n a11 = aVar2.a();
        if (a11.h() != null) {
            sslSocket.setEnabledProtocols(a11.f33777d);
        }
        if (a11.d() != null) {
            sslSocket.setEnabledCipherSuites(a11.f33776c);
        }
    }

    public final List<C4869k> d() {
        String[] strArr = this.f33776c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C4869k.f33769t.b(str));
        }
        return C7714v.U0(arrayList);
    }

    public final boolean e(@NotNull SSLSocket socket) {
        C4869k.a aVar;
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.f33774a) {
            return false;
        }
        String[] strArr = this.f33777d;
        if (strArr != null && !Ye.b.l(strArr, socket.getEnabledProtocols(), Vc.a.e())) {
            return false;
        }
        String[] strArr2 = this.f33776c;
        if (strArr2 == null) {
            return true;
        }
        String[] enabledCipherSuites = socket.getEnabledCipherSuites();
        C4869k.f33769t.getClass();
        aVar = C4869k.f33751b;
        return Ye.b.l(strArr2, enabledCipherSuites, aVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4872n)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C4872n c4872n = (C4872n) obj;
        boolean z11 = c4872n.f33774a;
        boolean z12 = this.f33774a;
        if (z12 != z11) {
            return false;
        }
        return !z12 || (Arrays.equals(this.f33776c, c4872n.f33776c) && Arrays.equals(this.f33777d, c4872n.f33777d) && this.f33775b == c4872n.f33775b);
    }

    public final boolean f() {
        return this.f33774a;
    }

    public final boolean g() {
        return this.f33775b;
    }

    public final List<P> h() {
        String[] strArr = this.f33777d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            P.Companion.getClass();
            arrayList.add(P.a.a(str));
        }
        return C7714v.U0(arrayList);
    }

    public final int hashCode() {
        if (!this.f33774a) {
            return 17;
        }
        String[] strArr = this.f33776c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f33777d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f33775b ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        if (!this.f33774a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb2 = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb2.append(Objects.toString(d(), "[all enabled]"));
        sb2.append(", tlsVersions=");
        sb2.append(Objects.toString(h(), "[all enabled]"));
        sb2.append(", supportsTlsExtensions=");
        return V.d(sb2, this.f33775b, ')');
    }
}
