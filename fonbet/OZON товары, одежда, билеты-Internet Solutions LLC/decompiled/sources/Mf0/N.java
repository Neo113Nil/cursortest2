package Mf0;

import C.o0;
import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f17967a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f17968b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f17969c;

    /* renamed from: d, reason: collision with root package name */
    private final String f17970d;

    public interface a {

        /* renamed from: Mf0.N$a$a, reason: collision with other inner class name */
        public static final class C0349a implements a {

            /* renamed from: a, reason: collision with root package name */
            private final boolean f17971a;

            /* renamed from: b, reason: collision with root package name */
            private final String f17972b;

            /* renamed from: c, reason: collision with root package name */
            private final String f17973c;

            /* renamed from: d, reason: collision with root package name */
            private final String f17974d;

            /* renamed from: e, reason: collision with root package name */
            private final String f17975e;

            /* renamed from: f, reason: collision with root package name */
            private final String f17976f;

            /* renamed from: g, reason: collision with root package name */
            private final String f17977g;

            public C0349a(String str, boolean z11, String str2, String str3, String str4, String str5, String str6) {
                this.f17971a = z11;
                this.f17972b = str;
                this.f17973c = str2;
                this.f17974d = str3;
                this.f17975e = str4;
                this.f17976f = str5;
                this.f17977g = str6;
            }

            public final String a() {
                return this.f17974d;
            }

            public final String b() {
                return this.f17972b;
            }

            public final String c() {
                return this.f17975e;
            }

            public final String d() {
                return this.f17976f;
            }

            public final String e() {
                return this.f17977g;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0349a)) {
                    return false;
                }
                C0349a c0349a = (C0349a) obj;
                return this.f17971a == c0349a.f17971a && Intrinsics.d(this.f17972b, c0349a.f17972b) && Intrinsics.d(this.f17973c, c0349a.f17973c) && Intrinsics.d(this.f17974d, c0349a.f17974d) && Intrinsics.d(this.f17975e, c0349a.f17975e) && Intrinsics.d(this.f17976f, c0349a.f17976f) && Intrinsics.d(this.f17977g, c0349a.f17977g);
            }

            public final String f() {
                return this.f17973c;
            }

            public final boolean g() {
                return this.f17971a;
            }

            public final int hashCode() {
                int hashCode = Boolean.hashCode(this.f17971a) * 31;
                String str = this.f17972b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f17973c;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f17974d;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f17975e;
                int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.f17976f;
                int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.f17977g;
                return hashCode6 + (str6 != null ? str6.hashCode() : 0);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Completed(isSuccess=");
                sb2.append(this.f17971a);
                sb2.append(", message=");
                sb2.append(this.f17972b);
                sb2.append(", responseProtocol=");
                sb2.append(this.f17973c);
                sb2.append(", cipherSuite=");
                sb2.append(this.f17974d);
                sb2.append(", metrics=");
                sb2.append(this.f17975e);
                sb2.append(", requestHeaders=");
                sb2.append(this.f17976f);
                sb2.append(", responseHeaders=");
                return o0.c(sb2, this.f17977g, ")");
            }
        }

        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f17978a = new b();
        }

        public static final class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f17979a = new c();
        }
    }

    public N() {
        this(15);
    }

    public static N a(N n11, a lastRequestState, String baseUrl, Map extraHeaders, String str, int i11) {
        if ((i11 & 1) != 0) {
            lastRequestState = n11.f17967a;
        }
        if ((i11 & 2) != 0) {
            baseUrl = n11.f17968b;
        }
        if ((i11 & 4) != 0) {
            extraHeaders = n11.f17969c;
        }
        if ((i11 & 8) != 0) {
            str = n11.f17970d;
        }
        n11.getClass();
        Intrinsics.checkNotNullParameter(lastRequestState, "lastRequestState");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(extraHeaders, "extraHeaders");
        return new N(lastRequestState, baseUrl, extraHeaders, str);
    }

    @NotNull
    public final String b() {
        return this.f17968b;
    }

    @NotNull
    public final Map<String, String> c() {
        return this.f17969c;
    }

    @NotNull
    public final a d() {
        return this.f17967a;
    }

    public final String e() {
        return this.f17970d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n11 = (N) obj;
        return Intrinsics.d(this.f17967a, n11.f17967a) && Intrinsics.d(this.f17968b, n11.f17968b) && Intrinsics.d(this.f17969c, n11.f17969c) && Intrinsics.d(this.f17970d, n11.f17970d);
    }

    public final int hashCode() {
        int a11 = D40.c.a(this.f17969c, G.g.a(this.f17967a.hashCode() * 31, 31, this.f17968b), 31);
        String str = this.f17970d;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ONDebugMenuUIState(lastRequestState=" + this.f17967a + ", baseUrl=" + this.f17968b + ", extraHeaders=" + this.f17969c + ", mockServer=" + this.f17970d + ")";
    }

    public /* synthetic */ N(int i11) {
        this(a.b.f17978a, (i11 & 2) != 0 ? "" : "https://api-stg.ozonru.me/test", U.c(), null);
    }

    public N(@NotNull a lastRequestState, @NotNull String baseUrl, @NotNull Map<String, String> extraHeaders, String str) {
        Intrinsics.checkNotNullParameter(lastRequestState, "lastRequestState");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(extraHeaders, "extraHeaders");
        this.f17967a = lastRequestState;
        this.f17968b = baseUrl;
        this.f17969c = extraHeaders;
        this.f17970d = str;
    }
}
